public class MoodAnalysisException extends Exception {
    public Invalid type;
    private String message;
    enum Invalid {
        NULL,
        EMPTY
    }
    MoodAnalysisException(Invalid type , String exceptionMessage){
        message = exceptionMessage;
        this.type = type;
    }
    @Override
    public String toString() {
        return message;
    }
}
