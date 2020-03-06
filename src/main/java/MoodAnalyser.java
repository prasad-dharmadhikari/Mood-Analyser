public class MoodAnalyser
{
    private String returnMessage;
    public String analyseMood(String message)
    {
        if (message.equals("I am in Sad Mood"))
        {
            returnMessage = "SAD";
        }
        else if (message.equals("I am in Any Mood"))
        {
            returnMessage = "HAPPY";
        }
        return  returnMessage;
    }
}
