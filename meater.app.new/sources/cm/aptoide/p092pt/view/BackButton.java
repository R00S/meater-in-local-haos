package cm.aptoide.p092pt.view;

/* loaded from: classes.dex */
public interface BackButton {

    public interface ClickHandler {
        boolean handle();
    }

    void registerClickHandler(ClickHandler clickHandler);

    void unregisterClickHandler(ClickHandler clickHandler);
}
