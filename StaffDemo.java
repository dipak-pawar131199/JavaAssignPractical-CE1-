import java.util.*;
abstract class Staff
{
String name;
String address;
public Staff(String nm,String addr)
{
name=nm;
address=addr;
}
abstract public void display();
}
class FullTimeStaff extends Staff
{
String dept;
double sal;
FullTimeStaff(String nm,String addr,String dpt,double sal)
{
super(nm,addr);
dept=dpt;
this.sal=sal;
}
public void display()
{
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Department:"+dept);
System.out.println("Salary:"+sal);
}
}
class PartTimeStaff extends Staff
{
int no_of_hours;
int rate_per_hour;
PartTimeStaff(String nm,String addr,int h,int r)
{
super(nm,addr);
no_of_hours=h;
rate_per_hour=r;
}
public void display()
{
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Number of Hours:"+no_of_hours);
System.out.println("Rate per Hour:"+rate_per_hour);
}
}
public class StaffDemo
{
public static void main(String g[])
{
int n,ch;
Scanner s1=new Scanner(System.in);
System.out.println("Enter size of array:");
n=s1.nextInt();
Staff s[]=new Staff[n];
for(int i=0;i<n;i++)
{
System.out.println("\n1:FullTime \n2:PartTime");
System.out.println("Enter Choice:");
ch=s1.nextInt();
if(ch==1)
{
System.out.println("Enter name:Address:Dept:Sal:");
String x=s1.next();
String y=s1.next();
String z=s1.next();
double w=s1.nextDouble();
s[i]=new FullTimeStaff(x,y,z,w);
}
if(ch==2)
{
System.out.println("Enter 
name:Address:no_of_hours:rate_per_hour:");
String x=s1.next();
String y=s1.next();
int z=s1.nextInt();
int w=s1.nextInt();
s[i]=new PartTimeStaff(x,y,z,w);
}
}
for(int i=0;i<n;i++)
{
if(s[i].getClass().getName().equals("FullTimeStaff"))
{
System.out.println("Full time Object");
s[i].display();
}
else
{
if(s[i].getClass().getName().equals("PartTimeStaff"))
{
System.out.println("PartTime Object");
s[i].display();
}
}
}
}
}
