
public class Animal_Java {

	private static Animal_Java.Birds Bird;

	public static void main(String[] args) {
	Animal_Java romeo = new Animal_Java();          //first create object
     romeo.barking();                               // calling object with . 
     romeo.sleeping();
	
	
     Birds moti = new Birds() { 
    	  moti.flies(); {                      // 4. created object reference with{
	     moti.chatters();
    	  
     }
      	  
	    Bird.chatters();
	
	}
	
	

    public void barking() {                         // 2nd behavior of object
	System.out.println("romeo barks");
}
    public void sleeping() {
    	System.out.println("romeo sleeps");
    }

   class Birds{                                   // 1.created new class
	   void flies() {;                            // 2. created behavior with(){
	   System.out.println("moti flies");          //3. Syso with }
	   }
	   void chatters() {;                         // 2nd behavior
       System.out.println("moti chatters");
	   
	   }


}}
