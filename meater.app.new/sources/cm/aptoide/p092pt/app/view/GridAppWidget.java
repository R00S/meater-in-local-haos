package cm.aptoide.p092pt.app.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.GridAppDisplayable;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.home.AppSecondaryInfoViewHolder;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import java.text.DecimalFormat;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class GridAppWidget<T extends GridAppDisplayable> extends Widget<T> {
    private AppSecondaryInfoViewHolder appInfoViewHolder;
    private ImageView icon;
    private TextView name;
    private String storeName;

    public GridAppWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$newOnClickListener$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7277a(long j2, App app, GridAppDisplayable gridAppDisplayable, Void r12) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(j2, app.getPackageName(), app.getStore().getAppearance().getTheme(), this.storeName, gridAppDisplayable.getTag()), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.name = (TextView) this.itemView.findViewById(C1146R.id.name);
        this.icon = (ImageView) this.itemView.findViewById(C1146R.id.icon);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(this.itemView, new DecimalFormat("0.0"));
    }

    protected InterfaceC11253b<Void> newOnClickListener(final T t, final App app, final long j2) {
        return new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.md
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7929f.m7277a(j2, app, t, (Void) obj);
            }
        };
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(T t, int i2) {
        App app = (App) t.getPojo();
        long id = app.getId();
        ImageLoader.with(getContext()).load(app.getIcon(), this.icon);
        this.name.setText(app.getName());
        this.appInfoViewHolder.setInfo(app.hasBilling(), app.getStats().getRating().getAvg(), true, false);
        this.storeName = app.getStore().getName();
        this.compositeSubscription.m40667a(C8975a.m28573a(this.itemView).m40063H0(newOnClickListener(t, app, id), new InterfaceC11253b() { // from class: cm.aptoide.pt.app.view.nd
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
