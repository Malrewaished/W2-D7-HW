import java.util.ArrayList;
public class mainMethod {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee("Meshal",130,10000);
        FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee("Saud",131,5000);

        PartTimeEmployee partTimeEmployee1=new PartTimeEmployee("Abullah",132,6,400);
        PartTimeEmployee partTimeEmployee2=new PartTimeEmployee("Saad",133,4,300);
        ArrayList<PayAble> list = new ArrayList<>();
        Company company=new Company("National Guard Health Affairs "+" NGHA");
        company.add(fullTimeEmployee1);
        company.add(fullTimeEmployee2);
        company.add(partTimeEmployee1);
        company.add(partTimeEmployee2);
        System.out.println(company);
        System.out.println(company.computeAmount());
    }
}