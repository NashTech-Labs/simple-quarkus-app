package com.knoluds.health;

import org.eclipse.microprofile.health.HealthCheckResponse;
import org.junit.jupiter.api.Test;
import com.knoluds.service.InMemoryStorageService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ReadinessCheckTest {


    @Test
    void testCall() {
        HealthCheckResponse actualCallResult = (new ReadinessCheck(new InMemoryStorageService())).call();
        assertFalse(actualCallResult.getData().isPresent());
        assertEquals(HealthCheckResponse.State.UP, actualCallResult.getState());
        assertEquals("Storage Service", actualCallResult.getName());
    }


}

