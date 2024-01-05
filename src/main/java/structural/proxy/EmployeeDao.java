package structural.proxy;

public interface EmployeeDao {
    void create(String client,EmployeeDo obj);
    void delete(String client,int empId);
    EmployeeDo get(String client,int empId);
}
