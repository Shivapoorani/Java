import java.util.Hashtable;
public class bankdetail{
public static void main(String[] args) {
Hashtable<Integer, String> bankDetails = new Hashtable<>();
bankDetails.put(101, "John Doe");
bankDetails.put(102, "Jane Doe");
bankDetails.put(103, "Jim Doe");
System.out.println("Size of the HashTable: " + bankDetails.size());
bankDetails.clear();
System.out.println("HashTable cleared");
}
}
