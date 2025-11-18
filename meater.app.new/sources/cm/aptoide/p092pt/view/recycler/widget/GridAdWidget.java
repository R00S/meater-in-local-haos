package cm.aptoide.p092pt.view.recycler.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.view.recycler.displayable.GridAdDisplayable;
import java.text.DecimalFormat;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class GridAdWidget extends Widget<GridAdDisplayable> {
    private ImageView icon;
    private TextView name;
    private TextView rating;

    public GridAdWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9004a(MinimalAd minimalAd, GridAdDisplayable gridAdDisplayable, Void r5) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(new SearchAdResult(minimalAd), gridAdDisplayable.getTag()), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.name = (TextView) view.findViewById(C1146R.id.name);
        this.icon = (ImageView) view.findViewById(C1146R.id.icon);
        this.rating = (TextView) view.findViewById(C1146R.id.rating_label);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final GridAdDisplayable gridAdDisplayable, int i2) {
        final MinimalAd pojo = gridAdDisplayable.getPojo();
        this.name.setText(pojo.getName());
        ImageLoader.with(getContext()).load(pojo.getIconPath(), this.icon);
        this.compositeSubscription.m40667a(C8975a.m28573a(this.itemView).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.recycler.widget.a
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11903f.m9004a(pojo, gridAdDisplayable, (Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.recycler.widget.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
        try {
            this.rating.setText(new DecimalFormat("0.0").format(pojo.getStars()));
        } catch (Exception unused) {
            this.rating.setText(C1146R.string.appcardview_title_no_stars);
        }
    }
}
