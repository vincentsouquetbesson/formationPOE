package com.Semaine03.lundi02.Pannier;

import javafx.scene.media.MediaException;

import java.util.HashSet;

public class Pannier {
    int nbArticl;

    private HashSet<MediaQuantity> quantitiesList;

    public Pannier(){
        nbArticl = 0;
        quantitiesList =new HashSet<>();
    }


    public void addMedia(IMedia mediaAdd){
        /*
        for( MediaQuantity q:quantitiesList) {
            if(mediaAdd.equals( q.getMedia() ) ){
                System.out.println("valeur trouvé");
                q.addQuantity();
                return;
            }
        }
        quantitiesList.add( new MediaQuantity(mediaAdd) );
        */

        MediaQuantity res = isMediaInCart(mediaAdd);
        if( res != null ){
            System.out.println("valeur trouvé");
            res.addQuantity();
            return;
        }
        quantitiesList.add( new MediaQuantity(mediaAdd) );
    }

    private MediaQuantity isMediaInCart(IMedia m){
        return quantitiesList.stream().filter(row -> row.getMedia() == m).findFirst().orElse(null);
        //     on parcourt les quantité     Si on trouve un resultat, on arrete , sinon null
    }


    public void removeMedia(IMedia mediaAdd){
        for( MediaQuantity q:quantitiesList) {
            if(mediaAdd.equals( q.getMedia() ) ){
                quantitiesList.remove(q);
                return;
            }
        }
    }

    /*
    public void removeQuantityMedia(IMedia mediaAdd) throws MediaException {
        for (MediaQuantity q : quantitiesList) {
            if (mediaAdd.equals(q.getMedia())) {
                if(q.getQuantity () > 1){
                    q.lessQuantity();
                }
                else{
                //    throw MediaException("a");
                    System.out.println("erreur pannier");
                }
            }
        }
    }
    */


    public double getTotalNetPrice( ){
      /*  double totalNetPrice = 0;
        for(MediaQuantity q:quantitiesList) {
            totalNetPrice += q.getNetPrice();
        }
        return "le prix total est: "+totalNetPrice;
*/

        return quantitiesList.stream().mapToDouble(x -> x.getNetPrice()).sum();
    }
}
