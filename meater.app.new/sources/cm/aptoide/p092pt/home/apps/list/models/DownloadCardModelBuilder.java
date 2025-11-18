package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.DownloadCardModel;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.InterfaceC5138f0;
import com.airbnb.epoxy.InterfaceC5142h0;
import com.airbnb.epoxy.InterfaceC5144i0;
import com.airbnb.epoxy.InterfaceC5146j0;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public interface DownloadCardModelBuilder {
    DownloadCardModelBuilder application(DownloadApp downloadApp);

    DownloadCardModelBuilder eventSubject(C11418b<AppClick> c11418b);

    /* renamed from: id */
    DownloadCardModelBuilder mo8018id(long j2);

    /* renamed from: id */
    DownloadCardModelBuilder mo8019id(long j2, long j3);

    /* renamed from: id */
    DownloadCardModelBuilder mo8020id(CharSequence charSequence);

    /* renamed from: id */
    DownloadCardModelBuilder mo8021id(CharSequence charSequence, long j2);

    /* renamed from: id */
    DownloadCardModelBuilder mo8022id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    DownloadCardModelBuilder mo8023id(Number... numberArr);

    DownloadCardModelBuilder layout(int i2);

    DownloadCardModelBuilder onBind(InterfaceC5138f0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5138f0);

    DownloadCardModelBuilder onUnbind(InterfaceC5142h0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5142h0);

    DownloadCardModelBuilder onVisibilityChanged(InterfaceC5144i0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5144i0);

    DownloadCardModelBuilder onVisibilityStateChanged(InterfaceC5146j0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5146j0);

    DownloadCardModelBuilder spanSizeOverride(AbstractC5166s.c cVar);
}
