public class week1_2 {
    public static void main(String[] args)
{
	int myInt=9;
	double myDouble=myInt;
	System.out.println(myInt);
	System.out.println(myDouble);
    int x=150;
	int y=x+250;
    System.out.println(x);
	System.out.println(y);
    String val="hello world ";
    System.out.println(val+y);
    int z=(x==150)?100:200;
    System.out.println(z);
    System.out.println("The length of string is " + val.length());
    System.out.println("The string in upper " + val.toUpperCase());
    System.out.println("The string in lower " + val.toLowerCase());
    System.out.println("The index of \"o\" " + val.indexOf("o"));
}
    
}
