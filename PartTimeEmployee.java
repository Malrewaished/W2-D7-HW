public class PartTimeEmployee extends Employee {

    private int workHours;
    private int wage;

    public PartTimeEmployee(String name, int id, int workHours, int wage) {
        super(name, id);
        this.workHours = workHours;
        this.wage = wage;

    }
    public double computeAmount() {
        return workHours * wage;
    }
    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workHours=" + workHours +
                ", wage=" + wage +
                '}';
    }

    public int getWorlHours() {
        return workHours;
    }

    public void setWorlHours(int worlHours) {
        this.workHours = worlHours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}