package design.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具有混合调料功能的装饰器抽象类：为咖啡混合不同调料
 */
public abstract class AbstractCoffeeFixDecorator implements Coffee {
    //持有咖啡，由构造方法传入
    protected Coffee coffee;
    /*
    维护调料列表。
    如果在这里直接初始化了 new ArrlyList() ，那么以后每new出一个子类装饰器就会new出一个array。而我们要的是所有的FixDecorator在一个list。
    因为Coffee本身不具备“调料列表”这个属性，而我们又要所有FixDecorator共享这个属性，由外部传递进来？只能传进来，因为构造函数的参数Coffee中取不到。
    最合适的设计方式就是 ：需要引入新属性的装饰器不能有子类，除非属性是静态常量。  从io包可以看出来，Reader(有子类)的属性都是静态常量。BufferedInputStream没有子类，DataInputStream也没有子类。

     */
    protected List<String> fixList = null;

    public AbstractCoffeeFixDecorator(Coffee coffee){
        this.coffee = coffee;
        if (null == fixList){
            fixList=new ArrayList<>();
        }
    }
    public void fix(String fix){
        this.fixList.add(fix);
    }

    @Override
    public String makingCoffee() {
        return coffee.makingCoffee()+":{"+fixList.toString()+"}";
    }
}
