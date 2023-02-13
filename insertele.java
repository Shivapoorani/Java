import java.util.LinkedList;
import java.util.ListIterator;
public class insertele{
public static void main(String[] args) {
LinkedList<String> elements = new LinkedList<>();
elements.add("C");
elements.add("A");
elements.add("E");
elements.add("B");
elements.add("D");
elements.add("F");
ListIterator<String> iterator = elements.listIterator();
while (iterator.hasNext()) {
String element = iterator.next();
iterator.set(element + "+");
}
ListIterator<String> reverseIterator = elements.listIterator(elements.size());
while (reverseIterator.hasPrevious()) {
System.out.println(reverseIterator.previous());
}
}
}
