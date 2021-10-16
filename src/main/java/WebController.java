import com.google.gson.Gson;
import java.util.Map;
import java.util.Optional;

/**
 * @author vadym
 */
public class WebController {

  private final Gson gson = new Gson();

  public String buildJson() {
    return gson.toJson(Map.of("key", Optional.of("value")));
  }

  public static void main(String[] args) {
    System.out.println(new WebController().buildJson());
  }
}
