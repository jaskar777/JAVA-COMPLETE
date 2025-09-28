interface Playable {
    void play();
}


class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitor");
    }
}

class Piano implements Playable {
    
    @Override
    public void play() {
        System.out.println("Piano");
    }
}
public class Interface {
    public static void main(String[] args) {
        

        Piano p1 = new Piano();
        p1.play();

        Guitar g1 = new Guitar();
        g1.play();

    }
}
