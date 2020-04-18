package pl.itacademy.java.lesson6;

public class ObjectDemo extends Object {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house = new House(4, 1, false);

        int hashCode = house.hashCode();
        System.out.println(hashCode);

        String toString = house.toString();
        System.out.println(toString);
        System.out.println(house);

        Class<? extends House> aClass = house.getClass();
        System.out.println(aClass);


        House anotherHouse = new House(4, 1, true);
        System.out.println(house.equals(anotherHouse));
        System.out.println(house == anotherHouse);

        Integer a = 120;
        Integer b = 120;
        System.out.println(a == b);

        System.out.println("=======================================");
        System.out.println(house.equals(anotherHouse));
        System.out.println(house.hashCode());
        System.out.println(anotherHouse.hashCode());
        System.out.println(anotherHouse);

        System.out.println("=========CLONE EXAMPLE===============");
        House clonedHouse = (House) house.clone();
        System.out.println(clonedHouse);

        System.out.println("=========FINALIZE EXAMPLE - DON'T REPEAT IT AT HOME!!");
        for (int i = 0; i < 1_000_000; i++) {
            House h = new House(i, 1, false);
        }
    }
}
