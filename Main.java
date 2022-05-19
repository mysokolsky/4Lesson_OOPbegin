
// К сожалению, на repl.it не удаётся запустить программу без класса Main.java, поэтому он будет вместо Game.java

public class Main {



 
  public static void main(String[] args) {


    //последние значения в скобках - 100% жизнеспособность оружия и брони
    Weapon axe = new Weapon("алебарда", 1.4F,100);
    Weapon arrow = new Weapon("лук и стрелы", 1.3F, 100);
    Weapon magic = new Weapon("заклинание", 1.2F, 100);
    Weapon fire = new Weapon("огонь", 1.5F, 100);
    
    Armor dragonskin = new Armor("чешуя дракона", 1.7F, 100);
    Armor bearskin = new Armor("медвежья шкура", 1.1F, 100);
    Armor shield = new Armor("защитное поле", 1.5F, 100);
    Armor robe = new Armor("чёрная мантия", 1.3F, 100);



    //создадим объект orc с переменными, которые прописаны в файле-классе Unit.java и сразу в скобках присваиваем им нужные значения 
    Unit orc = new Unit("Орк",100,30,bearskin,axe); 
    Unit elf = new Unit("Эльф",100,20,shield,arrow);
    Dragon gorynych = new Dragon("Горыныч-змей",100,50,dragonskin,fire,500);
    Witch yaga = new Witch("Баба Яга",100,40,robe,magic);

    System.out.println();
    System.out.println("БИТВА НАЧАЛАСЬ!!!!");
    System.out.println();


    Unit[] units = {orc, elf, gorynych, yaga};
         

    int k=0,l=0;

    while (true) {
     if (k != l){
      units[k].napadenie(units[l]);
      }
      k = random();
      l = random();
    }



  }

  public static int random(){
     int x = ( int )Math.round(1*Math.random());
    // System.out.println(x);
    return x;
  }
  
}
 