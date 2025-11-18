package cm.aptoide.p092pt.home.bundles.misc;

import android.view.View;
import android.widget.Button;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class LoadingMoreErrorViewHolder extends AppBundleViewHolder {
    private Button retry;
    private C11418b<HomeEvent> uiEventsListener;

    public LoadingMoreErrorViewHolder(View view, C11418b<HomeEvent> c11418b) {
        super(view);
        this.retry = (Button) view.findViewById(C1146R.id.load_more_retry_button);
        this.uiEventsListener = c11418b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundle$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8088a(HomeBundle homeBundle, int i2, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, i2, HomeEvent.Type.LOAD_MORE_RETRY));
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, final int i2) {
        this.retry.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.misc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9613f.m8088a(homeBundle, i2, view);
            }
        });
    }
}
