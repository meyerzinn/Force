package com.aniskywalker.force.arena;

import com.aniskywalker.force.minigame.MinigameContainer;

import java.util.Optional;

/**
 * Represents an arena in which a {@link MinigameContainer} can be played.
 */
public interface Arena {

    /**
     * Gets the currently playing {@link MinigameContainer}.
     *
     * @return The minigame, if available
     */
    Optional<MinigameContainer> getMinigame();

}
