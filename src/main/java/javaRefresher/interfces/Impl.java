package javaRefresher.interfces;

public class Impl implements OuterInterface{

    /**
     *
     */
    @Override
    public void m1() {

    }
}

class Impl1 implements OuterInterface.InnerInterface{

    /**
     *
     */
    @Override
    public void m2() {

    }
}

class Impl2 implements OuterInterface,OuterInterface.InnerInterface{

    /**
     *
     */
    @Override
    public void m1() {

    }

    /**
     *
     */
    @Override
    public void m2() {

    }
}

class InterfaceWIthinClass{
    //nested interfaces can be private
    private interface inner{
        void m3();
    }
}