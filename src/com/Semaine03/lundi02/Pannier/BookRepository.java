package com.Semaine03.lundi02.Pannier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BookRepository implements IBookRepository {

    List<Book> bookList = new ArrayList<>();
    String uri;

    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;


    @Override
    public void load(String uri) throws IOException {

        System.out.println(System.getProperty("user.dir"));
        BufferedReader reader = new BufferedReader(new FileReader( uri ));
        String line = reader.readLine();
        line = reader.readLine();
        while (line !=null) {   //tant que l'on a pas tout lu on continu de placer line en buffer
            StringTokenizer st = new StringTokenizer(line, ";");

            int id = Integer.parseInt(st.nextToken());
            String title = st.nextToken();
            double price = Double.parseDouble(st.nextToken());
            int nbPage = Integer.parseInt(st.nextToken());
          //  String publisherName = st.nextToken();

            bookList.add( new Book( price,title,nbPage ));
            line = reader.readLine();
        }
        reader.close();
    }


/*
    @Override
    public void load(String uri) throws IOException, ClassNotFoundException {
        ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                new File("bookRepository.csv"))));
        System.out.println(((Book)ois.readObject() ));
        ois.close();
    }

*/




    @Override
    public List<Book> getAll() {
        return bookList;
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public List<Book> getByTitle(String title) {
        return bookList.stream()
                .filter(b->b.getTitle().toUpperCase().contains(title.toUpperCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getByPrice(double price) {
        return bookList.stream().filter(b->b.getNetPrice()<=price).collect(Collectors.toList());
    }

    @Override
    public List<Book> getByPublisher(String publisherName) {
        return null;
    }

    /*
    @Override
    public void add(Book b) throws IOException{
        oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(
                                new File("bookRepository.csv"))));
        //FileOutputStream fos = new FileOutputStream(new File("bookRepository.csv"));
        //String buffer = b.getPrice()+";"+b.getTitle()+";"+b.getNbPage() ;
        oos.writeObject(b);
        oos.close();
    }
*/
    /*
    @Override
    public void add(Book b) throws IOException{

        FileWriter fw = new FileWriter(new File("bookRepository.csv"));
        //FileOutputStream fos = new FileOutputStream(new File("bookRepository.csv"));
        String buffer = b.getPrice()+";"+b.getTitle()+";"+b.getNbPage() ;
        fw.write(buffer);
        //fw.println(buffer);
        fw.close();
    }
*/

    @Override
    public void add(Book b){
        bookList.add(b);
    }



    @Override
    public void remove(Book b) {
        bookList.stream().filter(row -> row.equals(b)).findFirst().orElse(null);
    }

    @Override
    public void update(Book b) {

    }
}
