package upper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.projecttest.upper.IUpper;
import com.example.projecttest.upper.UpperImpl;
import org.junit.jupiter.api.Test;

class IUpperTest {

    private final IUpper iUpper;

    public IUpperTest() {
        this.iUpper = new UpperImpl();
    }

    @Test
    void context() {
        assertEquals("XX", iUpper.upper("xx"));
    }

    @Test
    void context2() {
        assertEquals("AB", iUpper.upper("ab"));
    }

}
