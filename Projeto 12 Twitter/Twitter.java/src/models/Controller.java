package models;

import java.util.Map;
import java.util.TreeMap;

public class Controller 
{
    private Map<String, User> users;
    private Map<Integer, Tweet> tweets;

    public Controller(){
        users = new TreeMap<>();
        tweets = new TreeMap<>();
    }

    public void sendTweet(String userName, String msg)throws Exception{
        if(!users.containsKey(userName)){
            throw new Exception("Usuário não existe");
        }
        Tweet tweet = new Tweet(userName, msg);
        users.get(userName).sendTweet(tweet);
        tweets.put(tweet.getId(), tweet);

    }

    public void addUser(String userName)throws Exception{
        if(users.containsKey(userName)){
            throw new Exception ("Usuário já existe");
        }
        User user = new User(userName);
        users.put(userName, user);
    }

    public User getUser(String userName)throws Exception{
        if(!users.containsKey(userName)){
            throw new Exception("Não existe esse BABACA aqui, seu BABACA");
        }
        return users.get(userName);
    }

    public void follow(String nameFollower, String nameFollowing)throws Exception{
        if(!users.containsKey(nameFollower) || !users.containsKey(nameFollowing)){
            new Exception("Algum desses imbecis não existe, seu imbecil");
        }
        User user1 = users.get(nameFollower);
        User user2 = users.get(nameFollowing);

        user1.follow(user2);
    }

    public void unFollow(String nameFollower, String nameFollowing)throws Exception{
        if(!users.containsKey(nameFollower) || !users.containsKey(nameFollowing)){
            new Exception("Algum desses imbecis não existe, seu imbecil");
        }
        User user1 = users.get(nameFollower);
        User user2 = users.get(nameFollowing);

        user1.unFollow(user2.getUsername());
    }

    public void like(String userName, int twId)throws Exception{
        if(!users.containsKey(userName)){
            throw new Exception("Ei chapa, o carinha aí não existe ohhhh");
        }
        if(!tweets.containsKey(twId)){
            throw new Exception("O tweet não existe");
        }
        if(!users.get(userName).getTimeLine().containsKey(twId)){
            throw new Exception("KKKKKKKKKKKK tem não");
        }

        Tweet tweet = tweets.get(twId);
        tweet.getLikes().add(userName);
    }

    public String unread(String userName)throws Exception{
        if(!users.containsKey(userName)){
            throw new Exception("Ei chapa, o carinha aí não existe ohhhh");
        }

        return users.get(userName).getUnread();
    }

    public String timeLine(String userName)throws Exception{
        if(!users.containsKey(userName)){
            throw new Exception("Ei chapa, o carinha aí não existe ohhhh");
        }

        return users.get(userName).getTimeLineStg();
    }    

}
