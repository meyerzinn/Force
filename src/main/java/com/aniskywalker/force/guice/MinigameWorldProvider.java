package com.aniskywalker.force.guice;

import com.aniskywalker.force.annotation.MinigameWorld;
import com.google.inject.Provider;

import java.util.Optional;

public final class MinigameWorldProvider implements Provider<Optional<MinigameWorld>> {

    @Override
    public Optional<MinigameWorld> get() {
        return null;
    }
}
