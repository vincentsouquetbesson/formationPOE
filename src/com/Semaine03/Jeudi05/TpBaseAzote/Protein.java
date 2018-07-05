package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;
import java.util.List;

public class Protein {
    private List<AmineAcid> chain;

    public Protein(){
        chain = new ArrayList<>();
    }



    public ArrayList<Protein> factory(List<AmineAcid> amineAcidsList){
        Protein proteinBuffer = new Protein();
        ArrayList<Protein> proteinsList = new ArrayList<>();

        int nbChain = 0;
        for (AmineAcid a:amineAcidsList){
            if(a.getSymbol() ==" "){
                //System.out.println(" Fin de parcourt");
                proteinsList.add(proteinBuffer);
                proteinBuffer = new Protein();
                nbChain++;
            }
            else{
                //System.out.print(a.getSymbol());
                proteinBuffer.addChain(a);
            }
        }
        //System.out.println(" "+nbChain);
        return proteinsList;
    }


    public List<AmineAcid> getChain(){
        return chain;
    }

    public void addChain(AmineAcid a ){
        chain.add(a);
    }
}
