import java.io.Serializable;
import java.util.List;

void main(){

}

class Super{
    <K, T extends Serializable & Comparable<K>>void myMethod(List<T> list){
    }
}

class Sub  extends Super {
    <T extends Serializable, K extends Comparable<T> & Serializable> void myMethod(List<K> k, int x){

    }
}