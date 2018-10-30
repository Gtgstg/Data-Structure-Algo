package com.company.Trie;

public class Main {

    public static void main(String[] args) {
        Trie t=new Trie();
//        t.insert("abcd");
//        t.insert("abcedf");
//        t.insert("asljd");
//        t.insert("avkd");
//        t.insert("avhjvjvd");
//        System.out.println("search");
//        System.out.println(t.search("abcd"));
//        System.out.println(t.search("abcedf"));
//        System.out.println(t.search("asljd"));
//        System.out.println(t.search("avhjvjvd"));
//        System.out.println(t.search("qqqvhjvjvd"));
//        System.out.println("delete");
//        System.out.println(t.delete("avhjvjvd"));
//        System.out.println(t.delete("avhjvjvd"));
//        System.out.println(t.delete("abcd"));
//        System.out.println("search");
//        System.out.println(t.search("abcd"));
//        System.out.println(t.search("abcedf"));
//        System.out.println(t.search("asljd"));
//        System.out.println(t.search("avhjvjvd"));
//        System.out.println(t.search("qqqvhjvjvd"));
        //Recursive
        t.insertRecursive("abcd");
        t.insertRecursive("abcedf");
        t.insertRecursive("asljd");
        t.insertRecursive("avkd");
        t.insertRecursive("avhjvjvd");
        System.out.println("search");
        System.out.println(t.searchRecursive("abcd"));
        System.out.println(t.searchRecursive("abcedf"));
        System.out.println(t.searchRecursive("asljd"));
        System.out.println(t.searchRecursive("avhjvjvd"));
        System.out.println(t.searchRecursive("qqqvhjvjvd"));
        System.out.println("delete");
        System.out.println(t.delete("avhjvjvd"));
        System.out.println(t.delete("avhjvjvd"));
        System.out.println(t.delete("abcd"));
        System.out.println("search");
        System.out.println(t.searchRecursive("abcd"));
        System.out.println(t.searchRecursive("abcedf"));
        System.out.println(t.searchRecursive("asljd"));
        System.out.println(t.searchRecursive("avhjvjvd"));
        System.out.println(t.searchRecursive("qqqvhjvjvd"));
    }
}
