package wk5;

import java.util.ArrayList;

//Exercise 90: Team and Players

//Exercise 90.1: Class Team
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    //Exercise 90.3: Adding players to a team
    public void addPlayer(Player player) {
        if (size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player:this.players) {
            System.out.println(player.getName() +", goals " +player.getGoals());
        }
    }

    //Exercise 90.4: The team maximum size and current size
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    //Exercise 90.5: Goals of a team
    public int goals() {
        int total = 0;
        for (Player player:this.players) {
            total += player.getGoals();
        }
        return total;
    }
}