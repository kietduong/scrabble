import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;



public class ScrabbleTest {
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreForWord_7() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 7;
    assertEquals(expected, testScrabble.calculateScore("adam"));
  }
  
}
