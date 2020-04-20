package lesson5;

public class HT_5 {
    public static void main(String[] args)  {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee();
        employees[0].setName("Yarik Mudriy");
        employees[0].setAge(66);
        employees[0].setMail("yarik@mailkievrus.ru");
        employees[0].setPhoneNumber("89000000000");
        employees[0].setPosition("Customer");
        employees[0].setSalary(2000);

        employees[1] = new Employee();
        employees[1].setName("Ilon Mask");
        employees[1].setAge(34);

        employees[2] = new Employee();
        employees[2].setName("James Bond");
        employees[2].setAge(38);

        employees[3] = new Employee();
        employees[3].setName("Vladimir Putin");
        employees[3].setAge(66);

        employees[4] = new Employee();
        employees[4].setName("Solnecniy Skitalec");
        employees[4].setAge(50);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].getInfo();;
            }
        }
    }


}