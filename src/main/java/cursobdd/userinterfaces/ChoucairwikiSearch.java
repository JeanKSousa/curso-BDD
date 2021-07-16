package cursobdd.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairwikiSearch {
    public static final Target SEARCH_FIELD = Target.the("type the concept")
            .located(By.id("searchInput"));
    public static final Target RESULT = Target.the("Result of serach to validate")
            .located(By.id("firstHeading"));
}
