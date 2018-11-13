package nl.mikuhq.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class joinlistener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        String name = event.getPlayer().getName();
        event.setJoinMessage("Geef deze " + name + " een een hartelijk welkom!");

    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event){
        boolean spawn = true ;
        event.setSpawnLocation(spawn);
        event.getPlayer().sendMessage("Ben je er eindelijk uit debil?");
    }

    @EventHandler
    public void drop (PlayerDropItemEvent event){
        event.getPlayer().sendMessage("Je dropte zojuist een item. Was dit niet iets belangrijks?");
    }
}
