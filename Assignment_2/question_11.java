abstract class Monster{
    String type;
    String name;
    public abstract String toString();
}

class Vampire extends Monster{
    Vampire(String s)
    {
        super.name =s;
        super.type = "Vampire";
    }
    public String toString()
    {
        return "Type: "+super.type+", Name: "+super.name+"\0";
    }
}

class Werewolf extends Monster{
    Werewolf(String s)
    {
        super.name =s;
        super.type = "Werewolf";
    }
    public String toString()
    {
        return "Type: "+super.type+", Name: "+super.name+"\0";
    }
}

class Zombie extends Monster{
    Zombie(String s)
    {
        super.name =s;
        super.type = "Zombie";
    }
    public String toString()
    {
        return "Type: "+super.type+", Name: "+super.name+"\0";
    }
}

public class question_11 {
    public static void main(String[] args){
        Monster monsterArray[] = new Monster[7];
        int i=0;
        Vampire v1 = new Vampire("V1");
        monsterArray[i++]=v1;
        Werewolf w1 = new Werewolf("W1");
        monsterArray[i++]=w1;
        Zombie z1 = new Zombie("Z1");
        monsterArray[i++]=z1;
        Zombie z2 = new Zombie("Z2");
        monsterArray[i++]=z2;
        Vampire v2 = new Vampire("V2");
        monsterArray[i++]=v2;
        Werewolf w2 = new Werewolf("W2");
        monsterArray[i++]=w2;
        for(int j =0;j<6;j++)
        {
            System.out.println(monsterArray[j].toString());
        }
    }
}
