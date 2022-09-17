public class Escudo {

    private float defense;

    public float getDefense() {
        return defense;
    }
    public void setDefensa0(){
        this.defense = 0.95f;

    }
    public void setDefensa1(){
        this.defense = 0.75f;

    }
    public void setDefensa2(){
        this.defense = 0.55f;

    }
    public float defensaXdano(Float damage){
        return (float) this.getDefense()*damage;
    }


}


/*

 T
    
    */