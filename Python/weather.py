import requests
import json

def get_weather_data(api_key, city):
    base_url = "http://api.openweathermap.org/data/2.5/weather"
    params = {
        "q": city,
        "appid": api_key,
        "units": "metric"  # You can change this to "imperial" for Fahrenheit
    }

    response = requests.get(base_url, params=params)

    if response.status_code == 200:
        return response.json()
    else:
        return None

def display_weather_data(data):
    if data is not None:
        main_data = data["main"]
        weather_data = data["weather"][0]

        print(f"Weather in {data['name']}, {data['sys']['country']}:")
        print(f"Description: {weather_data['description']}")
        print(f"Temperature: {main_data['temp']}°C")
        print(f"Feels Like: {main_data['feels_like']}°C")
        print(f"Humidity: {main_data['humidity']}%")
        print(f"Pressure: {main_data['pressure']} hPa")
    else:
        print("Weather data not available.")

if __name__ == "__main__":
    api_key = "YOUR_OPENWEATHERMAP_API_KEY"  # Replace with your API key
    city = input("Enter a city name: ")

    weather_data = get_weather_data(api_key, city)

    display_weather_data(weather_data)
