//In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

//Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
//
//The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
//
//Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
//
//Tags can consist of any printable characters.
//
//Input Format
//
//The first line of input contains a single integer,  (the number of lines).
//The  subsequent lines each contain a line of text.
//
//Constraints
//
//Each line contains a maximum of  printable characters.
//The total number of characters in all test cases will not exceed .
//Output Format
//
//For each line, print the content enclosed within valid tags.
//If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.
//
import java.io.*;
import java.util.regex.*;
import java.math.*;
import java.util.Scanner;

public class TagContentExtractor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while(t>0)
        {
            String line = sc.nextLine();
            Matcher m = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);
            
            if(!m.find())
            {
                System.out.println("None");
                continue;
            }
            m.reset();
            while(m.find()) {
                System.out.println(m.group(2));
            }
        }
	}
}
