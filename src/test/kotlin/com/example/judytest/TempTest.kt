package com.example.judytest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
@SpringBootTest
class TempTest {
    @Test
    fun tempT(){
        assertThat(1).isEqualTo(1)

    }
}