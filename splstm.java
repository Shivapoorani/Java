import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class splstm{
public static void main(String[] args) {
String statement = "Modi Birthday @ September 17, #&$% is the wishes code for him";
int count = 0;
Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]");
Matcher matcher = pattern.matcher(statement);
while (matcher.find()) {
count++;
}
System.out.println("Number of special characters: " + count);
}
}
