import java.util.*;
public class ntiles{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of tiles: ");
int n = sc.nextInt();
System.out.println("Enter the letters on the tiles: ");
String tiles = sc.next();
int[] count = new int[26];
for (int i = 0; i < n; i++) {
count[tiles.charAt(i) - 'A']++;
}
long res = 1;
for (int i = 0; i < 26; i++) {
res = res * (count[i] + 1) % 1000000007;
}
System.out.println("The number of possible non-empty sequences of letters: " + (res - 1));
}
}
