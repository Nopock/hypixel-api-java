package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import io.github.neopixel.wrapper.util.GuildLevelingUtil;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class HypixelGuild {
    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public HypixelGuild(String name, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = new JSONHandler(requestController.getPlayer(name).getJSONObject("player"));
    }

    public HypixelGuild(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = new JSONHandler(requestController.getPlayer(uuid).getJSONObject("player"));
    }

    public Optional<String> getName() {
        return jsonHandler.getSafeString("name");
    }

    public Optional<Double> getLevel() {
        return Optional.of(GuildLevelingUtil.getLevel(jsonHandler.getSafeInt("exp").get()));
    }

    public Optional<Integer> getExperience() {
        return jsonHandler.getSafeInt("exp");
    }

    public List<HypixelPlayer> getMembers() {
        throw new UnsupportedOperationException();
    }

    public HypixelPlayer getOwner() {
        throw new UnsupportedOperationException();
    }

    public long getDailyGEXP() {
        throw new UnsupportedOperationException();
    }

    public Optional<Boolean> isPubliclyListed() {
        return jsonHandler.getSafeBoolean("publiclyListed");
    }

    public Optional<String> getDescription() {
        return jsonHandler.getSafeString("description");
    }

    public Optional<Integer> getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public Optional<Integer> getCoinsEver() {
        return jsonHandler.getSafeInt("coinsEver");
    }

    public Optional<String> getTag() {
       return jsonHandler.getSafeString("tag");
    }

    public int getPlacementOnLeaderboard() {
        throw new UnsupportedOperationException();
    }
}
