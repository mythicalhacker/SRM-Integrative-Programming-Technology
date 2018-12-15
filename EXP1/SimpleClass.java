import java.io.*;
import java.util.*;
public class SimpleClass
{
  static int count;
  public void Increment()
  {
    count=count*10;
    System.out.println(count);
  }
  public native void changecountvalue(SimpleClass sc);
  public static void main(String[] args)
  {
    System.loadLibrary("SimpleClass");
    SimpleClass sc=new SimpleClass();
    count=10;
    System.out.println(count);
    //sc.Increment();
    sc.changecountvalue(sc);
    //sc.Increment();
  }
}
