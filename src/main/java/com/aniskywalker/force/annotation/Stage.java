package com.aniskywalker.force.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Stage {

    /**
     * A unique ID to identify a {@link Stage}.
     * <p>IDs should follow the following format for a better chance of being unique: <pre>minigame:stage</pre>.</p>
     *
     * @return The ID
     */
    String id();

    /**
     * A user-friendly name to represent a stage.
     *
     * @return The name
     */
    String name();

    /**
     * The duration of a {@link Stage}.
     * <p>Use <pre>-1</pre> to indicate an untimed stage. If a stage is untimed, it is the responsibility of the
     * stage to trigger the {@link }</p>
     *
     * @return The duration
     */
    long duration() default 60000;

}
