import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory 
{
    public static Constructor<?> getConstructor(String className) throws MoodAnalysisException
    {
        try 
        {
            Class<?> moodAnalyserClass = Class.forName(className);
            return moodAnalyserClass.getConstructor();
        } 
        catch (ClassNotFoundException e) 
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,"Class not found");
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