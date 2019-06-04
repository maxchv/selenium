import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringHelperTest {

    StringHelper helper;
    static StringHelper staticHelper;

    @BeforeClass
    public static void beforeClassTest(){
        staticHelper = new StringHelper();
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClassTest(){
        staticHelper = null;
        System.out.println("After class");
    }


    @Before
    public void beforeTest(){
        helper = new StringHelper();
        System.out.println("Before");
    }

    @After
    public void afterTest(){
        helper = null;
        System.out.println("After");
    }


    @Test
    public void stringJoinTest() {
//        StringHelper helper = new StringHelper();
        String expected = "hello, ,world";
        String actual = helper.joinStrings("hello", " ", "world");

        System.out.println("Test string Join");
        assertEquals("Строки не соответствуют", expected, actual);

    }


    @Test
    public void stringSplitTest() {

        String[] expected = new String[3];
        expected[0] = "hello";
        expected[1] = " ";
        expected[2] = "world";

        String[] actual = helper.spiltStrings("hello, ,world",",");

        System.out.println("Test string Split");
        assertArrayEquals("Результат не соответствует ожидаемому",expected,actual);
    }
}
