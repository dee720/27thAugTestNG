
public class Class_Object_Method_Calling {

	public static void main(String[] args) {
	Class_Object_Method_Calling abc; new Class_Object_Method_Calling ();
	// class name object name new ( key word) class name ();
    int result=abc.add();           // calling non static with return by making object
    System.out.println(result);    //30
	
    
    abc.add2();                    // non static no return
    
    Class_Object_Method_Calling.sub2();   // static no return
	
	int a = Class_Object_Method_Calling.sub(); //static, no need to create the object
	System.out.println(a);
	}

   
	public int add()	{               // non static method with return value
		int a = 10; int b = 20;
		int res = a+b;
		return res;
		
   }
	public void add2() {;                // Non static with NO return
	int a = 12; int b = 22;
	System.out.println(a+b);
	
	}
	public static int sub() {             // static method return
		int x = 100; int y = 50;
		int z = x-y;
		return z;
		
	}
	
	
	public static void sub2() {          // static, No return that's why used VOID
		int i = 30; int j = 20;
		System.out.println(i-j);
		
	}
	
	



}


