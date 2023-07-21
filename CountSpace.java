public class CountSpace
{
public static void main(String args[])
{
String s="Malala got nobel price for peace";
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)==' ')
{
count=count+1;
}

}
System.out.println(count);
System.out.println(count+1);
}
}
