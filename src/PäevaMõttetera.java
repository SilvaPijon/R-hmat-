import java.util.Random;
import java.util.stream.IntStream;

public class PäevaMõttetera {

    private static String [] mõtteterad= {
            "Ära lase pead longu kui oled kaelani sita sees", "Katkine kell näitab päevas kaks korda õiget aega",
            "Kus viga näed laita, seal mine ja aita laita"
    };

    public static void  mõtteteraLeidija(){
        System.out.println(mõtteterad[(int)(Math.random()* mõtteterad.length)]);

    }
}
