package com.company.mergesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Trie {
    private class TrieNode {
        TreeMap<Character, TrieNode> children;
        boolean endOfWord;
        String list;
        public TrieNode() {
            children = new TreeMap();
            endOfWord = false;
            list="";
        }
    }

    private final TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);
    }


    private void insertRecursive(TrieNode current, String word, int index) {
        if(index==word.length()){
            current.endOfWord=true;
            current.list=word;
            return;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            node = new TrieNode();
            current.children.put(ch, node);
        }
        insertRecursive(node, word, index+1);
    }
    public void searchRecursive(String word) {
        searchRecursive(root, word, 0);

    }
    private boolean searchRecursive(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if(current.endOfWord==true)
                System.out.print(current.list+" ");
            Stack<TrieNode> stack=new Stack();
            ArrayList<Character> keys = new ArrayList(current.children.keySet());
            for (int i = keys.size() - 1; i >= 0; i--) {
                stack.push(current.children.get(keys.get(i)));
            }
            while(!stack.isEmpty()) {
                TrieNode node = stack.pop();
                if(node!=null) {
                    if(node.endOfWord==true)
                        System.out.print(node.list + " ");
                    keys = new ArrayList(node.children.keySet());
                    for (int i = keys.size() - 1; i >= 0; i--) {
                        stack.push(node.children.get(keys.get(i)));
                    }
                }
            }
            System.out.println();
            return true;
        }
        char ch = word.charAt(index);
        TrieNode node = current.children.get(ch);
        if (node == null) {
            System.out.println(0);
            return false;
        }
        return searchRecursive(node, word, index + 1);

    }
}
public class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(r.readLine());
        for(int i=0;i<t;++i){
            Trie trie=new Trie();
            int n=Integer.parseInt(r.readLine());
            String[] s=r.readLine().split(" ");
            for(int j=0;j<s.length;j++){
                trie.insertRecursive(s[j]);
            }
            String v=r.readLine();
            String c="";
            for(int j=0;j<v.length();j++) {
                c = v.substring(0, j + 1);
                trie.searchRecursive(c);
            }
        }
    }
}