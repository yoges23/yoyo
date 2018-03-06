import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int flag=0;
if(n<=1000)
{
if(n==0||n==1)
{
System.out.print("not");
}
else
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
System.out.print("yes");
}
}
}


