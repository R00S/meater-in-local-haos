package cm.aptoide.p092pt.store.view.featured;

import android.view.View;
import android.widget.ImageView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class AppBrickWidget extends Widget<AppBrickDisplayable> {
    private ImageView graphic;

    public AppBrickWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8829a(AppBrickDisplayable appBrickDisplayable, Void r10) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(appBrickDisplayable.getPojo().getId(), appBrickDisplayable.getPojo().getPackageName(), appBrickDisplayable.getPojo().getStore().getAppearance().getTheme(), appBrickDisplayable.getPojo().getStore().getName(), appBrickDisplayable.getTag(), String.valueOf(getAdapterPosition())), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.graphic = (ImageView) view.findViewById(C1146R.id.featured_graphic);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final AppBrickDisplayable appBrickDisplayable, int i2) {
        ImageLoader.with(getContext()).load(appBrickDisplayable.getPojo().getGraphic(), C1146R.attr.placeholder_brick, this.graphic);
        this.compositeSubscription.m40667a(C8975a.m28573a(this.itemView).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.featured.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11332f.m8829a(appBrickDisplayable, (Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.featured.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
