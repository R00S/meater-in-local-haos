package cm.aptoide.p092pt.download.view.outofspace;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
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

/* compiled from: InstalledAppCardModel.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModel$CardHolder;", "()V", "application", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "getApplication", "()Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "setApplication", "(Lcm/aptoide/pt/download/view/outofspace/InstalledApp;)V", "eventSubject", "Lrx/subjects/PublishSubject;", HttpUrl.FRAGMENT_ENCODE_SET, "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "handleUninstallClick", "app", "CardHolder", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class InstalledAppCardModel extends AbstractC5167t<CardHolder> {
    private InstalledApp application;
    private C11418b<String> eventSubject;

    /* compiled from: InstalledAppCardModel.kt */
    @Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0011\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, m32267d2 = {"Lcm/aptoide/pt/download/view/outofspace/InstalledAppCardModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "appIcon", "Landroid/widget/ImageView;", "getAppIcon", "()Landroid/widget/ImageView;", "appIcon$delegate", "Lkotlin/properties/ReadOnlyProperty;", "appSize", "Landroid/widget/TextView;", "getAppSize", "()Landroid/widget/TextView;", "appSize$delegate", "name", "getName", "name$delegate", "uninstallButton", "getUninstallButton", "uninstallButton$delegate", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class CardHolder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9790g0.m32304h(new C9819y(CardHolder.class, "appIcon", "getAppIcon()Landroid/widget/ImageView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "name", "getName()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "appSize", "getAppSize()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(CardHolder.class, "uninstallButton", "getUninstallButton()Landroid/widget/TextView;", 0))};
        private final ReadOnlyProperty appIcon$delegate = bind(C1146R.id.app_icon);
        private final ReadOnlyProperty name$delegate = bind(C1146R.id.app_name);
        private final ReadOnlyProperty appSize$delegate = bind(C1146R.id.app_size);
        private final ReadOnlyProperty uninstallButton$delegate = bind(C1146R.id.uninstall_button);

        public final ImageView getAppIcon() {
            return (ImageView) this.appIcon$delegate.mo6183a(this, $$delegatedProperties[0]);
        }

        public final TextView getAppSize() {
            return (TextView) this.appSize$delegate.mo6183a(this, $$delegatedProperties[2]);
        }

        public final TextView getName() {
            return (TextView) this.name$delegate.mo6183a(this, $$delegatedProperties[1]);
        }

        public final TextView getUninstallButton() {
            return (TextView) this.uninstallButton$delegate.mo6183a(this, $$delegatedProperties[3]);
        }
    }

    private final void handleUninstallClick(CardHolder holder, final InstalledApp app) {
        holder.getUninstallButton().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.download.view.outofspace.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstalledAppCardModel.m40788handleUninstallClick$lambda1(this.f8710f, app, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleUninstallClick$lambda-1, reason: not valid java name */
    public static final void m40788handleUninstallClick$lambda1(InstalledAppCardModel installedAppCardModel, InstalledApp installedApp, View view) {
        C9801m.m32346f(installedAppCardModel, "this$0");
        C9801m.m32346f(installedApp, "$app");
        C11418b<String> c11418b = installedAppCardModel.eventSubject;
        if (c11418b != null) {
            c11418b.onNext(installedApp.getPackageName());
        }
    }

    public final InstalledApp getApplication() {
        return this.application;
    }

    public final C11418b<String> getEventSubject() {
        return this.eventSubject;
    }

    public final void setApplication(InstalledApp installedApp) {
        this.application = installedApp;
    }

    public final void setEventSubject(C11418b<String> c11418b) {
        this.eventSubject = c11418b;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void bind(CardHolder holder) {
        C9801m.m32346f(holder, "holder");
        InstalledApp installedApp = this.application;
        if (installedApp != null) {
            holder.getName().setText(installedApp.getAppName());
            ImageLoader.with(holder.getItemView().getContext()).load(installedApp.getIcon(), holder.getAppIcon());
            holder.getAppSize().setText(AptoideUtils.StringU.formatBytes(installedApp.getSize(), false));
            handleUninstallClick(holder, installedApp);
        }
    }
}
