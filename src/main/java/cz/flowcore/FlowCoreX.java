package cz.flowcore;

import org.bukkit.plugin.java.JavaPlugin;

public class FlowCoreX extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("FlowCoreX byl uspesne zapnut!");
    }

    @Override
    public void onDisable() {
        getLogger().info("FlowCoreX byl vypnut!");
    }
}
