package org.example.DesignPattern.StructuralDesignPattern.FlyweightDesignPattern.Example1.BetterCode;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character,DocumentCharacter> cacheObject = new HashMap<>();
    public static DocumentCharacter createObject(char ch){
        if(cacheObject.containsKey(ch)){
            return cacheObject.get(ch);
        }
        else{
            DocumentCharacter newObject = new DocumentCharacter(ch,"Ariel",12);
            cacheObject.put(ch,newObject);
            return cacheObject.get(ch);
        }
    }
}
