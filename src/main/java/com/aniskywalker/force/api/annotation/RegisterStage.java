package com.aniskywalker.force.api.annotation;


import com.aniskywalker.force.api.minigame.stage.MinigameStage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RegisterStage {

    /**
     * A unique ID to identify a {@link MinigameStage}.
     * <p>IDs should follow the following format for a better chance of being unique: <pre>minigame:stage</pre>.</p>
     *
     * @return The ID
     */
    String id();

    /**
     * The duration of a {@link MinigameStage}.
     * <p>Use <pre>-1</pre> to indicate an untimed stage. If a stage is untimed, it is the responsibility of the
     * stage to trigger the {@link }</p>
     *
     * @return The duration
     */
    long duration() default 60000;

}
