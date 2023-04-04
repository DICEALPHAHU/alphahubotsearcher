//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.alphahubotsearcher.searcher.alphahubot;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AlphahuBot extends JavaPlugin {
    public AlphahuBot() {
    }

    public void onEnable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[AlphahuBotSearcher]插件已成功启动，本插件由DICEALPHAHU制作");
        this.getServer().getPluginManager().registerEvents(new MessageListener(), this);
    }

    public void onDisable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[AlphahuBotSearcher]插件已卸载");
    }
}
