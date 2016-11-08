//package com.test.mine;
//
//interface NewFruit {
//public void eat() ;
//}
//
//class NewApple implements NewFruit {
//public void eat() {
//	System.out.println("³ÔÆ»¹û¡£");
//}
//}
//
//class NewOrange implements NewFruit {
//public void eat() {
//	System.out.println("³ÔéÙ×Ó¡£");
//}
//}
//
//
//public class NewFactory {
//	public static NewFruit getInstance(String className){
//		NewFruit ret = null;
//		try {
//			ret = (NewFruit)Class.forName(className).newInstance();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return ret;
//	}
//	//////
//	public static void main(String[] args) {
//		NewFruit apple = NewFactory.getInstance("com.test.mine.NewApple");
//		apple.eat();
//		NewFruit orange = NewFactory.getInstance("com.test.mine.NewOrange");
//		orange.eat();
//	}
//}
