package snippet;

public class Snippet {
	
	public static void main(String[] args) {
		
		String str1="2019-07-01";  
	
		String str2="2019-07-02";  
	    java.sql.Date date1111=java.sql.Date.valueOf(str1);//converting string into sql date
	    java.sql.Date date11122=java.sql.Date.valueOf(str2);//converting string into sql date		
	   System.out.println(date1111.before(date11122));
	
	// -1 means true
	// 0  means false
	   // 1 means flase 
	}
}

