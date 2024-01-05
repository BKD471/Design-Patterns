package structural.proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    /**
     * @param client
     * @param obj
     */
    @Override
    public void create(String client, EmployeeDo obj) {
        System.out.println("Created New Row in Emp Table");
    }

    /**
     * @param client
     * @param empId
     */
    @Override
    public void delete(String client, int empId) {
        System.out.println("Deleted Row with EmpId: "+empId);
    }

    /**
     * @param client
     * @param empId
     * @return
     */
    @Override
    public EmployeeDo get(String client, int empId) {
        //fetch row
        System.out.println("Fetching Data from the row DB");
        return new EmployeeDo();
    }
}
