package fr.jason.puissance.Managers;

import fr.jason.puissance.State;

public class GameManager {

    private State state;

    public void Game(){
        initializeGame();
        gameLoop();
        endGame();
    }

    public void initializeGame(){
        /*
        Create 2 players :
            - ask pseudos
            - generate UUIDs
        Create 1 Board
         */
    }

    public void gameLoop(){

    }

    public void endGame(){

    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isState(State state){
        return this.state == state;
    }
}
