package com.example.testapp

import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun test_count_is_zero() {
        val ma = MainActivity()
        assertEquals(ma.count, 0)
    }

    @Test
    fun test_count_is_one() {
        val ma = MainActivity()
        var newValue = ma.increase(ma.count)

        assertEquals(newValue, 1)
    }
}
