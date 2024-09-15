public class Human extends Actor {
String getName() {
    return name;
}

    @Override
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
    public boolean isTakeOrder() {
        return isTakeOrder;}
}
