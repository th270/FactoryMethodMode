/**
 * Created by Administrator on 2018/11/19.
 */
public class MainClass {
    public static void main(String[] args) {
        FruitFactoryMethod ff = new AppleFactory();
        Fruit apple = ff.getFruit();
        apple.get();

        FruitFactoryMethod bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();

        FruitFactoryMethod pearFactory = new PearFactory();
        Fruit pear = pearFactory.getFruit();
        pear.get();
    }
}
