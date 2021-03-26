package ua.sport;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

public class TestFirst extends WebDriverSettings {

    @Test
    public void testFirst() {
        driver.get("https://sport.ua/football");
        String Title = driver.getTitle();
        String TitleCondition = "Футбол онлайн на СПОРТ.UA ⇔ Футбол Украины и мира онлайн ⋆ Последние новости футбола на сегодня";
        String condition1 = "Шахтер1";
        String condition2 = "Динамо1";
        Assert.assertEquals("Wrong Page", TitleCondition, Title);
        WebElement[] AllNewsClass = driver.findElementsByClassName("all-news__title").toArray(new WebElement[0]);
        int counter = 0;
        while (counter < AllNewsClass.length) {
            System.out.println(AllNewsClass[counter].getText());
            Boolean TestCondition1 = AllNewsClass[counter].getText().toLowerCase().contains(condition1.toLowerCase());
            Boolean TestCondition2 = AllNewsClass[counter].getText().toLowerCase().contains(condition2.toLowerCase());
            Assert.assertFalse("There is a coincidence N1", TestCondition1);
            Assert.assertFalse("There is a coincidence N2", TestCondition2);
            counter++;
        }





    }
}
