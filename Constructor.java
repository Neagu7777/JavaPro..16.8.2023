package ConstructorPerson;

public class Constructor {
    public static void main(String[]args){

        Person person1 = new Person("Ivan", 25, 180, 75);
        Person person2 = new Person("Maria", 15, 160, 50);
        Person person3 = new Person("Maria", 75, 170, 70);

        person1.printInfo();
        person1.goToWork();

        person2.printInfo();
        person2.goToWork();

        person3.printInfo();
        person3.goToWork();

    }}


