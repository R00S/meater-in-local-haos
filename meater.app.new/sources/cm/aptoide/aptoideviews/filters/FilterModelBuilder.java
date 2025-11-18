package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.FilterModel;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;

/* loaded from: classes.dex */
public interface FilterModelBuilder {
    FilterModelBuilder backgroundRes(Integer num);

    FilterModelBuilder eventListener(FilterEventListener filterEventListener);

    FilterModelBuilder filter(Filter filter);

    /* renamed from: id */
    FilterModelBuilder mo6794id(long j2);

    /* renamed from: id */
    FilterModelBuilder mo6795id(long j2, long j3);

    /* renamed from: id */
    FilterModelBuilder mo6796id(CharSequence charSequence);

    /* renamed from: id */
    FilterModelBuilder mo6797id(CharSequence charSequence, long j2);

    /* renamed from: id */
    FilterModelBuilder mo6798id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    FilterModelBuilder mo6799id(Number... numberArr);

    FilterModelBuilder layout(int i2);

    FilterModelBuilder onBind(InterfaceC5138f0<FilterModel_, FilterModel.CardHolder> interfaceC5138f0);

    FilterModelBuilder onUnbind(InterfaceC5142h0<FilterModel_, FilterModel.CardHolder> interfaceC5142h0);

    FilterModelBuilder onVisibilityChanged(InterfaceC5144i0<FilterModel_, FilterModel.CardHolder> interfaceC5144i0);

    FilterModelBuilder onVisibilityStateChanged(InterfaceC5146j0<FilterModel_, FilterModel.CardHolder> interfaceC5146j0);

    FilterModelBuilder spanSizeOverride(AbstractC5166s.c cVar);

    FilterModelBuilder textColorStateList(Integer num);
}
