package com.java.oops.inheritance;

public class A {//Multi level inheritnace is possible
	int x = 99;

}


class B extends A{
	int x = 100;
	{
		System.out.println(super.x);
	}
}

final class C extends B{//final classes cannot be inherited
	int x = 101;
	
	{
		System.out.println(super.x);
	}
}


//class D extends C{
//	
//}
//class Y extends Z{  //Cyclic inheritance is band
//	
//}
//class Z extends Y{
//	
//}