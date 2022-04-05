public class testSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer sp1 = new SoccerPlayer();
        System.out.println("The name is: " + sp1.run());
        System.out.println("The number is: " + sp1.jumpNumber());
        System.out.println("The xLocation is: " + sp1.jumpXL());
        System.out.println("The yLocation is: " + sp1.jumpYL());
        System.out.printf("The kick ball is: %.2f%n", sp1.kickBall());

        System.out.println("");

        SoccerPlayer sp2 = new SoccerPlayer("Re Jame", 21);
        System.out.println("The name is: " + sp2.run());
        System.out.println("The number is: " + sp2.jumpNumber());
        System.out.println("The xLocation is: " + sp2.jumpXL());
        System.out.println("The yLocation is: " + sp2.jumpYL());
        System.out.printf("The kick ball is: %.2f%n", sp2.kickBall());

        System.out.println("");


        SoccerPlayer sp3 = new SoccerPlayer("Mount Jame", 30, 50, 60);
        System.out.println("The name is: " + sp3.run());
        System.out.println("The number is: " + sp3.jumpNumber());
        System.out.println("The xLocation is: " + sp3.jumpXL());
        System.out.println("The yLocation is: " + sp3.jumpYL());
        System.out.printf("The kick ball is: %.2f%n", sp3.kickBall());
    }
}
