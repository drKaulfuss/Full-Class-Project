import java.util.Arrays;
public class Building
{   
    private String name;
    private Item[] item[];
    private String location;
    private String objective;
    private NPC[] npc[];
    private Mission mission;
    
    public Building(String name, Items[] items[], String location, String objective,NPC[] npc[])
    {
        this.name = name;
        this.location =location;
        this.objective = objective;
        this.item = new Items[items];
    }

    // Changed this. It shouldn't be static and should have a return type.
    public String Greeting(){
        return "Welcome to " + this.name + ". Located in " + this.location;
    }
    public void GetInfo(){
        System.out.println("Your objectives for " + name + " is " + objective);

    }
    public String GetName(){
         return this.name;
    }
    public String GetLocation(){
         return this.location;
    }
    public String GetObjective(){
         return this.objective;
    }
    public Items[] GetItems(){
        return Arrays.copyof(items, items.length);
        
        
    }
    public NPC[] GetNpc(){
        return Arrays.copyof(npc, npc.length);
        
    } 
    public void  SetName(String name){
         this.name = name;
    }
    public void SetLocation(String location){
          this.location= location;
    }
    public void SetObjective(String objective){
          this.objective = objective ;
    }
    
    
}
