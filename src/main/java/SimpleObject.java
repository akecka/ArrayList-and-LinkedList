import java.util.*;
import java.lang.*;
import java.io.*;

public class SimpleObject {
}

class Simple {

    public static void simple () throws java.lang.Exception {

        SimpleObject obj = new SimpleObject();
        int result = obj.hashCode();

        System.out.println(result);
    }
}