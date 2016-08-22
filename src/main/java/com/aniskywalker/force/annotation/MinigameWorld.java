package com.aniskywalker.force.annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@BindingAnnotation
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MinigameWorld {

    /**
     * The unique identifier for the MinigameContainer World. This might vary based on your platform, but is typically a UUID
     * or name.
     *
     * @return The unique identifier
     */
    String identifier();

    /**
     * Whether or not changes to the world should be automatically rolled back when a Stage has concluded.
     *
     * @return Whether or not changes to the world should be rolled back
     */
    boolean rollback() default true;

}
