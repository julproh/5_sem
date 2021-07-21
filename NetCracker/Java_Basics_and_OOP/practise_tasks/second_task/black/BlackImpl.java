public class BlackImpl implements Black {
    String color;

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void isBlack() {
        if (this.color == "black"){
            System.out.println("It is black");
        }
        else {
            System.out.println("It isn't black");
        }
    }
}