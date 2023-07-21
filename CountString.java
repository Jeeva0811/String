public class CountString
{
public static void main(String args[])
{
String s="payilagam";
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a')
{
count=count+1;
}

}
System.out.println(count);
}
}
