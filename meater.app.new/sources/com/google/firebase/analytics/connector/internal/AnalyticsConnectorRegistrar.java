package com.google.firebase.analytics.connector.internal;

import D9.h;
import K8.g;
import K8.q;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.2.0 */
@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<K8.c<?>> getComponents() {
        return Arrays.asList(K8.c.e(I8.a.class).b(q.l(com.google.firebase.f.class)).b(q.l(Context.class)).b(q.l(g9.d.class)).f(new g() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return I8.b.h((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (Context) dVar.a(Context.class), (g9.d) dVar.a(g9.d.class));
            }
        }).e().d(), h.b("fire-analytics", "22.2.0"));
    }
}
