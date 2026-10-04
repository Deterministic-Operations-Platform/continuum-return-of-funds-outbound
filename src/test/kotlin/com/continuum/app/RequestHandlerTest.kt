package com.continuum.app

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestHandlerTest {
    @Test
    fun handlesHealthCheck() {
        val handler = RequestHandler(ProcessingService("continuum-return-of-funds-outbound"))

        assertEquals("continuum-return-of-funds-outbound processed: health-check", handler.handle("health-check"))
    }
}