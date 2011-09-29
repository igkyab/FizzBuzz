/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsi.fizzbuzz;

import java.util.List;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 *
 * @author shadow16
 */
public class testFizzBuzz {

    private fizzBuzz instance;
    private List<String> retour;

    public testFizzBuzz() {
    }

    @Before
    public void avant() {
        instance = new fizzBuzz();
        retour = Lists.newArrayList();
    }

    @Test
    public void retourneNombre() {

        retour = instance.fizzBuzz(11);

        assertThat(retour, notNullValue());
        assertThat(retour.isEmpty(), is(false));
        assertThat(retour.get(0), is("11"));
    }

    @Test
    public void fizz() {

        retour = instance.fizzBuzz(10);

        assertThat(retour, notNullValue());
        assertThat(retour.isEmpty(), is(false));
        assertThat(retour.get(0), is("Fizz"));
    }

    @Test
    public void buzz() {

        retour = instance.fizzBuzz(12);

        assertThat(retour, notNullValue());
        assertThat(retour.isEmpty(), is(false));
        assertThat(retour.get(0), is("Buzz"));
    }

    @Test
    public void fizzBuzz() {

        retour = instance.fizzBuzz(15);

        assertThat(retour, notNullValue());
        assertThat(retour.isEmpty(), is(false));
        assertThat(retour.get(0), is("FizzBuzz"));
    }
}
