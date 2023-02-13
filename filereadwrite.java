import java.io.*;
class filereadwrite{
public static void main(String[] args){
String file = "sample.txt"; 
String text = null;
System.out.println("Content of the file: ");
try{
FileReader fileReader = new FileReader(file);
BufferedReader bufferedReader = new BufferedReader(fileReader);
while ((text = bufferedReader.readLine()) != null)
{
System.out.println(text);
}
bufferedReader.close();
}
catch (FileNotFoundException ex){
ex.printStackTrace();
}
catch (IOException ex){
ex.printStackTrace();
}
}
}