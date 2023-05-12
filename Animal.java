package class20;

public class Animal {
    String name;
    String color;
    int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void run() {
        System.out.println("run");
    }


    void jump() {
        System.out.println("jump");
    }


    void sleep() {
        System.out.println("sleep");
    }
}

    class Dog extends Animal {
        Dog(String name, String color, int age) {
            super(name, color, age);
        }

        void run(){
            System.out.println("zoom");
        }
    }

        class Cat extends Animal {
            Cat(String name, String color, int age) {
                super(name, color, age);
            }
        }

            class Horse extends Animal {
                Horse(String name, String color, int age) {
                    super(name, color, age);
                }
            }

