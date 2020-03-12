import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser;
    String result;
    @Test
    public void givenMessage_WhenProper_RespondAsSadMood() throws MoodAnalysisException
    {
        moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_WhenProper_RespondAsHappyMood() throws MoodAnalysisException
    {
        moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
    @Test
    public void givenNullMood_ShouldReturnHappy() throws MoodAnalysisException
    {
        moodAnalyser = new MoodAnalyser(null);
        result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
    @Test
    public void givenNullMood_ShouldThrowCustomException()
    {
        try
        {
            moodAnalyser = new MoodAnalyser();
            result = moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
    @Test
    public void givenEmptyMood_ShouldThrowCustomExceptionWithExceptionType()
    {
        try
        {
            moodAnalyser = new MoodAnalyser();
            result = moodAnalyser.analyseMood(" ");
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
    @Test
    public void givenMoodAnalyser_WhenProper_ShouldReturnObject() throws MoodAnalysisException
    {
        moodAnalyser = new MoodAnalyser();
        MoodAnalyser moodAnalyserObject = MoodAnalyserFactory.createMoodAnalyserObject();
        boolean result = moodAnalyser.equals(moodAnalyserObject);
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenClassName_WhenImproper_ShouldThrowMoodAnalysisException()
    {
        try
        {
            MoodAnalyser moodAnalyserObject = MoodAnalyserFactory.createMoodAnalyserObject();
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,e.type);
        }
    }
}