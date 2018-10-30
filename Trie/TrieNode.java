package com.company.Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    private Map<Character,TrieNode> children;
    private boolean endOfWord;
    public TrieNode(){
        this.children=new HashMap<>();
        this.endOfWord=false;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public void insertRecursive(String word, int index) {
        if(index==word.length()){
            this.endOfWord=true;
            return;
        }
        char ch=word.charAt(index);
        TrieNode node=this.getChildren().get(ch);
        if(node==null){
            node=new TrieNode();
            this.getChildren().put(ch,node);
        }
        node.insertRecursive(word,index+1);
    }

    public boolean searchRecursive(String word, int i) {
        if(i==word.length()){
            return this.endOfWord;
        }
        char ch=word.charAt(i);
        TrieNode node=this.getChildren().get(ch);
        if(node==null){
            return false;
        }
        return node.searchRecursive(word,i+1);
    }

    public boolean delete(String word,int i) {
        if(i==word.length()) {
            if (!this.isEndOfWord()) {
                return false;
            }
            this.setEndOfWord(false);
            return this.getChildren().size()==0;

        }
        char ch=word.charAt(i);
        TrieNode node=this.getChildren().get(ch);
        if(node==null){
            return false;
        }
        boolean shouldDelete=node.delete(word,i+1);
        if(shouldDelete){
            this.getChildren().remove(ch);
            return this.getChildren().size()==0;
        }
        return false;
    }
}