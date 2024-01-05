package javaRefresher.enums;

//enum with abs method
public enum EnumSample2 {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special Monday method");
        }
    },
    TUESDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special Tuesday method");
        }
    },WEDNESDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special Wednesday method");
        }
    },THURSDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special ThursDay method");
        }
    },FRIDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special FriDay method");
        }
    },SATURDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special SaturDay method");
        }
    },SUNDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Special SunDay method");
        }
    };

    public abstract void dummyMethod();
}
