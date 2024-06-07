package de.souperman.pokemon;

import de.souperman.enums.Attack;
import de.souperman.enums.Type;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int pokedexNumber;
    private ItemStack sprite;
    private ArrayList<Type> type;
    private int maxHP;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private Attack attack1;
    private Attack attack2;
    private Attack attack3;
    private Attack attack4;


    public Pokemon() {

    }
}
