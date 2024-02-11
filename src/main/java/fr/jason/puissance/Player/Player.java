package fr.jason.puissance.Player;

import java.util.UUID;

public class Player {

    private String name;

    private UUID uuid;

    // =============== CONSTRUCTOR ===============

    public Player(String name, UUID uuid){
        this.name = name;
        this.uuid = uuid;
    }

    // =============== GETTERS ===============

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    // =============== SETTERS ===============

    public void setName(String name) {
        this.name = name;
    }

    public void setUuid(UUID uuid){
        this.uuid = uuid;
    }
}
