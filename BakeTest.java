
public class BakeTest {
 
public static void main(String[] args) {
 
icings myicings[] = {
new icings(),
new icings(),
new icings(),
new icings(),
};
 
CakeBase CakeB = new CakeBase();
Cherry ch=  new Cherry();
Dryfruits dr = new Dryfruits();
 
    Cake Cake = new Cake();
Bakedcake bc = Cake.heat(myicings, ch, dr);
bc.printBill();
 
 
}
}
 
 
class Food{}
class CakeBase{}
class icings{}
class Cherry{}
class Dryfruits {}
class Bakedcake{
 
private float cost;

public float getCost() {
return cost;
}

public void setCost(float cost) {
this.cost = cost;
}
 
void printBill()
{ System.out.println("Cake costs for"+cost);
 
}
}
class Cake extends Food {

CakeBase CakeBase = new CakeBase();
Bakedcake heat(icings[],Cherry ch, Dryfruits dr)
{
Bakedcake bakedCake =new Bakedcake();
Bakedcake.setCost(250* icings.length);
return Bakedcake;
 
 
}
}
