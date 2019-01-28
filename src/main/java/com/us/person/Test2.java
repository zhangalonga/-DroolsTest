package com.us.person;


import java.io.*;

/**
 * created by zhangalong on 2019/1/28
 */
public class Test2 {
    public static void readFile(String filePath, String encoding) {
        long point = 0;
        try {
            String config = "where.txt";
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(config));
            RandomAccessFile ras = new RandomAccessFile(filePath, "r");
            if (point > 0) {
                ras.seek(point);
            }
            String line;
            while ((line = ras.readLine()) != null) {
                if (line != null && line != "") {
                    line = new String(line.getBytes("ISO-8859-1"), encoding);
                    String[] split = line.split(" ");
                    System.out.println(split[0]);
                    bWriter.write(split[0]+ "\r\n");
                }
            }
            ras.close();
            bWriter.close();
        } catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("F:\\元气阅读50个账号_2018-07-27.txt","UTF-8");
    }
}
