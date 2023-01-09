package upper;

import com.example.projecttest.upper.IUpperRepository;
import org.mockito.Mock;

class IUpperTest {

    @Mock
    private IUpperRepository repository;

//    @InjectMocks
//    final IUpper iUpper;

//    public IUpperTest() {
//        this.iUpper = new UpperImpl();
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void context() {
//        Mockito.when(repository.findRepository()).thenReturn("Thiago");
//
//        String name = iUpper.upper("aName");
//        assertEquals(name, "ANAMEThiago");
//    }
//
//    @Test
//    void context2() {
//        Mockito.when(repository.findRepository()).thenReturn("James");
//
//        assertEquals("ABJames", iUpper.upper("ab"));
//    }
//
//    @Test
//    void testStaticClass() {
////        try (MockedStatic<LookUtils> utilities = Mockito.mockStatic(LookUtils.class)) {
////            utilities.when(LookUtils::getName)
////                .thenReturn("NameForTest");
////        }
//
//            assertEquals("NameForTest", LookUtils.getName());
//
//    }

}
