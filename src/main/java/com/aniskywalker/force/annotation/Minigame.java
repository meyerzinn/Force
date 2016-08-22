package com.aniskywalker.force.annotation;

public @interface Minigame {

    /**
     * A unique ID to identify the Minigame.
     *
     * @return The ID
     */
    String id();

    /**
     * A user-friendly name to describe the Minigame.
     *
     * @return The name
     */
    String name();

    /**
     * All stages of the minigame, in order.
     *
     * @return
     */
    Stage[] stages();

}
