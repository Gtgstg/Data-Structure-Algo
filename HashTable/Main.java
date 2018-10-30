package com.company.hashtable;

public class Main {

    public static void main(String[] args) {
        Employee daa211=new Employee("sasas","adas",1);
        Employee daa213=new Employee("sasasxzc","avvsvdsdas",132);
        Employee daa11121=new Employee("22wdsasas","adas",13333);
        Employee dasdsa=new Employee("sa2412ecacsas","adaascs",1342);
        SimpleHashtable s=new SimpleHashtable();
        s.put("sdd",daa211);
        s.put("scxzcd",daa213);
        s.put(" sssd",daa11121);
        s.put("s dsd",dasdsa);
        s.print();
        System.out.println("akasljdsla"+s.get("sdd"));
    }
}
