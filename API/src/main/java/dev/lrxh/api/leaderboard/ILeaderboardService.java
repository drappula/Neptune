package dev.lrxh.api.leaderboard;

import dev.lrxh.api.kit.IKit;

import java.util.List;
import java.util.UUID;

public interface ILeaderboardService {
    /**
     * Get the top players for a kit and stat. Used by websites, discord bots, stats menus.
     */
    List<ILeaderboardEntry> getTopPlayers(IKit kit, ILeaderboardType type, int limit);

    /**
     * Get a single player's rank (1-based) for a stat. Returns -1 if unranked.
     * Used by tab list priority, chat tags, discord sync.
     */
    int getPlayerRank(UUID playerUUID, IKit kit, ILeaderboardType type);

    /**
     * Force the leaderboards to reload from the database. Useful after admin edits or external scripts.
     */
    void reload();
}
