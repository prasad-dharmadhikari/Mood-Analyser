public class MoodAnalyser
{
    private String message;
    private String returnMessage;
    //no-arg constructor
    public MoodAnalyser()
    {

    }
    //parametrized constructor
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    public String analyseMood(String message)
    {
        this.message = message;
        return  analyseMood();
    }
    public String analyseMood()
    {
        if (message.equals("I am in Sad Mood"))
        {
            returnMessage="SAD";
        }
        return returnMessage;
    }
}