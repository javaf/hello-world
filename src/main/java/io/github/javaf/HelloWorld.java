package io.github.javaf;
import java.io.*;

/**
 * I have a question for you.
 */
public class HelloWorld {

  /**
   * Asks a question.
   * @param args command-line arguments
   * @throws IOException input
   */
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("What clothing does a house wear?");
    String ans = in.readLine();
    if (ans.equalsIgnoreCase("address")) System.out.println("Got it!");
    else System.out.println("It's Address!");
  }
}
