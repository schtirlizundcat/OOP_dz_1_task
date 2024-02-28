public class Main {
    public static void main(String args[]) { // инициализируем экземпляры классов.
        Crocodile c = new Crocodile();
        Animal d = new Duck();
        Animal dr = new Draco();
        Animal m = new Manul();
        Animal s = new SnowLeopard();
        Animal y = new Yellowbelly();
// Вызываем у инициализированных экземпляров классов методы toGo, fly, swim.
        c.toGo();
        c.fly();
        c.swim();

        d.toGo();
        d.fly();
        d.swim();

        dr.toGo();
        dr.fly();
        dr.swim();

        m.toGo();
        m.fly();
        m.swim();

        s.toGo();
        s.fly();
        s.swim();

        y.toGo();
        y.fly();
        y.swim();
    }

}
