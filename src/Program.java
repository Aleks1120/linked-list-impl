public class Program {
    public static void main(String[] args) {
         Person var = new Person("Ivan", "Ivanov");

        System.out.println(var);


//        List list = new List();
//        List.insert(list, 1);
//        List.insert(list, 2);
//        List.insert(list, 3);
//        List.insert(list, 4);
//        List.insert(list, 5);
//        List.insert(list, 6);
//
//        List.printList(list);
    }

    static class Person {
        private String firstName;
        private String lastName;

        Person(String firstName, String name2){
            this.firstName = firstName;
        }
    }
}
