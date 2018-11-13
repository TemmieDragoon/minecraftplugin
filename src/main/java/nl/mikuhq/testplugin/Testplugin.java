package nl.mikuhq.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Testplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new joinlistener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
