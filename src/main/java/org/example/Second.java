package org.example;

public class Second {
     static String toggleWords(String str) {
        String chuoi[] = str.split("\\s");
        String toggleTam = "";
        for(String i: chuoi){
            StringBuffer cd = new StringBuffer(i);
            cd.reverse();
          String firstLetter = cd.substring(0,1);
          String afterLeeter = cd.substring(1);
          toggleTam += firstLetter.toLowerCase()+afterLeeter.toUpperCase() + " ";
        }
        return toggleTam;
    }

}





