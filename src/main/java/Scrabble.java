import java.util.ArrayList;
import java.util.List;


class Scrabble {

  public static Integer calculateScore(String word) {
    int total = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'a' || word.charAt(i) == 'e'|| word.charAt(i) == 'i'|| word.charAt(i) == 'o'|| word.charAt(i) == 'u'|| word.charAt(i) == 'l'|| word.charAt(i) == 'n'|| word.charAt(i) == 'r'|| word.charAt(i) == 's'|| word.charAt(i) == 't') {
        total += 1;
      } else if (word.charAt(i) == 'd' || word.charAt(i) == 'g'){
        total += 2;
      } else if (word.charAt(i) == 'b' || word.charAt(i) == 'c'|| word.charAt(i) == 'm'|| word.charAt(i) == 'p') {
        total += 3;
      } else if (word.charAt(i) == 'f' || word.charAt(i) == 'h'|| word.charAt(i) == 'v'|| word.charAt(i) == 'w'|| word.charAt(i) == 'y') {
        total += 4;
      } else if (word.charAt(i) == 'k') {
        total += 5;
      } else if (word.charAt(i) == 'j' || word.charAt(i) == 'x'){
        total += 8;
      } else if (word.charAt(i) == 'q' || word.charAt(i) == 'z'){
        total += 10;
      }

    }

    return total;
  }
}
