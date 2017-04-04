package stringFunctionsPkg;

public class StringFun_Main {

	public void funCharAt()
	{
		//returns char value for the particular index
		String name="Selenium Automation";		
		char ch=name.charAt(4);//returns the char value at the 4th index  -- n // Start with 0--4
		System.out.println(ch);  
		System.out.println(name.charAt(8));
		if(name.charAt(4)=='n')
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
	}
	
	public void funLenght()
	{
	
		//returns string length
		String s1="Selenium Automation";  
		String s2="Selenium";  
		System.out.println("string length is: "+s1.length());//19 is the length of Selenium Automation string  
		System.out.println("string length is: "+s2.length());//8 is the length of Selenium string  
	}
	public void funSubString()
	{
		//returns substring for given begin index and end index
		String s1="Selenium Automation";  
		System.out.println(s1.substring(2));//returns lenium Automation
		System.out.println(s1.substring(2,5));//returns len  ---->[Se"len"]
		System.out.println(s1.substring(0,5));//returns len  ---->[Se"len"]
	
	}
	public void funContains()
	{
		//returns true or false after matching the sequence of char value
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
	}
	public void funJoin()
	{
		//returns a joined string
		String joinString1=String.join("-","welcome","to","Selenium Automation");  
		System.out.println(joinString1);
		
	}
	
	public void funIsEmpty()
	{
		//checks if string is empty
		String s = null;
		String s1="";  
		String s2="Selenium Automation";
		
		//System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());
	}
	public void funConcat()
	{
		//concatinates specified string
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1.concat("is immutable---"));
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  
	}
	
	public void funReplace()
	{
		//replaces all occurrences of specified char value
		String s1="Selenium Automation is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);  
		
		String s2="my name Is khan my name is java";  
		String replaceString2=s2.replace("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString2);  
	}
	
	public void funEquals()
	{
		String s1="Selenium Automation";  
		String s2="selenium Automation";  
		String s3="SElenium Automation";  
		String s4="Selenium";
		String s5="Selenium Automation";
		System.out.println(s1.equals(s5));//true because content and case is same  
		if(s1==s5)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same
		System.out.println(s1.equals(s5));//True 
		
	}
	public void funIndexOf()
	{
		//returns specified char value index
		String s1="this is index of example index";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1+"  "+index2);//2 8  
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 i.e. the index of another is  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3 
	}
	
	public void funSplit()
	{
		String s1="java string split method by-Selenium Automation";  
		String[] words=s1.split("-");//splits the string based on string  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		String s1="java";//creating string by java string literal  
//		
//		char ch[]={'s','t','r','i','n','g','s'};  
//		String s2=new String(ch);//converting char array to string  
//		  
//		String s3=new String("example");//creating java string by new keyword  
//		
//		String s4 = new String();
//		s4="Java object";
//		
//		String env = "PROD ";
//	
//		if(env.toLowerCase().trim().equals("prod"))
//		{
//			System.out.println("Production environment");
//		}
//		else
//		{
//			System.out.println("Test");
//		}
//		
//		if("PROD"=="PROD")
//		{
//			System.out.println("String = Production environment");
//		}
//		else
//		{
//			System.out.println("String = Test");
//		}
//		
//		System.out.println(s1);  
//		System.out.println(s2);  
//		System.out.println(s3);  
//		
//		
		
		StringFun_Main ObjString = new StringFun_Main();
//		ObjString.funCharAt();
//		ObjString.funLenght();
//		ObjString.funSubString();
//		ObjString.funContains();
//		ObjString.funJoin();
//		ObjString.funIsEmpty();
//		ObjString.funConcat();
//		ObjString.funReplace();
		ObjString.funEquals();
		ObjString.funIndexOf();
		ObjString.funSplit();

		
		
		
	}

}
