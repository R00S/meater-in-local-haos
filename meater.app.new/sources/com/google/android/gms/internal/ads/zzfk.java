package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public abstract class zzfk implements Callable {

    /* renamed from: f */
    private final String f26088f = getClass().getSimpleName();

    /* renamed from: g */
    protected final zzdy f26089g;

    /* renamed from: h */
    private final String f26090h;

    /* renamed from: i */
    private final String f26091i;

    /* renamed from: j */
    protected final zzbp.zza.C11479zza f26092j;

    /* renamed from: k */
    protected Method f26093k;

    /* renamed from: l */
    private final int f26094l;

    /* renamed from: m */
    private final int f26095m;

    public zzfk(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        this.f26089g = zzdyVar;
        this.f26090h = str;
        this.f26091i = str2;
        this.f26092j = c11479zza;
        this.f26094l = i2;
        this.f26095m = i3;
    }

    /* renamed from: a */
    protected abstract void mo19932a() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        long jNanoTime;
        Method methodM19906p;
        int i2;
        try {
            jNanoTime = System.nanoTime();
            methodM19906p = this.f26089g.m19906p(this.f26090h, this.f26091i);
            this.f26093k = methodM19906p;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (methodM19906p == null) {
            return null;
        }
        mo19932a();
        zzda zzdaVarM19913w = this.f26089g.m19913w();
        if (zzdaVarM19913w != null && (i2 = this.f26094l) != Integer.MIN_VALUE) {
            zzdaVarM19913w.m19126b(this.f26095m, i2, (System.nanoTime() - jNanoTime) / 1000);
        }
        return null;
    }
}
