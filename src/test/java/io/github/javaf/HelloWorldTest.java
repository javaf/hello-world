package io.github.javaf;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;




/**
 * This is a demo.
 *
 * NOTE:
 * Full version is paid.
 * Quickly, get aboard before it launches!
 */
public class HelloWorldTest {

  public HelloWorldTest() {
  }

  @BeforeAll
  public static void setUpClass() {
  }

  @AfterAll
  public static void tearDownClass() {
  }

  @BeforeEach
  public void setUp() {
  }

  @AfterEach
  public void tearDown() {
  }




  // EQ, IMPLY (FIXED)
  public void testEq() {
    System.out.println("eq(a, b)");
    boolean x;
    // 2.3
    x = HelloWorld.eq(true, true);
    assertEquals(true, x);
    // 2.0
    x = HelloWorld.eq(false, false);
    assertEquals(true, x);
    // 2.2
    x = HelloWorld.eq(true, false);
    assertEquals(false, x);
    // 2.1
    x = HelloWorld.eq(false, true);
    assertEquals(false, x);
  }


  public void testImply() {
    System.out.println("imply(a, b)");
    boolean x;
    // 2.3
    x = HelloWorld.imply(true, true);
    assertEquals(true, x);
    // 2.1
    x = HelloWorld.imply(false, true);
    assertEquals(true, x);
    // 2.0
    x = HelloWorld.imply(false, false);
    assertEquals(true, x);
    // 2.2
    x = HelloWorld.imply(true, false);
    assertEquals(false, x);
  }




  // EQV, IMP (SHORTCUTS)
  public void testEqv() {
    System.out.println("eqv(a, b)");
    boolean x;
    // 2.3
    x = HelloWorld.eqv(true, true);
    assertEquals(true, x);
    // 2.0
    x = HelloWorld.eqv(false, false);
    assertEquals(true, x);
    // 2.2
    x = HelloWorld.eqv(true, false);
    assertEquals(false, x);
    // 2.1
    x = HelloWorld.eqv(false, true);
    assertEquals(false, x);
  }


  public void testImp() {
    System.out.println("imp(a, b)");
    boolean x;
    // 2.3
    x = HelloWorld.imp(true, true);
    assertEquals(true, x);
    // 2.1
    x = HelloWorld.imp(false, true);
    assertEquals(true, x);
    // 2.0
    x = HelloWorld.imp(false, false);
    assertEquals(true, x);
    // 2.2
    x = HelloWorld.imp(true, false);
    assertEquals(false, x);
  }




  // AND (VARIABLE)
  public void testAnd() {
    System.out.println("and[n](a, b, ...)");
    boolean x;
    // 0.0
    x = HelloWorld.and();
    assertEquals(true, x);
    // 1.1
    x = HelloWorld.and(true);
    assertEquals(true, x);
    // 1.0
    x = HelloWorld.and(false);
    assertEquals(false, x);
    // 2.3
    x = HelloWorld.and(true, true);
    assertEquals(true, x);
    // 2.2
    x = HelloWorld.and(true, false);
    assertEquals(false, x);
    // 2.1
    x = HelloWorld.and(false, true);
    assertEquals(false, x);
    // 2.0
    x = HelloWorld.and(false, false);
    assertEquals(false, x);
  }




  // MAIN
  @Test
  public void testMain() throws Exception {
    System.out.println("main");
  }
}
