package com.test.mine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test
{
	public void testFunction()
	{
		System.out.println("you are here...");
	}

}

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Test test1 = new Test();
		System.out.println(test1.getClass().getName());  //getClass方法取得一个对象  Class<?>.getInstance();
		Object obj1 = new Object();
		System.out.println(obj1.getClass().getName());
		//getClass的实现用到了反射的机制
		
		/*通过反射获取Test类实例化对象的三种方式*/
		//方式1：通过Object类的getClass()方法取得(通常很少用这种方式)
		Test test_1 = new Test();
		Class<?> cls_1 = test_1.getClass();
		System.out.println(cls_1.getName());
//		
//		//方式2：使用“类.class”取得
		Class<?> cls_2 = Test.class;
		System.out.println(cls_2.getName());
		
//		//方式3：使用Class类内部的 forName方法
		Class<?> cls_3 = Class.forName("com.test.mine.Test");
		System.out.println(cls_3.getName());
		Test tst1 = (Test)cls_3.newInstance();
		Test tmp = (Test)tst1;
		
		String str = new String();
		
		//对于对象的实例化，现在可以用除了new之外的另外一种方式了
		Class<?> cls_4 = Test.class; //这里用第二种方法取得 Class 对象
		Object obj = cls_4.newInstance();  //这个函数的返回值类型是Object
		//Test wanted_object = (Test)obj;
		
		Test wanted_object_new = (Test)cls_4.newInstance(); //也可以这样写
		
		Test tmp1 = new Test();
		
		
//		//反射方法
//		Class<?> cls_4 = Class.forName("com.test.mine.Test");
//		Method m1 = cls_4.getDeclaredMethod("testFunction");
//		Object obj = cls_4.newInstance();
//		m1.invoke(obj);
//
//		wanted_object_new.testFunction();
		
		//具体使用场景:降低系统的 耦合程度 
		
	}
}
