public class tets {
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
//        b.bark();

        int ww=a.test();
        a.test(3);

    }
}
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
    public int test(){
        System.out.println("test1");
        return 1;
    }

    public  void test(int a){
        System.out.println("test2"+a);
    }
}

class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}