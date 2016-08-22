package com.aniskywalker.force.stage;

import com.aniskywalker.force.annotation.Stage;

import java.util.Collection;
import java.util.Optional;

/**
 * Based heavily on the SpongeAPI.
 */
public interface StageManager {

    /**
     * Get the {@link StageContainer} from an instance.
     *
     * @param instance The instance
     * @return The container, if available
     */
    Optional<StageContainer> fromInstance(Object instance);

    /**
     * Retrieves a {@link StageContainer} based on its ID.
     *
     * @param id The stage ID
     * @return The {@link Stage}, if available
     */
    Optional<StageContainer> getStage(String id);

    /**
     * Gets a {@link Collection} of all {@link StageContainer}s.
     *
     * @return The stages
     */
    Collection<StageContainer> getStages();

    /**
     * Checks if a {@link Stage} is loaded based on its ID.
     *
     * @param id the id of the {@link Stage}
     * @return If the stage is loaded
     */
    boolean isLoaded(String id);

}
