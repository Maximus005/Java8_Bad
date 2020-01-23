package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsChecked {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3));

        List<Integer> checkedIntegerList = Collections.checkedList(integerList, Integer.class);

//        legacyCode(integerList); //вставить значение то мы можем
//        Integer integer1 = integerList.get(0); // но вот пролемы будут при извлечении значения

        legacyCode(checkedIntegerList);
    }

    private static void legacyCode(List arg) {
        arg.set(0,"string");
    }
}
