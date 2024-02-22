public class Program {
    public static void main(String[] args) {
        MusicStyles duaLipa = new PopMusic();
        MusicStyles linkinPark = new RockMusic();
        MusicStyles chopen = new ClassicMusic();

        MusicStyles[] groupArray = {duaLipa, linkinPark, chopen};
        for(MusicStyles group: groupArray){
            group.playMusic();
        }




    }
}
