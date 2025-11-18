package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzdor {

    /* renamed from: a */
    private static final zzdno f25792a = zzdno.m19702d();

    /* renamed from: b */
    private zzdmr f25793b;

    /* renamed from: c */
    private volatile zzdpk f25794c;

    /* renamed from: d */
    private volatile zzdmr f25795d;

    /* renamed from: c */
    private final zzdpk m19761c(zzdpk zzdpkVar) {
        if (this.f25794c == null) {
            synchronized (this) {
                if (this.f25794c == null) {
                    try {
                        this.f25794c = zzdpkVar;
                        this.f25795d = zzdmr.f25661f;
                    } catch (zzdok unused) {
                        this.f25794c = zzdpkVar;
                        this.f25795d = zzdmr.f25661f;
                    }
                }
            }
        }
        return this.f25794c;
    }

    /* renamed from: a */
    public final zzdmr m19762a() {
        if (this.f25795d != null) {
            return this.f25795d;
        }
        synchronized (this) {
            if (this.f25795d != null) {
                return this.f25795d;
            }
            if (this.f25794c == null) {
                this.f25795d = zzdmr.f25661f;
            } else {
                this.f25795d = this.f25794c.mo19586e();
            }
            return this.f25795d;
        }
    }

    /* renamed from: b */
    public final int m19763b() {
        if (this.f25795d != null) {
            return this.f25795d.size();
        }
        if (this.f25794c != null) {
            return this.f25794c.mo19729i();
        }
        return 0;
    }

    /* renamed from: d */
    public final zzdpk m19764d(zzdpk zzdpkVar) {
        zzdpk zzdpkVar2 = this.f25794c;
        this.f25793b = null;
        this.f25795d = null;
        this.f25794c = zzdpkVar;
        return zzdpkVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdor)) {
            return false;
        }
        zzdor zzdorVar = (zzdor) obj;
        zzdpk zzdpkVar = this.f25794c;
        zzdpk zzdpkVar2 = zzdorVar.f25794c;
        return (zzdpkVar == null && zzdpkVar2 == null) ? m19762a().equals(zzdorVar.m19762a()) : (zzdpkVar == null || zzdpkVar2 == null) ? zzdpkVar != null ? zzdpkVar.equals(zzdorVar.m19761c(zzdpkVar.mo19727f())) : m19761c(zzdpkVar2.mo19727f()).equals(zzdpkVar2) : zzdpkVar.equals(zzdpkVar2);
    }

    public int hashCode() {
        return 1;
    }
}
