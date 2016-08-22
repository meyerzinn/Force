package com.aniskywalker.force.minigame.world;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.data.Transaction;
import org.spongepowered.api.event.cause.Cause;

import java.util.List;

import javax.annotation.Nonnull;

@Builder
public final class WorldChange implements Comparable<WorldChange> {

    @Getter
    @Nonnull
    private final long timestamp = System.currentTimeMillis();
    @Nonnull
    private Cause cause;
    @Singular
    @Nonnull
    private List<Transaction<BlockSnapshot>> transactions;

    @Override
    public int compareTo(@NotNull WorldChange o) {
        return ((Long) timestamp).compareTo(o.getTimestamp());
    }
}
