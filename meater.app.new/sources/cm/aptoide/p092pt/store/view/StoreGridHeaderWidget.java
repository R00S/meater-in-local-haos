package cm.aptoide.p092pt.store.view;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.dataprovider.util.CommentType;
import cm.aptoide.p092pt.store.view.StoreGridHeaderDisplayable;
import cm.aptoide.p092pt.view.Translator;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class StoreGridHeaderWidget extends Widget<StoreGridHeaderDisplayable> {
    private Button more;
    private TextView title;

    public StoreGridHeaderWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8821a(GetStoreWidgets.WSWidget wSWidget, StoreGridHeaderDisplayable.Model model, SharedPreferences sharedPreferences, StoreGridHeaderDisplayable storeGridHeaderDisplayable, Void r12) {
        Event event = wSWidget.getActions().get(0).getEvent();
        String storeTheme = model.getStoreTheme();
        String tag = model.getTag();
        StoreContext storeContext = model.getStoreContext();
        String title = wSWidget.getTitle();
        if (event.getName() != Event.Name.listComments) {
            storeGridHeaderDisplayable.getStoreTabNavigator().navigateToStoreTabGridRecyclerView(event, title, storeTheme, tag, storeContext, true);
        } else {
            String action = event.getAction();
            storeGridHeaderDisplayable.getStoreTabNavigator().navigateToCommentGridRecyclerView(CommentType.STORE, action != null ? replaceActionUrl(action, sharedPreferences) : null, "View Comments", storeContext);
        }
    }

    private String replaceActionUrl(String str, SharedPreferences sharedPreferences) {
        return AbstractC2229V7.isUrlBaseCache(str) ? str.replace(AbstractC2229V7.getCacheHost(sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET) : str.replace(AbstractC2229V7.getHost(sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.title = (TextView) view.findViewById(C1146R.id.title);
        this.more = (Button) view.findViewById(C1146R.id.more);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final StoreGridHeaderDisplayable storeGridHeaderDisplayable, int i2) {
        final GetStoreWidgets.WSWidget wsWidget = storeGridHeaderDisplayable.getWsWidget();
        boolean zHasActions = wsWidget.hasActions();
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        String marketName = storeGridHeaderDisplayable.getMarketName();
        final SharedPreferences defaultSharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.title.setText(Translator.translate(wsWidget.getTitle(), getContext().getApplicationContext(), marketName));
        final StoreGridHeaderDisplayable.Model model = storeGridHeaderDisplayable.getModel();
        this.more.setTextColor(storeGridHeaderDisplayable.getTextColor());
        this.more.setVisibility((zHasActions && model.isMoreVisible()) ? 0 : 8);
        if (zHasActions) {
            this.compositeSubscription.m40667a(C8975a.m28573a(this.more).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.q1
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11412f.m8821a(wsWidget, model, defaultSharedPreferences, storeGridHeaderDisplayable, (Void) obj);
                }
            }));
        }
    }
}
