import java.util.Scanner;
class Assignment13
{
  public static void main(String[] args)
  {
    int[] a = new int[10];
    int j;
    Scanner s=new Scanner(System.in);
    System.out.println("enter 10 integers to create an array: ");
    for(int i=0;i<10;i++)
      a[i] = s.nextInt();
    System.out.println("reversed array is: ");
    for(j=9;j>=0;j--)
      System.out.print(" "+a[j]);
  }

}