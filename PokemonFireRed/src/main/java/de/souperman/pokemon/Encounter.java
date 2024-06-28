package de.souperman.pokemon;

import de.souperman.trainer.Trainer;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Encounter {

    private final Trainer trainer;
    private final Pokemon pokemon;
    private static boolean onTurn;
    private static Inventory inv;


    public Encounter(Trainer trainer, Pokemon pokemon) {
        this.trainer = trainer;
        this.pokemon = pokemon;

        inv = Bukkit.createInventory(null, 36, "WILD ENCOUNTER");



        trainer.getPlayer().openInventory(inv);
    }

    public void changeTurn() {
        onTurn = !onTurn;
    }
    public boolean isOnTurn() {
        return onTurn;
    }

    public Trainer getTrainer() {
        return this.trainer;
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }
}
