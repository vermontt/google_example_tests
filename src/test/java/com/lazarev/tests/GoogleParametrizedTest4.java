package com.lazarev.tests;

import com.lazarev.enums.Films;
import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class GoogleParametrizedTest4 extends BaseTest {

    @ResourceLock("1")
    @EnumSource(value = Films.class)
    @ParameterizedTest
    void googleSearchTest4(Films word) {
        googleSearchPage.doSearch(word.getDay())
                .checkResults(word.getDay());
    }
}
