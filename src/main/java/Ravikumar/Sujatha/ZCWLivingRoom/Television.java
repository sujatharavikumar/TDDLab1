package Ravikumar.Sujatha.ZCWLivingRoom;

/**
 * Created by sujatharavikumar on 9/9/16.
 */
public class Television {
    private Integer volume;
    private Integer channel;

    public Television(){
        volume = 0;
        channel = 0;
    }
    public Integer getVolume(){
        // Null is being returned here because we are Stubbing this method out.
        // The goal in TDD is to create just enough of the method so that it can compile
        return volume;
    }
    public void setVolume(Integer volume){
        // Since the return type is void, we do not have to do anything more to Stubb out this method
        volume = 0;
    }
}
