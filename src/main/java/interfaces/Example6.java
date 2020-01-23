package interfaces;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.FieldLayout;

import java.util.SortedSet;

public class Example6 {

    public static void main(String[] args) {
        ClassLayout layoutString = ClassLayout.parseClass(String.class);

        int headerSize = layoutString.headerSize();

        SortedSet<FieldLayout> fields = layoutString.fields();
        int totalFieldSize = 0;
        for (FieldLayout field : fields) {
            System.out.println(field);
            totalFieldSize += field.size();
        }

        int offset = 4;
        int expectedInstanceSize = headerSize + totalFieldSize + offset;

        System.out.println(headerSize +"," + totalFieldSize + "," +expectedInstanceSize);
        System.out.println(layoutString.instanceSize());

        System.out.println(layoutString.toPrintable());

        String str1 = "mama";
        String str2 = "mamamamamamamamamamama";

        ClassLayout layoutStr1 = ClassLayout.parseInstance(str1);
        ClassLayout layoutStr2 = ClassLayout.parseInstance(str2);

        System.out.println(layoutStr1.instanceSize() + "," + layoutStr2.instanceSize());
    }
}
