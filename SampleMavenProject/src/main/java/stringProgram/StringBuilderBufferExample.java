package stringProgram;

public class StringBuilderBufferExample {
	
	public static void main (String[]args) {
		
		
		
		
		StringBuffer a = new StringBuffer("Praveen");
		System.out.println(a);
		
		StringBuilder b = new StringBuilder("Hello");
		 System.out.println(b);
		 
		 // append to add a string to another string
		 
		 System.out.println(b.append(a));
		 System.out.println(b.append(" Word"));
		 
		 //insert - to insert a value at specific index
		 
		 System.out.println(a.insert(0, "Hi"));
		 
		 //Replace - to replace a specific word in string
		 
		 System.out.println(b.replace(0, 2, "good"));
		 
		 // Reverse - to reverse the string
		 
		 System.out.println(b.reverse());
		 
		 // Delete - to delete from specific index
		 
		  System.out.println(b.delete(0, 2));
	}

}
