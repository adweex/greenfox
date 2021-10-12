public class Animal{
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " eszik");
    }

    public void drink(){
        System.out.println(name + " iszik");
    }
}
