package com.lazarev.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.lazarev.pages.GoogleSearchPage;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @BeforeEach
    void setUp() {
        Configuration.startMaximized = true;
        Selenide.open(googleSearchPage.URL);
    }
}
