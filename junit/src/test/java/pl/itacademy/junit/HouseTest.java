package pl.itacademy.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class HouseTest {

    private House house;

    @BeforeAll
    public static void runOnceBeforeAllTheTests() {
        System.out.println("Global test setup is here");
    }

    @BeforeEach
    public void setUp() {
        house = new House();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("This method executes after each test");
    }

    @Test
    public void addRoom_addsNewRoomToHouse() {
        house.addRoom(new Room("Kitchen"));

        assertThat(house.getRooms()).contains(new Room("Kitchen"));
    }

    @Test
    public void addRoof_makesHouseContainsARoof() {
        house.addRoof(new Roof("Red"));

        assertThat(house.containsRoof()).isTrue();
    }

    @Test
    public void addRoof_addsARoof() {
        house.addRoof(new Roof("Red"));

        assertThat(house.getRoof()).isEqualTo(new Roof("Red"));
    }

    @Test
    public void addGarden_addsGardenToHouse() {
        Garden garden = new Garden();
        house.addGarden(garden);
        assertThat(house.getGarden()).isSameAs(garden);
    }

}