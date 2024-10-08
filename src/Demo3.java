void main(){
    myMethod(10);
}

void myMethod(){

}

void myMethod(int x){

}

void myMethod(long x){

}

/* If two methods have the same method name but their signatures are not override-equivalent
 * Then we say those two methods are overloaded.
 *
 * The informal intuition is that if two methods have the same name but differ in
 * either the parameter count or data types, then those two methods are said to be overloaded.
 *
 * IMP: It is not required to have the methods in the same type. If S and T are types that satisfies
 * the relationship S :> T, then if a one method (m1) is to be found on the type S and other method (m2)
 * is to be found on the type T, if the m1 and m2's names are same but their signatures are not
 * override-equivalent then we still consider m1 and m2 methods are overloaded
 *
 * If methods are overloaded then there is ad-hoc polymorphism */