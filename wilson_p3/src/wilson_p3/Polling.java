package wilson_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int [] topicRating = new int[5];
		
        System.out.println("Please enter a rating from 1 to 10 for each topic. ");
        
        System.out.print("How much do you like pizza? ");
        topicRating[0] = scnr.nextInt();
        
        System.out.print("How much fun is Borderlands 3?");
        topicRating[1] = scnr.nextInt();

        System.out.print("How often do you text while driving? ");
        topicRating[2] = scnr.nextInt();
        
        System.out.print("Is global warming real? ");
        topicRating[3] = scnr.nextInt();
        
        System.out.print("How important do you think the switch to electric cars will be in the future? ");
        topicRating[4] = scnr.nextInt();
        
        System.out.println("Topic 1:" + topicRating[0]);
        System.out.println("Topic 2:" + topicRating[1]);
        System.out.println("Topic 3:" + topicRating[2]);
        System.out.println("Topic 4:" + topicRating[3]);
        System.out.println("Topic 5:" + topicRating[4]);


	}

}
