package phrase;

public class Main {
    public static void main(String[] args) {
        
        String[] wordListOne = {"24/7", "multi-Tier", "B-to-B"};
        String[] wordListTwo = {"empowered", "sticky", "value-added"};
        String[] wordListThree = {"process", "solution", "strategy"};


        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;


        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);


        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];


        System.out.println("What we need is a " + phrase);
    }
}