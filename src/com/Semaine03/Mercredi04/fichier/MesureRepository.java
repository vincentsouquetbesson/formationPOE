package com.Semaine03.Mercredi04.fichier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class MesureRepository implements IMesureRepository {
    BufferedReader reader;
    //ArrayList<String> bufferRow = new ArrayList<>();

    private List<Double> theoricalList  = new ArrayList<>();
    private List<Double> mesureList  = new ArrayList<>();
    private List<Double> differenceList  = new ArrayList<>();
    private List<Double> quadratiqueList  = new ArrayList<>();
    private List<Integer> timeDifferenceErrorList  = new ArrayList<>();
    private List<Integer> timeQuadratiqueErrorList  = new ArrayList<>();

    public MesureRepository(){

    }


    @Override
    public void load(String uri) throws IOException {
        StringTokenizer st;

        System.out.println(System.getProperty("user.dir"));
        reader = new BufferedReader(new FileReader( uri ));
        String line = reader.readLine();
        while (line !=null) {   //tant que l'on a pas tout lu on continu de placer line en buffer
            st = new StringTokenizer(line,";");
            st.nextToken();
            double theorical = Double.parseDouble(st.nextToken());
            double mesure = Double.parseDouble(st.nextToken());
            theoricalList.add( theorical);
            mesureList.add( mesure );
            line = reader.readLine();
        }
    }


    @Override
    public List<Double> getTheoricalList() {
        return theoricalList;
    }

    @Override
    public List<Double> getMesureList() {
        return mesureList;
    }



    @Override
    public List<Double> getDifferenceList() {
        //double difference;
        for(int i = 0; i < theoricalList.size();i++){
            differenceList.add( mesureList.get(i)- theoricalList.get(i) );
        }
        return differenceList;
    }


    @Override
    public List<Double> getQuadraticList() {
        for(int i = 0; i < theoricalList.size();i++){
            quadratiqueList.add(  (mesureList.get(i)- theoricalList.get(i) )* (mesureList.get(i)- theoricalList.get(i) )  );
        }
        return quadratiqueList;
    }

    @Override
    public List<Integer> getTimeDifferenceErrorList(double delta) {
        for(int i = 0; i < differenceList.size();i++){
            if(Math.abs(differenceList.get(i))>= delta){
                timeDifferenceErrorList.add(i+1);
            }
        }
        return timeDifferenceErrorList;
    }



    @Override
    public List<Integer> getTimeQuadraticErrorList(double delta) {
        for(int i = 0; i < quadratiqueList.size();i++){
            if( quadratiqueList.get(i) >= delta ) {
                timeQuadratiqueErrorList.add( i+1 );
            }
        }
        return timeQuadratiqueErrorList;
    }
}
