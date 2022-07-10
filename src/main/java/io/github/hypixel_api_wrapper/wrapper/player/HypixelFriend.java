package io.github.hypixel_api_wrapper.wrapper.player;

import java.time.Instant;

/**
 * This class is used to link two {@link HypixelPlayer}'s as friends on the Hypixel network.
 *
 * @author sam & insert
 */
public class HypixelFriend {

    private final HypixelPlayer player;
    private final HypixelPlayer friend;
    private final String apiKey;

    public HypixelFriend(HypixelPlayer player, HypixelPlayer friend, String apiKey) {
        this.player = player;
        this.friend = friend;
        this.apiKey = apiKey;
    }

    public HypixelPlayer getFriend() {
        return friend;
    }

    /**
     * @return The date the {@player} added the {@friend} as a friend on the network.
     */
    public Instant getDateAdded() {
        throw new UnsupportedOperationException();
    }
}
