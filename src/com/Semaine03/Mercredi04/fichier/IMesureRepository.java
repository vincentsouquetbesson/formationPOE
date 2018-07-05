package com.Semaine03.Mercredi04.fichier;

import java.io.IOException;
import java.util.List;

public interface IMesureRepository {
    void load(String uri) throws IOException;
    List<Double> getTheoricalList();
    List<Double> getMesureList();
   // List<Integer> get
    List<Double> getDifferenceList();
    List<Double> getQuadraticList();
    List<Integer> getTimeDifferenceErrorList(double delta);
    List<Integer> getTimeQuadraticErrorList(double delta);

}
