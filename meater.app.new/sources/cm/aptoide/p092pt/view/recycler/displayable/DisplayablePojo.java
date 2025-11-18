package cm.aptoide.p092pt.view.recycler.displayable;

/* loaded from: classes.dex */
public abstract class DisplayablePojo<T> extends Displayable {
    private T pojo;

    public DisplayablePojo() {
    }

    public T getPojo() {
        return this.pojo;
    }

    public DisplayablePojo<T> setPojo(T t) {
        this.pojo = t;
        return this;
    }

    public DisplayablePojo(T t) {
        this.pojo = t;
    }
}
