package com.example.decrypter.util;

import java.util.*;

public class AlphabetMaps {

    public static HashMap<Character, Integer> getEnglishAlphabetMap(){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i<Alphabet.englishAlphabet.length(); i++){
            hashMap.put(Alphabet.englishAlphabet.charAt(i),0);
        }
        return hashMap;
    }
 
    public static HashMap<Character, Integer> getAlbanianAlphabetMap(){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i<Alphabet.albanianAlphabet.length(); i++){
            hashMap.put(Alphabet.albanianAlphabet.charAt(i),0);
        }
        return hashMap;
    }

    public static LinkedHashMap<Character, Integer> getValueSortedLinkedHashMap(HashMap<Character,Integer> hashMap){
        ArrayList<Map.Entry<Character,Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        sortArrayListwithEntries(entryList);
        LinkedHashMap<Character,Integer> sortedLinkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry : entryList){
            sortedLinkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return sortedLinkedHashMap;
    }

    private static void sortArrayListwithEntries(ArrayList<Map.Entry<Character,Integer>> entryList){
        entryList.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
    }
}
