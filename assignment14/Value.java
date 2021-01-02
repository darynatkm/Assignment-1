package assignment14;

public class Value {
    int value;
    boolean wasModified;
    boolean wasUsed;


    public Value(int value) {
        this.value = value;
        wasUsed=true;
    }
    public Value(){

    }
    public void setVal(int value){
        this.value=value;
        wasModified=true;
    }
    public boolean wasModified(){
        if(wasModified==true)
            return true;
        else return false;
    }
    public int getVal(){
        if(wasModified==true)
            return value;
        else if(wasUsed==true)
            return value;
       else return 0;
    }
}
