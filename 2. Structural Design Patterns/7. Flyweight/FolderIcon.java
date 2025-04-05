public class FolderIcon implements Icon{
    private String color;
    private String image;

    public FolderIcon(String color, String image) {
        this.color = color;
        this.image = image;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing foler icon with color "+ color + " and image "+ image +" at position ("+ x + ")");
    }
}
