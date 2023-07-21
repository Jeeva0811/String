public class Palindrome
{
public static void main(String args[])
{
String s="malayalam";
char c[]=new char[s.length()];
for(int i=s.length()-1;i>=0;i=i-1)
{
//c[i]=s.charAt(i); ..............i=s.length
c[s.length()-1-i]=s.charAt(i);
}
String s1="";  //empty String
for(int i=0;i<c.length;i=i+1)
{
s1=s1+c[i];
}
if(s.equals(s1))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}
