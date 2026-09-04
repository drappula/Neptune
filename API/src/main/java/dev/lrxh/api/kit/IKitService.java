package dev.lrxh.api.kit;

import dev.lrxh.api.arena.IArena;

import java.util.LinkedHashSet;
import java.util.List;

public interface IKitService {
    LinkedHashSet<IKit> getAllKits();

    IKit getKitByName(String name);

    IKit getKitByDisplay(String displayName);

    List<String> getKitNames();

    void removeArena(IArena arena);

    boolean addKit(IKit kit);

    void save();
}
