package io.github.javaf;
import java.io.*;




/**
 * A "Hello, World!" is an introductory computer program.<br>
 * 📦 <a href="https://search.maven.org/artifact/io.github.javaf/hello-world">Central</a>,
 * 📜 <a href="https://repo1.maven.org/maven2/io/github/javaf/hello-world/">Releases</a>,
 * 😺 <a href="https://github.com/javaf/hello-world/packages/579834">GitHub</a>,
 * 🐸 <a href="https://bintray.com/beta/#/bintray/jcenter/io.github.javaf:hello-world">Bintray</a>,
 * 🦚 <a href="https://mvnrepository.com/artifact/io.github.javaf/hello-world">MvnRepository</a>,
 * 📰 <a href="https://javaf.github.io/hello-world/">Javadoc</a>,
 * 📘 <a href="https://github.com/javaf/hello-world/wiki">Wiki</a>.
 */
public class HelloWorld {

  // CONSTANTS
  private static final String STRUE = "true";
  private static final String SFALSE = "false";




  // EQ, IMPLY (FIXED)
  /**
   * Check if antecedent ⇔ consequent (a ⇔ b).
   * <a href="https://github.com/javaf/hello-world/wiki/eq">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *eq(true, true)   == true
   *eq(false, false) == true
   *eq(true, false)  == false
   *eq(false, true)  == false
   *}</pre>
   */
  public static boolean eq(boolean a, boolean b) {
    return a == b;
  }


  /**
   * Check if antecedent ⇒ consequent (a ⇒ b).
   * <a href="https://github.com/javaf/hello-world/wiki/imply">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *imply(true, true)   == true
   *imply(false, true)  == true
   *imply(false, false) == true
   *imply(true, false)  == false
   *}</pre>
   */
  public static boolean imply(boolean a, boolean b) {
    return !a || b;
  }




  // EQV, IMP (SHORTCUTS)
  /**
   * Check if antecedent ⇔ consequent (a ⇔ b).
   * <a href="https://github.com/javaf/hello-world/wiki/eqv">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *eqv(true, true)   == true
   *eqv(false, false) == true
   *eqv(true, false)  == false
   *eqv(false, true)  == false
   *}</pre>
   */
  public static boolean eqv(boolean a, boolean b) {
    return eq(a, b);
  }


  /**
   * Check if antecedent ⇒ consequent (a ⇒ b).
   * <a href="https://github.com/javaf/hello-world/wiki/imp">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *imp(true, true)   == true
   *imp(false, true)  == true
   *imp(false, false) == true
   *imp(true, false)  == false
   *}</pre>
   */
  public static boolean imp(boolean a, boolean b) {
    return imply(a, b);
  }




  // AND (VARIABLE)
  /**
   * Check if all values are true.
   * <a href="https://github.com/javaf/hello-world/wiki/and">📘</a>
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and() {
    return true;
  }


  /**
   * Check if all values are true.
   * <a href="https://github.com/javaf/hello-world/wiki/and">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a) {
    return a;
  }


  /**
   * Check if all values are true.
   * <a href="https://github.com/javaf/hello-world/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b) {
    return a && b;
  }




  // MAIN
  /**
   * Here is a puzzle for you!
   * @param args command-line arguments
   * @throws IOException on exit
   *<pre>{@code
   *main([])
   *}</pre>
   */
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("What clothing does a house wear?");
    String ans = in.readLine();
    if (ans.equalsIgnoreCase("address")) System.out.println("Got it!");
    else System.out.println("It's Address!");
  }
}
