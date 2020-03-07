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
        return analyseMood();
    }
    // Overloaded analyseMood method
    public String analyseMood()
    {
        if (message.contains("Sad"))
        {
            returnMessage="SAD";
        }
        else if (message.contains("Happy"))
        {
            returnMessage="HAPPY";
        }
        return returnMessage;
    }
}
