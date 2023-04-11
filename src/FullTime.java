public class FullTime extends Employee{
    int yearsOfExperience;

    public FullTime(int id, String name, int age,int yearsOfExperience) {
//        super(id, name, age,);
        this.yearsOfExperience = yearsOfExperience;

    }
    @Override
    public String toString(){
        return super.toString() + this.yearsOfExperience;
    }
}