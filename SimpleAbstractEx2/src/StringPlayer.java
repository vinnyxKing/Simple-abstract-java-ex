public class StringPlayer extends MusicMaker{


    public StringPlayer(String instrument, String name) {
        super(instrument, name);
    }

    public StringPlayer() {

    }

    @Override
    public void play() {
        System.out.println("Ding Ding Ding baby!!");
    }
}
