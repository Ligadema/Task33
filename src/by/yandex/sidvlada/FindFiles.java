package by.yandex.sidvlada;

import java.io.File;

public class FindFiles {
    private static final String DIR = "C:\\Users\\sid-v";

    public static void main(String[] args) {
        new FindFiles().displayIt(DIR);
    }

    private void displayIt(final String filename) {
        System.out.println(filename);
        final File file = new File(filename);
        if(file.isDirectory()) {
            for(String nextFilename: file.list()) {
                displayIt(file.getAbsolutePath() + File.separator
                        + nextFilename);
            }
        }
    }
}
