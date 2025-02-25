package Exercicios;

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return 10;
        } return 6;
    }

    @Override
    public String toString() {
        return "Exercicios.Fighter is a Exercicios.Warrior";
    }
}

class Wizard extends Fighter{
    boolean preparingSpell;

    @Override
    public String toString() {
        return "Exercicios.Fighter is a Exercicios.Wizard";
    }


    public void prepareSpell(){
        this.preparingSpell = true;
    }

    @Override
    boolean isVulnerable() {
        if (this.preparingSpell){
            return false;
        } return true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (this.preparingSpell){
            return 12;
        } return 3;
    }
}

