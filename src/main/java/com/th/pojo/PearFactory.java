/**
 * Created by Administrator on 2018/11/19.
 */
public class PearFactory implements FruitFactoryMethod {
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
