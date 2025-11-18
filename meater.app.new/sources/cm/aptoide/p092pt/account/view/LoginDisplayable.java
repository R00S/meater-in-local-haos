package cm.aptoide.p092pt.account.view;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class LoginDisplayable extends Displayable {
    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.login_store_displayable_layout;
    }
}
