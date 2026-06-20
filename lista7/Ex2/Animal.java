package Ex2;

public abstract class Animal {
    public abstract String fala();
}
class Homem extends Animal{
    public String fala(){
        return "Oi";
    }

}
class Cao extends Animal{
    public String fala(){
        return "Au Au";
    }
}
class Gato extends Animal{
    public String fala(){
        return "Miau";
    }
}