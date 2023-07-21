public class TotalVowelCount
{
public static void main(String args[])
{
String s="Malala got nobel price for peace";
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
count=count+1;
}

}
System.out.println(count);
}
}
