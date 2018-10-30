package com.company.hashtable;

public class SimpleHashtable {
    private StoredEmployee[] hashTable;
    public SimpleHashtable(){
        hashTable=new StoredEmployee[10];
    }
    private int hashkey(String key){
        return key.length()% hashTable.length;
    }
    private boolean occupied(int index){
        if(hashTable[index]!=null){
            return true;
        }
        return false;
    }
    public void put(String key,Employee employee){
        int hashedkey=hashkey(key);
        if(occupied((hashedkey))){
            int stopIndex=hashedkey;
            if(hashedkey==hashTable.length-1){
                hashedkey=0;
            }
            else{
                hashedkey++;
            }
            while(occupied(hashedkey) && hashedkey!=stopIndex){
                hashedkey=(hashedkey+1) % hashTable.length;
            }
        }
        if(occupied((hashedkey))){
            System.out.println("Sorry u r moron");
        }
        else{
            hashTable[hashedkey]=new StoredEmployee(key,employee);
        }
    }
    public Employee get(String key){
        int hashedkey=findKey(key);
        if(hashedkey==-1){
            return null;
        }
        return hashTable[hashedkey].employee;
    }
    private int findKey(String key){
        int hashedkey=hashkey(key);
        if(hashTable[hashedkey]!=null && hashTable[hashedkey].key.equals(key)){
            return hashedkey;
        }
            int stopIndex=hashedkey;
            if(hashedkey==hashTable.length-1){
                hashedkey=0;
            }
            else{
                hashedkey++;
            }
            while(occupied(hashedkey) && hashedkey!=stopIndex && !hashTable[hashedkey].key.equals(key)){
                hashedkey=(hashedkey+1) % hashTable.length;
            }
            if(stopIndex==hashedkey){
                return -1;
            }
            else{
                return hashedkey;
            }
        }
    public void print(){
        for(int i=0;i<hashTable.length;i++){
            if(hashTable[i]==null){
                System.out.println("empty");
            }
            else {
                System.out.println(hashTable[i].employee);
            }
        }
    }
}
