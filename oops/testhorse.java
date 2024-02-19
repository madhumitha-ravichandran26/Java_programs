import animalpack.animal;
class horse extends animal
{

public void move(){
        System.out.println("horse moves to forest");
    }
    public void eat(){
        System.out.println("horse eat oats");
    }
}
public class testhorse {
    public static void main(String[] args)
    {
        animal a=new animal();
        horse h=new horse();
        a.get_name("Alexander");
        a.put_name();
        h.eat();
        h.move();
    }
}