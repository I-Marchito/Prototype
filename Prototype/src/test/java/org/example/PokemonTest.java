package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Pokemon pokemon = new Pokemon("Totodile", "Água", new Moves("Bite", "Rage", "Water Gun", "Scary Face"), 340, 5);

        Pokemon ditto = pokemon.clone();
        ditto.setLevel(12);
        ditto.setNome("Jaré");
        ditto.getMoves().setMove2("Ice Fang");
        ditto.getMoves().setMove4("Aqua Tail");

        assertEquals("Pokemon{, nome='Totodile', moves=Bite\nRage\nWater Gun\nScary Face\n, tipo='Água', BST='340', Level='5'}", pokemon.toString());
        assertEquals("Pokemon{, nome='Jaré', moves=Bite\nIce Fang\nWater Gun\nAqua Tail\n, tipo='Água', BST='340', Level='12'}", ditto.toString());
    }

}