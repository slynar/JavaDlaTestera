package model.computer;
public class Laptop extends Computer implements Music, Video {
    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }
    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if(batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is too low!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }
    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public  int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }
    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }
    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO");
    }
    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO");
    }
    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO");
    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

}