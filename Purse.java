import java.util.HashMap;
import java.util.Map;


public class Purse
{
    HashMap<Denomination,Integer> cash = new HashMap<>();

    //This method adds an amount to the denomination value
    public void add(Denomination type, int num)
    {
        cash.put(type, cash.getOrDefault(type, 0) + num);
    }

    //This method is not used in the program
    public double remove(Denomination type, int num)
    {
        double example = 0.0;
        return example;
    }

    //This method returns the total(users input)
    public double getValue()
    {
        double total = 0.0;
        for(Map.Entry<Denomination,Integer> entry : cash.entrySet())
        {
            Denomination key = entry.getKey();
            int currentValue = entry.getValue();
            total += key.amt() * currentValue;
        }
        return total;
    }

    //This method is used to output each bill and/or coin to the console(if any)
    public String toString()
    {
        String output = "";
        for(Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            Denomination key = entry.getKey();
            int currentValue = entry.getValue();
            output += currentValue + " " + key.name() + "\n";
        }
        return output;
    }



}
