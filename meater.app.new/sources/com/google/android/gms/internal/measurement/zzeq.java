package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public class zzeq {

    /* renamed from: b */
    private static volatile zzeq f28054b;

    /* renamed from: c */
    private static volatile zzeq f28055c;

    /* renamed from: e */
    private final Map<C7631a, zzfd.zzf<?, ?>> f28057e;

    /* renamed from: a */
    private static final Class<?> f28053a = m22247d();

    /* renamed from: d */
    private static final zzeq f28056d = new zzeq(true);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzeq$a */
    static final class C7631a {

        /* renamed from: a */
        private final Object f28058a;

        /* renamed from: b */
        private final int f28059b;

        C7631a(Object obj, int i2) {
            this.f28058a = obj;
            this.f28059b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7631a)) {
                return false;
            }
            C7631a c7631a = (C7631a) obj;
            return this.f28058a == c7631a.f28058a && this.f28059b == c7631a.f28059b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f28058a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f28059b;
        }
    }

    zzeq() {
        this.f28057e = new HashMap();
    }

    /* renamed from: a */
    public static zzeq m22245a() {
        zzeq zzeqVar = f28054b;
        if (zzeqVar == null) {
            synchronized (zzeq.class) {
                zzeqVar = f28054b;
                if (zzeqVar == null) {
                    zzeqVar = f28056d;
                    f28054b = zzeqVar;
                }
            }
        }
        return zzeqVar;
    }

    /* renamed from: c */
    public static zzeq m22246c() {
        zzeq zzeqVarM21169b = f28055c;
        if (zzeqVarM21169b == null) {
            synchronized (zzeq.class) {
                zzeqVarM21169b = f28055c;
                if (zzeqVarM21169b == null) {
                    zzeqVarM21169b = AbstractC7536k2.m21169b(zzeq.class);
                    f28055c = zzeqVarM21169b;
                }
            }
        }
        return zzeqVarM21169b;
    }

    /* renamed from: d */
    private static Class<?> m22247d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <ContainingType extends zzgo> zzfd.zzf<ContainingType, ?> m22248b(ContainingType containingtype, int i2) {
        return (zzfd.zzf) this.f28057e.get(new C7631a(containingtype, i2));
    }

    private zzeq(boolean z) {
        this.f28057e = Collections.emptyMap();
    }
}
