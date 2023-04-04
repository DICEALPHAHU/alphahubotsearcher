package com.alphahubotsearcher.searcher;

import me.dreamvoid.miraimc.api.MiraiBot;
import me.dreamvoid.miraimc.bukkit.event.message.passive.MiraiGroupMessageEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class alphahubot2 extends JavaPlugin implements Listener {

    @Override // 加载插件
    public void onLoad() { }

    @Override // 启用插件
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override // 禁用插件
    public void onDisable() { }


    @EventHandler
    public void onGroupMessageReceive(MiraiGroupMessageEvent e){
        if(e.getMessage().equals("#卫星地图")) {
            MiraiBot.getBot(e.getBotID()).getGroup(e.getGroupID()).sendMessage("why13700.com:37885");
        }
    }
}
