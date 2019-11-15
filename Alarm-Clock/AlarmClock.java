
/**
 * Allows setting the alarm clock 
 * 
 * @author (Kirk Fay) 
 * @version (March 23 2017)
 */
public class AlarmClock
{
    //initialize instance variables
    private Time clockTime;
    private Time alarmTime;

    /**
     * Constructor for objects of class AlarmClock
     */
    public AlarmClock()
    {
        alarmTime = new Time(12, 00, true);
        clockTime = new Time (12, 00, true);
    }

    /**
     * Getter Methods 
     */
    public Time getClockTime(){ return clockTime;}

    public Time getAlarmTime(){ return alarmTime;}

    /**
     * Allows setting the clock 
     *      
     * @param      hourDesired     an integer in the range 1-12
     * @param      minuteDesired   an integer in the range 0-59
     * @param      amIndicatorDesired a boolean
     * @return     void 
     */
    public void setClock(int hourDesired, int minuteDesired, boolean amIndicatorDesired){ 
        while (clockTime.getMinute() != minuteDesired){
            clockTime.advanceMinute();
        }
        while (clockTime.getHour() != hourDesired){
            clockTime.advanceHour();
        }
        if(clockTime.isAM() != amIndicatorDesired){
            for (int count = 0; count < 12; count++){
                clockTime.advanceHour();
            }
        }
        return; 
    }

    /**
     * Allows setting the clock 
     *      
     * @param      hourDesired     an integer in the range 1-12
     * @param      minuteDesired   an integer in the range 0-59
     * @param      amIndicatorDesired a boolean
     * @return     void 
     */
    public void setAlarm(int  hourDesired, int minuteDesired, boolean amIndicatorDesired){ 
        while (alarmTime.getMinute() != minuteDesired){
            alarmTime.advanceMinute();
        }
        while (alarmTime.getHour() != hourDesired){
            alarmTime.advanceHour();
        }
        if(alarmTime.isAM() != amIndicatorDesired){
            for (int count = 0; count < 12; count++){
                alarmTime.advanceHour();
            }
        }
        return; 
    }
}
