package de.souperman.pokemon;

import de.souperman.trainer.Trainer;

public class Encounter {

    private final Trainer trainer;
    private final Pokemon pokemon;
    private static boolean onTurn;
    private static Inventory inv;


    public Encounter(Trainer trainer, Pokemon pokemon) {
        this.trainer = trainer;
        this.pokemon = pokemon;

        Inventory inv = new Inventory()//TODO
    }

    public void changeTurn() {
        this.onTurn = !onTurn;
    }
    public boolean isOnTurn() {
        return this.onTurn;
    }

    public Trainer getTrainer() {
        return this.trainer;
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }
}
