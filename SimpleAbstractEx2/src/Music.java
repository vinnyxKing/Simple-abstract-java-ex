public class Music {
    public static void main(String[] args) {
        StringPlayer string1 = new StringPlayer("Guitar Instrument","Base Guiter");
        WoodwindPlayer wood1 = new WoodwindPlayer("Reedless wind instrument","Flute");
        BrassPlayer brass1 = new BrassPlayer("Jazz brass instrument", "Trumpet");

        MusicMaker [] musicArr = {string1, wood1, brass1};

        for (MusicMaker eachMusic : musicArr){
            System.out.println("Type is a " + eachMusic.instrument);
            System.out.println("Name is : " + eachMusic.name);
            System.out.print("And it goes: ");
            eachMusic.play();
            System.out.println("\n");
        }
    }
}
