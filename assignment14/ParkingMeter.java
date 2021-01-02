package assignment14;

public class ParkingMeter{
    int timeLeft=0;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }
    public boolean add(int a){
        if(a==25 && timeLeft<maxTime){
            timeLeft+=30;
            return true;}
        return false;
    }
    public void tick(){
        if(timeLeft>0)
            timeLeft-=1;
    }
    public boolean isExpired(){
        if(timeLeft==0)
            return true;
        else return false;
    }

}
