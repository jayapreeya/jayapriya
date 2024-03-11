package day5_multilevelinheritance;

public class City extends State{
	private String cityName;
	private float area; 
	public String getityName() {
	return cityName;
	}
	public void setCityName(String cityName) {
	this.cityName = cityName;
	}
	public float getArea() {
	return area;
	}
	public void setArea(float area) {
	this.area = area;
	}
    public String toString() {
    return "City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName() + ", Language= "+getLanguage()+ ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}
}
