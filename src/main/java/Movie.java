import java.util.*;
import java.lang.*;

public class Movie {

    String title;
    int yearOfPublication;

    public Movie(String title, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}

class List {

    public static void exemple() throws java.lang.Exception {

        double mySum = 0;
        double myAverage;
        int myCount = 0;

        ArrayList<Integer> mathMarks = new ArrayList<>();
        mathMarks.add(4);
        mathMarks.add(2);
        mathMarks.add(3);
        mathMarks.add(5);
        mathMarks.add(6);

        for (int n = 0; (n < mathMarks.size()); n++) {
            if (mathMarks.get(n) > 2 && mathMarks.get(n) < 6) {

                System.out.println(mathMarks.get(n));
                mySum = mySum + mathMarks.get(n);
                myCount = myCount + 1;

            }
        }
        myAverage = mySum / myCount;
        System.out.println("Sum is: " + mySum);
        System.out.println("Marks: " + myCount);
        System.out.println("My Average is:" + myAverage);

        LinkedList<Movie> movies = new LinkedList<>();

        Movie movie1 = new Movie("Blade Runner", 2017);
        Movie movie2 = new Movie("Harry Potter", 1997);
        Movie movie3 = new Movie("The Square", 2017);
        Movie movie4 = new Movie("Fantastyczna kobieta", 2017);

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        for (Movie movie : movies) {
            if (movie.getYearOfPublication() >= 2001) {
                System.out.println(movie.title);
            }
        }
    }
}
