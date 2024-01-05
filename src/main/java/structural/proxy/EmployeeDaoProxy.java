package structural.proxy;

public class EmployeeDaoProxy implements EmployeeDao{
    private final EmployeeDao employeeDaoObj;

    public EmployeeDaoProxy(EmployeeDao employeeDaoObj){
        this.employeeDaoObj=employeeDaoObj;
    }
    /**
     * @param client
     * @param obj
     */
    @Override
    public void create(String client, EmployeeDo obj) {
       if(client.equals("ADMIN")){
         employeeDaoObj.create(client,obj);
         return;
       }
       throw  new RuntimeException("ACCESS DENIED FOR NON ADMINS!!!!");
    }

    /**
     * @param client
     * @param empId
     */
    @Override
    public void delete(String client, int empId) {
       if(client.equals("ADMIN")){
           employeeDaoObj.delete(client,empId);
           return;
       }
       throw new RuntimeException("ACCESS DENIED FOR NON ADMIN!!!!");
    }

    /**
     * @param client
     * @param empId
     * @return
     */
    @Override
    public EmployeeDo get(String client, int empId) {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeDaoObj.get(client,empId);
        }
        throw new RuntimeException("ACCESS DENIED!.Please Authenticate");
    }
}
