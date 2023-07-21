public class LastIndex
{
public static void main(String args[])
{
String s="Malala got nobel price for peace";
for(int i=s.length()-1;i>=0;i=i-1)
{
if(s.charAt(i)=='a')
{

System.out.println(i);
break;
}

}
}
}
