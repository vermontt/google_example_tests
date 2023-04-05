package com.lazarev.tests;

import org.junit.jupiter.api.parallel.ResourceLock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GoogleParametrizedTest3 extends BaseTest {

    static Stream<String> argsProviderFactory() {
        return Stream.of("Дом дракона", "Ваша честь");
    }

    @ResourceLock("1")
    @MethodSource("argsProviderFactory")
    @ParameterizedTest
    void googleSearchTest3(String film) {
        googleSearchPage.doSearch(film)
                .checkResults(film);
    }
}
