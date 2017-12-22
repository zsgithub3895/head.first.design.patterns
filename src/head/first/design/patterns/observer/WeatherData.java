package head.first.design.patterns.observer;

public abstract class WeatherData implements Subject{
	public abstract void registerObserver();
	public abstract void removeObserver();
	public abstract void notifyObservers();
	float temp;
	float humidity;
	float pressure;
}
