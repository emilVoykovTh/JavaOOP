import java.util.ArrayList;
import java.util.List;

public class Team {
    //+	addPlayer(Player) : void
    //+	removePlayer(String) : void
    //+	getRating() : double

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name == null) {
            throw new IllegalArgumentException("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(String playerName){
        boolean containsPlayerName = false;
        Player playerSearched = null;
        for (Player player : players) {
            if(playerName.equals(player.getName())){
                containsPlayerName = true;
                playerSearched = player;
                break;
            }
        }
        if (containsPlayerName){
            players.remove(playerSearched);
        }else {
            throw new IllegalArgumentException("Player "+ playerName +" is not in Arsenal team.");
        }
    }

    public double getRating(){
        double totalRating = 0;
        for (Player player : players) {
            totalRating += player.overallSkillLevel();
        }
        return totalRating / players.size();
    }
}

