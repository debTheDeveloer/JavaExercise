package DecalrationAndAccessModifier;

public class AbstractChldClassConstrutor extends AbstractClassConstructor {

    //So whenever parent class is abstract and it is having a constructor, It is mandatory to have constructor in that child class
    //as well with those parameters. Any extra variable may present in the child  class constructor. But it is mandatory to have at
    //lease those parent class variavbles.
    // This behaviour is true for non abstract parent class as well.

    int k;
    public AbstractChldClassConstrutor(int i, int j, int k) {
        super(i, j);
        this.k =k;
    }
}
