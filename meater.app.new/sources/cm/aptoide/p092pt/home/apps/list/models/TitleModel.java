package cm.aptoide.p092pt.home.apps.list.models;

import android.view.View;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
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

/* compiled from: TitleModel.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/TitleModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/pt/home/apps/list/models/TitleModel$Holder;", "()V", "eventSubject", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "getEventSubject", "()Lrx/subjects/PublishSubject;", "setEventSubject", "(Lrx/subjects/PublishSubject;)V", "shouldShowButton", HttpUrl.FRAGMENT_ENCODE_SET, "getShouldShowButton", "()Z", "setShouldShowButton", "(Z)V", "title", HttpUrl.FRAGMENT_ENCODE_SET, "getTitle", "()Ljava/lang/Integer;", "setTitle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "Holder", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class TitleModel extends AbstractC5167t<Holder> {
    private C11418b<Void> eventSubject;
    private boolean shouldShowButton;
    private Integer title;

    /* compiled from: TitleModel.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, m32267d2 = {"Lcm/aptoide/pt/home/apps/list/models/TitleModel$Holder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "button", "Landroid/widget/TextView;", "getButton", "()Landroid/widget/TextView;", "button$delegate", "Lkotlin/properties/ReadOnlyProperty;", "title", "getTitle", "title$delegate", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Holder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9790g0.m32304h(new C9819y(Holder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), C9790g0.m32304h(new C9819y(Holder.class, "button", "getButton()Landroid/widget/TextView;", 0))};
        private final ReadOnlyProperty title$delegate = bind(C1146R.id.apps_header_title);
        private final ReadOnlyProperty button$delegate = bind(C1146R.id.apps_header_button);

        public final TextView getButton() {
            return (TextView) this.button$delegate.mo6183a(this, $$delegatedProperties[1]);
        }

        public final TextView getTitle() {
            return (TextView) this.title$delegate.mo6183a(this, $$delegatedProperties[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bind$lambda-1, reason: not valid java name */
    public static final void m40839bind$lambda1(TitleModel titleModel, View view) {
        C9801m.m32346f(titleModel, "this$0");
        C11418b<Void> c11418b = titleModel.eventSubject;
        if (c11418b != null) {
            c11418b.onNext(null);
        }
    }

    public final C11418b<Void> getEventSubject() {
        return this.eventSubject;
    }

    public final boolean getShouldShowButton() {
        return this.shouldShowButton;
    }

    public final Integer getTitle() {
        return this.title;
    }

    public final void setEventSubject(C11418b<Void> c11418b) {
        this.eventSubject = c11418b;
    }

    public final void setShouldShowButton(boolean z) {
        this.shouldShowButton = z;
    }

    public final void setTitle(Integer num) {
        this.title = num;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void bind(Holder holder) {
        C9801m.m32346f(holder, "holder");
        Integer num = this.title;
        if (num != null) {
            holder.getTitle().setText(holder.getItemView().getContext().getString(num.intValue()));
        }
        if (this.shouldShowButton) {
            holder.getButton().setVisibility(0);
        } else {
            holder.getButton().setVisibility(8);
        }
        holder.getButton().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.apps.list.models.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TitleModel.m40839bind$lambda1(this.f9414f, view);
            }
        });
    }
}
