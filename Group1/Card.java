public class Card implements Comparable<Card>
{
    private int Id;
    

    public void Card(int id)

    {
        Id = id;
    }

    public int getId()
    {
        return Id;
    }

    public boolean equals(Card other)
    {
        if (other.getId() == getId())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int compareTo(Card other)
    {
        if (getId() == other.getId())
        {
            return 0;
        }
        else if (getId() > other.getId())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    public String toString()
    {
         return Integer.toString(getId());
    }
}
