
public class OptimizedPalindrome
{
public static void main(String args[])
{
String s = "java";
String x=""; 
char c[] = new char[s.length()];
for(int i=0 ; i < c.length;i=i+1)
{
c[i]=s.charAt(s.length()-1-i);
x=x+c[i];
}
System.out.println(x);
if(s.equals(x))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}
}

