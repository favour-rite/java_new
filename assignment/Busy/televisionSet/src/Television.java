

public class Television {

    private boolean isOn;
    private int volume = 0;
    private int channel;

    public Television() {
        this.isOn = false;
        this.volume = 0;
        this.channel = 0;

    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public void increaseVolume() {
        if ( getIsOn() && volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if( getIsOn() && volume > 0) {
            volume--;
        }
    }
    public int getVolume() {
        return volume;
    }

    public void channelUp() {
        if (getIsOn() && channel > 0 && channel <= 100) {
            channel++;
        }
    }
    public int getChannelUp() {
        return channel;
    }

}
