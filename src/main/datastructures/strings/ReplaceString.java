package main.datastructures.strings;

public class ReplaceString {

    public String replacelastIndexof(String s){
        s = s.substring(0, s.lastIndexOf(" ")) + " 9";

        return s;
    }
}
