package campuslocator.android.thiagoloschi.com.campuslocator;

/**
 * Created by thiagoloschi on 11/20/15.
 */
public class LocationLab {
    private Location location = new Location();

    Location dc = new Location("Dining Commons", "510-855-2540", "37.652979,-122.053698");
    Location eb = new Location("Einstein Bros", "510-885-7006", "37.6567977,-122.0541549");
    Location gt = new Location("Greens To Go", "510-885-7102", "37.6548798,-122.0558564");
    Location jj = new Location("Jamba Juice", "510-885-7088", "37.6545196,-122.053703");
    Location pe = new Location("Panda Express", "510-885-7697", "37.6544759,-122.0555766");
    Location pd = new Location("P.O.D", "510-885-7697", "37.6548798,-122.0558564");
    Location ph = new Location("Pizza Hut", "510-885-7697", "37.6548798,-122.0558564");
    Location sb = new Location("Starbucks", "510-885-7102", "37.655636, -122.056280");
    Location sw = new Location("Subway", "510-885-7697", "37.6544759,-122.0555766");
    Location tb = new Location("Taco Bell", "510-885-7697", "37.6548798,-122.0558564");

    private Location dinings[] = {dc,eb,gt,jj,pe,pd,ph,sb,sw,tb};

    private Location[] plots = {
            new Location("Lot A","General Paring", "37.656026,-122.0582411"),
            new Location("Lot B","Faculty/Staff", "37.654251,-122.0566771"),
            new Location("Lot C","General Parking", "37.6520179,-122.0519777"),
            new Location("Lot C1","General Parking", "37.6516599,-122.0505255"),
            new Location("Lot D","General Parking", "37.6551101,-122.0529557"),
            new Location("Lot E","Faculty/Staff", "37.6559584,-122.0522931"),
            new Location("Lot F","General Parking", "37.6564942,-122.0519522"),
            new Location("Lot G","General Parking", "37.6578347,-122.0521947"),
            new Location("Lot H","General Parking", "37.6590408,-122.0539633"),
            new Location("Lot J","Faculty/Staff", "37.658601,-122.0554925"),
            new Location("Lot K","General Parking", "37.6597389,-122.0564286"),
            new Location("Lot L","Faculty/Staff", "37.6593883,-122.0586509"),
            new Location("Lot M","Faculty/Staff", "37.6578858,-122.0595017"),
            new Location("Lot N","General Parking", "37.6581909,-122.0619053"),
            new Location("Lot O","Faculty/Staff", "37.655918,-122.0607232"),
            new Location("Lot P","General Parking", "37.6590186,-122.0604665")
    };

    private Location[] buildings = {
            new Location ("Academic Services","","37.6579956,-122.0546082"),
            new Location ("Accessibility Services","","37.6559747,-122.0557325"),
            new Location ("Agora Stage","","37.6550327,-122.0550271"),
            new Location ("Art And Education","","37.6578119,-122.0566793"),
            new Location ("Athletics Temporary Offices","","37.6591166,-122.0591618"),
            new Location ("Boiler Plant/Storage","","37.6558793,-122.0533002"),
            new Location ("Campus Police Station","","37.6553793,-122.0566242"),
            new Location ("Corporation Yard/Receiving","","37.6553619,-122.0534834"),
            new Location ("Facilities Maintenance","","37.655609,-122.0536166"),
            new Location ("Field house Offices","","37.656088,-122.0606834"),
            new Location ("Meiklejohn Hall","","37.6536614,-122.0547707"),
            new Location ("Music Building","","37.6585738,-122.0586832"),
            new Location ("Old University Union","","37.6548639,-122.0558622"),
            new Location ("Physical Education & Gym","","37.6571229,-122.058219"),
            new Location ("Pioneer Amphitheatre","","37.659089,-122.0567282"),
            new Location ("Pioneer Bookstore","","37.6552382,-122.0560556"),
            new Location ("Pioneer Heights Student Housing","","37.6532274,-122.0524597"),
            new Location ("Pioneer Stadium","","37.65724,-122.0607575"),
            new Location ("Recreation and Wellness Center","","37.6545656,-122.0536083"),
            new Location ("Robinson Hall","","37.6591536,-122.0582273"),
            new Location ("Science Building","","37.656226,-122.0540595"),
            new Location ("Student Health Center","","37.6563026,-122.0573252"),
            new Location ("Student Services & Administration","","37.6576683,-122.0542215"),
            new Location ("Support Temporary Offices","","37.655128,-122.0547689"),
            new Location ("University Art Gallery","","37.6578201,-122.0557437"),
            new Location ("University Library","","37.6557798,-122.0567186"),
            new Location ("University Theatre","","37.65959,-122.0576238"),
            new Location ("University Union","","37.6544662,-122.0556142"),
            new Location ("Valley Business & Technology Center","","37.6570768,-122.0551044"),
            new Location ("Welcome Center for Future Students","","37.6566023,-122.0591513")
    };

    private Location shuttles[] = {
            new Location("Stop A: Raw Center","Bus 60/Hayward Shuttle/Castro Valley Shuttle","37.6540739,-122.0535644"),
            new Location("Stop B: University Police","Bus 60","37.6558822,-122.0572506"),
            new Location("Stop C: Music Building","Hayward Shuttle/Castro Valley Shuttle","37.6588712,-122.0596512"),
            new Location("Stop D: Old Hilary Rd.","Bus 60","37.6578094,-122.0535465"),
            new Location("Stop E: University Village","Castro Valley Shuttle","37.6596467,-122.0633839")
    };


    public static Location getLocation(String name, Location[] locations){
        int i=0;
        for(Location l : locations) {
            if (l.getName().equalsIgnoreCase(name))
                return locations[i];
            i++;
        }
        return null;
    }

    public Location[] getLocations(int i){
        switch (i){
            case 1: return buildings;
            case 2: return dinings;
            case 3: return plots;
            case 4: return shuttles;
        }
        return null;
    }


}
