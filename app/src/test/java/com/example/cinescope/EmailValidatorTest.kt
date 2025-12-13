package com.example.cinescope
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {
    fun isValidEmail(email: String): Boolean {
        val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"
        return email.matches(emailRegex.toRegex())
    }

    @Test
    fun email_isCorrect_ReturnsTrue() {
        val result = isValidEmail("test@example.com")
        assertTrue(result)
    }

    @Test
    fun email_isWrong_ReturnsFalse() {
        val result = isValidEmail("test-example")
        assertFalse(result)
    }
}