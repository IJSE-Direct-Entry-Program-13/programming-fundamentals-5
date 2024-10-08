import java.io.Serializable;

void main(){

}

//<T extends Serializable & Comparable<? extends Serializable>> void myMethod(T t){}
//
//<K extends Comparable<? super Serializable> & Serializable> void myMethod(K k){}

// =====================================================

//<T extends Serializable & Comparable> void print(T t){}
//
//<K extends Comparable & Serializable> void print(K k){}

//========================================================

//<T extends Serializable & Comparable> void print(T t){}
//
//<K,T extends Serializable & Comparable<K>> void print(T t){}

//========================================================

//<I,T extends Serializable & Comparable<I>> void print(T t){}
//
//<K,T extends Serializable & Comparable<K>> void print(T t){}

//========================================================

//<T extends Serializable & Comparable> void print(T t){}

//<T extends Serializable & Comparable<?>> void print(T t){}
//<T extends Comparable & Serializable> void print(T t){}
//<T extends Comparable<?> & Serializable> void print(T t){}

//========================================================

//<T extends Serializable & Comparable> void print(T t){}

//<T extends Serializable & Comparable<? super Serializable>> void print(T t){}
//<T extends Comparable<? super Serializable> & Serializable > void print(T t){}
//<T extends Comparable<? extends Serializable> & Serializable > void print(T t){}
// <T extends Comparable & Serializable> void print(T t){}

//========================================================

<T extends Comparable> void print(T t){}
<K extends Comparable<?>> void print(K k){}
//<K extends Comparable<? super Serializable>> void print(K k){}
//<K extends Comparable<? extends Serializable>> void print(K k){}