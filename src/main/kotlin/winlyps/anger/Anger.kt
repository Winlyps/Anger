package winlyps.anger

import org.bukkit.plugin.java.JavaPlugin

class Anger : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("universalAnger", "true")
        }
        logger.info("Anger plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Anger plugin has been disabled.")
    }
}