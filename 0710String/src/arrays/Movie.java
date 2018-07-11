package arrays;

public class Movie implements Comparable {
//public class Movie  {
	private String name;
	private String releasedate;
	private String director;
	private int duration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", releasedate=" + releasedate + ", director=" + director + ", duration="
				+ duration + "]";
	}
	@Override
	public int compareTo(Object o) {
		Movie other = (Movie)o;
		return this.duration - other.duration;
		//return this.name.compareTo(other.name);
		/*if(this.duration > other.duration) {
			return 1;//정수 리턴 
		}
		else if(this.duration == other.duration) {
			return 0;
		}
		else {
			return -1;//부수 리턴
		}*/
	}
	
	

}
