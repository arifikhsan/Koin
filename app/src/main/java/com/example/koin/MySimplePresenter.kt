package com.example.koin

class MySimplePresenter(private val repo: HelloRepository) {
    fun sayHello() = "${ repo.giveHello() } from $this"
}