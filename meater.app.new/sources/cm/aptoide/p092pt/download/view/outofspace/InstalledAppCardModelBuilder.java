package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModel;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public interface InstalledAppCardModelBuilder {
    InstalledAppCardModelBuilder application(InstalledApp installedApp);

    InstalledAppCardModelBuilder eventSubject(C11418b<String> c11418b);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7544id(long j2);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7545id(long j2, long j3);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7546id(CharSequence charSequence);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7547id(CharSequence charSequence, long j2);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7548id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7549id(Number... numberArr);

    InstalledAppCardModelBuilder layout(int i2);

    InstalledAppCardModelBuilder onBind(InterfaceC5138f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5138f0);

    InstalledAppCardModelBuilder onUnbind(InterfaceC5142h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5142h0);

    InstalledAppCardModelBuilder onVisibilityChanged(InterfaceC5144i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5144i0);

    InstalledAppCardModelBuilder onVisibilityStateChanged(InterfaceC5146j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5146j0);

    InstalledAppCardModelBuilder spanSizeOverride(AbstractC5166s.c cVar);
}
