import org.junit.*;

import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest
{
  @BeforeClass
  public static void loadDB()
  {
    Fixtures.deleteAllModels();
  }
  
  @Test
  public void aVeryImportantThingToTest() {
      assertEquals(2, 1 + 1);
  }
}
