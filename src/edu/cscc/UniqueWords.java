package edu.cscc;

import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Utility to process a document to into sorted set of unique words
 * @author student name
 */
public class UniqueWords {

    private static Scanner input = new Scanner(System.in);
    /**
     * Read file one line at a time
     * Break input String into words
     * Store unique words sorted into alphabetic order
     *
     * @param myfile input file
     * @return sorted set of unique words
     */
    public static Set<String> processDocument(File myfile) {

        // and return a Set of sorted unique words. Choose the correct Collection
        // type to handle a sorted unique set of words. You will need to make use
        // of the tokenize() method below.

        TreeSet<String> set1 = new TreeSet<>();
        try {
            Scanner input = new Scanner(myfile);
            while (input.hasNext()) {
                String st = input.nextLine();
                String[] uni = tokenize(st);
                for (String word : uni) {
                    set1.add(word);
                }
            }
        } catch (Exception e) {

        }

        return set1;

    }
        /**
         * Remove all punctuation and numbers from String
         * Tokenize - break into individual words
         * Convert all words to lower case
         * @param str initial non-null String
         * @return array of words from initial String
         */
        public static String[] tokenize(String str){
            str = str.replaceAll("[^a-zA-Z \n]", " ");
            String[] tok = str.split(" ");
            for (int i = 0; i < tok.length; ++i) {
                tok[i] = tok[i].toLowerCase();
            }
            return tok;
        }
    }
