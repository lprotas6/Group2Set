public class Card implements Comparable<Card>
{
    private int Id;
    

<<<<<<< HEAD
    public void Card(int id)
=======
    public Card(int newid)

>>>>>>> 9e0a79610d7a089a9a3ea96ef5a2bc69ccfde57a

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
