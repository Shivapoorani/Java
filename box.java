public class box{  
private double width;  
private double height;  
private double depth;  
box(int width, int height, int depth){  
this.width = width;  
this.height = height;  
this.depth = depth;  
}  
double getVolume() {  
return width * height * depth;  
}  
public static void main(String[] args) {  
box box1 = new box(10, 20, 30);  
System.out.print("The volume of Box is " + box1.getVolume());  
}  
}  