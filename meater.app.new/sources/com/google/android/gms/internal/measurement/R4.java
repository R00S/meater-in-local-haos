package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public class R4 {

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC2517k5 f33858a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Y3 f33859b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f33860c;

    private final InterfaceC2517k5 d(InterfaceC2517k5 interfaceC2517k5) {
        if (this.f33858a == null) {
            synchronized (this) {
                if (this.f33858a == null) {
                    try {
                        this.f33858a = interfaceC2517k5;
                        this.f33859b = Y3.f33948C;
                    } catch (zzkp unused) {
                        this.f33860c = true;
                        this.f33858a = interfaceC2517k5;
                        this.f33859b = Y3.f33948C;
                    }
                }
            }
        }
        return this.f33858a;
    }

    public final int a() {
        if (this.f33859b != null) {
            return this.f33859b.z();
        }
        if (this.f33858a != null) {
            return this.f33858a.d();
        }
        return 0;
    }

    public final InterfaceC2517k5 b(InterfaceC2517k5 interfaceC2517k5) {
        InterfaceC2517k5 interfaceC2517k52 = this.f33858a;
        this.f33859b = null;
        this.f33858a = interfaceC2517k5;
        return interfaceC2517k52;
    }

    public final Y3 c() {
        if (this.f33859b != null) {
            return this.f33859b;
        }
        synchronized (this) {
            try {
                if (this.f33859b != null) {
                    return this.f33859b;
                }
                if (this.f33858a == null) {
                    this.f33859b = Y3.f33948C;
                } else {
                    this.f33859b = this.f33858a.h();
                }
                return this.f33859b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R4)) {
            return false;
        }
        R4 r42 = (R4) obj;
        InterfaceC2517k5 interfaceC2517k5 = this.f33858a;
        InterfaceC2517k5 interfaceC2517k52 = r42.f33858a;
        return (interfaceC2517k5 == null && interfaceC2517k52 == null) ? c().equals(r42.c()) : (interfaceC2517k5 == null || interfaceC2517k52 == null) ? interfaceC2517k5 != null ? interfaceC2517k5.equals(r42.d(interfaceC2517k5.c())) : d(interfaceC2517k52.c()).equals(interfaceC2517k52) : interfaceC2517k5.equals(interfaceC2517k52);
    }

    public int hashCode() {
        return 1;
    }
}
