package cm.aptoide.p092pt.view.recycler.widget;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreDisplays;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.store.view.GridDisplayDisplayable;
import cm.aptoide.p092pt.store.view.StoreTabFragmentChooser;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class GridDisplayWidget extends Widget<GridDisplayDisplayable> {
    private ImageView imageView;

    /* renamed from: cm.aptoide.pt.view.recycler.widget.GridDisplayWidget$1 */
    static /* synthetic */ class C48591 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name;

        static {
            int[] iArr = new int[Event.Name.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name = iArr;
            try {
                iArr[Event.Name.facebook.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.twitch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[Event.Name.youtube.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public GridDisplayWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9005a(GetStoreDisplays.EventImage eventImage, GridDisplayDisplayable gridDisplayDisplayable, Void r9) {
        Event event = eventImage.getEvent();
        Event.Name name = event.getName();
        if (StoreTabFragmentChooser.validateAcceptedName(name)) {
            getFragmentNavigator().navigateTo(StoreTabGridRecyclerFragment.newInstance(event, eventImage.getLabel(), gridDisplayDisplayable.getStoreTheme(), gridDisplayDisplayable.getTag(), gridDisplayDisplayable.getStoreContext(), false), true);
        } else {
            int i2 = C48591.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Event$Name[name.ordinal()];
            sendActionEvent(event.getAction());
        }
    }

    private void sendActionEvent(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.itemView.getContext().startActivity(intent);
        }
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.imageView = (ImageView) view.findViewById(C1146R.id.image_category);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final GridDisplayDisplayable gridDisplayDisplayable, int i2) {
        final GetStoreDisplays.EventImage pojo = gridDisplayDisplayable.getPojo();
        ImageLoader.with(getContext()).load(pojo.getGraphic(), this.imageView);
        this.compositeSubscription.m40667a(C8975a.m28573a(this.imageView).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.view.recycler.widget.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11908f.m9005a(pojo, gridDisplayDisplayable, (Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.view.recycler.widget.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
