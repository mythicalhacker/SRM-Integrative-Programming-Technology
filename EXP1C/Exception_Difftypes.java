import java.io.*;
import java.util.*;
public class Exception_Difftypes
{
  public native int intMethod(int x,int y);
  public native boolean booleanMethod(boolean text) throws NullPointerException;
  public native String stringMethod(String text);
  public native void doit() throws IllegalArgumentException;
  public void callback() throws NullPointerException
  {
    throw new NullPointerException("CatchThrow.callback");
  }
  public static void main(String[] args)
  {
    System.loadLibrary("Exception_Difftypes");
    Scanner in=new Scanner(System.in);
    Exception_Difftypes obj=new Exception_Difftypes();
    System.out.println("Please enter two numbers");
    int x=in.nextInt();
    int y=in.nextInt();
    System.out.println("Please enter 1 for true and 2 for false");
    int m=in.nextInt();
    boolean l;
    if(m==1)
    l=true;
    else
    l=false;
    boolean b=obj.booleanMethod(l);
    System.out.println("Please enter a string to turn to uppercase");
    String s=in.next();
    int a=obj.intMethod(x,y);
    String c=obj.stringMethod(s);
    try
    {
      obj.doit();
      obj.callback();
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
    char[] charArray = c.toCharArray();
    for(int i=0;i<charArray.length;i++)
    charArray[i]=(char)((int)charArray[i]-6);
    String c1=new String(charArray);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c1);
  }
}
