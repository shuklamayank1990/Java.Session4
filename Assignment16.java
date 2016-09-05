class Assignment16
{
  public static void main(String[] args)
  {
    String s1;
    s1 = "acadgild";
    int l = s1.length();
    System.out.println("Original string is : "+s1);
    System.out.print("Reversed string is : ");
    char[] ch = s1.toCharArray();
    for(int i=l-1;i>=0;i--)
    System.out.print(ch[i]);
  }

}