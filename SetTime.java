package StopWatch;
import java.text.ParseException;
import java.util.Scanner;

public class SetTime {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        arr = new int[] {4,3,6,34,5,63,7,48,4,3,5,5,3,8,3,35,0,8,8,777,2,2,3,2,3,2,3,23,2,3,2,32,2,4,2,42} ;
        sort(arr);
    }

    //phuong thuc tinh time
    private static void sort(int[] arr)
    {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStarDay());
        long start = stopWatch.getStartTime();
        stopWatch.getStartTime();
        int min = arr[0];
        for (int x = 1; x < arr.length; x++)
        {
            if(min > arr[x])
            {
                min = arr[x];
            }
        }
        for ( int x = 0; x < arr.length; x++)
        {
            System.out.print(arr[x] + ".");
        }
        System.out.println(stopWatch.getStopDate());
        long stop = stopWatch.getStopTime();
        stopWatch.getStopTime();
        System.out.println(stopWatch.getStopDate());
        System.out.println(stop-start);
    }
}
