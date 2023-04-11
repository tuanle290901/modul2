public class PartTime extends Employee{
    int workTime;

    public PartTime(int id,String name, int age, int workTime) {
//        super(id, name, age);
        this.workTime = workTime;
    }
}