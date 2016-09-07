import java.io.Console;

public class App {
  public static void main(String[] args) {
  Console console = System.console();

  System.out.println("Welcome to the Scrabble Scorer. Enter a word and we will tell you your word score.");

  String wordInput = console.readLine().toLowerCase();
  Scrabble.calculateScore(wordInput);

  System.out.println(Scrabble.calculateScore(wordInput));
  }
}
