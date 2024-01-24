package ie.tudublin;

public class Cat
{
    public String name;
    public Integer numLives;

    public Cat(String name)
    {
        this.name = name;
        this.numLives = 9;
    }

    public String getName()
    {
        return name;
    }

    public Integer getNumLives()
    {
        return numLives;
    }

    public void kill()
    {
        if (numLives > 0)
        {
            numLives--;
            System.out.println("Ouch!");
            if (numLives < 1){
                System.out.println("Dead");
            }
        }
    }
}
