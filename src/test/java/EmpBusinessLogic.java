public class EmpBusinessLogic {

    public double calculateYearlySalary( EmployeeDetails employee) {
        double yearlySalary = 0;
        yearlySalary = employee.getMonthlySalary() *12;
        return yearlySalary;
    }

    //calculate the appraisal amount of employee

}
