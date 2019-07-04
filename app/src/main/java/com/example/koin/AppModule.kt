package com.example.koin

import org.koin.dsl.module

val appModule = module {
    // single instance of HelloRespository
    single<HelloRepository> { HelloRepositoryImpl() }

    factory { MySimplePresenter(get()) }
}