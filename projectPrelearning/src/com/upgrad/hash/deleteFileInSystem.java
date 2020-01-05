package com.upgrad.hash;

import java.io.File;

public class deleteFileInSystem {



        public static void main (String[]args)
        {

            File file = new File("/wosfilerepo_QA/userfiles/2019/5/6/20190506113407818_luv.jpg");

            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        }


}
