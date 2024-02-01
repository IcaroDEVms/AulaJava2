class Ball{
    //cria uma variável "cor"
    private String color;

    //função para atribuir cor à bola
    public Ball(String color){
        this.color = color;
    }

    //função para obter valor "privado" (cor da bola)
    public String getColor(){
        return color;
    }

    //função para definir diferentes valores à (cor da bola)
    public void setColor(String color){
        this.color = color;
    }
}

class Square{
    private int length;

    public Square(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int Area(){
        return length*length;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Ball myBall = new Ball("Azivis");
        System.out.println("Ball color: " + myBall.getColor());
        
        myBall.setColor("Red");
        System.out.println("Ball color: " + myBall.getColor());

        System.out.println("\n");
        
        Square mySquare = new Square(10);
        System.out.println("Square length: " + mySquare.getLength());
        System.out.println("Square area: " + mySquare.Area());
        
        System.out.println("\n");

        mySquare.setLength(20);
        System.out.println("Square length: " + mySquare.getLength());
        System.out.println("Square area: " + mySquare.Area());
    }
}

