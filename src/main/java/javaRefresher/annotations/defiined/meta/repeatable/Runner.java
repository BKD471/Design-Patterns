package javaRefresher.annotations.defiined.meta.repeatable;

public class Runner {
    public static void main(String[] args) {
        Class eagleMetaData=Eagle.class;
        Category[] listOfCategory= new Eagle().getClass()
                .getAnnotationsByType(Category.class);
        for(Category c:listOfCategory){
            System.out.println(c);
        }
    }
}
