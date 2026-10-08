import java.util.Arrays;
public class Building
{   
    private String name;
    private Item[] items;
    private String location;
    private String objective;
    private NPC[] npc;
    private Missions mission;
    
    public Building(String name, Item[] items, String location, String objective, NPC[] npc)
    {
        this.name = name;
        this.location =location;
        this.objective = objective;
        this.items = items;
        this.npc = npc;
    }

    // Changed this. It shouldn't be static and should have a return type.
    public String greeting(){
        return "Welcome to " + this.name + ". Located in " + this.location;
    }
    public void getInfo(){
        System.out.println("Your objectives for " + name + " is " + objective);

    }
    public String getName(){
         return this.name;
    }
    public String getLocation(){
         return this.location;
    }
    public String getObjective(){
         return this.objective;
    }
    public Item[] getItems(){
        return Arrays.copyOf(this.items, this.items.length);
        
        
    }
    public NPC[] getNpc(){
        return Arrays.copyOf(this.npc, this.npc.length);
        
    } 
    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location= location;
    }
    public void setObjective(String objective){
        this.objective = objective;
    }
    
    
}
