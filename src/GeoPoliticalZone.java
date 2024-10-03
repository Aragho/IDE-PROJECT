import java.util.Scanner;

public enum GeoPoliticalZone {
    NORTHEAST ("Adamawa \nBauchi \nBorno \nGombe \nTaraba \nYobe"),
    NORTHWEST("Zamfara \nSokoto \nKebbi \nKatsina \nKano \nKaduna \nJigawa"),
    NORTHCENTRAL("Plateau \nNiger \nNasarawa \nKwara \nKogi \nFederal Capital Territory \nBenue"),
    SOUTHEAST("Imo \nEnugu \nEbony \nAnambra \nAbia"),
    SOUTHSOUTH ("Rivers \nEdo \nDelta \nCross River \nBayelsa \nAkwa Ibom"),
    SOUTHWEST("Ekiti \nLagos \nOgun \nOndo \nOsun \nOyo");

    private final  String description;

    GeoPoliticalZone(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the political zone: ");
        String name = scanner.nextLine().toUpperCase().trim();
        String zone = name.replaceAll(" ", "");
        try{
            GeoPoliticalZone politicalZone = GeoPoliticalZone.valueOf(zone);
            System.out.println(politicalZone.getDescription());
        }catch (Exception adenike){
            System.out.println("Invalid political zone");
        }
    }



}
