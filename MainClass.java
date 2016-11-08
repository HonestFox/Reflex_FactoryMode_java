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
		System.out.println(test1.getClass().getName());  //getClass����ȡ��һ������  Class<?>.getInstance();
		Object obj1 = new Object();
		System.out.println(obj1.getClass().getName());
		//getClass��ʵ���õ��˷���Ļ���
		
		/*ͨ�������ȡTest��ʵ������������ַ�ʽ*/
		//��ʽ1��ͨ��Object���getClass()����ȡ��(ͨ�����������ַ�ʽ)
		Test test_1 = new Test();
		Class<?> cls_1 = test_1.getClass();
		System.out.println(cls_1.getName());
//		
//		//��ʽ2��ʹ�á���.class��ȡ��
		Class<?> cls_2 = Test.class;
		System.out.println(cls_2.getName());
		
//		//��ʽ3��ʹ��Class���ڲ��� forName����
		Class<?> cls_3 = Class.forName("com.test.mine.Test");
		System.out.println(cls_3.getName());
		Test tst1 = (Test)cls_3.newInstance();
		Test tmp = (Test)tst1;
		
		String str = new String();
		
		//���ڶ����ʵ���������ڿ����ó���new֮�������һ�ַ�ʽ��
		Class<?> cls_4 = Test.class; //�����õڶ��ַ���ȡ�� Class ����
		Object obj = cls_4.newInstance();  //��������ķ���ֵ������Object
		//Test wanted_object = (Test)obj;
		
		Test wanted_object_new = (Test)cls_4.newInstance(); //Ҳ��������д
		
		Test tmp1 = new Test();
		
		
//		//���䷽��
//		Class<?> cls_4 = Class.forName("com.test.mine.Test");
//		Method m1 = cls_4.getDeclaredMethod("testFunction");
//		Object obj = cls_4.newInstance();
//		m1.invoke(obj);
//
//		wanted_object_new.testFunction();
		
		//����ʹ�ó���:����ϵͳ�� ��ϳ̶� 
		
	}
}
