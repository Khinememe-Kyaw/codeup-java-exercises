
import java.util.Arrays;
import java.util.List;
public class ArraysExercises {
        public String name;
        public ArraysExercises(String name){
            this.name = name;
        }
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length +1);
        newArray[newArray.length -1] = newPerson;
        return newArray;
    }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println(numbers);
//            it printed the address of numbers in computer memory
            System.out.println(Arrays.toString(numbers));

            Person[] people = new Person[3];
            people[0]= new Person("Khinememe");
            people[1]= new Person("Mimi");
            people[2]= new Person("Kyaw");

            for(Person person:people){
                System.out.println(person.name);
            }
//            Adding new People
            Person newPerson = new Person("Robert");
            people = addPerson(people, newPerson);

            for(Person person:people){
                System.out.println(person.name);
            }
        }
}


