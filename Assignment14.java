import java.util.Scanner;
class Assignment14
{
  public static void main(String[] args)
  {
   int[] a = new int[5];
    int temp;
    Scanner s=new Scanner(System.in);
    System.out.println("enter 5 integers to create an array: "); 
    for(int i=0;i<5;i++)
      a[i] = s.nextInt();
    for(int i=0;i<a.length;i++)
    {
     for(int j=i+1;j<a.length;j++)
      {
        if(a[i]>a[j])
         {
          temp = a[i];
          a[i]=a[j];
          a[j]=temp;
         }     
      }
    }
    System.out.print("Sorted array is :");
    for(int i=0;i<a.length;i++)
     System.out.print(" "+a[i]);
    System.out.println(" ");
    System.out.print("Enter a no. to be inserted :");
    int n = s.nextInt();
    int[] sorted = new int[6];
    sorted[5]=n;
    for(int i=0;i<a.length;i++)
    {
        sorted[i]=a[i];
    }
    for(int i=0;i<sorted.length;i++)
    {
     for(int j=i+1;j<sorted.length;j++)
      {
        if(sorted[i]>sorted[j])
         {
          temp = sorted[i];
          sorted[i]=sorted[j];
          sorted[j]=temp;
         }     
      }
    }
    System.out.print("Array after insertion is :");
    for(int i=0;i<sorted.length;i++)
     System.out.print(" "+sorted[i]);
  }
}