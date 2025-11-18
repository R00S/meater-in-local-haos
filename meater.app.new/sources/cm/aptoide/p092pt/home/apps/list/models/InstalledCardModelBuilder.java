package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.list.models.InstalledCardModel;
import cm.aptoide.p092pt.home.apps.model.InstalledApp;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;

/* loaded from: classes.dex */
public interface InstalledCardModelBuilder {
    InstalledCardModelBuilder application(InstalledApp installedApp);

    /* renamed from: id */
    InstalledCardModelBuilder mo8024id(long j2);

    /* renamed from: id */
    InstalledCardModelBuilder mo8025id(long j2, long j3);

    /* renamed from: id */
    InstalledCardModelBuilder mo8026id(CharSequence charSequence);

    /* renamed from: id */
    InstalledCardModelBuilder mo8027id(CharSequence charSequence, long j2);

    /* renamed from: id */
    InstalledCardModelBuilder mo8028id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    InstalledCardModelBuilder mo8029id(Number... numberArr);

    InstalledCardModelBuilder layout(int i2);

    InstalledCardModelBuilder onBind(InterfaceC5138f0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5138f0);

    InstalledCardModelBuilder onUnbind(InterfaceC5142h0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5142h0);

    InstalledCardModelBuilder onVisibilityChanged(InterfaceC5144i0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5144i0);

    InstalledCardModelBuilder onVisibilityStateChanged(InterfaceC5146j0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5146j0);

    InstalledCardModelBuilder spanSizeOverride(AbstractC5166s.c cVar);
}
