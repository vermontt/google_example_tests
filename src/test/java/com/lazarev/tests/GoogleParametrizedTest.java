package com.lazarev.tests;

import com.lazarev.pages.GoogleResultSearchPage;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GoogleParametrizedTest extends BaseTest {

    @ResourceLock("1")
    @ValueSource(strings = {
            "troy",
            "matrix",
            "dexter"
    })
    @ParameterizedTest
    void googleSearchTest1(String searchWord) {
        googleSearchPage.doSearch(searchWord)
                .checkResults(searchWord);

        // ломаем тесты для демонстрации
        GoogleResultSearchPage.listResults = null;
    }
}