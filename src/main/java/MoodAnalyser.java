public class MoodAnalyser {
    MoodAnalysisException.Invalid exceptionMessage;
    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0){
                throw new MoodAnalysisException(MoodAnalysisException.Invalid.EMPTY,"string is Empty");
            }

            if (this.message.toLowerCase().matches("(.*)sad(.*)")) {
                return "SAD";
            }
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.Invalid.NULL,"string is Null");
        }

        return "HAPPY";
    }
}
