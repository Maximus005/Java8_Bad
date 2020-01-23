package generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ErasureToTheLeftBorder {
    @Test
    void test() {
        Integer i;
        Object obj = new Object();
        i = (Integer) getObj();

        int value = 50;
        Holder<Integer> intHolder = new Holder<>(value);
        int result = intHolder.getValue();

        assertEquals(result,value);

        //Holder rowHolder = intHolder; //сырая ссылка - это плохо, не безопасно!
        //Holder<Object> objectHolder = new Holder<Integer>(value); wtf ??? why error ?!
        Holder<?> wildcardHolder = intHolder;


    }
    static Object getObj(){
        return new Object();
    }
    static class Holder<T> {
        T value;

        public Holder(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
