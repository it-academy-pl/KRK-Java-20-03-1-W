package pl.itacademy.immutable;

import java.util.List;
import java.util.Objects;

public class BeerMenu {
    private final List<Beer> menu;

    public BeerMenu(List<Beer> menu) {
        this.menu = List.copyOf(menu);
    }

    public List<Beer> getMenu() {
        return menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeerMenu beerMenu = (BeerMenu) o;
        return Objects.equals(menu, beerMenu.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menu);
    }

    @Override
    public String toString() {
        return "BeerMenu{" +
                "menu=" + menu +
                '}';
    }
}
