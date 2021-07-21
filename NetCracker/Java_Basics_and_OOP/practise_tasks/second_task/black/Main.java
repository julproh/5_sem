public class Main{
    public static void  main(String[] args) {
        Black black = new BlackImpl();
        
        black.setColor("blue");
        black.isBlack();

        black.setColor("black");
        black.isBlack();
    }
}