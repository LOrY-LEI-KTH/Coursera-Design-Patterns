//Subject.java

public interface Subject {

    public void registerObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObserver();

}




//Channel.java
import java.util.ArrayList;

public class Channel implements Subject {
  
  private ArrayList<Observer> observers;
  private String channelName;
  private String status;

  public String getStatus(){return this.status;}
  public void setStatus(String status) {
    this.status = status; 
  }
  public void notifyObserver(){
    for (Observer ob : observers)
        ob.update(this.status);
  }

  public void registerObserver(Observer ob){
    observers.add(ob);
  }
  public void removeObserver(Observer ob){
    observers.remove(ob);
  }
  //
}





//Observer.java

public interface Observer {
	public void update(String status);
}





//Follower.java

public class Follower implements Observer {

private String followerName;

public void update(String status){
    System.out.print("status changed: ",  status);
    if (status == "live")
    play();
}

public void play() 
System.out.print("play the channel");
}
