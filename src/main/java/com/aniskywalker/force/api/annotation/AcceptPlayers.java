package com.aniskywalker.force.api.annotation;

import com.aniskywalker.force.api.minigame.stage.MinigameStage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AcceptPlayers {

    /**
     * Whether or not players can join during a {@link MinigameStage}.
     *
     * @return Whether or not players can join
     */
    boolean acceptPlayers() default true;
}
