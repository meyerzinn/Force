package com.aniskywalker.force.event.world;

import com.aniskywalker.force.annotation.MinigameWorld;
import com.aniskywalker.force.event.ForceEvent;

public interface WorldEvent extends ForceEvent {

    MinigameWorld world();

}
