package cm.aptoide.p092pt.home.bundles.base;

/* loaded from: classes.dex */
public class HomeEvent {
    private final HomeBundle bundle;
    private final int bundlePosition;
    private final Type clickType;

    public enum Type {
        MORE,
        MORE_TOP,
        APP,
        AD,
        SCROLL_RIGHT,
        REWARD_APP,
        APPC_KNOW_MORE,
        DISMISS_BUNDLE,
        SOCIAL_INSTALL,
        EDITORIAL,
        INSTALL_WALLET,
        NO_OP,
        REACT_SINGLE_PRESS,
        REACT_LONG_PRESS,
        REACTION,
        POPUP_DISMISS,
        LOAD_MORE_RETRY,
        INSTALL_PROMOTIONAL,
        ARTICLE_PROMOTIONAL,
        NOTIFY_ME,
        CANCEL_NOTIFY_ME
    }

    public HomeEvent(HomeBundle homeBundle, int i2, Type type) {
        this.bundle = homeBundle;
        this.bundlePosition = i2;
        this.clickType = type;
    }

    public HomeBundle getBundle() {
        return this.bundle;
    }

    public int getBundlePosition() {
        return this.bundlePosition;
    }

    public Type getType() {
        return this.clickType;
    }
}
