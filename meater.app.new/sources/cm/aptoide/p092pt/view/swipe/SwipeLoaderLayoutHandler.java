package cm.aptoide.p092pt.view.swipe;

import android.view.View;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.ReloadInterface;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeFragment;
import p024c.p085v.p086a.C1020c;

/* loaded from: classes.dex */
public class SwipeLoaderLayoutHandler extends LoaderLayoutHandler {
    private C1020c swipeContainer;

    public SwipeLoaderLayoutHandler(int i2, ReloadInterface reloadInterface) {
        super(reloadInterface, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindViews$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9114d() {
        ((ReloadInterface) this.loadInterface).reload();
    }

    @Override // cm.aptoide.p092pt.view.swipe.LoaderLayoutHandler
    public void bindViews(View view) {
        super.bindViews(view);
        C1020c c1020c = (C1020c) view.findViewById(C1146R.id.swipe_container);
        this.swipeContainer = c1020c;
        c1020c.setOnRefreshListener(new C1020c.j() { // from class: cm.aptoide.pt.view.swipe.f
            @Override // p024c.p085v.p086a.C1020c.j
            /* renamed from: a */
            public final void mo6522a() {
                this.f12081a.m9114d();
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.swipe.LoaderLayoutHandler
    /* renamed from: onFinishLoading */
    public void m9111a(Throwable th) {
        super.m9111a(th);
        this.swipeContainer.setRefreshing(false);
        this.swipeContainer.setEnabled(false);
    }

    @Override // cm.aptoide.p092pt.view.swipe.LoaderLayoutHandler
    public void restoreState() {
        super.restoreState();
        this.swipeContainer.setEnabled(true);
    }

    @Override // cm.aptoide.p092pt.view.swipe.LoaderLayoutHandler
    public void unbindViews() {
        this.swipeContainer.setOnRefreshListener(null);
        super.unbindViews();
    }

    public SwipeLoaderLayoutHandler(int[] iArr, GridRecyclerSwipeFragment gridRecyclerSwipeFragment) {
        super(gridRecyclerSwipeFragment, iArr);
    }

    @Override // cm.aptoide.p092pt.view.swipe.LoaderLayoutHandler
    protected void onFinishLoading() {
        super.onFinishLoading();
        this.swipeContainer.setRefreshing(false);
        this.swipeContainer.setEnabled(true);
    }
}
