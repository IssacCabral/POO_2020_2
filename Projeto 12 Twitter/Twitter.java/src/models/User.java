package models;

import java.util.Map;
import java.util.TreeMap;

public class User 
{
    private String userName;
    private Map<String, User> followers;
    private Map<String, User> followings;
    private Map<Integer, Tweet> timeline;
    private int unreadCount;

    public User(String userName){
        this.userName = userName;
        followers = new TreeMap<>();
        followings = new TreeMap<>();
        timeline = new TreeMap<>();
    }

    public String getUsername(){return this.userName;}
    public Map<String, User> getFollowings(){return this.followings;}
    public Map<String, User> getFollowers(){return this.followers;}

    public void follow(User user)throws Exception{
        if(followings.containsKey(user.getUsername())){
            throw new Exception("Tu ja segue ele chapa!!");
        }
        followings.put(user.getUsername(), user);
        user.getFollowers().put(this.userName, this);
    }

    public void unFollow(String username)throws Exception{
        if(!followings.containsKey(username)){
            throw new Exception("Voce não segue ele para poder unFollow");
        }
        User user = followings.remove(username);
        user.getFollowers().remove(this.userName);
    }

    public void sendTweet(Tweet tweet){
        for(User seguidor: followers.values()){
            seguidor.timeline.put(tweet.getId(), tweet);
            seguidor.unreadCount +=1;
            
        }
        this.timeline.put(tweet.getId(), tweet);
    }

    public String getUnread(){
        String aux = "";

        if(unreadCount == 0){
            aux = "Vazio";
            return aux;
        }

        for(int i = this.timeline.size() - this.unreadCount + 1; i <= this.timeline.size(); i++){
            aux += timeline.get(i) + "\n";
        }
        unreadCount = 0;
        return aux;
    }

    public Tweet getTweet(int idTw)throws Exception{
        if(!timeline.containsKey(idTw)){
            throw new Exception("Esse tweet não existe na timeLine do User");
        }
        return this.timeline.get(idTw);
    }

    public Map<Integer, Tweet> getTimeLine(){return this.timeline;}
    
    public String getTimeLineStg(){
        String aux = "";

        for(Tweet tweets: timeline.values()){
            aux += tweets + " \n";
        }
        this.unreadCount = 0;
        return aux;
    }

    public String toString(){
        return this.userName;
    }
}
