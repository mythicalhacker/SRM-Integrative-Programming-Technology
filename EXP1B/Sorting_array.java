import java.io.*; 
import java.util.*;
public class Sorting_array
{
  public static native int[] ArraySorting(int[] array);
  public static void main(String[] args)
  {
    System.loadLibrary("Sorting_array");
    Scanner in=new Scanner(System.in);
    System.out.println("Please enter the number of numbers to be sorted");
    int n=in.nextInt();
    System.out.println("Please enter the elements to be sorted");
    int[] arr=new int[n];
    Sorting_array obj=new Sorting_array();
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int[] array=arr;
    array=obj.ArraySorting(array);
    for(int i=0;i<n;i++)
    {
      System.out.print(array[i]+" ");
    }
    System.out.println("");
  }
}
