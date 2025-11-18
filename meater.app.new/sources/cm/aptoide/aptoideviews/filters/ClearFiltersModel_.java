package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.ClearFiltersModel;
import com.airbnb.epoxy.AbstractC5153n;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.C5168u;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;
import com.airbnb.epoxy.InterfaceC5169v;

/* loaded from: classes.dex */
public class ClearFiltersModel_ extends ClearFiltersModel implements InterfaceC5169v<ClearFiltersModel.CardHolder>, ClearFiltersModelBuilder {
    private InterfaceC5138f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5142h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5144i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5146j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof ClearFiltersModel_) || !super.equals(obj)) {
            return false;
        }
        ClearFiltersModel_ clearFiltersModel_ = (ClearFiltersModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((getEventListener() == null) != (clearFiltersModel_.getEventListener() == null)) {
            return false;
        }
        return (getTextColorStateList() == null) == (clearFiltersModel_.getTextColorStateList() == null);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getEventListener() != null ? 1 : 0)) * 31) + (getTextColorStateList() == null ? 0 : 1);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onBind(InterfaceC5138f0 interfaceC5138f0) {
        return onBind((InterfaceC5138f0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5138f0);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onUnbind(InterfaceC5142h0 interfaceC5142h0) {
        return onUnbind((InterfaceC5142h0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5142h0);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onVisibilityChanged(InterfaceC5144i0 interfaceC5144i0) {
        return onVisibilityChanged((InterfaceC5144i0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5144i0);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onVisibilityStateChanged(InterfaceC5146j0 interfaceC5146j0) {
        return onVisibilityStateChanged((InterfaceC5146j0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5146j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public String toString() {
        return "ClearFiltersModel_{eventListener=" + getEventListener() + ", textColorStateList=" + getTextColorStateList() + "}" + super.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.AbstractC5167t
    public ClearFiltersModel.CardHolder createNewHolder() {
        return new ClearFiltersModel.CardHolder();
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ eventListener(FilterEventListener filterEventListener) {
        onMutation();
        super.setEventListener(filterEventListener);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePostBind(ClearFiltersModel.CardHolder cardHolder, int i2) {
        InterfaceC5138f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5138f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5138f0 != null) {
            interfaceC5138f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePreBind(C5168u c5168u, ClearFiltersModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public ClearFiltersModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onBind(InterfaceC5138f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5138f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5138f0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onUnbind(InterfaceC5142h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5142h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5142h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public ClearFiltersModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setEventListener(null);
        super.setTextColorStateList(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ textColorStateList(Integer num) {
        onMutation();
        super.setTextColorStateList(num);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public ClearFiltersModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ spanSizeOverride(AbstractC5166s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void unbind(ClearFiltersModel.CardHolder cardHolder) {
        super.unbind((ClearFiltersModel_) cardHolder);
        InterfaceC5142h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5142h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5142h0 != null) {
            interfaceC5142h0.m9296a(this, cardHolder);
        }
    }

    public FilterEventListener eventListener() {
        return super.getEventListener();
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, ClearFiltersModel.CardHolder cardHolder) {
        InterfaceC5144i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5144i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5144i0 != null) {
            interfaceC5144i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, ClearFiltersModel.CardHolder cardHolder) {
        InterfaceC5146j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5146j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5146j0 != null) {
            interfaceC5146j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public ClearFiltersModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer textColorStateList() {
        return super.getTextColorStateList();
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onVisibilityChanged(InterfaceC5144i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5144i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5144i0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onVisibilityStateChanged(InterfaceC5146j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5146j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5146j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo8024id(long j2) {
        super.mo8024id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo8029id(Number... numberArr) {
        super.mo8029id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo8025id(long j2, long j3) {
        super.mo8025id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo8026id(CharSequence charSequence) {
        super.mo8026id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo8028id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8028id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo8027id(CharSequence charSequence, long j2) {
        super.mo8027id(charSequence, j2);
        return this;
    }
}
