package generics;

public class Example1 {
    public static void main(String[] args) {
        Holder<String> stringHolder = new Holder<>("abc");
        Holder rowStringHolder = stringHolder;

        stringHolder.setField("j");
        //stringHolder.setField(123);
        rowStringHolder.setField(1L);

        //System.out.println(stringHolder.getField());
        //System.out.println(rowStringHolder.getField());
    }

    static class Holder<T> {
        T field;

        public Holder(T field) {
            this.field = field;
        }

        public void setField(T field) {
            this.field = field;
        }

        public T getField() {
            return field;
        }
    }
}