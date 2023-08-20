package ConstructorPerson;
//1 уровень сложности: 1)Создать класс Person.

//2) В нем добавить такие поля:

//    а) Имя человека (выбрать самостоятельно тип данных)
//    б) Возраст человека (выбрать самостоятельно тип данных)
//    в) Рост (выбрать самостоятельно тип данных)
//    г) Вес (выбрать самостоятельно тип данных)

//3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому

//4) Добавить методы:
//    a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
//    б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"

//            5) Создать несколько объектов и заполнить их

//    Доп. задание:

//            6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.
//            7) перед int money переменной поставить ключевое слово private. Описать, чт
public class Person {
        private String name;
        private int age;
        private double height;
        private double weight;

        public Person(String name, int age, double height, double weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

            public void printInfo() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age + " age");
                System.out.println("Height: " + height + " cm");
                System.out.println("Weight: " + weight + " kg");
            }
    public void goToWork() {
        if (age > 18) {
            System.out.println("Working");
        } else if (age <= 18 || age > 70) {
            System.out.println("Relaxing home");

        }}}
