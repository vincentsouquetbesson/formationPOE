package com.Semaine03.Jeudi05.TpBaseAzote;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DNARepository extends DNA{

    private String brinBuffer = "";
    private ArrayList<Base> baseList;

    public void load()throws  IOException {
        System.out.println(System.getProperty("user.dir"));
        BufferedReader reader = new BufferedReader( new FileReader("dna.txt"));
        brinBuffer = reader.readLine();
        System.out.println(brinBuffer.length());
        System.out.println(brinBuffer);
        super.getDNA(brinBuffer);

    }



}
