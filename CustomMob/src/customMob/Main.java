package customMob;

import org.bukkit.ChatColor;
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
        if (command.getName().equalsIgnoreCase("/monster")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.GOLD + "cookie monster!!!");
            }
            else if (args[0].equalsIgnoreCase("ph")) {
                Horse horse = (Horse) player.getWorld().spawnEntity(player.getLocation(), EntityType.HORSE);
                Pillager pillager = (Pillager) player.getWorld().spawnEntity(player.getLocation(), EntityType.PILLAGER);
                horse.setPassenger(pillager);
                return false;
            }
            else if (args[0].equalsIgnoreCase("ss")) {
                SkeletonHorse skeletonHorse = (SkeletonHorse) player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON_HORSE);
                Skeleton skeleton = (Skeleton) player.getWorld().spawnEntity(player.getLocation(), EntityType.SKELETON);
                skeletonHorse.setPassenger(skeleton);
                return false;
            }
            else if (args[0].equalsIgnoreCase("zz")) {
                ZombieHorse zombieHorse = (ZombieHorse) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE_HORSE);
                Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
                zombieHorse.setPassenger(zombie);
            }
        }
        return true;
    }
}
