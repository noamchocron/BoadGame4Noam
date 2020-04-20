public class computer extends Player {

    public computer(String token) {

        super("Bit Bucket", token);
    }
    public int determineMove() {

        int col = (int )(Math.random() * 8);

        return col;

    }

}
