public class Program {
    public static void main(String[] args) {

         Person person = new Person("Ivan","Ivanov");
         Person person1 = new Person("Aleks","Aleksandrov");
         Person person2 = new Person("Petur","Petrov");
         Person person3 = new Person("Stefan","Stefanv");
         Person person4 = new Person("Dimitur","Dimitrov");
         Person person5 = new Person("Georgi","Georgiev");

//        System.out.println(person);
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);
//        System.out.println(person5);


        List list = new List();
        List.insert(list,person);
        List.insert(list, person1);
        List.insert(list, person2);
        List.insert(list,person3);
        List.insert(list, person4);
        List.insert(list, person5);

        List.printList(list);
    }

    static class Person {
        private String firstName;
        private String lastName;

        Person(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
