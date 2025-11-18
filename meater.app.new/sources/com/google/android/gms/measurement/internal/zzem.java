package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzem<V> {

    /* renamed from: a */
    private static final Object f29186a = new Object();

    /* renamed from: b */
    private final String f29187b;

    /* renamed from: c */
    private final InterfaceC7690e3<V> f29188c;

    /* renamed from: d */
    private final V f29189d;

    /* renamed from: e */
    private final V f29190e;

    /* renamed from: f */
    private final Object f29191f;

    /* renamed from: g */
    private volatile V f29192g;

    /* renamed from: h */
    private volatile V f29193h;

    private zzem(String str, V v, V v2, InterfaceC7690e3<V> interfaceC7690e3) {
        this.f29191f = new Object();
        this.f29192g = null;
        this.f29193h = null;
        this.f29187b = str;
        this.f29189d = v;
        this.f29190e = v2;
        this.f29188c = interfaceC7690e3;
    }

    /* renamed from: a */
    public final V m23095a(V v) {
        synchronized (this.f29191f) {
        }
        if (v != null) {
            return v;
        }
        if (zzap.f29131a == null) {
            return this.f29189d;
        }
        synchronized (f29186a) {
            if (zzw.m23556a()) {
                return this.f29193h == null ? this.f29189d : this.f29193h;
            }
            if (zzw.m23556a()) {
                throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
            }
            zzw zzwVar = zzap.f29131a;
            try {
                for (zzem zzemVar : zzap.f29133b) {
                    synchronized (f29186a) {
                        if (zzw.m23556a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        try {
                            InterfaceC7690e3<V> interfaceC7690e3 = zzemVar.f29188c;
                            zzemVar.f29193h = interfaceC7690e3 != null ? interfaceC7690e3.mo22697a() : null;
                        } catch (IllegalStateException unused) {
                            zzemVar.f29193h = null;
                        }
                    }
                }
            } catch (SecurityException e2) {
                zzap.m23026f(e2);
            }
            InterfaceC7690e3<V> interfaceC7690e32 = this.f29188c;
            if (interfaceC7690e32 == null) {
                zzw zzwVar2 = zzap.f29131a;
                return this.f29189d;
            }
            try {
                return interfaceC7690e32.mo22697a();
            } catch (IllegalStateException unused2) {
                zzw zzwVar3 = zzap.f29131a;
                return this.f29189d;
            } catch (SecurityException e3) {
                zzap.m23026f(e3);
                zzw zzwVar4 = zzap.f29131a;
                return this.f29189d;
            }
        }
    }

    /* renamed from: b */
    public final String m23096b() {
        return this.f29187b;
    }
}
