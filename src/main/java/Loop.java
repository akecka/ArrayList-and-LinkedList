import java.lang.*;

public class Loop {

    public static void loop() throws Exception {

        double mySum = 0;
        double myAverage;

        int[] myMarks = new int[10];

        myMarks[0] = 18;
        myMarks[1] = 20;
        myMarks[2] = 5;
        myMarks[3] = 3;
        myMarks[4] = 2;
        myMarks[5] = 3;
        myMarks[6] = 6;
        myMarks[7] = 2;
        myMarks[8] = 1;
        myMarks[9] = 7;

        for (int i=0; i < myMarks.length; i++){

            System.out.println("Array element myMarks[" + i + "] = " + myMarks[i]);

            mySum = mySum + myMarks[i];
        }

        myAverage = mySum / myMarks.length;
        System.out.println("Sum is:" + mySum);
        System.out.println("My Marks:" + myMarks.length);
        System.out.println("My average is:" + myAverage);
    }
}




