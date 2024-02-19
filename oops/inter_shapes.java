interface shape
{
final static float pi=3.14F;
final static float half=0.5F;
public float area (float A,float B);
}
class circle implements shape
{
public float area(float r,float r1)
{
return (pi*r*r);
}
}
class rectangle implements shape
{
public float area (float l,float b)
{
return (l*b);
}
}
class triangle implements shape
{
public float area (float b,float h)
{
return (half*b*h);
}
}
class inter_shapes
{
public static void main(String[] args)
{
circle c=new circle();
rectangle r= new rectangle();
triangle t= new triangle();
System.out.println("Area of circle:"+c.area(5,0));
System.out.println("Area of rectangle:"+r.area(10,15));
System.out.println("Area of triangle:"+t.area(5,10));
}
}