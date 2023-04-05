package com.lazarev.tests;

import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GoogleParametrizedTest2 extends BaseTest {

    @ResourceLock("1")
    @CsvSource(value = {
            "marvel, 3",
            "comics, 9",
            "cinema star, 16"
    })
    @ParameterizedTest
    void googleSearchTest2(String searchWord, int resultLink) {
        googleSearchPage.doSearch(searchWord)
                .checkResults(searchWord, resultLink);
    }
}
