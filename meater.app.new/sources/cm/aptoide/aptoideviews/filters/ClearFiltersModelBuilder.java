package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.ClearFiltersModel;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;

/* loaded from: classes.dex */
public interface ClearFiltersModelBuilder {
    ClearFiltersModelBuilder eventListener(FilterEventListener filterEventListener);

    /* renamed from: id */
    ClearFiltersModelBuilder mo8024id(long j2);

    /* renamed from: id */
    ClearFiltersModelBuilder mo8025id(long j2, long j3);

    /* renamed from: id */
    ClearFiltersModelBuilder mo8026id(CharSequence charSequence);

    /* renamed from: id */
    ClearFiltersModelBuilder mo8027id(CharSequence charSequence, long j2);

    /* renamed from: id */
    ClearFiltersModelBuilder mo8028id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    ClearFiltersModelBuilder mo8029id(Number... numberArr);

    ClearFiltersModelBuilder layout(int i2);

    ClearFiltersModelBuilder onBind(InterfaceC5138f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5138f0);

    ClearFiltersModelBuilder onUnbind(InterfaceC5142h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5142h0);

    ClearFiltersModelBuilder onVisibilityChanged(InterfaceC5144i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5144i0);

    ClearFiltersModelBuilder onVisibilityStateChanged(InterfaceC5146j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5146j0);

    ClearFiltersModelBuilder spanSizeOverride(AbstractC5166s.c cVar);

    ClearFiltersModelBuilder textColorStateList(Integer num);
}
