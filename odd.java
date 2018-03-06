import java.util.*;
public class odd
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int m=scan.nextInt();
int n=scan.nextInt();
for(int i=m;i<=n;i++)
{
if(i%2!=0)
{
System.out.print(i);
if(i<=n)
System.out.print(" ");
}}}}
