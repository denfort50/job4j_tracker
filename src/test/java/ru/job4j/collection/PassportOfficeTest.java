package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addWithDuplicate() {
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen3 = new Citizen("9u47h", "Denis Kalchenko");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        office.add(citizen2);
        office.add(citizen3);
        assertThat(office.getSize(office), is(2));
    }

}