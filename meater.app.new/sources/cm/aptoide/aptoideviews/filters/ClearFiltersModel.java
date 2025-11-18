package cm.aptoide.aptoideviews.filters;

import android.view.View;
import android.widget.Button;
import androidx.core.content.C0255a;
import cm.aptoide.aptoideviews.C1103R;
import cm.aptoide.aptoideviews.filters.FilterEventListener;
import com.airbnb.epoxy.AbstractC5167t;
import kotlin.Metadata;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import p241e.p247c.p248a.p249a.p250a.base.BaseViewHolder;

/* compiled from: ClearFiltersModel.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/ClearFiltersModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/aptoideviews/filters/ClearFiltersModel$CardHolder;", "()V", "eventListener", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "getEventListener", "()Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "setEventListener", "(Lcm/aptoide/aptoideviews/filters/FilterEventListener;)V", "textColorStateList", HttpUrl.FRAGMENT_ENCODE_SET, "getTextColorStateList", "()Ljava/lang/Integer;", "setTextColorStateList", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bind", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "getDefaultLayout", "CardHolder", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class ClearFiltersModel extends AbstractC5167t<CardHolder> {
    private FilterEventListener eventListener;
    private Integer textColorStateList;

    /* compiled from: ClearFiltersModel.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/ClearFiltersModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "clearButton", "Landroid/widget/Button;", "getClearButton", "()Landroid/widget/Button;", "clearButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class CardHolder extends BaseViewHolder {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C9790g0.m32304h(new C9819y(CardHolder.class, "clearButton", "getClearButton()Landroid/widget/Button;", 0))};
        private final ReadOnlyProperty clearButton$delegate = bind(C1103R.id.clear_button);

        public final Button getClearButton() {
            return (Button) this.clearButton$delegate.mo6183a(this, $$delegatedProperties[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bind$lambda-0, reason: not valid java name */
    public static final void m40681bind$lambda0(ClearFiltersModel clearFiltersModel, View view) {
        C9801m.m32346f(clearFiltersModel, "this$0");
        FilterEventListener filterEventListener = clearFiltersModel.eventListener;
        if (filterEventListener != null) {
            filterEventListener.onFilterEvent(FilterEventListener.EventType.CLEAR_EVENT_CLICK, null);
        }
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    protected int getDefaultLayout() {
        return C1103R.layout.clear_filters_item;
    }

    public final FilterEventListener getEventListener() {
        return this.eventListener;
    }

    public final Integer getTextColorStateList() {
        return this.textColorStateList;
    }

    public final void setEventListener(FilterEventListener filterEventListener) {
        this.eventListener = filterEventListener;
    }

    public final void setTextColorStateList(Integer num) {
        this.textColorStateList = num;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void bind(CardHolder holder) {
        C9801m.m32346f(holder, "holder");
        super.bind((ClearFiltersModel) holder);
        holder.getClearButton().setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.aptoideviews.filters.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClearFiltersModel.m40681bind$lambda0(this.f7150f, view);
            }
        });
        Integer num = this.textColorStateList;
        if (num != null) {
            holder.getClearButton().setTextColor(C0255a.m1676e(holder.getItemView().getContext(), num.intValue()));
        }
    }
}
