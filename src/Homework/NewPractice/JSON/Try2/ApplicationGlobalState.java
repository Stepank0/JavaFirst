package Homework.NewPractice.JSON.Try2;

public final class ApplicationGlobalState {

    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private String enteredDate = null;
    private final String API_KEY = "BmKTX3bWs8Y0py0dR6s9tBuVRx0gRZM6";
    private final String DB_FILENAME = "application.db";

    private ApplicationGlobalState() {
    }


    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }

        return INSTANCE;
    }
    public String getDbFileName() { return DB_FILENAME; }

    public String getSelectedCity() {
        return selectedCity;
    }

    public String getEnteredDate() { return enteredDate; }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public void setEnteredDate(String enteredDate) { this.enteredDate = enteredDate; }

    public String getApiKey() {
        return this.API_KEY;
    }
}
