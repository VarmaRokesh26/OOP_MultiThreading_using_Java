package oops.theGreatRoberyGame;

public class City {

    private Building[] buildings = new Building[4];
    public City() {
        Items[] bankItems = new Items[2];
        bankItems[0] = new Items("Letter Opener", 2.5);
        bankItems[1] = new Items("Stamp", 3.5);

        buildings[0] = new Building("Bank", bankItems);

        Items[] mansionItems = new Items[2];
        mansionItems[0] = new Items("Pair of fancy shoes", 25.0);
        mansionItems[1] = new Items("Broken glass", 0.1);

        buildings[1] = new Building("Mansion", mansionItems);

        Items[] postOfficeItems = new Items[2];
        postOfficeItems[0] = new Items("Letter to Jenny", 1.5);
        postOfficeItems[1] = new Items("Pencil", 2.0);

        buildings[2] = new Building("Post Office", postOfficeItems);

        Items[] superMarketItems = new Items[2];
        superMarketItems[0] = new Items("A loaf of bread", 2.5);
        superMarketItems[1] = new Items("A bog of tea", 6.5);

        buildings[3] = new Building("Super Market", superMarketItems);
    }

    public Building[] getBuildings() {
        return buildings;
    }
}
