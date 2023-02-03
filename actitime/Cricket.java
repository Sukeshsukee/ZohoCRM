import java.util.Scanner;
class Cricket
{
Scanner s=new Scanner(System.in);

private int pin;
private String secrete;
private long contact;
String name;
public Cricket(int pin,String secrete,long contact,String name)
{
this.pin=pin;
this.secrete=secrete;
this.contact=contact;
this.name=name;
}
public int getPin()
{
System.out.println("enter your contact");
long l=s.nextLong();
if(l==contact)
return pin;
else 
System.out.println("entered wrong");
return 0;
}
public String getSecrete()
{
System.out.println("enter your pin");
int i=s.nextInt();
if(i==pin)
return secrete;
else 
System.out.println("entered wrong");
return null;
}
public long getContact()
{
System.out.println("enter your pin");
int p=s.nextInt();
if(p==pin)
return contact;
else 
System.out.println("entered wrong");
return 0;
}
public String getName()
{
return name;
}
public void setPin()
{
System.out.println("enter your old pin");
int i=s.nextInt();
if(i==pin)
{
System.out.println("enter your new pin");
int pin=s.nextInt();
System.out.println("successfully updated");
}
else 
System.out.println("wrong pin");
}
public void setContact()
{
System.out.println("enter your old contact");
long l=s.nextLong();
if(l==contact)
{
System.out.println("enter your new contact");
long con=s.nextLong();
System.out.println("successfully updated");
}
else 
System.out.println("wrong contact");
}}












