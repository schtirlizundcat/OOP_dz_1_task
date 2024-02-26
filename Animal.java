import java.util.Date;

public class Animal {
    public String animalName;
    public boolean canGo = false;

    public boolean canFly = false;
    public boolean canSwim = false;

    Animal(){
        System.out.println("Создан экземпляр Animal со стандартными параметрами.");
    }
    public Animal(Date dateOfBarth){
        System.out.println("Создан экземпляр Animal с датой рождения " + dateOfBarth);
    }
    public void toGo() {
        if (!canGo) System.out.println("Животное не умеет двигаться");
        else System.out.println("Животное двигается");
    }
    public void fly() {
        if (!canFly) System.out.println("Животное не умеет летать");
        else System.out.println("Животное летает");
    }
    public void swim() {
        if (!canSwim) System.out.println("Животное не умеет плавать");
        else System.out.println("Животное плавает");
    }
}

