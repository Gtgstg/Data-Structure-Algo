package com.company.Trie;

import java.util.HashMap;
import java.util.Map;
class X{
    private int words;
    private TrieNode t;
    public X(TrieNode t){
        this.words=0;
        this.t=t;
    }
    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words+= words;
    }

    public TrieNode getT() {
        return t;
    }

    public void setT(TrieNode t) {
        this.t = t;
    }
    public void print(){

    }
}
public class TrieNode {
    private Map<Character,X> children;
    private boolean endOfWord;
    public TrieNode() {
        this.children = new HashMap<>();
    }
    public Map<Character, X> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, X> children) {
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
        X x=this.getChildren().get(ch);
        if(x==null){
            TrieNode node=new TrieNode();
            x=new X(node);
            this.getChildren().put(ch,x);
        }
        x.setWords(1);
        //System.out.println(ch+" "+x.getWords());
        x.getT().insertRecursive(word,index+1);
    }

    public boolean searchRecursive(String word, int i) {
        if(i==word.length()){
            return this.endOfWord;
        }
        char ch=word.charAt(i);
        TrieNode node=this.getChildren().get(ch).getT();
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
        X x=this.getChildren().get(ch);
        if(x==null){
            return false;
        }
        boolean shouldDelete=x.getT().delete(word,i+1);
        if(shouldDelete){
            this.getChildren().remove(ch);
            return this.getChildren().size()==0;
        }
        x.setWords(-1);
        return false;
    }

    public int wordCount(String word, int i) {
        char ch=word.charAt(i);
        X x=this.getChildren().get(ch);
        if(x==null){
            return 0;
        }
        if(i==word.length()-1){
            return x.getWords();
        }
        return x.getT().wordCount(word,i+1);
    }
}