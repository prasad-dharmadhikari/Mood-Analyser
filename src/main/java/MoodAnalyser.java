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
    // Overloaded analyseMood method
    public String analyseMood()
    {
        if (message.equals("I am in Sad Mood"))
        {
            returnMessage="SAD";
        }
        else if (message.equals("I am in Happy Mood"))
        {
            returnMessage="HAPPY";
        }
        return returnMessage;
    }
}
