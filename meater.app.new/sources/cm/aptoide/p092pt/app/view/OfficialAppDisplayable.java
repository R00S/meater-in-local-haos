package cm.aptoide.p092pt.app.view;

import android.util.Pair;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class OfficialAppDisplayable extends Displayable {
    private boolean isAppInstalled;
    private final Pair<String, GetAppMeta> messageGetApp;
    private int primaryColor;
    private int raisedButtonDrawable;

    public OfficialAppDisplayable() {
        this.messageGetApp = null;
        this.primaryColor = C1146R.color.default_orange_gradient_start;
        this.raisedButtonDrawable = C1146R.drawable.aptoide_gradient_rounded;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public Pair<String, GetAppMeta> getMessageGetApp() {
        return this.messageGetApp;
    }

    public int getPrimaryColor() {
        return this.primaryColor;
    }

    public int getRaisedButtonDrawable() {
        return this.raisedButtonDrawable;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.official_app_displayable_layout;
    }

    public boolean isAppInstalled() {
        return this.isAppInstalled;
    }

    public OfficialAppDisplayable(Pair<String, GetAppMeta> pair, int i2, int i3, boolean z) {
        this.messageGetApp = pair;
        this.primaryColor = i2;
        this.raisedButtonDrawable = i3;
        this.isAppInstalled = z;
    }
}
