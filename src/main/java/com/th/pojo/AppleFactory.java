/**
 * Created by Administrator on 2018/11/19.
 */
public class AppleFactory implements FruitFactoryMethod {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
