package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class NavigationHelper extends HelperBase{
    public NavigationHelper(EventFiringWebDriver wd) {
        super(wd);
    }

    public void clickOnBoardButtonOnLeftNavMenu(){

    }

    public void clickOnHomeButtonOnHeader(){
        click(By.cssSelector(".icon-house"));
    }

    public void returnToPreviousPage() {
        wd.navigate().back();
    }
}
