import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int num,rem,rev=0;
    Scanner in=new Scanner(System.in);
    num=in.nextInt();
    while(num>0)
    {
      rem=num%10;
      rev=rev*10+rem;
        num=num/10;
    }
      System.out.println(rev);   
  }
}