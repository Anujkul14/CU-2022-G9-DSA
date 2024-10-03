package lec3;

import java.util.LinkedList;

public class HashTableChaining {
    public LinkedList<Entry>[] table;
    public int size;

    static class Entry{
        int key;
        String value;
        public Entry(int key,String value)
        {
            this.key = key;
            this.value = value;
        }
    }
    public HashTableChaining(int size)
    {
        this.size = size;
        table = new LinkedList[size];
        for(int i = 0;i < size;i++)
        {
            table[i] = new LinkedList<>();
        }
    }

    public int hash(int key)
    {
        return key % size;
    }

    public void put(int key,String value)
    {
        int index = hash(key);
        for(Entry entry : table[index])
        {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key,value));
    }

    public String get(int key)
    {
        int index = hash(key);
        for(Entry entry : table[index])
        {
            if(entry.key == key) {
                return entry.value;
            }
        }
        return "no value found";
    }

    public static void main(String[] args) {
        HashTableChaining hashTable = new HashTableChaining(10);
        hashTable.put(123,"Apple");
        hashTable.put(245,"Kiwi");
        hashTable.put(243,"Orange");

        System.out.println(hashTable.get(243));
        System.out.println(hashTable.get(145));

    }


}
