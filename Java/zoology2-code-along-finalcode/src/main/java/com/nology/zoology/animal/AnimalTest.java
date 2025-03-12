package com.nology.zoology.animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;
import static org.jupiter.api.Assertions.*;

public class AnimalTest {

    public final int Test_ID = 1;
    public final String Test_Name = "Tiger";
    public final int Test_Age = 5;
    public final int Test_Hunger = 50;

    private Animal animal;

    public AnimalTest(){
        System.out.println("Creating a new animal test");
    }

    @BeforeEach
    public void setUp() {
        this.animal = new Animal(Test_ID, Test_Name, Test_Age);
    }

    @Test
    void testForHunger() {
        Assertions.assertEquals(Test_Hunger, animal.getHunger()); animal.getHunger();

    }
    @Test
    void testIdGetterAndSetter(){
        assertEquals(Test_ID, animal.getId());
        animal.setId(2);
        assertEquals(2, animal.getId());
    }
    @Test
    void testAgeGetterAndSetter(){
        assertEquals(Test_Age, animal.getAge());
        animal.setAge(10);
        assertEquals(10, animal.getAge());
    }
    @Test
    void testIsHungry(){
        assertTrue(animal.isHungry());
        animal.feed();
        assertFalse(animal.isHungry());
    }
    @Test
    void testFeed(){
        animal.feed();
        assertEquals(0, animal.getHunger());
    }

    @Test
    @DisplayName("Empty name should throw an exception on construction")
    void constructor_EmptyStringNameArg_ThrowsException(){
        try{
            Tiger animal = new Tiger(2, "", 12);
            fail("Should throw an IllegalArgumentException");
        }catch (RuntimeException e){

        }
    }
}


