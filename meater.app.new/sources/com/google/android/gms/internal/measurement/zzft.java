package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public class zzft {

    /* renamed from: a */
    private static final zzeq f28157a = zzeq.m22245a();

    /* renamed from: b */
    private zzdu f28158b;

    /* renamed from: c */
    private volatile zzgo f28159c;

    /* renamed from: d */
    private volatile zzdu f28160d;

    /* renamed from: c */
    private final zzgo m22306c(zzgo zzgoVar) {
        if (this.f28159c == null) {
            synchronized (this) {
                if (this.f28159c == null) {
                    try {
                        this.f28159c = zzgoVar;
                        this.f28160d = zzdu.f28037f;
                    } catch (zzfo unused) {
                        this.f28159c = zzgoVar;
                        this.f28160d = zzdu.f28037f;
                    }
                }
            }
        }
        return this.f28159c;
    }

    /* renamed from: a */
    public final zzgo m22307a(zzgo zzgoVar) {
        zzgo zzgoVar2 = this.f28159c;
        this.f28158b = null;
        this.f28160d = null;
        this.f28159c = zzgoVar;
        return zzgoVar2;
    }

    /* renamed from: b */
    public final int m22308b() {
        if (this.f28160d != null) {
            return this.f28160d.mo21396f();
        }
        if (this.f28159c != null) {
            return this.f28159c.mo22272i();
        }
        return 0;
    }

    /* renamed from: d */
    public final zzdu m22309d() {
        if (this.f28160d != null) {
            return this.f28160d;
        }
        synchronized (this) {
            if (this.f28160d != null) {
                return this.f28160d;
            }
            if (this.f28159c == null) {
                this.f28160d = zzdu.f28037f;
            } else {
                this.f28160d = this.f28159c.mo22135h();
            }
            return this.f28160d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        zzgo zzgoVar = this.f28159c;
        zzgo zzgoVar2 = zzftVar.f28159c;
        return (zzgoVar == null && zzgoVar2 == null) ? m22309d().equals(zzftVar.m22309d()) : (zzgoVar == null || zzgoVar2 == null) ? zzgoVar != null ? zzgoVar.equals(zzftVar.m22306c(zzgoVar.mo22268d())) : m22306c(zzgoVar2.mo22268d()).equals(zzgoVar2) : zzgoVar.equals(zzgoVar2);
    }

    public int hashCode() {
        return 1;
    }
}
