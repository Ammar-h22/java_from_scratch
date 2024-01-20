package udemy.laptop.components;

public class Processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String MinFrequency;
	private String MaxFrequency;

	public Processor() {
		brand = "Intel";
		series = "i5 7200U";
		generation = 7;
		cores = 2;
		threads = 4;
		cacheMemory = "3MB";
		frequency = "2.5GHz";
		MinFrequency = "2.5GHz";
		MaxFrequency = "3.1GHz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {

		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		MinFrequency = minFrequency;
		MaxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", MinFrequency=" + MinFrequency + ", MaxFrequency=" + MaxFrequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinFrequency() {
		return MinFrequency;
	}

	public String getMaxFrequency() {
		return MaxFrequency;
	}
	
//	Note:
//	If in the "Laptop" class we want to access a particular property of the "Processor" class,
//	then we need a "setter" method of that property(variable).
	
//	Example:
	public void setFrequency(String frequency)
	{
		this.frequency = frequency;
	}
}
