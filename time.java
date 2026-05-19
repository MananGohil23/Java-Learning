class Time{
    int hours;
    int minutes;
    int seconds;
    Time(int hh , int mm , int ss){
        this.hours = hh;
        this.minutes = mm;
        this.seconds = ss;
    }

    void add(Time t1 , Time t2){
        int totalSeconds = t1.seconds + t2.seconds;
        int totalMinutes = t1.minutes + t2.minutes + totalSeconds / 60;
        int totalHours = t1.hours + t2.hours + totalMinutes / 60;

        totalSeconds = totalSeconds % 60;
        totalMinutes = totalMinutes % 60;

        System.out.println("Total Time: " + totalHours + " hours " + totalMinutes + " minutes " + totalSeconds + " seconds");
    }
}

class Main{
    public static void main(String args[]){
        Time t1 = new Time(2 , 45 , 30);
        Time t2 = new Time(1 , 20 , 45);
        t1.add(t1 , t2);
    }
}