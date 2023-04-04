package com.lazarev.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class GoogleResultSearchPage {

    private final ElementsCollection listResults = $$(".yuRUbf");

    public void checkResults(String expected) {
        listResults.shouldBe(CollectionCondition.sizeGreaterThan(0))
                .get(0)
                .shouldHave(Condition.text(expected));
    }

    public void checkResults(String expected, int resultLink) {
        listResults.shouldBe(CollectionCondition.sizeGreaterThan(resultLink))
                .get(0)
                .shouldHave(Condition.text(expected));
    }
}