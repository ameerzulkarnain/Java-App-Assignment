import java.util.ArrayList;

public class ForecastDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update (Observable observable, Object arg) {
		if(observable instanceof WeatherData) {
			WeatherData wd = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = wd.getPressure();
			display();
		}
	}
	
	public void display() {
		System.out.print("Forecast: ");
		if(currentPressure>lastPressure) {
			System.out.println("Improving weather on the way!");
		}else if(currentPressure == lastPressure) {
			System.out.println("More of the same");
		}else if(currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

}
