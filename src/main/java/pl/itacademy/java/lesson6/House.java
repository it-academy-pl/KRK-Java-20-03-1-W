package pl.itacademy.java.lesson6;

public class House implements Cloneable {
    int roomNumber;
    int floorNumber;
    boolean withStairs;

    public House(int roomNumber, int floorNumber, boolean withStairs) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.withStairs = withStairs;
    }

    @Override
    public boolean equals(Object another) {
        if (another == null) {
            return false;
        }

        if (this == another) {
            return true;
        }

        if (!(another instanceof House)) {
            return false;
        }

        House anotherHouse = (House) another;
        if (this.roomNumber != anotherHouse.roomNumber) {
            return false;
        }

        if (this.floorNumber != anotherHouse.floorNumber) {
            return false;
        }

        if (this.withStairs != anotherHouse.withStairs) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = roomNumber + floorNumber;
        if (withStairs) {
            result *= 2;
        }
        return result;
    }

    @Override
    public String toString() {
        String stairsMessage = withStairs ? "with stairs" : "without stairs";
        return "House: roomNumber = " + roomNumber +
                ", floorNumber = " + floorNumber +
                ", " + stairsMessage;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        House cloned = (House) super.clone();
//        cloned.floorNumber = this.floorNumber;
//        cloned.roomNumber = this.roomNumber;
//        cloned.withStairs = this.withStairs;
        return cloned;
    }

    @Override
    public void finalize() {
        System.out.println("House " + this + " has been destroyed! :'(");
    }
}
