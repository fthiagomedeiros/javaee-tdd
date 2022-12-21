package upper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.projecttest.upper.IUpper;
import com.example.projecttest.upper.IUpperRepository;
import com.example.projecttest.upper.UpperImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class IUpperTest {

    @Mock
    IUpperRepository repository;

    @InjectMocks
    final IUpper iUpper;

    public IUpperTest() {
        this.iUpper = new UpperImpl();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void context() {
        Mockito.when(repository.findRepository()).thenReturn("Thiago");

        String name = iUpper.upper("aName");
        assertEquals(name, "ANAMEThiago");
    }

    @Test
    void context2() {
        Mockito.when(repository.findRepository()).thenReturn("James");

        assertEquals("ABJames", iUpper.upper("ab"));
    }

}
