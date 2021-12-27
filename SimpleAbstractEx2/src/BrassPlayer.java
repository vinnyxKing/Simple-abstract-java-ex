public class BrassPlayer extends MusicMaker {


    public BrassPlayer(String instrument, String name) {
        super(instrument, name);
    }

    public BrassPlayer() {
    }

    @Override
    public void play() {
        System.out.println("Dong Dong Dong baby!!");
    }
}
