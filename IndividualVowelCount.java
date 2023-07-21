public class IndividualVowelCount
{
public static void main(String args[])
{
String s="Malala got nobel price for peace";
int a=0;
int b=0;
int c=0;
int d=0;
int e=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a')
{
a=a+1;
}
if(s.charAt(i)=='e')
{
b=b+1;
}
if(s.charAt(i)=='i')
{
c=c+1;
}
if(s.charAt(i)=='o')
{
d=d+1;
}
if(s.charAt(i)=='u')
{
e=e+1;
}
}
System.out.println(a+" "+b+" "+c+" "+d+" "+e);
/*System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);*/
}
}
