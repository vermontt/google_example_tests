package com.lazarev.tests;

import com.lazarev.enums.Films;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class GoogleParametrizedTest extends BaseTest {

    @ValueSource(strings = {
            "troy",
            "matrix",
            "dexter"
    })
    @ParameterizedTest
    void googleSearchTest1(String searchWord) {
        googleSearchPage.doSearch(searchWord)
                .checkResults(searchWord);
    }

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

    static Stream<String> argsProviderFactory() {
        return Stream.of("Дом дракона", "Ваша честь");
    }

    @MethodSource("argsProviderFactory")
    @ParameterizedTest
    void googleSearchTest3(String film) {
        googleSearchPage.doSearch(film)
                .checkResults(film);
    }

    @EnumSource(value = Films.class)
    @ParameterizedTest
    void googleSearchTest4(Films word) {
        googleSearchPage.doSearch(word.getDay())
                .checkResults(word.getDay());
    }
}