package me.itsatacoshop247.TreeAssist.events;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TASaplingReplaceEvent extends Event implements Cancellable {

private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	protected boolean cancelled;
    protected Block block;
    protected String type;

    public TASaplingReplaceEvent(Block block, String type)
    {
    	super();
    	this.block  = block;
        this.type = type;
    	this.cancelled = false;
    }
    
    public Block getBlock() {
    	return this.block;
    }

    public String getType() {
        return this.type;
    }
    
	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean value) {
		cancelled = value;
	}

}
