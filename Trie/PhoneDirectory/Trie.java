package com.company.Trie;

public class Trie {
    private final TrieNode root;
    public Trie(){
        this.root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for(int i=0;i!=word.length();++i){
            char ch=word.charAt(i);
            TrieNode node=current.getChildren().get(ch).getT();
            if(node==null){
                node=new TrieNode();
                X x=new X(node);
                current.getChildren().put(ch,x);
            }
            current=node;
        }
        current.setEndOfWord(true);
    }
    public String search(String word){
        TrieNode current=root;
        for(int i=0;i!=word.length();++i){
            char ch=word.charAt(i);
            TrieNode node=current.getChildren().get(ch).getT();
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
    public int wordCount(String word){
        return root.wordCount(word,0);
    }
}
