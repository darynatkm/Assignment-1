package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import utilities.Driver;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(css = "div.btn-group.actions-group > div")
    public WebElement options;

    @FindBy(css="input[type='number']")
    public WebElement pageNumber;

    @FindBy(xpath="//button[@data-toggle='dropdown' and normalize-space()='25']")
    public WebElement viewPerPage;

    /*@FindBy(xpath="//div[@class='grid-container']/table/tbody") //63 ??
    public WebElement table;*/
    @FindBy(css = "tr[class='grid-row']")
    public List<WebElement> rows;

    @FindBy(xpath="//input[@type='checkbox']")
    public WebElement selectAllButton;

    @FindBy(xpath="//input[@tabindex='-1']")
    public List<WebElement> checkedButtons;

    @FindBy(css="i[class='fa-filter hide-text']")
    public WebElement filterButton;

    @FindBy(css="div[class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'] >span[class='caret']")
    public WebElement filterTitle;

    @FindBy(xpath="//div[@class='value-field-frame']/input[@type='text']")
    public WebElement filterField;

    @FindBy(css="button[class='btn btn-primary filter-update']")
    public WebElement updateButton;

    @FindBy(xpath="//*[.='Nov 27, 2020, 9:30 AM']")
    //Nov 27, 2020, 9:30 AM
    public WebElement properLine;

    @FindBy(xpath="//div[@class='control-label'][1]")
    public WebElement title;

    @FindBy(xpath="//*[text()='This is a a weekly testers meeting']")
    public WebElement description;

    @FindBy(xpath="(//div[@class='control-label'])[2]")
    public WebElement start;

    @FindBy(xpath="(//div[@class='control-label'])[3]")
    public WebElement end;

    @FindBy(xpath="(//div[@class='control-label'])[4]")
    public WebElement isAllDayEvent;

    @FindBy(css="div[class='calendar-event-organizer'] > a")
    public WebElement organizer;



    public String getOptions() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return options.getText();
    }
    public String getPageNumber() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageNumber.getAttribute("value");
    }
    //QUESTION3
    public String getViewPerPage() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return viewPerPage.getText();
    }
    //QUESTION4
    public int countRows(){

        return rows.size();
    }
    public boolean selectAllButton() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
        selectAllButton.click();
        boolean result=true;
        for (WebElement checkedButton : checkedButtons) {
            result=checkedButton.isSelected();
        }return result;
    }


    public void selectLine() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        filterButton.click();
        waitUntilLoaderScreenDisappear();
        filterTitle.click();
        waitUntilLoaderScreenDisappear();
        filterField.sendKeys("Testers meeting");
        updateButton.click();
        waitUntilLoaderScreenDisappear();
        properLine.click();
        waitUntilLoaderScreenDisappear();
    }
    public String getTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return title.getText();
    }
    public String getDescription() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return description.getText();
    }
    public String getStartTime() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return start.getText();
    }
    public String getEndTime() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return end.getText();
    }
    public String getIsAllDayEvent() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return isAllDayEvent.getText();
    }
    public String getOrganizer() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return organizer.getText();
    }



}
