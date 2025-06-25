package com.yash.MockitoDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WeatherServiceTest {

    @Test
    void testGetTodayForecast_withMockedApiClient() {
        // mock
        WeatherApiClient mockApi = mock(WeatherApiClient.class);
        // Stub method
        when(mockApi.getForecast("Kolkata")).thenReturn("Sunny 30°C");
        // Inject mock into service
        WeatherService service = new WeatherService(mockApi);
        // Call method and assert
        String result = service.getTodayForecast("Kolkata");

        assertEquals("Today's forecast for Kolkata: Sunny 30°C", result);
    }
}
