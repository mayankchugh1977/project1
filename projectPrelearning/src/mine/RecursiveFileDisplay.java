package mine;


import java.io.File;
import java.io.IOException;

public class RecursiveFileDisplay {

    public static void main(String[] args) {
        File currentDir = new File("/wosfilerepo_QA/"); // current directory
        displayDirectoryContents(currentDir);
    }

    public static void displayDirectoryContents(File dir) {
//        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                   // System.out.println("directory:" + file.getCanonicalPath());
                    displayDirectoryContents(file);
                } else {
                    System.out.println(file.getPath());
                            //.getCanonicalPath());
                }
            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}