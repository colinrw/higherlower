/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_tables;

/**
 *
 * @authors Colin Werkhoven 17079578 & Vedat Yilmaz 17118700 2C
 */
public class Player {
    private final int id_players, score;
    private final String name;
    
    public Player(int id_players, String name, int score)
    {
        this.id_players=id_players;
        this.name=name;
        this.score=score;
    }
    
    public int getId_players()
    {
        return this.id_players;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getScore()
    {
        return this.score;
    }
}
