package com.lazarev.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {

    public final String URL = "https://www.google.ru";

    private final SelenideElement searchInput = $(".gLFyf");

    public GoogleResultSearchPage doSearch(String text) {
        searchInput.setValue(text).pressEnter();
        return new GoogleResultSearchPage();
    }
}