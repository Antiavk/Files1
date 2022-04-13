import java.io.File;

public class Main {
    public static void main(String[] args) {

        String GamesFolder = "C://Games";

        File dirSrc = new File(GamesFolder + "/src");
        File dirRes = new File(GamesFolder + "/res");
        File dirSavegames = new File(GamesFolder + "/savegames");
        File dirTemp = new File(GamesFolder + "/temp");
        if (dirSrc.mkdir() && dirRes.mkdir() && dirSavegames.mkdir() && dirTemp.mkdir()) {
            System.out.println("Директории src, res, savegames, temp созданы");
        } else {
            System.out.println("Директории src, res, savegames или  temp были созданы ранее, очистите папку Games и повторите");
        }

        File dirMain = new File(dirSrc + "/main");
        File dirTest = new File(dirSrc + "/test");
        if (dirMain.mkdir() && dirTest.mkdir()) {
            System.out.println("Каталоги main и test созданы в директории src");
        }
        File mainFile = new File(dirMain + "/Main.java");
        File utilsFile = new File(dirMain + "/Utils.java");
        try {
            if (mainFile.createNewFile() && utilsFile.createNewFile())
                System.out.println("Файлы Main.java и Utils.java были созданы в каталоге main");
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "Файлы был созданы ранее");
        }

        File dirDrawables = new File(dirRes + "/drawables");
        File dirVectors = new File(dirRes + "/vectors");
        File dirIcons = new File(dirRes + "/icons");
        if (dirDrawables.mkdir() && dirVectors.mkdir() && dirIcons.mkdir()) {
            System.out.println("Директории drawables, vectors и icons созданы в каталоге res");
        }
        File tempFile = new File(dirTemp + "/temp.txt");
        try {
            if (tempFile.createNewFile())
                System.out.println("Файл temp.txt был создан в каталоге temp");
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "Файл был создан ранее");
        }

    }
}
