package com.example.judytest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.PropertySource

@SpringBootTest
class TempTest {

    @Value("\${temp.test}")
    lateinit var test:String


    @Test
    fun tempT() {
        assertThat(1).isEqualTo(1)
assertThat(test).isEqualTo("test22")
    }
}