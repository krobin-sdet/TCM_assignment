package com.tcm;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class TCMTests extends TCMTestData {

    private WebDriver driver = new ChromeDriver();

    public void beforeTest() {
        System.out.println("Starting TCM Demo Test");
    }

    public void afterTest() {
        goBackToMain();
        driver.close();
        System.out.println("Ending TCM Demo Test");
    }

    // Movie 1
    public void loadTestUrl() {
        System.out.println("Load Test Page Url");
        driver.get(baseUrl);
        System.out.println("Url: " + baseUrl);
    }

    public void verifyPageTitle() {
        System.out.println("Verify Test Page Url Title");
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
        System.out.println("Page Title: " + actualPageTitle);
    }

    public void clickMovieLinkOne() {
        System.out.println("Click Movie Link");
        WebElement movieLinkOne = driver.findElement(By.linkText(clickMovieLinkOneText));
        System.out.println("Movie Link 1: " + movieLinkOne);
        movieLinkOne.click();
    }

    public void verifyMoviePageTitle() {
        System.out.println("Verify Movie Title Is Displayed");
        // Pause for a 2 seconds to allow page to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualMovieTitleOne = driver.findElement(By.className(movieTitle)).getText();
        Assert.assertEquals(expectedMovieTitleOne, actualMovieTitleOne);
    }

    public void verifyMovieOverview() {
        System.out.println("Verify Movie Overview Is Displayed");
        String movieOverviewOne = driver.findElement(By.className(movieOverview)).getText();
        Assert.assertEquals(expectedMovieOverviewOne, movieOverviewOne);
    }

    public void verifyMovieOneActor1() {
        System.out.println("Verify Actor 1 Is Displayed");
        String actorOneMovieOne = driver.findElement(By.linkText(actorOneMovieOneText)).getText();
        Assert.assertEquals(expectedActorOneMovieOne, actorOneMovieOne);
    }

    public void verifyMovieOneActor2() {
        System.out.println("Verify Actor 2 Is Displayed");
        String actorTwoMovieOne = driver.findElement(By.linkText(actorTwoMovieOneText)).getText();
        Assert.assertEquals(expectedActorTwpMovieOne, actorTwoMovieOne);
    }

    public void verifyReleaseDateOne() {
        System.out.println("Verify Release Date Is Displayed");
        String getReleaseDateOne = driver.findElement(By.xpath(releaseDateOne)).getText();
        System.out.println("This is the release date: " + getReleaseDateOne);
        Assert.assertEquals(expectedReleaseMovieOne, getReleaseDateOne);
    }

    // Movie 2
    public void clickMovieLinkTwo() {
        System.out.println("Click Movie Link");
        WebElement movieLinkTwo = driver.findElement(By.linkText(clickMovieLinkTwoText));
        System.out.println("Movie Link 2: " + movieLinkTwo);
        movieLinkTwo.click();
    }

    public void verifyMovieTwoPageTitle() {
        System.out.println("Verify Movie Title Is Displayed");
        // Pause for a 2 seconds to allow page to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualMovieTitleTwo = driver.findElement(By.className(movieTitle)).getText();
        Assert.assertEquals(expectedMovieTitleTwo, actualMovieTitleTwo);
    }

    public void verifyMovieTwoOverview() {
        System.out.println("Verify Movie Overview Is Displayed");
        String movieOverviewTwo = driver.findElement(By.className(movieOverview)).getText();
        Assert.assertEquals(expectedMovieOverviewTwo, movieOverviewTwo);
    }

    public void verifyMovieTwoActor1() {
        System.out.println("Verify Actor 1 Is Displayed");
        String actorOneMovieTwo = driver.findElement(By.linkText(actorOneMovieTwoText)).getText();
        Assert.assertEquals(expectedActorOneMovieTwo, actorOneMovieTwo);
    }

    public void verifyMovieTwoActor2() {
        System.out.println("Verify Actor 2 Is Displayed");
        String actorTwoMovieTwo = driver.findElement(By.linkText(actorTwoMovieTwoText)).getText();
        Assert.assertEquals(expectedActorTwoMovieTwo, actorTwoMovieTwo);
    }

    public void verifyReleaseDateTwo() {
        System.out.println("Verify Release Date Is Displayed");
        String getReleaseDateTwo = driver.findElement(By.xpath(releaseDateTwo)).getText();
        System.out.println("This is the release date: " + getReleaseDateTwo);
        Assert.assertEquals(expectedReleaseMovieTwo, getReleaseDateTwo);
    }


    // Movie 3
    public void clickMovieLinkThree() {
        System.out.println("Click Movie Link");
        WebElement movieLinkThree = driver.findElement(By.linkText(clickMovieLinkThreeText));
        System.out.println("Movie Link 3: " + movieLinkThree);
        movieLinkThree.click();
    }

    public void verifyMovieThreePageTitle() {
        System.out.println("Verify Movie Title Is Displayed");
        // Pause for a 2 seconds to allow page to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualMovieTitleThree = driver.findElement(By.className(movieTitle)).getText();
        Assert.assertEquals(expectedMovieTitleThree, actualMovieTitleThree);
    }

    public void verifyMovieThreeOverview() {
        System.out.println("Verify Movie Overview Is Displayed");
        String movieOverviewThree = driver.findElement(By.className(movieOverview)).getText();
        Assert.assertEquals(expectedMovieOverviewThree, movieOverviewThree);
    }

    public void verifyMovieThreeActor1() {
        System.out.println("Verify Actor 1 Is Displayed");
        String actorOneMovieThree = driver.findElement(By.linkText(actorOneMovieThreeText)).getText();
        Assert.assertEquals(expectedActorOneMovieThree, actorOneMovieThree);
    }

    public void verifyMovieThreeActor2() {
        System.out.println("Verify Actor 2 Is Displayed");
        String actorTwoMovieThree = driver.findElement(By.linkText(actorTwoMovieThreeText)).getText();
        Assert.assertEquals(expectedActorTwoMovieThree, actorTwoMovieThree);
    }

    public void verifyReleaseDateThree() {
        System.out.println("Verify Release Date Is Displayed");
        String getReleaseDateThree = driver.findElement(By.xpath(releaseDateThree)).getText();
        System.out.println("This is the release date: " + getReleaseDateThree);
        Assert.assertEquals(expectedReleaseMovieThree, getReleaseDateThree);
    }



    // Movie 4
    public void clickMovieLinkFour() {
        System.out.println("Click Movie Link");
        WebElement movieLinkFour = driver.findElement(By.linkText(clickMovieLinkFourText));
        System.out.println("Movie Link 4: " + movieLinkFour);
        movieLinkFour.click();
    }

    public void verifyMovieFourPageTitle() {
        System.out.println("Verify Movie Title Is Displayed");
        // Pause for a 2 seconds to allow page to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualMovieTitleFour = driver.findElement(By.className(movieTitle)).getText();
        Assert.assertEquals(expectedMovieTitleFour, actualMovieTitleFour);
    }

    public void verifyMovieFourOverview() {
        System.out.println("Verify Movie Overview Is Displayed");
        String movieOverviewFour = driver.findElement(By.className(movieOverview)).getText();
        Assert.assertEquals(expectedMovieOverviewFour, movieOverviewFour);
    }

    public void verifyMovieFourActor1() {
        System.out.println("Verify Actor 1 Is Displayed");
        String actorOneMovieFour = driver.findElement(By.linkText(actorOneMovieFourText)).getText();
        Assert.assertEquals(expectedActorOneMovieFour, actorOneMovieFour);
    }

    public void verifyMovieFourActor2() {
        System.out.println("Verify Actor 2 Is Displayed");
        String actorTwoMovieFour = driver.findElement(By.linkText(actorTwoMovieFourText)).getText();
        Assert.assertEquals(expectedActorTwoMovieFour, actorTwoMovieFour);
    }

    public void verifyReleaseDateFour() {
        System.out.println("Verify Release Date Is Displayed");
        String getReleaseDateFour = driver.findElement(By.xpath(releaseDateFour)).getText();
        System.out.println("This is the release date: " + getReleaseDateFour);
        Assert.assertEquals(expectedReleaseMovieFour, getReleaseDateFour);
    }



    // Movie 5
    public void clickMovieLinkFive() {
        System.out.println("Click Movie Link");
        WebElement movieLinkFive = driver.findElement(By.linkText(clickMovieLinkFiveText));
        System.out.println("Movie Link 5: " + movieLinkFive);
        movieLinkFive.click();
    }

    public void verifyMovieFivePageTitle() {
        System.out.println("Verify Movie Title Is Displayed");
        // Pause for a 2 seconds to allow page to load
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualMovieTitleFive = driver.findElement(By.className(movieTitle)).getText();
        Assert.assertEquals(expectedMovieTitleFive, actualMovieTitleFive);
    }

    public void verifyMovieFiveOverview() {
        System.out.println("Verify Movie Overview Is Displayed");
        String movieOverviewFive = driver.findElement(By.className(movieOverview)).getText();
        Assert.assertEquals(expectedMovieOverviewFive, movieOverviewFive);
    }

    public void verifyMovieFiveActor1() {
        System.out.println("Verify Actor 1 Is Displayed");
        String actorOneMovieFive = driver.findElement(By.linkText(actorOneMovieFiveText)).getText();
        Assert.assertEquals(expectedActorOneMovieFive, actorOneMovieFive);
    }

    public void verifyMovieFiveActor2() {
        System.out.println("Verify Actor 2 Is Displayed");
        String actorTwoMovieFive = driver.findElement(By.linkText(actorTwoMovieFiveText)).getText();
        Assert.assertEquals(expectedActorTwoMovieFive, actorTwoMovieFive);
    }

    public void verifyReleaseDateFive() {
        System.out.println("Verify Release Date Is Displayed");
        String getReleaseDateFive = driver.findElement(By.xpath(releaseDateFive)).getText();
        System.out.println("This is the release date: " + getReleaseDateFive);
        Assert.assertEquals(expectedReleaseMovieFive, getReleaseDateFive);
    }


    public void goBackToMain() {
        System.out.println("Go back to TCM Movie Database Home");
        driver.navigate().back();
        String expectedPageTitle = driver.getTitle();
        Assert.assertEquals("TCM Movie Database", expectedPageTitle);
    }

}
