package StopWatch;
import java.util.Date;

public class StopWatch {
    private Date startTime = new Date();
    private Date stopTime = new Date();
    private long start =  System.currentTimeMillis();
    private long stop =  System.currentTimeMillis();
    public StopWatch(){
    }
    //time start
    public Date getStarDay(){
        return this.startTime;
    }
    public long getStartTime()
    {
        return System.currentTimeMillis();
    }

    //time stop
    public Date getStopDate(){
        return this.stopTime;
    }
    public long getStopTime()
    {
        return System.currentTimeMillis();
    }

    //trả về thời gian đã trôi qua theo số milisecond giây
    public  long getElapsedTime()
    {
        return this.stop - this.start;
    }

}
