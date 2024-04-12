package model.computer;
public class PC extends Computer implements Music, Video {
    private boolean isPowerConnected;
    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.isPowerConnected = false;
    }
    public void setPowerConnected(boolean powerConnected) {
        isPowerConnected = powerConnected;
    }
    public void showComputerName() {
        System.out.println(name);
    }
    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if(isPowerConnected) {
            super.switchOn();
        } else {
            System.out.println("Powwer supply is not connected!");
        }
    }

    @Override
    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    public  int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
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
        Video.super.sayHello();
    }

}