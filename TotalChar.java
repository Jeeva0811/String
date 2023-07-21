public class TotalChar
{
public static void main(String args[])
{
String s="Malala got nobel price for peace";
int count1=0,count2=0,count3=0;
//int x=s.length();

//System.out.println("Total length :" + x);

for(int i=0;i<s.length();i=i+1)
{
count1=count1+1;
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{

count2=count2+1;
}

if(s.charAt(i)==' ')
{
count3=count3+1;
}
}
System.out.println("Total count :" + count1);
System.out.println("Vowel count :" + count2);
System.out.println("Total space :" +count3);
int ConsonantCount=count1-count2-count3;
System.out.println("Consonant count :" + ConsonantCount);

}
}
