import java.util.*;
public class palindrome
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sum=0,rem,temp;
temp=n;
if(n<=1000)
{
while(n>0)
{
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
if(temp==n)
{
System.out.print("YES");
}
else
{
System.out.print("NO");
}
}
else
{
System.out.print("NO");
}
