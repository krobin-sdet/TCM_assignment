package com.tcm;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TCMDemoTest extends TCMTests {

    @BeforeTest
    public void setUpTest() {
        beforeTest();
    }

    @AfterTest
    public void tearDownTest() {
        afterTest();
    }

    @Test(priority=1)
    public void loadTestUrlTest() {
        loadTestUrl();
    }

    @Test(priority=2,dependsOnMethods = {"loadTestUrlTest"})
    public void verifyPageTitleTest() {
        verifyPageTitle();
    }

    @Test(priority=3)
    public void clickMovieLinkOneTest() {
        clickMovieLinkOne();
    }

    @Test(priority=4)
    public void verifyMoviePageTitleTest() {
        verifyMoviePageTitle();
    }

    @Test(priority=5)
    public void verifyMovieOverviewTest() {
        verifyMovieOverview();
    }

    @Test(priority=6)
    public void verifyMovieOneActor1Test() {
        verifyMovieOneActor1();
    }

    @Test(priority=7)
    public void verifyMovieOneActor2Test() {
        verifyMovieOneActor2();
    }

    @Test(priority=8)
    public void verifyReleaseDateOneTest() {
        verifyReleaseDateOne();
        goBackToMain();
    }

    // Movie 2
    @Test(priority=9)
    public void clickMovieLinkTwoTest() {
        clickMovieLinkTwo();
    }

    @Test(priority=10)
    public void verifyMovieTwoPageTitleTest() {
        verifyMovieTwoPageTitle();
    }

    @Test(priority=11)
    public void verifyMovieTwoOverviewTest() {
        verifyMovieTwoOverview();
    }

    @Test(priority=12)
    public void verifyMovieTwoOneActor1Test() {
        verifyMovieTwoActor1();
    }

    @Test(priority=13)
    public void verifyMovieTwoOneActor2Test() {
        verifyMovieTwoActor2();
    }

    @Test(priority=14)
    public void verifyReleaseTwoDateOneTest() {
        verifyReleaseDateTwo();
        goBackToMain();
    }

    // Movie 3
    @Test(priority=15)
    public void clickMovieLinkThreeTest() {
        clickMovieLinkThree();
    }

    @Test(priority=16)
    public void verifyMovieThreePageTitleTest() {
        verifyMovieThreePageTitle();
    }

    @Test(priority=17)
    public void verifyMovieThreeOverviewTest() {
        verifyMovieThreeOverview();
    }

    @Test(priority=18)
    public void verifyMovieThreeOneActor1Test() {
        verifyMovieThreeActor1();
    }

    @Test(priority=19)
    public void verifyMovieThreeOneActor2Test() {
        verifyMovieThreeActor2();
    }

    @Test(priority=20)
    public void verifyReleaseThreeDateOneTest() {
        verifyReleaseDateThree();
        goBackToMain();
    }

    // Movie 4
    @Test(priority=21)
    public void clickMovieLinkFourTest() {
        clickMovieLinkThree();
    }

    @Test(priority=22)
    public void verifyMovieFourPageTitleTest() {
        verifyMovieFourPageTitle();
    }

    @Test(priority=23)
    public void verifyMovieFourOverviewTest() {
        verifyMovieFourOverview();
    }

    @Test(priority=24)
    public void verifyMovieFourOneActor1Test() {
        verifyMovieFourActor1();
    }

    @Test(priority=25)
    public void verifyMovieFourOneActor2Test() {
        verifyMovieFourActor2();
    }

    @Test(priority=26)
    public void verifyReleaseFourDateOneTest() {
        verifyReleaseDateFour();
        goBackToMain();
    }

    // Movie 5
    @Test(priority=27)
    public void clickMovieLinkFiveTest() {
        clickMovieLinkFive();
    }

    @Test(priority=28)
    public void verifyMovieFivePageTitleTest() {
        verifyMovieFivePageTitle();
    }

    @Test(priority=29)
    public void verifyMovieFiveOverviewTest() {
        verifyMovieFiveOverview();
    }

    @Test(priority=30)
    public void verifyMovievOneActor1Test() {
        verifyMovieFiveActor1();
    }

    @Test(priority=31)
    public void verifyMovieFiveOneActor2Test() {
        verifyMovieFiveActor2();
    }

    @Test(priority=32)
    public void verifyReleaseFiveDateOneTest() {
        verifyReleaseDateFive();
        goBackToMain();
    }

}