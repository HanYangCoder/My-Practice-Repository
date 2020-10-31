public studentClass{

    private String firstName = "";
    private String lastName = "";
    private String middleName = "";

    private int dateOfBirthMonth;
    private int dateOfBirthDay;
    private int dateOfBirthYear;

    private int gradeLevel;
    private int genAverage;

    studentClass(String firstName, String middleName, String lastName, 
        int dateOfBirthMonth, int dateOfBirthDay, int dateOfBirthYear){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirthMonth = dateOfBirthMonth;
        this.dateOfBirthDay = dateOfBirthDay;
        this.dateOfBirthYear = dateOfBirthYear;
    }

    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }

    public void setGradeLevel(int genAverage){
        this.genAverage = genAverage;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getStringDateOfBirth(){
        return dateOfBirthMonth + "-" + dateOfBirthDay + "-" + dateOfBirthYear;
    }

    public int getGradeLevel(){
        return gradeLevel;
    }

    public int getGeneralAverage(){
        return genAverage;
    }
}