package nl.mikuhq.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class joinlistener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        String name = event.getPlayer().getName();
        event.setJoinMessage("Geef deze " + name + " een een hartelijk welkom!");

    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        boolean spawn = true;
        event.setSpawnLocation(spawn);
        event.getPlayer().sendMessage("Ben je er eindelijk uit debil?");
    }

    @EventHandler
    public void drop(PlayerDropItemEvent event) {
        event.getPlayer().sendMessage("Je dropte zojuist een item. Was dit niet iets belangrijks?");
    }

    @EventHandler
    public void info(PlayerEggThrowEvent event){
        event.getPlayer().sendMessage("Je hebt zojuist een ei gegooit. Misschien krijg je hier wel een kuiken uit.");

    }

    @EventHandler
    public void teleport(PlayerTeleportEvent event){
        String message = event.getPlayer().getDisplayName();
        event.getPlayer().sendMessage(message + ", je bent zojuist geteleporteerd. Dit kan komen doordat je /tp deed.");

    }
}
