package de.souperman.pokemon;

import de.souperman.enums.Attack;
import de.souperman.enums.Type;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public enum Pokemon {
    BULBASAUR(1, "Bulbasaur", Type.GRASS, Type.POISON),
    IVYSAUR(2, "Ivysaur", Type.GRASS, Type.POISON),
    VENUSAUR(3, "Venusaur", Type.GRASS, Type.POISON),
    CHARMANDER(4, "Charmander", Type.FIRE),
    CHARMELEON(5, "Charmeleon", Type.FIRE),
    CHARIZARD(6, "Charizard", Type.FIRE, Type.FLYING),
    SQUIRTLE(7, "Squirtle", Type.WATER),
    WARTORTLE(8, "Wartortle", Type.WATER),
    BLASTOISE(9, "Blastoise", Type.WATER),

    //...

    MEWTWO(150, "Mewtwo", Type.PSYCHIC),
    MEW(151, "Mew", Type.PSYCHIC);

    private final int id;
    private final String name;
    private final ItemStack sprite;
    private final Type primaryType;
    private final Type secondaryType;

    Pokemon(int id, String name, ItemStack sprite, Type primaryType, Type secondaryType) {
        this.id = id;
        this.name = name;
        this.sprite = sprite;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
    }

    Pokemon(int id, String name, ItemStack sprite, Type primaryType) {
        this(id, name, sprite, primaryType, Type.NONE);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getPrimaryType() {
        return primaryType;
    }

    public Type getSecondaryType() {
        return secondaryType;
    }
}