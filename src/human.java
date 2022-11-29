public class human {
    private int yearOfBirth;
    String name;
    private String town;
    String gender;
    String jobTitle;
    human(String gender, String name,String town, int yearOfBirth, String jobTitle) {
        this.gender = gender;
        this.setYearOfBirth(yearOfBirth);
        this.setTown(town);
        if (name!=null && name.length()!=0) {
            this.name=name;
        } else {
            this.name = "<<Информация не указана>>";
        }
        if (jobTitle!=null && jobTitle.length()!=0) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "<<Информация не указана>>";
        }
    }
    @Override
    public String toString() {
        if (gender=="муж") {
            return "Привет! Меня зовут " + this.name + ". Я из города "+
                    this.town + ". Я родился в " + this.yearOfBirth +
                    " году. Я работаю на должности "+this.jobTitle+". Будем знакомы!";
        } else {
            return "Привет! Меня зовут " + this.name + ". Я из города "+
                    this.town + ". Я родилась в " + this.yearOfBirth +
                    " году. Я работаю на должности "+this.jobTitle+". Будем знакомы!";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth>0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town!=null && town.length()!=0) {
            this.town = town;
        } else {
            this.town = "<<Информация не указана>>";
        }
    }
}