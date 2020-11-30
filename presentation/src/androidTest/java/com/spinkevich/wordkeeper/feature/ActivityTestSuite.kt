package com.spinkevich.wordkeeper.feature

import com.codingwithmitch.espressouitestexamples.ui.main.MainActivityTest
import org.junit.runner.RunWith
import org.junit.runners.Suite


@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    TranslationEnToRu::class,
    TranslationEnToEe::class,
    TranslationEnToDe::class,
    TranslationEnToTu::class
)
class ActivityTestSuite