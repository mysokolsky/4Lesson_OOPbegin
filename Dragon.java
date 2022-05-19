// Класс Dragon.java наследует свойства класса Unit.java. То есть, все свойства и методы класса Unit у класса Dragon такие же и кроме того, мы можем дополнить новыми переменными и методами наш класс Dragon
public class Dragon extends Unit{

  // создаём новую переменную flySpeed, которая будет свойственна объектам, создаваемым при помощи класса Dragon наряду с переменными класса Unit, которые так же будут унаследоваться объектами класса Dragon
  public int flySpeed;

  // Создаём метод "конструктор" для объектов класса Dragon, в переменные которого добавляется новая переменная flySpeed
  public Dragon(String imya, int zdorovie, int silaudara, Armor bronya, Weapon weapon, int skorost){
    super(imya, zdorovie, silaudara, bronya, weapon); 
    this.flySpeed = skorost;
  }

}