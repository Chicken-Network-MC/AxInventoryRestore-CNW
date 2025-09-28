package com.artillexstudios.axinventoryrestore.models;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class InventorySaveModel {

    private final UUID requestId = UUID.randomUUID();
    private final UUID player;
    private final ItemStack[] items;
    private final String reason;
    private final String cause;
    private final String worldName;
    private final int x;
    private final int y;
    private final int z;

    public InventorySaveModel(UUID player, ItemStack[] items, String reason, String cause, String worldName, int x, int y, int z) {
        this.player = player;
        this.items = items;
        this.reason = reason;
        this.cause = cause;
        this.worldName = worldName;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public UUID getPlayer() {
        return player;
    }

    public ItemStack[] getItems() {
        return items;
    }

    public String getReason() {
        return reason;
    }

    public String getCause() {
        return cause;
    }

    public String getWorldName() {
        return worldName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
