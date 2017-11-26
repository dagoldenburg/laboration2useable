package com.example.micke.laboration2.Model;

/**
 * Created by Micke on 11/26/2017.
 */

public class GameState {

    private boolean firstPlayersTurn;

    private static GameState gameState;

    private GameState() {
        firstPlayersTurn = true;
    }

    public GameState getInstance(){
        if(gameState==null){
            gameState = new GameState();
        }
        return gameState;
    }

    public boolean isFirstPlayersTurn() {
        return firstPlayersTurn;
    }

    public void setFirstPlayersTurn(boolean firstPlayersTurn) {
        this.firstPlayersTurn = firstPlayersTurn;
    }
}
