package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.DownloadCardModel;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
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
public class DownloadCardModel_ extends DownloadCardModel implements InterfaceC5169v<DownloadCardModel.CardHolder>, DownloadCardModelBuilder {
    private InterfaceC5138f0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5142h0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5144i0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5146j0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof DownloadCardModel_) || !super.equals(obj)) {
            return false;
        }
        DownloadCardModel_ downloadCardModel_ = (DownloadCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? downloadCardModel_.getApplication() == null : getApplication().equals(downloadCardModel_.getApplication())) {
            return (getEventSubject() == null) == (downloadCardModel_.getEventSubject() == null);
        }
        return false;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder eventSubject(C11418b c11418b) {
        return eventSubject((C11418b<AppClick>) c11418b);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    protected int getDefaultLayout() {
        return C1146R.layout.apps_download_app_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onBind(InterfaceC5138f0 interfaceC5138f0) {
        return onBind((InterfaceC5138f0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5138f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onUnbind(InterfaceC5142h0 interfaceC5142h0) {
        return onUnbind((InterfaceC5142h0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5142h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onVisibilityChanged(InterfaceC5144i0 interfaceC5144i0) {
        return onVisibilityChanged((InterfaceC5144i0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5144i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onVisibilityStateChanged(InterfaceC5146j0 interfaceC5146j0) {
        return onVisibilityStateChanged((InterfaceC5146j0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5146j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public String toString() {
        return "DownloadCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ application(DownloadApp downloadApp) {
        onMutation();
        super.setApplication(downloadApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.AbstractC5167t
    public DownloadCardModel.CardHolder createNewHolder() {
        return new DownloadCardModel.CardHolder();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ eventSubject(C11418b<AppClick> c11418b) {
        onMutation();
        super.setEventSubject(c11418b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePostBind(DownloadCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5138f0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5138f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5138f0 != null) {
            interfaceC5138f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePreBind(C5168u c5168u, DownloadCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public DownloadCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onBind(InterfaceC5138f0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5138f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5138f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onUnbind(InterfaceC5142h0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5142h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5142h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public DownloadCardModel_ reset() {
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
    public DownloadCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public DownloadCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ spanSizeOverride(AbstractC5166s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void unbind(DownloadCardModel.CardHolder cardHolder) {
        super.unbind((DownloadCardModel_) cardHolder);
        InterfaceC5142h0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5142h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5142h0 != null) {
            interfaceC5142h0.m9296a(this, cardHolder);
        }
    }

    public DownloadApp application() {
        return super.getApplication();
    }

    public C11418b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, DownloadCardModel.CardHolder cardHolder) {
        InterfaceC5144i0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5144i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5144i0 != null) {
            interfaceC5144i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, DownloadCardModel.CardHolder cardHolder) {
        InterfaceC5146j0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5146j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5146j0 != null) {
            interfaceC5146j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public DownloadCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onVisibilityChanged(InterfaceC5144i0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5144i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5144i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onVisibilityStateChanged(InterfaceC5146j0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5146j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5146j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8018id(long j2) {
        super.mo8018id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8023id(Number... numberArr) {
        super.mo8023id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8019id(long j2, long j3) {
        super.mo8019id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8020id(CharSequence charSequence) {
        super.mo8020id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8022id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8022id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8021id(CharSequence charSequence, long j2) {
        super.mo8021id(charSequence, j2);
        return this;
    }
}
