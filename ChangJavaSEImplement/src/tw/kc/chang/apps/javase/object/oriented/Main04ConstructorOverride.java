package tw.kc.chang.apps.javase.object.oriented;

import tw.kc.chang.apps.javase.object.tool.Tool03ConstructorOverride;

public class Main04ConstructorOverride {

	public static void main(String[] args) {
		// Java中字串事物件的概念
		// 雙引號 => 字串 ； 單引號 => 字元
		// 字串的equals方法是用來比對字串內容
		String s1 = new String();
		Tool03ConstructorOverride b1 = new Tool03ConstructorOverride();
		
		// System.out.println(s1.toString());
		// System.out.println(s1);
		// System.out.println(b1.toString());
		// System.out.println(b1);
		
		byte[] b2 = {97,98,99,100,101,102,103};
		String s2 = new String(b2);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = new String(b2, 2, 4);
		System.out.println(s3);
		
		System.out.println("----------------");
		
		String a1 = new String(b2); // "abcdefg"
		String a2 = new String(b2); // "abcdefg"
		System.out.println(a1 == a2); // 因為兩個物件記憶體位址不同
		System.out.println(a1.equals(a2));
		
		System.out.println("----------------");
		
		Tool03ConstructorOverride t1 = new Tool03ConstructorOverride();
		Tool03ConstructorOverride t2 = new Tool03ConstructorOverride();
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));
		
		System.out.println("----------------");
		
		String a3 = "abcdefg"; // 雙引號包起來就形成物件
		
	}

}
