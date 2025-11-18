package cm.aptoide.p092pt.app.view;

/* loaded from: classes.dex */
public interface Scrollable {

    public enum Position {
        FIRST,
        LAST
    }

    void itemAdded(int i2);

    void itemChanged(int i2);

    void itemRemoved(int i2);

    void scroll(Position position);
}
