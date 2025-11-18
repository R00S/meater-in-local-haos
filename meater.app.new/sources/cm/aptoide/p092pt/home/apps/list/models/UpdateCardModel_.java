package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.UpdateCardModel;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.themes.ThemeManager;
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
public class UpdateCardModel_ extends UpdateCardModel implements InterfaceC5169v<UpdateCardModel.CardHolder>, UpdateCardModelBuilder {
    private InterfaceC5138f0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5142h0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5144i0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5146j0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof UpdateCardModel_) || !super.equals(obj)) {
            return false;
        }
        UpdateCardModel_ updateCardModel_ = (UpdateCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? updateCardModel_.getApplication() != null : !getApplication().equals(updateCardModel_.getApplication())) {
            return false;
        }
        if ((getEventSubject() == null) != (updateCardModel_.getEventSubject() == null)) {
            return false;
        }
        return (getThemeManager() == null) == (updateCardModel_.getThemeManager() == null);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder eventSubject(C11418b c11418b) {
        return eventSubject((C11418b<AppClick>) c11418b);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    protected int getDefaultLayout() {
        return C1146R.layout.apps_update_app_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() != null ? 1 : 0)) * 31) + (getThemeManager() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onBind(InterfaceC5138f0 interfaceC5138f0) {
        return onBind((InterfaceC5138f0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5138f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onUnbind(InterfaceC5142h0 interfaceC5142h0) {
        return onUnbind((InterfaceC5142h0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5142h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onVisibilityChanged(InterfaceC5144i0 interfaceC5144i0) {
        return onVisibilityChanged((InterfaceC5144i0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5144i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onVisibilityStateChanged(InterfaceC5146j0 interfaceC5146j0) {
        return onVisibilityStateChanged((InterfaceC5146j0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5146j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public String toString() {
        return "UpdateCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + ", themeManager=" + getThemeManager() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ application(UpdateApp updateApp) {
        onMutation();
        super.setApplication(updateApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.AbstractC5167t
    public UpdateCardModel.CardHolder createNewHolder() {
        return new UpdateCardModel.CardHolder();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ eventSubject(C11418b<AppClick> c11418b) {
        onMutation();
        super.setEventSubject(c11418b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePostBind(UpdateCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5138f0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5138f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5138f0 != null) {
            interfaceC5138f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5169v
    public void handlePreBind(C5168u c5168u, UpdateCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public UpdateCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onBind(InterfaceC5138f0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5138f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5138f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onUnbind(InterfaceC5142h0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5142h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5142h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public UpdateCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication(null);
        super.setEventSubject(null);
        super.setThemeManager(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ themeManager(ThemeManager themeManager) {
        onMutation();
        super.setThemeManager(themeManager);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public UpdateCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public UpdateCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public UpdateCardModel_ spanSizeOverride(AbstractC5166s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void unbind(UpdateCardModel.CardHolder cardHolder) {
        super.unbind((UpdateCardModel_) cardHolder);
        InterfaceC5142h0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5142h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5142h0 != null) {
            interfaceC5142h0.m9296a(this, cardHolder);
        }
    }

    public UpdateApp application() {
        return super.getApplication();
    }

    public C11418b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, UpdateCardModel.CardHolder cardHolder) {
        InterfaceC5144i0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5144i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5144i0 != null) {
            interfaceC5144i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5167t, com.airbnb.epoxy.AbstractC5166s
    public void onVisibilityStateChanged(int i2, UpdateCardModel.CardHolder cardHolder) {
        InterfaceC5146j0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5146j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5146j0 != null) {
            interfaceC5146j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5166s
    public UpdateCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public ThemeManager themeManager() {
        return super.getThemeManager();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onVisibilityChanged(InterfaceC5144i0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5144i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5144i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onVisibilityStateChanged(InterfaceC5146j0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5146j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5146j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8040id(long j2) {
        super.mo8040id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8045id(Number... numberArr) {
        super.mo8045id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8041id(long j2, long j3) {
        super.mo8041id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8042id(CharSequence charSequence) {
        super.mo8042id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8044id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8044id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5166s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8043id(CharSequence charSequence, long j2) {
        super.mo8043id(charSequence, j2);
        return this;
    }
}
