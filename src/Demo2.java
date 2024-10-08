public class Demo2 {

    public static void main(String[] args) {
        var s1 = new Student();
        var s2 = new Student();
        var s3 = new Student();

        Student.myStaticMethod();
        //Student.myInstanceMethod();
        s1.myInstanceMethod();
        s2.myInstanceMethod();
        s3.myInstanceMethod();

        s1.myStaticMethod();
        s2.myStaticMethod();
        s3.myStaticMethod();
    }
}

class Student {

    static void myStaticMethod(){
        System.out.println("Static Method");
    }

    void myInstanceMethod(){
        System.out.println("Instance Method");
    }

}
