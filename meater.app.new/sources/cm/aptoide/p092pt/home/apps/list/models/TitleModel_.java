package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.apps.list.models.TitleModel;
import com.airbnb.epoxy.AbstractC5153n;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.C5168u;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;
import com.airbnb.epoxy.InterfaceC5169v;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class TitleModel_ extends TitleModel implements InterfaceC5169v<TitleModel.Holder>, TitleModelBuilder {
    private InterfaceC5138f0<TitleModel_, TitleModel.Holder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5142h0<TitleModel_, TitleModel.Holder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5144i0<TitleModel_, TitleModel.Holder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5146j0<TitleModel_, TitleModel.Holder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof TitleModel_) || !super.equals(obj)) {
            return false;
        }
        TitleModel_ titleModel_ = (TitleModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (titleModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (titleModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (titleModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (titleModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getTitle() == null ? titleModel_.getTitle() != null : !getTitle().equals(titleModel_.getTitle())) {
            return false;
        }
        if (getShouldShowButton() != titleModel_.getShouldShowButton()) {
            return false;
        }
        return (getEventSubject() == null) == (titleModel_.getEventSubject() == null);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder eventSubject(C11418b c11418b) {
        return eventSubject((C11418b<Void>) c11418b);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    protected int getDefaultLayout() {
        return C1146R.layout.apps_header_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getTitle() != null ? getTitle().hashCode() : 0)) * 31) + (getShouldShowButton() ? 1 : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onBind(InterfaceC5138f0 interfaceC5138f0) {
        return onBind((InterfaceC5138f0<TitleModel_, TitleModel.Holder>) interfaceC5138f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onUnbind(InterfaceC5142h0 interfaceC5142h0) {
        return onUnbind((InterfaceC5142h0<TitleModel_, TitleModel.Holder>) interfaceC5142h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onVisibilityChanged(InterfaceC5144i0 interfaceC5144i0) {
        return onVisibilityChanged((InterfaceC5144i0<TitleModel_, TitleModel.Holder>) interfaceC5144i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onVisibilityStateChanged(InterfaceC5146j0 interfaceC5146j0) {
        return onVisibilityStateChanged((InterfaceC5146j0<TitleModel_, TitleModel.Holder>) interfaceC5146j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public String toString() {
        return "TitleModel_{title=" + getTitle() + ", shouldShowButton=" + getShouldShowButton() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.AbstractC5167t
    public TitleModel.Holder createNewHolder() {
        return new TitleModel.Holder();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ eventSubject(C11418b<Void> c11418b) {
        onMutation();
        super.setEventSubject(c11418b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePostBind(TitleModel.Holder holder, int i2) {
        InterfaceC5138f0<TitleModel_, TitleModel.Holder> interfaceC5138f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5138f0 != null) {
            interfaceC5138f0.m9291a(this, holder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePreBind(C5168u c5168u, TitleModel.Holder holder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public TitleModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onBind(InterfaceC5138f0<TitleModel_, TitleModel.Holder> interfaceC5138f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5138f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onUnbind(InterfaceC5142h0<TitleModel_, TitleModel.Holder> interfaceC5142h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5142h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public TitleModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setTitle(null);
        super.setShouldShowButton(false);
        super.setEventSubject(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ shouldShowButton(boolean z) {
        onMutation();
        super.setShouldShowButton(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ title(Integer num) {
        onMutation();
        super.setTitle(num);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public TitleModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public TitleModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public TitleModel_ spanSizeOverride(AbstractC5166s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void unbind(TitleModel.Holder holder) {
        super.unbind((TitleModel_) holder);
        InterfaceC5142h0<TitleModel_, TitleModel.Holder> interfaceC5142h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5142h0 != null) {
            interfaceC5142h0.m9296a(this, holder);
        }
    }

    public C11418b<Void> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, TitleModel.Holder holder) {
        InterfaceC5144i0<TitleModel_, TitleModel.Holder> interfaceC5144i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5144i0 != null) {
            interfaceC5144i0.m9298a(this, holder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) holder);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, TitleModel.Holder holder) {
        InterfaceC5146j0<TitleModel_, TitleModel.Holder> interfaceC5146j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5146j0 != null) {
            interfaceC5146j0.m9300a(this, holder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) holder);
    }

    public boolean shouldShowButton() {
        return super.getShouldShowButton();
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public TitleModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer title() {
        return super.getTitle();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onVisibilityChanged(InterfaceC5144i0<TitleModel_, TitleModel.Holder> interfaceC5144i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5144i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onVisibilityStateChanged(InterfaceC5146j0<TitleModel_, TitleModel.Holder> interfaceC5146j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5146j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8031id(long j2) {
        super.mo8031id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8036id(Number... numberArr) {
        super.mo8036id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8032id(long j2, long j3) {
        super.mo8032id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8033id(CharSequence charSequence) {
        super.mo8033id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8035id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8035id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8034id(CharSequence charSequence, long j2) {
        super.mo8034id(charSequence, j2);
        return this;
    }
}
