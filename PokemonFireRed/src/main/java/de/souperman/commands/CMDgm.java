package de.souperman.commands;

import de.souperman.main.Main;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class CMDgm implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {

        if(!(sender instanceof Player)) {return false;}


        Player p = (Player) sender;

        if (args.length == 0) {

            if (p.getGameMode() == GameMode.CREATIVE) {
                p.setGameMode(GameMode.SURVIVAL);
            } else {
                p.setGameMode(GameMode.CREATIVE);
            }
            p.sendMessage("§c> §7Set gamemode to §6"+p.getGameMode());

        } else if(args.length == 1) {

        }

        return false;
    }
}
