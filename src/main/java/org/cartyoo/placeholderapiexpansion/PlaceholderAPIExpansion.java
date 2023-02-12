package org.cartyoo.placeholderapiexpansion;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlaceholderAPIExpansion extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "util";
    }

    @Override
    public String getAuthor() {
        return "cartyoo";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public boolean persist() {
        return true;
    }


    //Flight Placeholder
    @Override
    public String onPlaceholderRequest(Player p, String params) {
        if(p == null) {
            return "false";
        }
        if(params.equals("flying")) {
            return String.valueOf(p.isFlying());
        }

        //UUID Placeholder
        if(params.equals("uuid")) {
            return String.valueOf(p.getUniqueId().toString());
        }


        //Username Placeholder
        if(params.equals("name")) {
            return String.valueOf(p.getName());
        }


        //Ping Placeholder
        if(params.equals("ping")) {
            return String.valueOf(p.getPing());
        }


        //Health Placeholder
        if(params.equals("health")) {
            return String.valueOf(p.getHealth());
        }


        //MOTD Placeholder
        if(params.equals("motd")) {
            return String.valueOf(getPlaceholderAPI().getServer().getMotd());
        }


        //Banned Placeholder
        if(params.equals("banned")) {
            return String.valueOf(p.isBanned());
        }

        //Online Placeholder
        if(params.equals("online")) {
            return String.valueOf(getPlaceholderAPI().getServer().getOnlinePlayers().size());
        }

        //OP Placeholder
        if(params.equals("op")) {
            return String.valueOf(p.isOp());
        }

        //Whitelisted Placeholder
        if(params.equals("whitelisted")) {
            return String.valueOf(p.isWhitelisted());
        }

        //Gamemode Placeholder
        if(params.equals("gamemode")) {
            return String.valueOf(p.getGameMode());
        }

        //Location Placeholder
        if(params.equals("location")) {
            return String.valueOf("WORLD=" + p.getLocation().getWorld().getName() + ",X=" + p.getLocation().getBlockX() + ",Y=" + p.getLocation().getBlockY() + ",Z=" + p.getLocation().getBlockZ());
        }

        //Kills Placeholder
        if(params.equals("kills")) {
            return String.valueOf(p.getStatistic(Statistic.PLAYER_KILLS));
        }

        //Deaths Placeholder
        if(params.equals("deaths")) {
            return String.valueOf(p.getStatistic(Statistic.DEATHS));
        }

        return null;
    }
}
