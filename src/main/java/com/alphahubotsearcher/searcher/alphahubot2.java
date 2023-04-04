package com.alphahubotsearcher.searcher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.dreamvoid.miraimc.api.MiraiBot;
import me.dreamvoid.miraimc.bukkit.event.message.passive.MiraiGroupMessageEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class alphahubot2 extends JavaPlugin implements Listener {

    @Override // 加载插件
    public void onLoad() {
    }

    @Override // 启用插件
    public void onEnable() {        
        this.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[ABS]AlphahuBotSearcher已在运行，插件作者DICEALPHAHU，感谢MiraiMC与Shpries提供代码参考");
        this.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[ABS]Github.com/DICEALPHAHU");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override // 禁用插件
    public void onDisable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[ABS]AlphahuBotSearcher已卸载");
    }


    @EventHandler
    public void onGroupMessageReceiveMap(MiraiGroupMessageEvent e){
        if(e.getMessage().equals("#卫星地图")) {
            MiraiBot.getBot(e.getBotID()).getGroup(e.getGroupID()).sendMessage("why13700.com:37885");
        }
    }
    
    @EventHandler
    public void onGroupMessageReceivePlayers(MiraiGroupMessageEvent var1) {
        if (var1.getMessage().equals("#人数")) {
            MiraiBot.getBot(var1.getBotID()).getGroup(var1.getGroupID()).sendMessage("服务器在线玩家数：" + Bukkit.getServer().getOnlinePlayers().size());
            List var2 = (List)Bukkit.getOnlinePlayers();
            List<String> var3 = new ArrayList();
            Iterator var4 = var2.iterator();

            while(var4.hasNext()) {
                Object var5 = var4.next();
                String var6 = ((Player)var5).getName();
                var3.add(var6);
            }

            MiraiBot.getBot(var1.getBotID()).getGroup(var1.getGroupID()).sendMessage("目前在线玩家: " + var3);
     }
}
