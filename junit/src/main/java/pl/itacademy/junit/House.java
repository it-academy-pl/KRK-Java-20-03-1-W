package pl.itacademy.junit;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class House {
    private List<Room> rooms = new ArrayList<>();
    private Roof roof;
    private Garden garden;

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addRoof(Roof roof) {
        this.roof = roof;
    }

    public boolean containsRoof() {
        return roof != null;
    }

    public void addGarden(Garden garden) {
        this.garden = garden;
    }

    public Garden getGarden() {
        return garden;
    }
}
