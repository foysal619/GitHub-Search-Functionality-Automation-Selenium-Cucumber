package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    @FindBy(xpath = "//span[@class='flex-1']")
    public WebElement txtSearch;

    @FindBy(id = "query-builder-test")
    public WebElement txtenterSearch;

    @FindBy(className = "search-title")
    public List<WebElement> repoResult;
    @FindBy(className = "Link--secondary")
    public List<WebElement> btnClick;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doSearch(String repoName) throws InterruptedException {
        txtSearch.click();
        txtenterSearch.sendKeys(repoName);
        Thread.sleep(1000);
        txtenterSearch.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }

    public void doClick() {
        btnClick.get(48).click();
    }

}
