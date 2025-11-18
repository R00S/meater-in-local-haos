package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* loaded from: classes2.dex */
final class RunnableC6498ar implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zzda f18180f;

    RunnableC6498ar(zzda zzdaVar) {
        this.f18180f = zzdaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f18180f.f25413e != null) {
            return;
        }
        synchronized (zzda.f25409a) {
            if (this.f18180f.f25413e != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21805i2)).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzda.f25410b = new zzwo(this.f18180f.f25412d.f26008b, "ADSHIELD", null);
                    z = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z = zBooleanValue;
            }
            this.f18180f.f25413e = Boolean.valueOf(z);
            zzda.f25409a.open();
        }
    }
}
