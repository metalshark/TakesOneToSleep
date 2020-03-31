package github.metalshark.takesonetosleep;

import github.metalshark.takesonetosleep.listeners.PlayerBedEnterListener;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class TakesOneToSleep extends JavaPlugin {

    Listener onPlayerBedEnter = new PlayerBedEnterListener();

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(onPlayerBedEnter, this);
    }

    @Override
    public void onDisable() {
        HandlerList.unregisterAll(onPlayerBedEnter);
    }

}
