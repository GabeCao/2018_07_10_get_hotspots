package com.lv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FiveSeconds5 {
//    将sensor的数据进行改变，每五秒钟取一次
    public static void main(String[] args) throws Exception{
        File fileFolder = new File("C:\\Users\\lv\\Desktop\\数据2018_07_18\\2009-03-10\\2009-03-10_4_去掉相同时刻的点");
        File[] files = fileFolder.listFiles();
        for (File file : files) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File outFile = new File("C:\\Users\\lv\\Desktop\\数据2018_07_18\\2009-03-10\\2009-03-10_5_每五秒取一次数据\\" + file.getName());
            FileWriter fileWriter = new FileWriter(outFile, true);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write(line + "\n");
                line = bufferedReader.readLine();
                line = bufferedReader.readLine();
                line = bufferedReader.readLine();
                line = bufferedReader.readLine();
            }
            fileWriter.close();
        }
    }
}
