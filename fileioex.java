import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class fileioex {
public static void main(String[] args) {
String fileName = "message.txt";
String message = "Computer Science and Engineering";
try {
FileWriter writer = new FileWriter(fileName);
writer.write(message);
writer.close();
System.out.println("Writing to file successful");
} 
catch (IOException e) {
System.out.println("An error occurred while writing to file");
e.printStackTrace();
}
try {
FileReader reader = new FileReader(fileName);
int character;
StringBuilder readMessage = new StringBuilder();
while ((character = reader.read()) != -1) {
readMessage.append((char) character);
}
reader.close();
System.out.println("Reading from file successful");
System.out.println("Message: " + readMessage.toString());
} 
catch (IOException e) {
System.out.println("An error occurred while reading from file");
e.printStackTrace();
}
}
}
