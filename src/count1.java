import java.io.*;
import java.util.*;
class count1
{
	static void maa(int max,int[] a,int n,int[] b)
	{
		int c1=0,k;
		for(k=0;k<n-1;k++)
{
	if(a[k]==a[k+1])
	{
		c1++;
	}
	else
	{
		c1=0;
	}
	if(c1==max-1 && b[a[k]]==max)
	{
		while(c1>=0)
		{
	System.out.print(a[k]);	
	c1--;
		}
	}	
}
if(max>1)
maa(max-1,a,n,b);	
	}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,max=0;
int n=s.nextInt();
int[] a=new int[n];
int[] b=new int[10];
for(i=0;i<n;i++)
{
a[i]=s.nextInt(); 
}
for(i=0;i<n;i++)
{
b[a[i]]++;
}
for(i=0;i<10;i++)
{
	if(max<b[i])
	{
		max=b[i];
	}
}
maa(max,a,n,b);
}
}