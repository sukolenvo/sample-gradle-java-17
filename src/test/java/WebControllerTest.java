import java.lang.reflect.InaccessibleObjectException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author vadym
 */
class WebControllerTest {

  private final WebController webController = new WebController();

  @Test
  void buildJson() {
    Assertions.assertThrows(InaccessibleObjectException.class, webController::buildJson);
  }
}