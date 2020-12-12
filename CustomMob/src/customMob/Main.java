package customMob;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Custom Mob is activated");
    }

    @Override
    public void onDisable() {
        System.out.println("Custom Mob is deactivated");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("za")) {
            Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
            Pillager pillager = (Pillager) player.getWorld().spawnEntity(player.getLocation(), EntityType.PILLAGER);
            horse.setPassenger(pillager);
            return false;
        }
        return true;
    }
}
