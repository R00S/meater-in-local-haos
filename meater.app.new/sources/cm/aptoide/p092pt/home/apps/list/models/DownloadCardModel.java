package cm.aptoide.p092pt.home.apps.list.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.aptoideviews.common.Debouncer;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import com.airbnb.epoxy.AbstractC5164q;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.AbstractC5167t;
import kotlin.Metadata;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import p241e.p247c.p248a.p249a.p250a.base.BaseViewHolder;
import p456rx.p473s.C11418b;

/* compiled from: DownloadCardModel.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J \u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/DownloadCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/DownloadCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/model/DownloadApp;", "getApplication", "()Lcm/aptoide/pt/home/apps/model/DownloadApp;", "setApplication", "(Lcm/aptoide/pt/home/apps/model/DownloadApp;)V", "debouncer", "Lcm/aptoide/aptoideviews/common/Debouncer;", "eventSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "previouslyBoundModel", "Lcom/airbnb/epoxy/EpoxyModel;", "processDownload", "app", "setDownloadViewVisibility", "installed", HttpUrl.FRAGMENT_ENCODE_SET, "error", "setupListeners", "CardHolder", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class DownloadCardModel extends AbstractC5167t<CardHolder> {
    private DownloadApp application;
    private final Debouncer debouncer = new Debouncer(1250);
    private C11418b<AppClick> eventSubject;

    /* compiled from: DownloadCardModel.kt */
    @Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0014\u0010\u0006R\u001b\u0010\u0016\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/DownloadCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "appIcon", "Landroid/widget/ImageView;", "getAppIcon", "()Landroid/widget/ImageView;", "appIcon$delegate", "Lkotlin/properties/ReadOnlyProperty;", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "getDownloadProgressView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "downloadProgressView$delegate", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name$delegate", "secondaryIcon", "getSecondaryIcon", "secondaryIcon$delegate", "secondaryText", "getSecondaryText", "secondaryText$delegate", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class CardHolder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9790g0.m32304h(new C9819y(CardHolder.class, "name", "getName()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "appIcon", "getAppIcon()Landroid/widget/ImageView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "secondaryText", "getSecondaryText()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "secondaryIcon", "getSecondaryIcon()Landroid/widget/ImageView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "downloadProgressView", "getDownloadProgressView()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", 0))};
        private final ReadOnlyProperty name$delegate = bind(C1146R.id.apps_app_name);
        private final ReadOnlyProperty appIcon$delegate = bind(C1146R.id.apps_app_icon);
        private final ReadOnlyProperty secondaryText$delegate = bind(C1146R.id.apps_secondary_text);
        private final ReadOnlyProperty secondaryIcon$delegate = bind(C1146R.id.secondary_icon);
        private final ReadOnlyProperty downloadProgressView$delegate = bind(C1146R.id.download_progress_view);

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo6183a(this, $$delegatedProperties[1]);
        }

        public final DownloadProgressView getDownloadProgressView() {
            return (DownloadProgressView) this.downloadProgressView$delegate.mo6183a(this, $$delegatedProperties[4]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo6183a(this, $$delegatedProperties[0]);
        }

        public final ImageView getSecondaryIcon() {
            return (ImageView) this.secondaryIcon$delegate.mo6183a(this, $$delegatedProperties[3]);
        }

        public final TextView getSecondaryText() {
            return (TextView) this.secondaryText$delegate.mo6183a(this, $$delegatedProperties[2]);
        }
    }

    /* compiled from: DownloadCardModel.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateApp.Status.values().length];
            iArr[StateApp.Status.ACTIVE.ordinal()] = 1;
            iArr[StateApp.Status.INSTALLING.ordinal()] = 2;
            iArr[StateApp.Status.PAUSE.ordinal()] = 3;
            iArr[StateApp.Status.ERROR.ordinal()] = 4;
            iArr[StateApp.Status.IN_QUEUE.ordinal()] = 5;
            iArr[StateApp.Status.STANDBY.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void processDownload(CardHolder holder, DownloadApp app) {
        holder.getDownloadProgressView().setProgress(app.getProgress());
        StateApp.Status status = app.getStatus();
        switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                setDownloadViewVisibility(holder, false, false);
                holder.getDownloadProgressView().startDownload();
                break;
            case 2:
                setDownloadViewVisibility(holder, false, false);
                holder.getDownloadProgressView().startInstallation();
                break;
            case 3:
                setDownloadViewVisibility(holder, false, false);
                holder.getDownloadProgressView().pauseDownload();
                break;
            case 4:
                setDownloadViewVisibility(holder, false, true);
                break;
            case 5:
                holder.getDownloadProgressView().reset();
                setDownloadViewVisibility(holder, false, false);
                break;
            case 6:
                holder.getDownloadProgressView().reset();
                setDownloadViewVisibility(holder, true, false);
                break;
        }
        holder.getDownloadProgressView().setProgress(app.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDownloadViewVisibility(CardHolder holder, boolean installed, boolean error) {
        if (error) {
            holder.getDownloadProgressView().setVisibility(8);
            holder.getSecondaryIcon().setVisibility(0);
            holder.getSecondaryText().setVisibility(0);
            holder.getSecondaryIcon().setImageResource(C1146R.drawable.ic_error_outline_red);
            holder.getSecondaryText().setText(C1146R.string.apps_short_error_download);
            holder.getSecondaryText().setTextAppearance(holder.getItemView().getContext(), C1146R.style.Aptoide_TextView_Medium_XS_Red700);
            return;
        }
        if (!installed) {
            holder.getDownloadProgressView().setVisibility(0);
            holder.getSecondaryIcon().setVisibility(8);
            holder.getSecondaryText().setVisibility(8);
        } else {
            holder.getDownloadProgressView().setVisibility(8);
            holder.getSecondaryIcon().setVisibility(8);
            holder.getSecondaryText().setVisibility(0);
            holder.getSecondaryText().setText(C1146R.string.apps_short_ready_to_install);
            holder.getSecondaryText().setTextAppearance(holder.getItemView().getContext(), C1146R.style.Aptoide_TextView_Regular_XS_BlackAlpha);
        }
    }

    private final void setupListeners(final CardHolder holder, final DownloadApp app) {
        holder.getItemView().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadCardModel.m40838setupListeners$lambda1(this.f9412f, app, view);
            }
        });
        holder.getDownloadProgressView().setEventListener(new DownloadEventListener() { // from class: cm.aptoide.pt.home.apps.list.models.DownloadCardModel.setupListeners.2

            /* compiled from: DownloadCardModel.kt */
            @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
            /* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModel$setupListeners$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
                    iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
                    iArr[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
                    iArr[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener
            public void onActionClick(DownloadEventListener.Action action) {
                C11418b<AppClick> eventSubject;
                C9801m.m32346f(action, "action");
                int i2 = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
                if (i2 == 1) {
                    C11418b<AppClick> eventSubject2 = DownloadCardModel.this.getEventSubject();
                    if (eventSubject2 != null) {
                        eventSubject2.onNext(new AppClick(app, AppClick.ClickType.CANCEL_CLICK));
                    }
                    DownloadCardModel.this.setDownloadViewVisibility(holder, false, false);
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3 && (eventSubject = DownloadCardModel.this.getEventSubject()) != null) {
                        eventSubject.onNext(new AppClick(app, AppClick.ClickType.PAUSE_CLICK));
                        return;
                    }
                    return;
                }
                C11418b<AppClick> eventSubject3 = DownloadCardModel.this.getEventSubject();
                if (eventSubject3 != null) {
                    eventSubject3.onNext(new AppClick(app, AppClick.ClickType.RESUME_CLICK));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-1, reason: not valid java name */
    public static final void m40838setupListeners$lambda1(DownloadCardModel downloadCardModel, DownloadApp downloadApp, View view) {
        C9801m.m32346f(downloadCardModel, "this$0");
        C9801m.m32346f(downloadApp, "$app");
        downloadCardModel.debouncer.execute(new DownloadCardModel$setupListeners$1$1(downloadApp, downloadCardModel));
    }

    public final DownloadApp getApplication() {
        return this.application;
    }

    public final C11418b<AppClick> getEventSubject() {
        return this.eventSubject;
    }

    public final void setApplication(DownloadApp downloadApp) {
        this.application = downloadApp;
    }

    public final void setEventSubject(C11418b<AppClick> c11418b) {
        this.eventSubject = c11418b;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t
    public /* bridge */ /* synthetic */ void bind(AbstractC5164q abstractC5164q, AbstractC5166s abstractC5166s) {
        bind((CardHolder) abstractC5164q, (AbstractC5166s<?>) abstractC5166s);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public /* bridge */ /* synthetic */ void bind(Object obj, AbstractC5166s abstractC5166s) {
        bind((CardHolder) obj, (AbstractC5166s<?>) abstractC5166s);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void bind(CardHolder holder) {
        C9801m.m32346f(holder, "holder");
        DownloadApp downloadApp = this.application;
        if (downloadApp != null) {
            holder.getName().setText(downloadApp.getName());
            ImageLoader.with(holder.getItemView().getContext()).load(downloadApp.getIcon(), holder.getAppIcon());
            holder.getSecondaryText().setText(downloadApp.getVersion());
            setupListeners(holder, downloadApp);
            processDownload(holder, downloadApp);
        }
    }

    public void bind(CardHolder cardHolder, AbstractC5166s<?> abstractC5166s) {
        C9801m.m32346f(cardHolder, "holder");
        C9801m.m32346f(abstractC5166s, "previouslyBoundModel");
        DownloadApp downloadApp = this.application;
        if (downloadApp != null) {
            processDownload(cardHolder, downloadApp);
        }
    }
}
