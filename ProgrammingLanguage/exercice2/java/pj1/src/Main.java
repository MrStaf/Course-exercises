public class Main {
    public static void main(String args[]){
        counter headCount, tailCount;
        tailCount = new counter();
        headCount = new counter();
        for ( int flip = 0; flip < 100; flip++ ) {
        if (Math.random() < 0.5) headCount.increment(); // Count a "head".
        else tailCount.increment(); ; // Count a "tail".
        }
        System.out.println("There were " + headCount.getValue() +" heads.");
        System.out.println("There were " + tailCount.getValue() +" tails.");
    }
}
