import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory 
{
    public static MoodAnalyser createMoodAnalyserObject() 
    {
        try 
        {
            Class<?> moodAnalyser = Class.forName("MoodAnalyser");
            Constructor<?> moodAnalyserConstructor = moodAnalyser.getConstructor();
            Object moodObject = moodAnalyserConstructor.newInstance();
            return (MoodAnalyser) moodObject;
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}