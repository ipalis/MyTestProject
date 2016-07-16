import java.util.Date;

public class EmployeeDetails {

    private String name;
    private double monthlySalary;
    private int age;
    private int workingDay;
    private double baseRate;
    private double experienceRatio;
    private double bonus;
    private int id;
    private Date dateExpireId;
    private int workingMonth;

    // @return the name
    public String getName() {

        return name;
    }

    // @param name the name to set
    public void setName(String name) {

        this.name = name;
    }

    // @return the monthlySalary
    public double getMonthlySalary() {

        return monthlySalary;
    }

    // @param monthlySalary the monthlySalary to set
    public void setMonthlySalary(double monthlySalary) {

        this.monthlySalary = monthlySalary;
    }

    // @return the age
    public int getAge() {

        return age;
    }

    // @param age the age to set
    public void setAge(int age) {

        this.age = age;
    }

    // @return the working day
    public int getWorkingDay() {

        return workingDay;
    }

    // @param the working day to set
    public void setWorkingDay(int workingDay) {

        this.workingDay = workingDay;
    }

    // @return the base rate
    public double getBaseRate() {

        return baseRate;
    }

    // @param base rate to set
    public void setBaseRate(double baseRate) {

        this.baseRate = baseRate;
    }

    // @return the experience ratio
    public double getExperienceRatio() {

        return experienceRatio;
    }

    // @param experience ratio to set
    public void setExperienceRatio(double experienceRatio) {

        this.experienceRatio = experienceRatio;
    }

    // @return the bonus
    public double getBonus() {

        return bonus;
    }

    // @param bonus to set
    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    // @return the id
    public double getId() {

        return id;
    }

    // @param id to set
    public void setId(int id) {

        this.id = id;
    }
    //return the expire date
    public void setDateExpire(Date newDateExpireId){
        dateExpireId = newDateExpireId;
    }

    //param id to set expire date
    public Date getDateExpire(){
        return dateExpireId;
    }

    //return the working month
    public void setWorkingMonth(int workingMonth){
        this.workingMonth = workingMonth;
    }

    //param id to set orking month
    public int getWorkingMonth(){
        return workingMonth;
    }
}