package stringProgram;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // System.out.println("HelloWorld");
		
		String s = ("Hello Everyone");
		String s1 = new String("Welcome to Java");
		char a[] = {'a','b','c','d'};
		String s3 = new String(a);
		
		//length - to find length or size of string
		
		int l = s.length();
		System.out.println(l);
		
		//charAt - to take specif character from a string based on index
		
		char c = s.charAt(1);
		System.out.println(c);
		
	    String var = "Java";
	    String d = "java";
	    String e = "Selenium";
	   
	    // equal
	    
	    System.out.println(var.equals(d));
	    System.out.println(d.equals(e));
	    
	 
	    
	    // equal ignore case
	    
	    System.out.println(var.equalsIgnoreCase(d));
	    
	    //concat- to add or combine 2 strings
	    
	    System.out.println(d.concat(e));
	    
	    System.out.println(d.contains("e"));
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		
		//contain-To check specific word in string
	
		String h = "My name is Praveen";
	 System.out.println(h.contains("name"));
		
	// to upper case - to change lower case string to upper case
		System.out.println(d.toUpperCase());
		
		// to Lower case - to change 
		String m = "JAVA";
		
		System.out.println(m.toLowerCase());
		
		// value of - for type casting - to convert from any type to string
		
		   int y = 5;
		   
		   String r = String.valueOf(y);
		   System.out.println(r);
		   
		   // is empty - to check string is empty or not (space will consider as char)
		   
		   System.out.println(h.isEmpty());
		   
		   String z = " ";
		   System.out.println(z.isEmpty());
		
		   String w = "Hello";
		   String v = "Hello";
		   
		   System.out.println(w==v);
		   
		   String t = new String("Hello");
		   System.out.println(v==t);
	}
	

}
