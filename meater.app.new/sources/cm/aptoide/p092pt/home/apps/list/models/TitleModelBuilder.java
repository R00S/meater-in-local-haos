package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.list.models.TitleModel;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public interface TitleModelBuilder {
    TitleModelBuilder eventSubject(C11418b<Void> c11418b);

    /* renamed from: id */
    TitleModelBuilder mo8031id(long j2);

    /* renamed from: id */
    TitleModelBuilder mo8032id(long j2, long j3);

    /* renamed from: id */
    TitleModelBuilder mo8033id(CharSequence charSequence);

    /* renamed from: id */
    TitleModelBuilder mo8034id(CharSequence charSequence, long j2);

    /* renamed from: id */
    TitleModelBuilder mo8035id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    TitleModelBuilder mo8036id(Number... numberArr);

    TitleModelBuilder layout(int i2);

    TitleModelBuilder onBind(InterfaceC5138f0<TitleModel_, TitleModel.Holder> interfaceC5138f0);

    TitleModelBuilder onUnbind(InterfaceC5142h0<TitleModel_, TitleModel.Holder> interfaceC5142h0);

    TitleModelBuilder onVisibilityChanged(InterfaceC5144i0<TitleModel_, TitleModel.Holder> interfaceC5144i0);

    TitleModelBuilder onVisibilityStateChanged(InterfaceC5146j0<TitleModel_, TitleModel.Holder> interfaceC5146j0);

    TitleModelBuilder shouldShowButton(boolean z);

    TitleModelBuilder spanSizeOverride(AbstractC5166s.c cVar);

    TitleModelBuilder title(Integer num);
}
