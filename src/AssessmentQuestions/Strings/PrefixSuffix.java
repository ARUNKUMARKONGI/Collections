package AssessmentQuestions.Strings;
import java.util.*;
public class PrefixSuffix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            int n = str.length();
            String prefix = "";
            for (int i = 1; i < n; i++) {
                prefix = str.substring(0, i);
                String suffix = str.substring(n - i);

                if (prefix.equals(suffix)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
