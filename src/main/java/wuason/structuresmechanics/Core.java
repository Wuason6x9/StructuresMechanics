package wuason.structuresmechanics;

import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {

        getLogger().info("<gold>(------<dark_purple>StructuresMechanics<gold>------)");
        getLogger().info("<gray>Structures loaded: <aqua>" + 0);
        getLogger().info("<gold>(-------------------------------)");

    }

    @Override
    public void onDisable() {

    }
}
