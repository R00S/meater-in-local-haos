package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzem extends zzfk {

    /* renamed from: n */
    private static zzfl<String> f26058n = new zzfl<>();

    /* renamed from: o */
    private final Context f26059o;

    public zzem(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3, Context context) {
        super(zzdyVar, str, str2, c11479zza, i2, 29);
        this.f26059o = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        this.f26092j.m18095u("E");
        AtomicReference<String> atomicReferenceM19942a = f26058n.m19942a(this.f26059o.getPackageName());
        if (atomicReferenceM19942a.get() == null) {
            synchronized (atomicReferenceM19942a) {
                if (atomicReferenceM19942a.get() == null) {
                    atomicReferenceM19942a.set((String) this.f26093k.invoke(null, this.f26059o));
                }
            }
        }
        String str = atomicReferenceM19942a.get();
        synchronized (this.f26092j) {
            this.f26092j.m18095u(zzcg.m18756a(str.getBytes(), true));
        }
    }
}
