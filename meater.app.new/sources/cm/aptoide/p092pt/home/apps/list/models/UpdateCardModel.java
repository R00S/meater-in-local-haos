package cm.aptoide.p092pt.home.apps.list.models;

import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0216d;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.themes.ThemeManager;
import com.airbnb.epoxy.AbstractC5164q;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.AbstractC5167t;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import p241e.p247c.p248a.p249a.p250a.base.BaseViewHolder;
import p456rx.p473s.C11418b;

/* compiled from: UpdateCardModel.kt */
@Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J(\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "getApplication", "()Lcm/aptoide/pt/home/apps/model/UpdateApp;", "setApplication", "(Lcm/aptoide/pt/home/apps/model/UpdateApp;)V", "eventSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "setThemeManager", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "previouslyBoundModel", "Lcom/airbnb/epoxy/EpoxyModel;", "processDownload", "app", "setDownloadViewVisibility", "visible", HttpUrl.FRAGMENT_ENCODE_SET, "error", "setupListeners", "CardHolder", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class UpdateCardModel extends AbstractC5167t<CardHolder> {
    private UpdateApp application;
    private C11418b<AppClick> eventSubject;
    private ThemeManager themeManager;

    /* compiled from: UpdateCardModel.kt */
    @Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R\u001b\u0010\u001e\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0014R\u001b\u0010!\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/UpdateCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "actionButton", "Landroid/widget/ImageView;", "getActionButton", "()Landroid/widget/ImageView;", "actionButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "appIcon", "getAppIcon", "appIcon$delegate", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "getDownloadProgressView", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "downloadProgressView$delegate", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "name$delegate", "rootLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRootLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rootLayout$delegate", "secondaryIcon", "getSecondaryIcon", "secondaryIcon$delegate", "secondaryText", "getSecondaryText", "secondaryText$delegate", "tertiaryText", "getTertiaryText", "tertiaryText$delegate", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class CardHolder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9790g0.m32304h(new C9819y(CardHolder.class, "name", "getName()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "appIcon", "getAppIcon()Landroid/widget/ImageView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "secondaryText", "getSecondaryText()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "secondaryIcon", "getSecondaryIcon()Landroid/widget/ImageView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "tertiaryText", "getTertiaryText()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "actionButton", "getActionButton()Landroid/widget/ImageView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "downloadProgressView", "getDownloadProgressView()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "rootLayout", "getRootLayout()Landroidx/constraintlayout/widget/ConstraintLayout;", 0))};
        private final ReadOnlyProperty name$delegate = bind(C1146R.id.apps_app_name);
        private final ReadOnlyProperty appIcon$delegate = bind(C1146R.id.apps_app_icon);
        private final ReadOnlyProperty secondaryText$delegate = bind(C1146R.id.apps_secondary_text);
        private final ReadOnlyProperty secondaryIcon$delegate = bind(C1146R.id.secondary_icon);
        private final ReadOnlyProperty tertiaryText$delegate = bind(C1146R.id.apps_tertiary_text);
        private final ReadOnlyProperty actionButton$delegate = bind(C1146R.id.apps_action_button);
        private final ReadOnlyProperty downloadProgressView$delegate = bind(C1146R.id.download_progress_view);
        private final ReadOnlyProperty rootLayout$delegate = bind(C1146R.id.root_layout);

        public final ImageView getActionButton() {
            return (ImageView) this.actionButton$delegate.mo6183a(this, $$delegatedProperties[5]);
        }

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo6183a(this, $$delegatedProperties[1]);
        }

        public final DownloadProgressView getDownloadProgressView() {
            return (DownloadProgressView) this.downloadProgressView$delegate.mo6183a(this, $$delegatedProperties[6]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo6183a(this, $$delegatedProperties[0]);
        }

        public final ConstraintLayout getRootLayout() {
            return (ConstraintLayout) this.rootLayout$delegate.mo6183a(this, $$delegatedProperties[7]);
        }

        public final ImageView getSecondaryIcon() {
            return (ImageView) this.secondaryIcon$delegate.mo6183a(this, $$delegatedProperties[3]);
        }

        public final TextView getSecondaryText() {
            return (TextView) this.secondaryText$delegate.mo6183a(this, $$delegatedProperties[2]);
        }

        public final TextView getTertiaryText() {
            return (TextView) this.tertiaryText$delegate.mo6183a(this, $$delegatedProperties[4]);
        }
    }

    /* compiled from: UpdateCardModel.kt */
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

    private final void processDownload(CardHolder holder, UpdateApp app) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        StateApp.Status status = app.getStatus();
        switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
            case 1:
                setDownloadViewVisibility(holder, app, true, false);
                holder.getDownloadProgressView().startDownload();
                break;
            case 2:
                setDownloadViewVisibility(holder, app, true, false);
                holder.getDownloadProgressView().startInstallation();
                break;
            case 3:
                setDownloadViewVisibility(holder, app, true, false);
                holder.getDownloadProgressView().pauseDownload();
                break;
            case 4:
                setDownloadViewVisibility(holder, app, false, true);
                break;
            case 5:
                holder.getDownloadProgressView().reset();
                setDownloadViewVisibility(holder, app, true, false);
                break;
            case 6:
                holder.getDownloadProgressView().reset();
                setDownloadViewVisibility(holder, app, false, false);
                break;
        }
        holder.getDownloadProgressView().setProgress(app.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDownloadViewVisibility(CardHolder holder, UpdateApp app, boolean visible, boolean error) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        TypedValue attributeForTheme;
        if (visible) {
            holder.getDownloadProgressView().setVisibility(0);
            holder.getSecondaryIcon().setVisibility(8);
            holder.getSecondaryText().setVisibility(8);
            holder.getTertiaryText().setVisibility(8);
            holder.getActionButton().setVisibility(4);
            C0216d c0216d = new C0216d();
            c0216d.m1369f(holder.getRootLayout());
            c0216d.m1371h(C1146R.id.apps_app_name, 4, C1146R.id.apps_app_icon, 4);
            c0216d.m1371h(C1146R.id.apps_app_name, 3, C1146R.id.apps_app_icon, 3);
            c0216d.m1374p(C1146R.id.apps_app_name, 0.0f);
            c0216d.m1366c(holder.getRootLayout());
        } else {
            holder.getDownloadProgressView().setVisibility(8);
            holder.getSecondaryIcon().setVisibility(0);
            holder.getSecondaryText().setVisibility(0);
            holder.getTertiaryText().setVisibility(app.isInstalledWithAptoide() ? 0 : 8);
            holder.getActionButton().setVisibility(0);
            C0216d c0216d2 = new C0216d();
            c0216d2.m1369f(holder.getRootLayout());
            c0216d2.m1371h(C1146R.id.apps_app_name, 4, C1146R.id.apps_secondary_text, 3);
            c0216d2.m1371h(C1146R.id.apps_app_name, 3, holder.getRootLayout().getId(), 3);
            c0216d2.m1374p(C1146R.id.apps_app_name, 0.5f);
            c0216d2.m1366c(holder.getRootLayout());
        }
        if (error) {
            holder.getSecondaryIcon().setImageResource(C1146R.drawable.ic_error_outline_red);
            holder.getSecondaryText().setText(C1146R.string.apps_short_error_download);
            holder.getSecondaryText().setTextAppearance(holder.getItemView().getContext(), C1146R.style.Aptoide_TextView_Medium_XS_Red700);
        } else {
            ThemeManager themeManager = this.themeManager;
            if (themeManager != null && (attributeForTheme = themeManager.getAttributeForTheme(C1146R.attr.version_refresh_icon)) != null) {
                holder.getSecondaryIcon().setImageResource(attributeForTheme.resourceId);
            }
            holder.getSecondaryText().setText(app.getVersion());
            holder.getSecondaryText().setTextAppearance(holder.getItemView().getContext(), C1146R.style.Aptoide_TextView_Medium_XS_Grey);
        }
    }

    private final void setupListeners(final CardHolder holder, final UpdateApp app) {
        holder.getActionButton().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateCardModel.m40840setupListeners$lambda1(this.f9417f, app, view);
            }
        });
        holder.getItemView().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UpdateCardModel.m40841setupListeners$lambda2(this.f9419f, app, view);
            }
        });
        holder.getItemView().setOnLongClickListener(new View.OnLongClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return UpdateCardModel.m40842setupListeners$lambda3(this.f9415f, app, view);
            }
        });
        holder.getDownloadProgressView().setEventListener(new DownloadEventListener() { // from class: cm.aptoide.pt.home.apps.list.models.UpdateCardModel.setupListeners.4

            /* compiled from: UpdateCardModel.kt */
            @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
            /* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel$setupListeners$4$WhenMappings */
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
            public void onActionClick(DownloadEventListener.Action action) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                C11418b<AppClick> eventSubject;
                C9801m.m32346f(action, "action");
                int i2 = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
                if (i2 == 1) {
                    C11418b<AppClick> eventSubject2 = UpdateCardModel.this.getEventSubject();
                    if (eventSubject2 != null) {
                        eventSubject2.onNext(new AppClick(app, AppClick.ClickType.CANCEL_CLICK));
                    }
                    UpdateCardModel.this.setDownloadViewVisibility(holder, app, false, false);
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 3 && (eventSubject = UpdateCardModel.this.getEventSubject()) != null) {
                        eventSubject.onNext(new AppClick(app, AppClick.ClickType.PAUSE_CLICK));
                        return;
                    }
                    return;
                }
                C11418b<AppClick> eventSubject3 = UpdateCardModel.this.getEventSubject();
                if (eventSubject3 != null) {
                    eventSubject3.onNext(new AppClick(app, AppClick.ClickType.RESUME_CLICK));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-1, reason: not valid java name */
    public static final void m40840setupListeners$lambda1(UpdateCardModel updateCardModel, UpdateApp updateApp, View view) {
        C9801m.m32346f(updateCardModel, "this$0");
        C9801m.m32346f(updateApp, "$app");
        C11418b<AppClick> c11418b = updateCardModel.eventSubject;
        if (c11418b != null) {
            c11418b.onNext(new AppClick(updateApp, AppClick.ClickType.DOWNLOAD_ACTION_CLICK));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-2, reason: not valid java name */
    public static final void m40841setupListeners$lambda2(UpdateCardModel updateCardModel, UpdateApp updateApp, View view) {
        C9801m.m32346f(updateCardModel, "this$0");
        C9801m.m32346f(updateApp, "$app");
        C11418b<AppClick> c11418b = updateCardModel.eventSubject;
        if (c11418b != null) {
            c11418b.onNext(new AppClick(updateApp, AppClick.ClickType.CARD_CLICK));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-3, reason: not valid java name */
    public static final boolean m40842setupListeners$lambda3(UpdateCardModel updateCardModel, UpdateApp updateApp, View view) {
        C9801m.m32346f(updateCardModel, "this$0");
        C9801m.m32346f(updateApp, "$app");
        C11418b<AppClick> c11418b = updateCardModel.eventSubject;
        if (c11418b == null) {
            return true;
        }
        c11418b.onNext(new AppClick(updateApp, AppClick.ClickType.CARD_LONG_CLICK));
        return true;
    }

    public final UpdateApp getApplication() {
        return this.application;
    }

    public final C11418b<AppClick> getEventSubject() {
        return this.eventSubject;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final void setApplication(UpdateApp updateApp) {
        this.application = updateApp;
    }

    public final void setEventSubject(C11418b<AppClick> c11418b) {
        this.eventSubject = c11418b;
    }

    public final void setThemeManager(ThemeManager themeManager) {
        this.themeManager = themeManager;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t
    public /* bridge */ /* synthetic */ void bind(AbstractC5164q abstractC5164q, AbstractC5166s abstractC5166s) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bind((CardHolder) abstractC5164q, (AbstractC5166s<?>) abstractC5166s);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public /* bridge */ /* synthetic */ void bind(Object obj, AbstractC5166s abstractC5166s) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        bind((CardHolder) obj, (AbstractC5166s<?>) abstractC5166s);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void bind(CardHolder holder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(holder, "holder");
        UpdateApp updateApp = this.application;
        if (updateApp != null) {
            holder.getName().setText(updateApp.getName());
            ImageLoader.with(holder.getItemView().getContext()).load(updateApp.getIcon(), holder.getAppIcon());
            holder.getSecondaryText().setText(updateApp.getVersion());
            setupListeners(holder, updateApp);
            processDownload(holder, updateApp);
        }
    }

    public void bind(CardHolder cardHolder, AbstractC5166s<?> abstractC5166s) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C9801m.m32346f(cardHolder, "holder");
        C9801m.m32346f(abstractC5166s, "previouslyBoundModel");
        UpdateApp updateApp = this.application;
        if (updateApp != null) {
            processDownload(cardHolder, updateApp);
        }
    }
}
