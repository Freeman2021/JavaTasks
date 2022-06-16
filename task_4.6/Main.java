/*
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

public class Main {
    public static void main(String[] args) {
    }
}

class Person {
    private String name;
    private String lastname;
    private int age;
    private int hp = 100;
    private Person mother;
    private Person father;

    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    public void getInfo() {
        String info = "Меня зовут " + this.name + "\n";
        if (getMother().getName() != null) {
            info += "Имя моей мамы: " + getMother().getName() + "\n";
            if (getFather().getName() != null) {
                info += "Имя моего папы: " + getFather().getName() + "\n";
                if (getMother().getMother().getName() != null) {
                    info += "У меня две бабушки, бабушка " + getMother().getMother().getName();
                    if (this.father.mother.name != null) {
                        info += " и бабушка " + this.father.mother.name + "\n";
                        if (this.mother.father.name != null) {
                            info += "У меня два деда, деда " + this.mother.father.name;
                            if (this.father.father.name != null) {
                                info += " и деда " + this.father.father.name + "\n";
                            }
                        }
                    }
                }
            }
        }
        System.out.println(info);
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public Person getMother() {
        return this.mother;
    }

    public Person getFather() {
        return this.father;
    }

    public void setHp(int hp) {
        if (this.hp + hp > 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }
}
