public class SpecialMenu extends Menu {
    private String story; 
    public SpecialMenu(String Menuid, String Menuname, double price, String location, String story) {
        super(Menuid, Menuname, price, location); 
        this.story = story; 
    }

    // getters and setters untuk story
    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}

