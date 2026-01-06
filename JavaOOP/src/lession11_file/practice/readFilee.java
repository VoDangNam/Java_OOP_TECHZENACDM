package lession11_file.practice;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class readFilee {
    private static final Logger logger = Logger.getLogger(readFilee.class.getName());

    public static void main(String[] args) {
        File file = new File("JavaOOP/src/lession11_file/data/input");
//        BufferedReader bufferedReader = null;
        /// Try with resoucre

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>Loi doc file", e);
        }



  /*
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
*//*

            System.out.println(bufferedReader.lines());
            System.out.println(bufferedReader.lines());
            System.out.println(bufferedReader.lines());
            System.out.println(bufferedReader.lines());
*//*

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, ">>>>Loi doc file!!!", e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                logger.log(Level.SEVERE, ">Loi khi dong bufferRead", e);
            }*//*catch (NullPointerException e){
                logger.log(Level.SEVERE,">>>Loi Null",e);   //Bat Null thay cho dong 32,34
            }*//*
        }
*/


    }
}
