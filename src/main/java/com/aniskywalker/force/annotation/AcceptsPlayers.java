package com.aniskywalker.force.annotation;

import com.aniskywalker.force.stage.Stage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AcceptsPlayers {

    /**
     * Whether or not players can join during a {@link Stage}.
     *
     * @return Whether or not players can join
     */
    boolean acceptPlayers() default true;
}
