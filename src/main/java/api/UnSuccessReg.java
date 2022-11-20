package api;

public class UnSuccessReg {
    private final String error;

    public UnSuccessReg(String error) {
        this.error = error;
    }


    public String getError() {
        return error;
    }
}
