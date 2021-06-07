package Ex04;
import java.util.Scanner;

// Note: if one of the words contains another, it will also be replaced
// Try world end quick quickly as an example

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String lit_phrase = "noun was able to verb adverb over the adjective wall.";
        System.out.print("Enter a noun, verb, adjective, and adverb in that order. ");

        String noun =input.next();
        String verb = input.next();
        String adjective =input.next();
        String adverb =input.next();

        String end_string = lit_phrase.replaceAll("noun",noun);
        end_string = end_string.replaceAll("verb",verb);
        end_string = end_string.replaceAll("adjective",adjective);
        end_string = end_string.replaceAll("adverb",adverb);

        System.out.print(end_string);

    }
}
