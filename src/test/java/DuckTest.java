import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void getAge() {
        Duck duck = new Duck("joe",4);
        assertEquals(4,duck.getAge());
    }

    @Test
    void setAge() {
        int value = 8;
        Duck duck = new Duck("joe",4);
        duck.setAge(8);
        assertEquals(8,duck.getAge());

    }
}
