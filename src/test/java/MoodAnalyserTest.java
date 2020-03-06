import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser;
    String result;
    // Test case for Given “I am in Sad Mood” message through constructor should return SAD
    @Test
    public void givenMessage_WhenProper_RespondAsSadMood()
    {
        moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",result);
    }
    // Test case for Given “I am in Happy Mood” message through constructor should return HAPPY
    @Test
    public void givenMessage_WhenProper_RespondAsHappyMood()
    {
        moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
}
