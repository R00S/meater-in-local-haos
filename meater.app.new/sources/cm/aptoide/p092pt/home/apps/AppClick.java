package cm.aptoide.p092pt.home.apps;

/* loaded from: classes.dex */
public class AppClick {
    private App app;
    private ClickType clickType;

    public enum ClickType {
        CARD_CLICK,
        CARD_LONG_CLICK,
        DOWNLOAD_ACTION_CLICK,
        APPC_ACTION_CLICK,
        PAUSE_CLICK,
        CANCEL_CLICK,
        RESUME_CLICK,
        INSTALL_CLICK,
        APPC_UPGRADE_APP,
        APPC_UPGRADE_RESUME,
        APPC_UPGRADE_RETRY,
        APPC_UPGRADE_CANCEL,
        APPC_UPGRADE_PAUSE
    }

    public AppClick(App app, ClickType clickType) {
        this.app = app;
        this.clickType = clickType;
    }

    public App getApp() {
        return this.app;
    }

    public ClickType getClickType() {
        return this.clickType;
    }
}
