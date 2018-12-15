import java.io.*;
import java.util.*;
public class SuperNumber
{
  public static int m1(int x)
  {
    int[] arr=new int[x];
    for(int i=0;i<x;i++)
    {
      arr[i]=m2(i+1);
    }
  }
  public static int m2(int x)
  {
    for(int i=1;i<=x;i++)
    {
      
    }
  }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    int[] brr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=in.nextInt();
    for(int i=0;i<n;i++)
    {
      brr[i]=m1(arr[i]);
    }
  }
}
