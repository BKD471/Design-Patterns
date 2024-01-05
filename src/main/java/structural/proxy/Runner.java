package structural.proxy;

public class Runner {
    public static void main(String[] args){
        String[] test={"CREATE","DELETE","GET"};
            for (String t : test) {
                happyPath(t);
                try {
                    unHappyPath(t);
                }catch (RuntimeException e){
                    System.out.println("ENCOUNTERED EXCEPTION");
                }
            }
        }


    private static void unHappyPath(String testCase) throws RuntimeException {
        switch (testCase) {
            case "CREATE" -> {
                EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
                employeeDao.create("USER", new EmployeeDo());
                System.out.println(" USER CREATION SUCCESSFUL");
            }
            case "DELETE" -> {
                EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
                employeeDao.delete("USER", 6969);
                System.out.println(" USER DELETION SUCCESSFUL");
            }
            case "GET" -> {
                EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
                employeeDao.get("USER", 6969);
                System.out.println(" USER FETCHED SUCCESSFUL");
            }
        }
    }

    private static void happyPath(String testCase) {
        switch (testCase) {
            case "CREATE" -> {
                EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
                employeeDao.create("ADMIN", new EmployeeDo());
                System.out.println(" USER CREATION SUCCESSFUL");
            }
            case "DELETE" -> {
                EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
                employeeDao.delete("ADMIN", 6969);
                System.out.println(" USER DELETION SUCCESSFUL");
            }
            case "GET" -> {
                EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
                employeeDao.get("ADMIN", 6969);
                System.out.println(" USER FETCHED SUCCESSFUL");
            }
        }
    }
}
