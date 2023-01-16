import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("alecscripts", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit alecscripts!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
      // Match found
      System.out.println(matcher);
      // .Matcher[pattern=alecscripts region=0,18 lastmatch=alecscripts]
      
    } else {
      System.out.println("Match not found");
    }
  }
}

