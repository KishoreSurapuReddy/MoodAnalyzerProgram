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
            if (message == " "){
                throw new MoodAnalysisException(MoodAnalysisException.Invalid.EMPTY,"string is Empty");
            }
            if (this.message.toLowerCase().matches("(.*)sad(.*)")) {
                return "SAD";
            }
        }
        catch (MoodAnalysisException e){
            throw new MoodAnalysisException(MoodAnalysisException.Invalid.EMPTY , "String is Empty");
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.Invalid.NULL,"string is Null");
        }
        return "HAPPY";
    }
}
