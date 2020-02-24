public class MoodAnalysisException extends Exception {
    enum Invalid{
        NULL,
        EMPTY
    }
    MoodAnalysisException(String exceptionMessage){
        super(exceptionMessage);
    }
}
