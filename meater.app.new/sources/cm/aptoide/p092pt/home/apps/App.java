package cm.aptoide.p092pt.home.apps;

/* loaded from: classes.dex */
public interface App {

    public enum Type {
        UPDATE,
        DOWNLOAD,
        INSTALLED
    }

    String getIdentifier();

    Type getType();
}
