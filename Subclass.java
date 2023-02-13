class superclass
{
   superclass(){
	System.out.println("Constructor of parent class");
   }
}
class Subclass extends superclass
{
   Subclass(){
	/* Compile implicitly adds super() here as the
	 *  first statement of this constructor.
	 */
	System.out.println("Constructor of child class");
   }
   Subclass(int num){
	/* Even though it is a parameterized constructor.
	 * The compiler still adds the no-arg super() here
	 */
	System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
public static void main(String args[]){
Subclass obj= new Subclass();
obj.display();
Subclass obj2= new Subclass(10);
obj2.display();
   }
}