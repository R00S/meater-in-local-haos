package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModel;
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
public class InstalledAppCardModel_ extends InstalledAppCardModel implements InterfaceC5169v<InstalledAppCardModel.CardHolder>, InstalledAppCardModelBuilder {
    private InterfaceC5138f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5142h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5144i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5146j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof InstalledAppCardModel_) || !super.equals(obj)) {
            return false;
        }
        InstalledAppCardModel_ installedAppCardModel_ = (InstalledAppCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? installedAppCardModel_.getApplication() == null : getApplication().equals(installedAppCardModel_.getApplication())) {
            return (getEventSubject() == null) == (installedAppCardModel_.getEventSubject() == null);
        }
        return false;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder eventSubject(C11418b c11418b) {
        return eventSubject((C11418b<String>) c11418b);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    protected int getDefaultLayout() {
        return C1146R.layout.out_of_space_installed_app_card;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onBind(InterfaceC5138f0 interfaceC5138f0) {
        return onBind((InterfaceC5138f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5138f0);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onUnbind(InterfaceC5142h0 interfaceC5142h0) {
        return onUnbind((InterfaceC5142h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5142h0);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onVisibilityChanged(InterfaceC5144i0 interfaceC5144i0) {
        return onVisibilityChanged((InterfaceC5144i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5144i0);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onVisibilityStateChanged(InterfaceC5146j0 interfaceC5146j0) {
        return onVisibilityStateChanged((InterfaceC5146j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5146j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public String toString() {
        return "InstalledAppCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ application(InstalledApp installedApp) {
        onMutation();
        super.setApplication(installedApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.AbstractC5167t
    public InstalledAppCardModel.CardHolder createNewHolder() {
        return new InstalledAppCardModel.CardHolder();
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ eventSubject(C11418b<String> c11418b) {
        onMutation();
        super.setEventSubject(c11418b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePostBind(InstalledAppCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5138f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5138f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5138f0 != null) {
            interfaceC5138f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePreBind(C5168u c5168u, InstalledAppCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public InstalledAppCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onBind(InterfaceC5138f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5138f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5138f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onUnbind(InterfaceC5142h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5142h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5142h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public InstalledAppCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication(null);
        super.setEventSubject(null);
        super.reset();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public InstalledAppCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public InstalledAppCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public InstalledAppCardModel_ spanSizeOverride(AbstractC5166s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void unbind(InstalledAppCardModel.CardHolder cardHolder) {
        super.unbind((InstalledAppCardModel_) cardHolder);
        InterfaceC5142h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5142h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5142h0 != null) {
            interfaceC5142h0.m9296a(this, cardHolder);
        }
    }

    public InstalledApp application() {
        return super.getApplication();
    }

    public C11418b<String> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, InstalledAppCardModel.CardHolder cardHolder) {
        InterfaceC5144i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5144i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5144i0 != null) {
            interfaceC5144i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, InstalledAppCardModel.CardHolder cardHolder) {
        InterfaceC5146j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5146j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5146j0 != null) {
            interfaceC5146j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public InstalledAppCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onVisibilityChanged(InterfaceC5144i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5144i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5144i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onVisibilityStateChanged(InterfaceC5146j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5146j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5146j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo6794id(long j2) {
        super.mo6794id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo6799id(Number... numberArr) {
        super.mo6799id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo6795id(long j2, long j3) {
        super.mo6795id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo6796id(CharSequence charSequence) {
        super.mo6796id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo6798id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo6798id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo6797id(CharSequence charSequence, long j2) {
        super.mo6797id(charSequence, j2);
        return this;
    }
}
