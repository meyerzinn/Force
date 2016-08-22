package com.aniskywalker.force.event.world;

import com.aniskywalker.force.minigame.world.WorldChange;
import com.google.common.collect.ImmutableList;
import org.spongepowered.api.event.Cancellable;

public interface RollbackWorldEvent extends WorldEvent, Cancellable {

    /**
     * Gets the {@link WorldChange}s (in reverse chronological order, the same order they will be processed) the
     * rollback is reverting.
     *
     * @return The changes (in order of processing)
     */
    ImmutableList<WorldChange> getChanges();

}
