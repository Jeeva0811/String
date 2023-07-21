public class charsortManupulation
{
public static void main(String[] args)
{
String s="java";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
}

for(int i=0;i<c.length;i=i+1)
{
for(int j=i+1;j<c.length;j=j+1)
{
if(c[i]>c[j])
{
char temp=c[i];
c[i]=c[j];
c[j]=temp;
}
}
}
for(int i=0;i<c.length;i=i+1)
{
System.out.println(c[i]);
}
}
}

