import java.util.Scanner;
class Assignment15
{
  private int emp_no;
  private String emp_name;
  private float emp_salary;

  Assignment15()
  {
   emp_no = 111;
   emp_name = "Acadgild";
   emp_salary = 11111.00f;
  }
  
  void setDetails(int i, String s,float f)
  {
   emp_no = i;
   emp_name = s;
   emp_salary = f;
  }
  
  String getDetails()
  {
   return emp_no + " has name " + emp_name + " gets salary " + emp_salary;
  }

  
public static void main(String[] args)
{
  Assignment15 a1=new Assignment15();
  a1.setDetails(4345 ,"Rakesh", 23400);
  String name = a1.getDetails();
  System.out.println(name);
}
}
