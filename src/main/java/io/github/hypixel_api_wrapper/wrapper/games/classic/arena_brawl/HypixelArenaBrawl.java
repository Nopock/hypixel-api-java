package io.github.hypixel_api_wrapper.wrapper.games.classic.arena_brawl;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelArenaBrawl implements HypixelGame {
    @Override
    public String getGameID() {
        return "ARENA";
    }

    @Override
    public String getGameName() {
        return "Arena Brawl";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
