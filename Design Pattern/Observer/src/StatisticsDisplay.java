import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement{
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private Subject weatherData;
	private int numReadings;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	public void update(Observable observable, Object arg) {
		if(observable instanceof WeatherData) {
			WeatherData wd = (WeatherData)observable;
			tempSum += wd.getTemperature();
			numReadings++;
			if(wd.getTemperature()>maxTemp) {
				maxTemp = wd.getTemperature();
			}
			if(wd.getTemperature() < minTemp) {
				minTemp = wd.getTemperature();
			}
			display();
		}
	}
	
	public void display() {
		System.out.println("Avg/Max/Min temperature="+(tempSum/numReadings)+"/"+maxTemp+"/"+minTemp);
		
	}

}
