package datareader;

import java.io.*;
import java.io.FileReader;

public class ReadData {


    public static void main(String[] args) {

        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        // Path type
        // Absolute Path: Full Path
        // Relative Path: Relatively shorter path


        String filePath="G:\\SOFTWARE ENGINEERING\\PROJECTS\\IdeaProjects\\PNT\\LearnJava_WeekendMorningSeleniumNY_Winter2020\\DataTest\\Sample.txt";


        try {
            fileReader=new FileReader(filePath);
            bufferedReader=new BufferedReader(fileReader);

            String data;

            while (    (data=bufferedReader.readLine())  != null   ){
                System.out.println(data);
            }
        } catch (Exception e){
            //e.printStackTrace();
            System.out.println("File not Found");
        } finally {
            // Finally is block which will execute must

            try{
                fileReader.close();
                bufferedReader.close();

            } catch (Exception e){
                //e.printStackTrace();
                System.out.println("File Already close");
            }



        }










    }




}
