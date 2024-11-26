public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDics = 0;
    private int id;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public float getCost(){
        return cost;
    }
    

    public DigitalVideoDisc(String title){
        super();
        this.title = title;
        nbDigitalVideoDics++;
        id = nbDigitalVideoDics;
    }
    public DigitalVideoDisc(String title, String category, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDics++;
        id = nbDigitalVideoDics;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost){
        super();
        this.title = title;
        this.category = category;
		this.director = director;
		this.cost = cost;
        nbDigitalVideoDics++;
        id = nbDigitalVideoDics;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
        nbDigitalVideoDics++;
        id = nbDigitalVideoDics;
    }
    public String display(){ // return disc's title and cost
        return "Title: " + title + ", Cost: $" + cost;
    }
}
