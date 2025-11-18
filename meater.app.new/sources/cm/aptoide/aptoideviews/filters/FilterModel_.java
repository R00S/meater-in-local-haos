package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.FilterModel;
import com.airbnb.epoxy.AbstractC5153n;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.C5168u;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;
import com.airbnb.epoxy.InterfaceC5169v;

/* loaded from: classes.dex */
public class FilterModel_ extends FilterModel implements InterfaceC5169v<FilterModel.CardHolder>, FilterModelBuilder {
    private InterfaceC5138f0<FilterModel_, FilterModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5142h0<FilterModel_, FilterModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5144i0<FilterModel_, FilterModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5146j0<FilterModel_, FilterModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    @Override // com.airbnb.epoxy.AbstractC5166s
    public void addTo(AbstractC5153n abstractC5153n) {
        super.addTo(abstractC5153n);
        addWithDebugValidation(abstractC5153n);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterModel_) || !super.equals(obj)) {
            return false;
        }
        FilterModel_ filterModel_ = (FilterModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (filterModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (filterModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (filterModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (filterModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getFilter() == null ? filterModel_.getFilter() != null : !getFilter().equals(filterModel_.getFilter())) {
            return false;
        }
        if ((getEventListener() == null) != (filterModel_.getEventListener() == null)) {
            return false;
        }
        if ((getTextColorStateList() == null) != (filterModel_.getTextColorStateList() == null)) {
            return false;
        }
        return (getBackgroundRes() == null) == (filterModel_.getBackgroundRes() == null);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getFilter() != null ? getFilter().hashCode() : 0)) * 31) + (getEventListener() != null ? 1 : 0)) * 31) + (getTextColorStateList() != null ? 1 : 0)) * 31) + (getBackgroundRes() == null ? 0 : 1);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onBind(InterfaceC5138f0 interfaceC5138f0) {
        return onBind((InterfaceC5138f0<FilterModel_, FilterModel.CardHolder>) interfaceC5138f0);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onUnbind(InterfaceC5142h0 interfaceC5142h0) {
        return onUnbind((InterfaceC5142h0<FilterModel_, FilterModel.CardHolder>) interfaceC5142h0);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onVisibilityChanged(InterfaceC5144i0 interfaceC5144i0) {
        return onVisibilityChanged((InterfaceC5144i0<FilterModel_, FilterModel.CardHolder>) interfaceC5144i0);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onVisibilityStateChanged(InterfaceC5146j0 interfaceC5146j0) {
        return onVisibilityStateChanged((InterfaceC5146j0<FilterModel_, FilterModel.CardHolder>) interfaceC5146j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public String toString() {
        return "FilterModel_{filter=" + getFilter() + ", eventListener=" + getEventListener() + ", textColorStateList=" + getTextColorStateList() + ", backgroundRes=" + getBackgroundRes() + "}" + super.toString();
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ backgroundRes(Integer num) {
        onMutation();
        super.setBackgroundRes(num);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.AbstractC5167t
    public FilterModel.CardHolder createNewHolder() {
        return new FilterModel.CardHolder();
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ eventListener(FilterEventListener filterEventListener) {
        onMutation();
        super.setEventListener(filterEventListener);
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ filter(Filter filter) {
        onMutation();
        super.setFilter(filter);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePostBind(FilterModel.CardHolder cardHolder, int i2) {
        InterfaceC5138f0<FilterModel_, FilterModel.CardHolder> interfaceC5138f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5138f0 != null) {
            interfaceC5138f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePreBind(C5168u c5168u, FilterModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public FilterModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onBind(InterfaceC5138f0<FilterModel_, FilterModel.CardHolder> interfaceC5138f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5138f0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onUnbind(InterfaceC5142h0<FilterModel_, FilterModel.CardHolder> interfaceC5142h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5142h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public FilterModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setFilter(null);
        super.setEventListener(null);
        super.setTextColorStateList(null);
        super.setBackgroundRes(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ textColorStateList(Integer num) {
        onMutation();
        super.setTextColorStateList(num);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public FilterModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public FilterModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public FilterModel_ spanSizeOverride(AbstractC5166s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void unbind(FilterModel.CardHolder cardHolder) {
        super.unbind((FilterModel_) cardHolder);
        InterfaceC5142h0<FilterModel_, FilterModel.CardHolder> interfaceC5142h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5142h0 != null) {
            interfaceC5142h0.m9296a(this, cardHolder);
        }
    }

    public Integer backgroundRes() {
        return super.getBackgroundRes();
    }

    public FilterEventListener eventListener() {
        return super.getEventListener();
    }

    public Filter filter() {
        return super.getFilter();
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, FilterModel.CardHolder cardHolder) {
        InterfaceC5144i0<FilterModel_, FilterModel.CardHolder> interfaceC5144i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5144i0 != null) {
            interfaceC5144i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, FilterModel.CardHolder cardHolder) {
        InterfaceC5146j0<FilterModel_, FilterModel.CardHolder> interfaceC5146j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5146j0 != null) {
            interfaceC5146j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public FilterModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer textColorStateList() {
        return super.getTextColorStateList();
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onVisibilityChanged(InterfaceC5144i0<FilterModel_, FilterModel.CardHolder> interfaceC5144i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5144i0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onVisibilityStateChanged(InterfaceC5146j0<FilterModel_, FilterModel.CardHolder> interfaceC5146j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5146j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6794id(long j2) {
        super.mo6794id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6799id(Number... numberArr) {
        super.mo6799id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6795id(long j2, long j3) {
        super.mo6795id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6796id(CharSequence charSequence) {
        super.mo6796id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6798id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo6798id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6797id(CharSequence charSequence, long j2) {
        super.mo6797id(charSequence, j2);
        return this;
    }
}
