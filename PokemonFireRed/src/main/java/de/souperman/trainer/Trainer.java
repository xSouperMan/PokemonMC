package de.souperman.trainer;

import de.souperman.enums.Area;
import de.souperman.pokemon.Pokemon;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Trainer {

    private Player player;
    private String name;
    private Area currentArea;
    private Location currentBlock;
    private int currency;
    private Pokemon pokeSlot1;
    private Pokemon pokeSlot2;
    private Pokemon pokeSlot3;
    private Pokemon pokeSlot4;
    private Pokemon pokeSlot5;
    private Pokemon pokeSlot6;
    private ArrayList<Pokemon> pokemonPC;


    public Player getPlayer() {
        return player;
    }
}
