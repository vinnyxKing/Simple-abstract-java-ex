public abstract class MusicMaker {

    protected String instrument;
    protected String name;

    public MusicMaker(String instrument, String name) {
        this.instrument = instrument;
        this.name = name;
    }

    public MusicMaker() {

    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void play();


}
