public class Person {
    String name;
//    constructor
    public Person(String name){
        this.name= name;
    }
    public String getName(){
        return name;
//TODO: return the person's name
    }

    public void setName(String name){
        System.out.println(name);
//TODO: change the name field to the passed value
    }
    public void sayHello(){
        System.out.println("Hello "+ name);
//TODO: print a message to the console using the person's name
    }
    public static void main(String[] args){
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane"); //Jane
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John

        Person person1 = new Person("Joe");
        Person person2 = new Person("Jack");
        System.out.println(person1.getName());
        person1.sayHello();
        person2.setName("Jack");
        System.out.println(person2.getName());
        person2.sayHello();
    }

}
