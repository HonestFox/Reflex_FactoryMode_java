//package com.test.mine;
//
///////����ģʽ
//
//interface Fruit {
//public void eat() ;
//}
//
//class Apple implements Fruit {
//public void eat() {
//	System.out.println("��ƻ����");
//}
//}
//
//class Orange implements Fruit {
//public void eat() {
//	System.out.println("�����ӡ�");
//}
//}
//
///////////////////////
//public class ClassFactory {
//	public static Fruit getInstance(String className) {
//		if("apple".equals(className)){
//			return new Apple() ;
//		}
//		if("orange".equals(className)){
//			return new Orange();
//		}
//		
//		//////.......
//		return null;
//	}
//	
//	public static void main(String[] args) {
//		Fruit apple = ClassFactory.getInstance("apple");
//		apple.eat();
//		Fruit orange = ClassFactory.getInstance("orange");
//		orange.eat();
//	}
//}
//
//
//
