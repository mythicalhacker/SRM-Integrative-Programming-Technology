import java.io.*;
import java.util.*;
public class AccountDetail_bean implements java.io.Serializable
{
  private String Date;
  private long Acct_no;
  private String Name;
  private double Withdraw_amount;
  private final double Balance_amt=100000;
  public void generate_SystemDate()
  {
    return Date;
  }
  public String gDate()
  {
    Date d=new Date();
    Date=d.toString();
  }
  public double current_balance(double b)
  {
    this.Withdraw_amount=b;
    if(Balance_amt<Withdraw_amount)
    {
      Balance_amt=Balance_amt;
    }
    else
    {
      Balance_amt=Balance_amt-Withdraw_amount;
    }
    return Balance_amt;
  }
}
