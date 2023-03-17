package footballplayer;

public class FootballPlayer {

    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;
    
    void play(int minutesToPlay){
        minutes += minutesToPlay;
    }
    
    void score(){
        numberOfGoals++;
    }
    
}
