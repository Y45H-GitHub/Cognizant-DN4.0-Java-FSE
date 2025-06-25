package com.yash.MockitoDemo;

public class WeatherService {
    private final WeatherApiClient apiClient;

    public WeatherService(WeatherApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String getTodayForecast(String city) {
        return "Today's forecast for " + city + ": " + apiClient.getForecast(city);
    }
}
