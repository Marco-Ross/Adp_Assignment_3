package com.marco.assignment3part1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainDriverTest {
    private Person person;
    private Person person1;
    private Person person2;

    @Before
    public void setUp() throws Exception {
        person= new Person();
        person1 = new Person("martha","jones",32,1999);
        person2 = new Person("martha","jonnas",32,1999);
    }

    //Object Equality
    @Test
    public void createPersonEqualityTest() {
        Person samePerson = person1;
        //person.Equals(samePerson)
        assertEquals(person1,samePerson);
    }

    //Object Identity NotSame
    @Test
    public void personIdentityTestNotSame() {
        //person != person1
        assertNotSame(person1,person2);
    }

    //Object Identity Same and Timeout test
    @Test(timeout = 1000)
    public void personIdentityTestSame() {
        //martha == martha : But object references are different
        assertSame(person1.getName(),person2.getName());
    }

    //Failing test
    @Test
    public void nameSurnameTestFail() {
        try{
            String nameSurname = person1.getName() + " " +  person1.getSurname();

            fail("IllegalArgumentException is expected");
        }catch(IllegalArgumentException e){
        }
    }

    //Disabling Test (Ignored)
    @Ignore
    @Test
    public void personIdentityTestSameIgnore() {
        //martha == martha : But object references are different
        assertSame(person1.getName(),person2.getName());
    }

}