
public class MoodAnalysisException extends Exception
{
    enum ExceptionType
    {
        ENTERED_NULL, ENTERED_EMPTY, NO_SUCH_CLASS, NO_SUCH_METHOD, NO_SUCH_FIELD;
    }
    ExceptionType type;
    // Constructor
    public MoodAnalysisException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
