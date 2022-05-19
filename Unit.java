// Служебный класс Unit.java служит для наделения создаваемых объектов свойствами, описанными в глобальных переменных ниже

public class Unit{

  // Объявляем глобальные переменные класса Unit.java, которыми будут наделяться все объекты, создаваемые через этот класс:

  public String name;
  public int health;
  public int attack;

  public Armor armor;
  public Weapon weapon;


  // Ниже прописан динамический(уже нет параметра static!!!) метод типа "конструктор", который автоматически запускается при создании нового объекта за пределами данного класса через конструкцию Unit xxx = new Unit(x1,x2, ...); с характеристиками класса Unit.java. Этот метод ВСЕГДА имеет имя класса, в котором он прописан. В нашем случае имя_метода = Имени_класса = Unit

  public Unit(String imya, int zdorovie, int silaudara, Armor bronya, Weapon oruzhie){
    // чтобы не путаться, объявляем локальные переменные конструктора другими именами
    name = imya;
    health = zdorovie;
    attack = silaudara;
    armor = bronya;
    weapon = oruzhie;

    System.out.println("Персонаж " + name + " создан!");

  };

  // Ниже объявление динамического (нет static!!!) метода исключительно для объектов, созданных с характеристиками класса Unit. При вызове данного метода из других классов, класс Unit.java не указывается. Метод вызывается исключительно для конкретного объекта, созданного при помощи класса Unit.java. Вызов пишется так: Объект1.napadenie(Объект2); В этом случае в самом методе можно прописать смену свойств обоих объектов.

  public void napadenie(Unit target){
    // в круглых скобках прописано, что метод выполняется для объекта с подменным именем target, который был создан ранее c характеристиками класса Unit.java
    
    // name - атакующий персонаж
    // target.name - персонаж-жертва
    
    // weapon.parameter - коэф. силы оружия атакующего
    // weapon.iznos - жизнь оружия атакующего

    // target.armor.parameter - коэф. сопротивления брони жертвы
    // target.armor.iznos - жизнь брони жертвы

    // int th = target.health;  //сокращаем для удобства
    String tn = target.name; //сокращаем для удобства
    Armor va = target.armor; //сокращаем для удобства

    if (target.health>0 && health>0){

      System.out.println(name + " напал на " + tn + " с помощью " + weapon.name +":");


      int damage = damagevictim(attack,weapon.parameter,va.parameter,va.iznos);

      if (damage>0) {
        target.health -= damage;
        System.out.println("Нанесён урон здоровью " + tn + " = " + damage + "%! ");
        
      }
      else System.out.println("Защита " + va.name + " не пробита! ");



      va.damageArmor(va); //повреждение защиты жертвы

      weapon.damageWeapon(weapon); //повреждение оружия атакующего

   
     
      if (target.health<=100 && target.health>0) System.out.println("Здоровье " + tn + " = "  + target.health + "%");  
      else System.out.println(tn + " УБИТ!");
      
      System.out.println();
      
    }

  }



  public int damagevictim(int a, float wp, float vp, int vi){
    return Math.round(a*wp - vp*vi);
  }

  
}