public class SpecialMenu extends Menu {
    private String story; // narasi cerita dari menu

    public SpecialMenu(String Menuid, String Menuname, double price, String location, String story) {
        super(Menuid, Menuname, price, location); // memanggil konstruktor dari superclass (Menu)
        this.story = story; // inisialisasi atribut tambahan untuk SpecialMenu
    }

    // getters and setters untuk story
    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}

