package nativeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumBase.SeleniumBase;

import java.io.IOException;

public class AndroidNativeTest extends SeleniumBase {

    protected AndroidNativeTest(String propName) throws IOException {
        super("androidNative.properties");
    }

    @Test(groups = {"HW2"}, description = "click on button 'Add contact'")

    public void SimplestTest(){
        String app_package_name = "com.example.android.contactmanager:id/";
        By add_btn = By.id(app_package_name + "addContactButton");
        WebElement addBtn = driver.findElement(add_btn);
        System.out.println(ExpectedConditions.visibilityOfElementLocated(add_btn));
        Assert.assertTrue(addBtn.isDisplayed());
        driver.findElement(add_btn).click();
        System.out.println("Simplest Appium test done");
    }
}

