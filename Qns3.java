public class Qns3 
{
    public static void main(String[] args) 
    {
        long totalMilliseconds = System.currentTimeMillis();

        //1s = 1000ms
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        
        //1min = 60s
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60; 

        //1hr = 60min
        long totalHours = totalMinutes/60;
        long currentHour = (totalHours%24)+8; //+8 due to GMT

        System.out.println("Current time is "+currentHour+":"+currentMinutes+":"+currentSeconds+" GMT");
    }
    
}
