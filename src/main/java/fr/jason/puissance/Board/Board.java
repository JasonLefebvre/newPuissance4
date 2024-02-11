package fr.jason.puissance.Board;

import fr.jason.puissance.Player.Player;
import fr.jason.puissance.Token.Token;

public class Board {

    private Token[][] grid;

    public Board(Token[][] grid){
        this.grid = grid;
    }

    public Token[][] getGrid() {
        return grid;
    }

    public void setGrid(Token[][] grid) {
        this.grid = grid;
    }

    public void addToken(Token[][] grid, int column, int line, Token token){
        grid[column][line] = token;
    }

    public boolean columnIsFull(Token[] column){
        for (Token token : column){
            if (token == null){
                return false;
            }
        }
        return true;
    }

    public boolean isFull(Token[][] grid){
        for (Token[] column : grid){
            for (Token token : column){
                if (token == null){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkOnAddingToken(Token token){


        int[] tokenCoordinates = token.getCoordinates();
        int xToken = tokenCoordinates[0];
        int yToken = tokenCoordinates[1];
        Player tokenPlayer = token.getPlayer();


        return false;
    }

}
