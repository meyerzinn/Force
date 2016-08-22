package com.aniskywalker.force.stage;

import com.aniskywalker.force.annotation.Stage;

/**
 * A wrapper around a class marked with
 */
public interface StageContainer {

    /**
     * Gets the qualified ID of the {@link Stage} within the container.
     *
     * @return The stage ID
     * @see Stage#id()
     */
    String getId();

    /**
     * Gets the name of the {@link Stage} within this container.
     *
     * @return The stage name
     * @see Stage#name()
     */
    String getName();

    /**
     * Gets the {@link Class<?>} of the {@link Stage}.
     *
     * @return The class
     */
    Class<?> getStageClass();

}
