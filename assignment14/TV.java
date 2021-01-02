package assignment14;

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on=false;
    String brand="undefined";
    public TV(){
        System.out.println("Creating TV object using no Args- constructor");}
    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg- constructor");}
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        if (!on || channel < 1 || channel > 120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            this.channel = channel;
        }
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel) {
        if (!on || volumeLevel < 1 || volumeLevel > 7) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            this.volumeLevel = volumeLevel;
        }
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void channelUp() {
        if (!on || channel == 120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            channel += 1;
        }
    }
    public void channelDown() {
        channel -= 1;
    }
    public void volumeUp() {
        if (!on || volumeLevel == 7) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            volumeLevel += 1;
        }
    }
    public void volumeDown() {
        if (!on || volumeLevel == 1) {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            volumeLevel -= 1;
        }
    }
    public boolean isOn() {
        return on;
    }
    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }
    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }
    }
}


