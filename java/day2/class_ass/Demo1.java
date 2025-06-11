package Demo1.java;

public class Demo1 {

	
     int num =20;
     static int num2 = 42;
     public void show()
     {
    	 float f=233.3f;
    	 System.out.println("instance:"+num);
    	 System.out.println("static"+num2);
    	 System.out.println("local:"+f);
     }
     public static void main(String args[])
     {
    	 Demo1 d1=new Demo1();
    	 d1.show();
     
	}


}
