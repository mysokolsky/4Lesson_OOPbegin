public class Armor extends Weapon{

// название брони
// коэффициент сопротивления атаке, снижающий силу атаки противника
// долговечность или брони


  public Armor(String imya, float resistance, int iznos){
    super(imya, resistance, iznos); 

  }

  public void damageArmor(Armor armor){
     if (iznos>0){

        iznos -= 10;
        parameter *= .9;
        System.out.println("Износ защиты " + name + " " + (100-iznos) + "%");

      }
      else iznos = 0;
  }
  
}