package com.aniskywalker.force.minigame.world;

import lombok.Builder;

import java.util.Optional;

/**
 * Describes the result of a rollback.
 */
@Builder
public final class RollbackResult {

    private Integer successCount;
    private Integer affectedBlocks;

    /**
     * Gets the success count of the rollback.
     *
     * @return The success count of the rollback
     */
    public Optional<Integer> getSuccessCount() {
        return Optional.ofNullable(successCount);
    }

    /**
     * Gets the number of blocks affected by the rollback.
     *
     * @return The number of blocks affected by the rollback, if one exists.
     */
    public Optional<Integer> getAffectedBlocks() {
        return Optional.ofNullable(affectedBlocks);
    }

}
