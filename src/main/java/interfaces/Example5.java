package interfaces;
/*
Ex1: Если имеем деф. мтеод в АА, но в ВВ или СС требуем определеить Integer getValue(), то в New
     необх. будет определить Integer getValue() не сомтря на уже деф.реализацию в АА.
 */
interface AA {
    default Integer getValue() {
        System.out.println("A.getValue");
        return 1;
    }
    //Integer getValue();

    static void f(){
        System.out.println("static meth from AA");
    }
}

interface BB extends AA {
//    default Integer getValue() {
//        System.out.println("BB.getValue");
//        return 2;
//    }

    //Integer getValue();
    static void f(){
        System.out.println("static meth from BB");
        AA.f();
    }
}

interface CC extends AA{
    default Integer getValue() {
        System.out.println("CC.getValue");
        return 1;
    }

    //Integer getValue();
}

class New implements CC, BB {
    //public Integer getValue(){return 2;}
}

public class Example5 {
    public static void main(String[] args) {
        System.out.println(new New().getValue());
    }
}
