package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C8405j;
import com.google.firebase.analytics.p179a.InterfaceC8095a;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.p203q.InterfaceC8482d;
import com.google.firebase.p209u.C8555h;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.2.0 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24986c(InterfaceC8095a.class).m25006b(C8132v.m25060k(C8405j.class)).m25006b(C8132v.m25060k(Context.class)).m25006b(C8132v.m25060k(InterfaceC8482d.class)).m25010f(C8100a.f30652a).m25009e().m25008d(), C8555h.m26903a("fire-analytics", "17.2.0"));
    }
}
