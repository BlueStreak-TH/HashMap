package edu.cscc;

import java.io.File;
import java.util.Set;

/*
Name Tihitina Hade, Date 11/26/2019

Description-- The main purpose of this program is to print a unique list of all the words in the document from "At the Mountains of Madness" Novel.
*/
public class Main {
    private static final String fname = "AtTheMountainsOfMadness_HP_Lovecraft.txt";

    public static void main(String[] args) {
        File myfile = new File(fname);
        Set<String> uniques = UniqueWords.processDocument(myfile);
        for (String s : uniques) {
            System.out.println(s);
        }
        System.out.println("Got "+uniques.size()+" words");
    }
}
