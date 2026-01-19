import java.util.Objects;

public class Animal {

    private int legs;
    private String color;
    private String name;
    private boolean fly;

    static void main(String[] args) {

        Animal myChicken = new Animal();
        myChicken.setFly(false);
        myChicken.setColor("white");
        myChicken.setName("Chikki");
        myChicken.setLegs(4);

        Animal yourChicken = new Animal();
        yourChicken.setFly(false);
        yourChicken.setColor("white");
        yourChicken.setName("Roxy");
        yourChicken.setLegs(4);



        System.out.println(myChicken);
        System.out.println(yourChicken);

        System.out.println(myChicken == yourChicken);
        System.out.println(myChicken.equals(yourChicken));
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return  name+","+legs+","+color+","+fly;

    }

    @Override
    public boolean equals(Object o) {
        Animal animal = (Animal) o;

        if (   name.equals(animal.name) && legs == animal.legs && color.equals(animal.color)      )
                return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, color, name, fly);
    }
}

