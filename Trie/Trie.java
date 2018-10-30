package com.company.Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final TrieNode root;
    public Trie(){
        this.root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for(int i=0;i!=word.length();++i){
            char ch=word.charAt(i);
            TrieNode node=current.getChildren().get(ch);
            if(node==null){
                node=new TrieNode();
                current.getChildren().put(ch,node);
            }
            current=node;
        }
        current.setEndOfWord(true);
    }
    public String search(String word){
        TrieNode current=root;
        for(int i=0;i!=word.length();++i){
            char ch=word.charAt(i);
            TrieNode node=current.getChildren().get(ch);
            if(node==null){
                return "Not Found";
            }
            current=node;
        }
        if(current.isEndOfWord()) {
            return "Found";
        }else{
            return "Not Found";
        }
    }
    public void insertRecursive(String word){

        root.insertRecursive(word,0);
    }
    public String searchRecursive(String word){
        boolean find=root.searchRecursive(word,0);
        if(find){
            return "Found";
        }
        else{
            return "Not Found";
        }
    }
    public String delete(String word){
        boolean find=false;
        if(search(word)=="Found"){
            find=true;
        }
        root.delete(word,0);
        if(find){
            return "Deleted";
        }
        return "Not Present";
    }
}
