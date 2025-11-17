public class ArrayActivity {
    public static void main(String[] args) {

        int[] score = {65, 88, 93, 70, 82, 91, 76, 84, 95, 68};

        System.out.println("First: " + score[0]);
        System.out.println("Last: " + score[score.length - 1]);

        int lowest = score[0];
        int highest = score[0];

        for (int s : score) {
            if (s < lowest) lowest = s;
            if (s > highest) highest = s;
        }

        System.out.println("Lowest: " + lowest);
        System.out.println("Highest: " + highest + "\n");

        for (int i = 0; i < score.length; i++) {
            System.out.println("Score[" + i + "] = " + score[i]);
        }

        System.out.println();
        for (int s : score) {
            System.out.println("Score: " + s);
        }
        
        int sum = 0;
        for (int s : score) {
            sum += s;
        }

        double average = (double) sum / score.length;
        System.out.println("\nAverage score: " + average);
    }
}
