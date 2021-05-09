package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenDescByName() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Buy food", 3));
        jobs.add(new Job("Go to barbershop", 4));
        jobs.add(new Job("Do educational tasks", 2));
        jobs.add(new Job("Kiss wife", 1));
        jobs.sort(new JobDescByName());
        assertThat(jobs.get(0).getName(), is("Kiss wife"));
        assertThat(jobs.get(1).getName(), is("Go to barbershop"));
        assertThat(jobs.get(2).getName(), is("Do educational tasks"));
        assertThat(jobs.get(3).getName(), is("Buy food"));
    }

    @Test
    public void whenAscByName() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Buy food", 3));
        jobs.add(new Job("Go to barbershop", 4));
        jobs.add(new Job("Do educational tasks", 2));
        jobs.add(new Job("Kiss wife", 1));
        jobs.sort(new JobAscByName());
        assertThat(jobs.get(0).getName(), is("Buy food"));
        assertThat(jobs.get(1).getName(), is("Do educational tasks"));
        assertThat(jobs.get(2).getName(), is("Go to barbershop"));
        assertThat(jobs.get(3).getName(), is("Kiss wife"));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Buy food", 3));
        jobs.add(new Job("Go to barbershop", 4));
        jobs.add(new Job("Do educational tasks", 2));
        jobs.add(new Job("Kiss wife", 1));
        jobs.sort(new JobDescByPriority());
        assertThat(jobs.get(0).getPriority(), is(4));
        assertThat(jobs.get(1).getPriority(), is(3));
        assertThat(jobs.get(2).getPriority(), is(2));
        assertThat(jobs.get(3).getPriority(), is(1));
    }

    @Test
    public void whenAscByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Buy food", 3));
        jobs.add(new Job("Go to barbershop", 4));
        jobs.add(new Job("Do educational tasks", 2));
        jobs.add(new Job("Kiss wife", 1));
        jobs.sort(new JobAscByPriority());
        assertThat(jobs.get(0).getPriority(), is(1));
        assertThat(jobs.get(1).getPriority(), is(2));
        assertThat(jobs.get(2).getPriority(), is(3));
        assertThat(jobs.get(3).getPriority(), is(4));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(
                new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByNameAndDescByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("read", 3));
        jobs.add(new Job("learn", 4));
        jobs.add(new Job("work out", 2));
        jobs.add(new Job("learn", 1));
        Comparator<Job> comb = new JobDescByName().thenComparing(new JobDescByPriority());
        jobs.sort(comb);
        assertThat(jobs.get(0).getPriority(), is(2));
        assertThat(jobs.get(1).getPriority(), is(3));
        assertThat(jobs.get(2).getPriority(), is(4));
        assertThat(jobs.get(3).getPriority(), is(1));
    }

    @Test
    public void whenComparatorDescByNameAndAscByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("read", 3));
        jobs.add(new Job("learn", 4));
        jobs.add(new Job("work out", 2));
        jobs.add(new Job("learn", 1));
        Comparator<Job> comb = new JobDescByName().thenComparing(new JobAscByPriority());
        jobs.sort(comb);
        assertThat(jobs.get(0).getPriority(), is(2));
        assertThat(jobs.get(1).getPriority(), is(3));
        assertThat(jobs.get(2).getPriority(), is(1));
        assertThat(jobs.get(3).getPriority(), is(4));
    }

    @Test
    public void whenComparatorAscByNameAndDescByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("read", 3));
        jobs.add(new Job("learn", 4));
        jobs.add(new Job("work out", 2));
        jobs.add(new Job("learn", 1));
        Comparator<Job> comb = new JobAscByName().thenComparing(new JobDescByPriority());
        jobs.sort(comb);
        assertThat(jobs.get(0).getPriority(), is(4));
        assertThat(jobs.get(1).getPriority(), is(1));
        assertThat(jobs.get(2).getPriority(), is(3));
        assertThat(jobs.get(3).getPriority(), is(2));
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("read", 3));
        jobs.add(new Job("learn", 4));
        jobs.add(new Job("work out", 2));
        jobs.add(new Job("learn", 1));
        Comparator<Job> comb = new JobAscByName().thenComparing(new JobAscByPriority());
        jobs.sort(comb);
        assertThat(jobs.get(0).getPriority(), is(1));
        assertThat(jobs.get(1).getPriority(), is(4));
        assertThat(jobs.get(2).getPriority(), is(3));
        assertThat(jobs.get(3).getPriority(), is(2));
    }
}