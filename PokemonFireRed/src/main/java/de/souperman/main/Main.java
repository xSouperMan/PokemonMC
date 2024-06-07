package de.souperman.main;

import de.souperman.commands.CMDgm;
import de.souperman.enums.Attack;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("[Plugin] Pokemon Fire Red started.");

        //events:
        PluginManager pm = Bukkit.getPluginManager();


        //commands:
        this.getCommand("gm").setExecutor(new CMDgm());

    }

    @Override
    public void onDisable() {
        System.out.println("[Plugin] Pokemon Fire Red stopped.");
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
