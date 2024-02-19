import java.io.*;
interface cherrybowl
{
void cherry();
}
interface redapple
{
void apple();
}
class fruit implements  cherrybowl,redapple
{

public void cherry()
{
System.out.println("The bowl contains cherries");
}
public void apple()
{
System.out.println("There are 5 red apples");
}
}
class implementinginterface
{
public static void main(String args[])
{
fruit obj = new fruit();
obj.cherry();
obj.apple();
}
}