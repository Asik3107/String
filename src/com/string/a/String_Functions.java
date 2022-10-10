package com.string.a;

public class String_Functions {
	

	

	

	public static void main(String[] args) {
		
		String h="Mohammed";
		System.out.println(h+"Asik");
		int j=h.length();
		System.out.println(j);
		System.out.println(h);
		
		
		
		
		
		StringBuffer name=new StringBuffer("Mohammed");
		System.out.println(name.append("Asik"));
		
		int u=name.length();
		
		System.out.println(u);
		System.out.println(name);
		
		
		int m=name.length();
		System.out.println(m);
		
		int o=name.length()-1;
		System.out.println(o);
		
		boolean h1 = name.equals("Mohammed Asik");  //case sensitivity
		System.out.println(h);
		
		boolean a = name.equalsIgnoreCase("mohammed asik");
		System.out.println(a);
		
		String upper = name.toUpperCase();
		System.out.println(upper);
		
		
		String lower = name.toLowerCase();
		System.out.println(lower);
		
	    char charAt = name.charAt(10);
	    System.out.println(charAt);
	    
	    int l = name.indexOf('a');
		System.out.println(l);
		
		int l1 = name.lastIndexOf('A');
		System.out.println(l1);
		
		boolean contains = name.contains("Asik");
		System.out.println(contains);
	
		
		
		
	}

	}


