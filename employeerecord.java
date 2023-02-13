import java.util.HashMap;
import java.util.Map;
public class employeerecord {
public static void main(String[] args) {
Map<Integer, String> employeeMap = new HashMap<>();
employeeMap.put(1, "John Doe");
employeeMap.put(2, "Jane Doe");
employeeMap.put(3, "Jim Smith");
System.out.println("Is the employee map empty? " + employeeMap.isEmpty());
employeeMap.remove(2);
employeeMap.clear();
System.out.println("Is the employee map empty? " + employeeMap.isEmpty());
}
}
