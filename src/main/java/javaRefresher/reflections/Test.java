package javaRefresher.reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * whebenevr jvm loads a .class file
 * it also creates Class Object for that class which contains the metdata fo the class
 * like properties,methods,constr
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //get the object of class for gettig the metadata of class Bird
        //approach1
        Class birdClass = Class.forName("javaRefresher.reflections.Eagle");
        //approach2
        Class birdClass1 = Eagle.class;
        //approach3
        Class birdClass2 = new Eagle("Golden", true).getClass();

        //Reflection of class
        System.out.println(birdClass1.getName());
        System.out.println(Modifier.toString(birdClass1.getModifiers()));

        //Reflection of methods
        Method[] methods = birdClass2.getDeclaredMethods();  //for both public and private withing Eagle only and not its parent
        System.out.println("All the methods of class");
        for (Method m : methods) {
            Parameter[] parameters = m.getParameters();
            Object[] obj1 = m.getExceptionTypes();
            Annotation[] obj2 = m.getAnnotations();


            System.out.println("Detailed summary for the method");
            System.out.println(m + "|| modifiers:" + m.getModifiers() + "|| Return Type:" + m.getReturnType() + "|| parameter count:" + m.getParameterCount() + "|| declaring classes " + m.getDeclaringClass().getSimpleName());

            for (Parameter p : parameters) {
                System.out.println("param name:" + p.getName() + "|| param type:" + p.getType());
            }
            System.out.println("#########################################################################");
        }

        //Invocation of methods
        Object eagleInstance = birdClass2.newInstance();
        Method flyMethod = birdClass2.getDeclaredMethod("specializedMehod",
                int.class, double.class, String.class);
        flyMethod.setAccessible(true); ///since its private make it accesible first
        Bird bird = (Bird) flyMethod.invoke(eagleInstance,69, 69.69d, "Bhag bsdk");
        bird.eat();
        bird.fly();
        System.out.println(bird.flapPerHour());

       //Refernce ::  https://stackoverflow.com/questions/880365/any-way-to-invoke-a-private-method/880400#880400



        //Reflection of Fields
        Field[] fields=birdClass2.getDeclaredFields();
        for (Field f:fields){
            System.out.println("Filed name "+f.getName());
            System.out.println("Field Type "+f.getType());
            System.out.println("Field Modifier "+Modifier.toString(f.getModifiers()));
            System.out.println("##############################################################################");
        }


        //setting value of pub;ic and private fields

        //public
        Eagle eagle=new Eagle();
        Field field=birdClass2.getDeclaredField("publicField");
        field.set(eagle,69);
        System.out.println(eagle);

        //private
        field=birdClass2.getDeclaredField("prvateField");
        field.setAccessible(true);
        field.set(eagle,6969);
        System.out.println(eagle);



        //Refelection of constructors

        Constructor[] constructorsList=birdClass2.getDeclaredConstructors();
        for(Constructor constructor:constructorsList){
            System.out.println("Modifiers "+Modifier.toString(constructor.getModifiers()));

            constructor.setAccessible(true);
            Eagle eagleObj=(Eagle) constructor.newInstance(69,69,"Bhag",true);
            eagleObj.fly();
        }
    }
}
