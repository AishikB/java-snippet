public class SubClass<T> extends MyClass<Number>{
    private T subVar1;

    public SubClass() {
    }

    public T getSubVar1() {
        return subVar1;
    }

    public void setSubVar1(T subVar1) {
        this.subVar1 = subVar1;
    }
}
