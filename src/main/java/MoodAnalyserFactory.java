import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory 
{
    public static MoodAnalyser createMoodAnalyserObject() throws MoodAnalysisException
    {
        try 
        {
            Class<?> moodAnalyser = Class.forName("MoodAnalyser");
            Constructor<?> moodAnalyserConstructor = moodAnalyser.getConstructor(Integer.class);
            Object moodObject = moodAnalyserConstructor.newInstance();
            return (MoodAnalyser) moodObject;
        } 
        catch (ClassNotFoundException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,"Class Not found");
        }
        catch (NoSuchMethodException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,"Method Not found");
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