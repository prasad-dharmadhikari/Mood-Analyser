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
    public String analyseMood(String message) throws MoodAnalysisException
    {
        this.message = message;
        return analyseMood();
    }
    // Overloaded analyseMood method
    public String analyseMood() throws MoodAnalysisException
    {
        try
        {
            returnMessage = (message.contains("Sad")) ? "SAD":"HAPPY";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException("Please enter proper message");
        }
        return returnMessage;
    }
}
