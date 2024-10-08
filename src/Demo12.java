import java.io.Serializable;

void main(){

}

<T extends Serializable> void myMethod(T t){}

<T extends Serializable & Comparable> void myMethod(T t){}