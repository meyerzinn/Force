package com.aniskywalker.force.minigame.world;

import org.spongepowered.api.world.World;

import java.util.List;
import java.util.function.Predicate;

public interface MinigameWorld {

    /**
     * Gets the {@link World} the MinigameWorld is tracking.
     *
     * @return The world
     */
    World getWorld();

    /**
     * Gets all {@link WorldChange}s the MinigameWorld has experienced.
     *
     * @return The changes
     */
    List<WorldChange> changes();

    /**
     * Rolls back all {@link WorldChange}s (in reverse order from the time they occurred) that meet the filter.
     *
     * @param filter The {@link Predicate<WorldChange>} to filter the WorldChanges by.
     * @return The {@link RollbackResult} describing the result.
     */
    RollbackResult rollback(Predicate<WorldChange> filter);

    /**
     * Rolls back all {@link WorldChange}s (in reverse order from the time they occurred). It
     * @return
     */
    RollbackResult rollback();


}
