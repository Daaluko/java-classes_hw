public class WaterBottle {
    private int volume;



    public WaterBottle(int inputVolume){
        this.volume = inputVolume;
    }


    public int drink(){
        return this.volume - 100;
    }

    public int fill(){
        return this.volume + 100;
    }
}
