package com.kopylovis.kmmcomposemuliplatformexample.di

import com.kopylovis.kmmcomposemuliplatformexample.utils.PlatformTestUtils
import com.kopylovis.kmmcomposemuliplatformexample.utils.TestUtils
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun initKoin() {
    val koinApplication = startKoin {
        modules(
            listOfNotNull(
                coreModule,
            )
        )
    }
    val koin = koinApplication.koin
    koin.createEagerInstances() // for create instances marked as createdAtStart
}

private val coreModule = module {
    single { TestUtils() }
    single { PlatformTestUtils() }
}

object ServiceLocator: KoinComponent {
    val testUtils = get<TestUtils>()
    val platformUtils = get<PlatformTestUtils>()
}