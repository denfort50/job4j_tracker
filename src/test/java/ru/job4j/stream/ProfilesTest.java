package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {

    @Test
    public void whenCorrect() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Тольятти", "Ясный проспект", 9, 20)),
                new Profile(new Address("Москва", "Ленинский проспект", 11, 34)),
                new Profile(new Address("Санкт-Петербург", "Сталинский проспект", 5, 10)),
                new Profile(new Address("Москва", "Ленинский проспект", 11, 34)));
        List<Address> expect = Arrays.asList(
                new Address("Москва", "Ленинский проспект", 11, 34),
                new Address("Санкт-Петербург", "Сталинский проспект", 5, 10),
                new Address("Тольятти", "Ясный проспект", 9, 20));
        List<Address> result = Profiles.sortAndDistinct(Profiles.collect(profiles));
        assertThat(result, is(expect));
    }
}