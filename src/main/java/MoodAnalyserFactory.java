import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory 
{
    public static Constructor<?> getConstructor(String className)
    {
        try 
        {
            Class<?> moodAnalyserClass = Class.forName(className);
            return moodAnalyserClass.getConstructor();
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static MoodAnalyser createMoodAnalyserObject(Constructor<?> moodAnalyserConstructor) throws IllegalAccessException, InvocationTargetException, InstantiationException
    {
        return (MoodAnalyser) moodAnalyserConstructor.newInstance();
    }
}