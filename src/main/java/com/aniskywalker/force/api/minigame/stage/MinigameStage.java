package com.aniskywalker.force.api.minigame.stage;

/**
 * Represents a logical stage of a Minigame.
 *
 * <p>For example, in TnTRun a MinigameStage could be "LobbyStage" or "PlayingStage".</p>
 * <p>You should break your Minigame up into smaller components that contain game logic specific to their stage.</p>
 */
public abstract class MinigameStage {

    /**
     * When this method is called, any necessary resources should be loaded (including Worlds, configurations, etc.).
     *
     * @throws Exception
     */
    abstract void initialize() throws Exception;



}
