package cm.aptoide.p092pt.autoupdate;

import cm.aptoide.p092pt.presenter.View;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: AutoUpdateDialogView.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;", "Lcm/aptoide/pt/presenter/View;", "dismissDialog", HttpUrl.FRAGMENT_ENCODE_SET, "notNowClicked", "Lrx/Observable;", "Ljava/lang/Void;", "updateClicked", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface AutoUpdateDialogView extends View {
    void dismissDialog();

    C11234e<Void> notNowClicked();

    C11234e<Void> updateClicked();
}
