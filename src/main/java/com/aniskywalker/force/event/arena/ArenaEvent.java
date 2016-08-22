package com.aniskywalker.force.event.arena;

import com.aniskywalker.force.arena.Arena;
import com.aniskywalker.force.event.ForceEvent;

public interface ArenaEvent extends ForceEvent {

    /**
     * Gets the {@link Arena} this event pertains to.
     *
     * @return The arena this event pertains to
     */
    Arena arena();

}
