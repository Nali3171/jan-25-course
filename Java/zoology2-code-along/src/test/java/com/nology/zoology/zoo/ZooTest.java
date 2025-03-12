package com.nology.zoology.zoo;

import com.nology.zoology.animal.Crocodile;
import com.nology.zoology.animal.Llama;
import com.nology.zoology.animal.Tiger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    private Zoo target;

    @BeforeEach
    public void setUp() {
        this.target = new Zoo();
    }

    @Test
    @DisplayName("Add Tiger to zoo")
    void addAnimal_ValidTiger_ReturnsCount() {
        assertEquals(0, target.getAnimalCount() );

        target.addAnimal( new Tiger(1, "Tony", 5));

        assertEquals(1, target.getAnimalCount() );
    }

    @Test
    @DisplayName("Add Llama to zoo")
    void addAnimal_ValidLlama_ReturnsCount() {
        assertEquals(0, target.getAnimalCount() );

        target.addAnimal( new Llama(1, "Tony", 5));

        assertEquals(1, target.getAnimalCount() );
    }

    @Test
    @DisplayName("Add Crocodile to zoo")
    void addAnimal_ValidCrocodile_ReturnsCount() {
        assertEquals(0, target.getAnimalCount() );

        target.addAnimal( new Crocodile(1, "Tony", 5));

        assertEquals(1, target.getAnimalCount() );

    }

    @Test
    @DisplayName("Add animals to zoo for animal count")
    void getAnimalCount_AddAnimals_ReturnsCount() {
        assertEquals(0, target.getAnimalCount() );

        target.addAnimal( new Tiger(1, "Tony", 5));
        target.addAnimal( new Llama(2, "Tony", 5));
        target.addAnimal( new Crocodile(3, "Tony", 5));

        assertEquals(3, target.getAnimalCount() );
    }
}