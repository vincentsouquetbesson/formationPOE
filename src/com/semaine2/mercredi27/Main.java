package com.semaine2.mercredi27;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();

        System.out.println(" POINT");
        p1.x = 1;
        p1.y = 2;
        p1.display();
        p1.moveTo(2,8);
        p1.display();
        p1.moveRelative(4,9);
        p1.display();

  /*      System.out.println(" BANQUE");
        Account a1 = new Account("jean X");
        a1.display();
        a1.depot(1000);
        a1.display();
        a1.retrait(15);
        a1.display();
        Account a2 = new Account("jacque Y");
        a1.createFee(-455);
        a1.createFee(1200);
        System.out.println( a1.toString() );
      //  a1.newMonth();
        a1.display();

        Account a3 = new Account();
        System.out.println( a3.toString() );
*/

        Customer c1 = new Customer("Jean X","Meylan");
        Account a1 = new Account(c1);
        a1.depot(1000);
        System.out.println( a1.toString() );

        Customer c2 = new Customer("Michel","Cruet");
        Account a2 = new Account(c2);
        a2.depot(1000);
        System.out.println( a2.toString() );






        Transaction t1 = new Transaction(1200);
        Transaction t2 = new Transaction(200, a1,a2);
        System.out.println( a1.toString() );
        System.out.println( a2.toString() );
        System.out.println(t2.toString());

    }

}
