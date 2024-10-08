public class Demo1 {

    public static void main(String[] args) {

    }

}

class GeneralCustomer{

    GeneralCustomer(){

    }

}

class Customer extends GeneralCustomer{

    void myInvoker(){
        myMethod();
        // Constructors can't be invoked via Method Invocation Expression Statement, so
        // following line raises a compile-time error
        // Customer();

        // You have to use the "new" keyword (Class Instance Creation Expression Statement)
        // when invoking Constructor methods
        new Customer();

        // You can't use "new" keyword with ordinary methods, using it will raise a compile-time error
        // new myMethod();
    }

    void myMethod(){

    }

    Customer(){
        // When you invoke an overloaded constructor within a constructor, then you still use
        // the method invocation expression statement, to be exact,
        // "this method invocation expression statement"
        this(10);
    }

    Customer(int x){
        // When you invoke a super class constructor within a constructor, then you still use
        // the method invocation expression statement, to be exact,
        // "super method invocation expression statement"
        super();
    }
}
