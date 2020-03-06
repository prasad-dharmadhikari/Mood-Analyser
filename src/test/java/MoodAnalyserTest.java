import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
    String result;
    // Test case for Given “I am in Sad Mood” message through constructor should return SAD
    @Test
    public void givenMessage_WhenProper_RespondAsSadMood()
    {
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",result);
    }
}
