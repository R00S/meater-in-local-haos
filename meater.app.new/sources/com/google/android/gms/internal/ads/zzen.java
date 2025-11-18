package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzen extends zzfk {

    /* renamed from: n */
    private static final zzfl<zzch> f26060n = new zzfl<>();

    /* renamed from: o */
    private final Context f26061o;

    /* renamed from: p */
    private zzbk.zza f26062p;

    public zzen(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3, Context context, zzbk.zza zzaVar) {
        super(zzdyVar, str, str2, c11479zza, i2, 27);
        this.f26062p = null;
        this.f26061o = context;
        this.f26062p = zzaVar;
    }

    /* renamed from: c */
    private static String m19933c(zzbk.zza zzaVar) {
        if (zzaVar == null || !zzaVar.m17804A() || zzef.m19922f(zzaVar.m17805B().m17813x())) {
            return null;
        }
        return zzaVar.m17805B().m17813x();
    }

    /* renamed from: d */
    private final String m19934d() throws ExecutionException, InterruptedException {
        try {
            if (this.f26089g.m19899A() != null) {
                this.f26089g.m19899A().get();
            }
            zzbp.zza zzaVarM19916z = this.f26089g.m19916z();
            if (zzaVarM19916z == null || !zzaVarM19916z.m18048d0()) {
                return null;
            }
            return zzaVarM19916z.m18047U();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        zzch zzchVar;
        zzbm zzbmVar;
        AtomicReference<zzch> atomicReferenceM19942a = f26060n.m19942a(this.f26061o.getPackageName());
        synchronized (atomicReferenceM19942a) {
            zzch zzchVar2 = atomicReferenceM19942a.get();
            if (zzchVar2 == null || zzef.m19922f(zzchVar2.f24301b) || zzchVar2.f24301b.equals("E") || zzchVar2.f24301b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzef.m19922f(m19933c(this.f26062p))) {
                    zzbk.zza zzaVar = this.f26062p;
                    zzbmVar = (Boolean.valueOf(zzef.m19922f(m19933c(zzaVar)) && zzaVar != null && zzaVar.m17806y() && zzaVar.m17807z().m17810z() == zzbm.ENUM_SIGNAL_SOURCE_GASS).booleanValue() && this.f26089g.m19914x()) ? zzbm.ENUM_SIGNAL_SOURCE_GASS : zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD;
                } else {
                    zzbmVar = zzbm.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                }
                Method method = this.f26093k;
                Object[] objArr = new Object[3];
                objArr[0] = this.f26061o;
                objArr[1] = Boolean.valueOf(zzbmVar == zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD);
                objArr[2] = zzyt.m20848e().m16421c(zzacu.f21853q2);
                zzch zzchVar3 = new zzch((String) method.invoke(null, objArr));
                if (zzef.m19922f(zzchVar3.f24301b) || zzchVar3.f24301b.equals("E")) {
                    int i2 = C7208ty.f20587a[zzbmVar.ordinal()];
                    if (i2 == 1) {
                        zzchVar3.f24301b = this.f26062p.m17805B().m17813x();
                    } else if (i2 == 2) {
                        String strM19934d = m19934d();
                        if (!zzef.m19922f(strM19934d)) {
                            zzchVar3.f24301b = strM19934d;
                        }
                    }
                }
                atomicReferenceM19942a.set(zzchVar3);
            }
            zzchVar = atomicReferenceM19942a.get();
        }
        synchronized (this.f26092j) {
            if (zzchVar != null) {
                this.f26092j.m18056C0(zzchVar.f24301b);
                this.f26092j.m18077Z(zzchVar.f24302c);
                this.f26092j.m18097v(zzchVar.f24303d);
                this.f26092j.m18099w(zzchVar.f24304e);
                this.f26092j.m18051A(zzchVar.f24305f);
            }
        }
    }
}
