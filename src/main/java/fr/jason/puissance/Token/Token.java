package fr.jason.puissance.Token;

import fr.jason.puissance.Player.Player;

import java.awt.*;

public class Token {

    private Player player;
    private Color color;
    private int[] coordinates;

    // =============== CONSTRUCTOR ===============

    public Token(Player player, Color color, int[] coordinates){
        this.player = player;
        this.color = color;
        this.coordinates = coordinates;
    }

    // =============== SETTERS ===============

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    // =============== GETTERS ===============

    public Player getPlayer() {
        return player;
    }

    public Color getColor() {
        return color;
    }

    public int[] getCoordinates() {
        return coordinates;
    }
}
