package com.company.Trie;

public class Main {

    public static void main(String[] args) {
	    Trie t=new Trie();
	    t.insertRecursive("abc");
        t.insertRecursive("abcd");
        t.insertRecursive("abce");
        t.insertRecursive("abgd");
        t.insertRecursive("acd");
        t.insertRecursive("ag");
        t.insertRecursive("laka");
        System.out.println(t.wordCount("abgd"));
        t.delete("abc");
        System.out.println(t.wordCount("ag"));
        System.out.println(t.search("ab"));
    }
}
