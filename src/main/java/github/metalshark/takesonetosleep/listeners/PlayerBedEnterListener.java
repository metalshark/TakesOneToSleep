package github.metalshark.takesonetosleep.listeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class PlayerBedEnterListener implements Listener {

    @EventHandler(ignoreCancelled=true, priority=EventPriority.MONITOR)
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        final Player player = event.getPlayer();
        final World world = player.getWorld();
        world.setTime(0);
    }

}
