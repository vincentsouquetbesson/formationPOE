package com.Semaine03.Mercredi04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(System.getProperty("user.dir"));
            BufferedReader reader = new BufferedReader( new FileReader("media.csv"));
            String line = reader.readLine();
            while (line !=null) {
                System.out.println(line);
                line= reader.readLine();
            }
            String s = "A;B;C";
            StringTokenizer st = new StringTokenizer(s,";");
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch( IOException e){
            e.printStackTrace();
        }
    }

}
