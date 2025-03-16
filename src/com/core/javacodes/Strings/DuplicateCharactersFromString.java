package com.core.javacodes.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharactersFromString {

    public static List<Character> findDuplicateChar(String str) {

        List<Character> duplicateCharactersList = new ArrayList<>();
        if(str == null)
        {
            System.out.println("NULL String");
            return new ArrayList<>(){};
        }else if(str.isEmpty())
        {
            System.out.println("No Characters found");
            return new ArrayList<>(){};
        }
       char [] chars = str.toCharArray();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (char ch : chars)
        {
            if(characterIntegerMap.containsKey(ch))
            {
                characterIntegerMap.put(ch,characterIntegerMap.get(ch)+1);
            }
            else {
                characterIntegerMap.put(ch, 1);
            }
        }

        //get values from HashMap
        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate element is : "+entry.getKey());
                duplicateCharactersList.add(entry.getKey());
            }
        }

        return duplicateCharactersList;
    }

    public static void main(String[] args) {
        String name = "Gu";
        List<Character> duplicateCharList = findDuplicateChar(name);
        System.out.println(duplicateCharList.toString());
    }
}
