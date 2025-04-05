public class Main {
    public static void main(String[] args) {
        IconFactory iconFactory = new IconFactory();

        Icon fileIcon1 = iconFactory.getIcon("file");
        fileIcon1.draw(100, 100);

        Icon fileIcon2 = iconFactory.getIcon("file");
        fileIcon2.draw(150, 150);

        Icon folerIcon1 = iconFactory.getIcon("folder");
        folerIcon1.draw(200, 200);

        Icon folderIcon2 = iconFactory.getIcon("folder");
        folderIcon2.draw(250, 250);        
    }
}
