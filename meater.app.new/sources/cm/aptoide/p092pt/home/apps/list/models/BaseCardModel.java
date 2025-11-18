package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.App;
import com.airbnb.epoxy.AbstractC5164q;
import com.airbnb.epoxy.AbstractC5167t;
import kotlin.Metadata;

/* compiled from: BaseCardModel.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/BaseCardModel;", "T", "Lcom/airbnb/epoxy/EpoxyHolder;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/App;", "getApplication", "()Lcm/aptoide/pt/home/apps/App;", "setApplication", "(Lcm/aptoide/pt/home/apps/App;)V", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class BaseCardModel<T extends AbstractC5164q> extends AbstractC5167t<T> {
    private App application;

    public final App getApplication() {
        return this.application;
    }

    public final void setApplication(App app) {
        this.application = app;
    }
}
