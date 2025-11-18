package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzcef implements zzdti<zzwj> {

    /* renamed from: a */
    private final zzdtu<Context> f24164a;

    /* renamed from: b */
    private final zzdtu<String> f24165b;

    /* renamed from: c */
    private final zzdtu<zzbai> f24166c;

    /* renamed from: d */
    private final zzdtu<Integer> f24167d;

    /* renamed from: e */
    private final zzdtu<String> f24168e;

    private zzcef(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<Integer> zzdtuVar4, zzdtu<String> zzdtuVar5) {
        this.f24164a = zzdtuVar;
        this.f24165b = zzdtuVar2;
        this.f24166c = zzdtuVar3;
        this.f24167d = zzdtuVar4;
        this.f24168e = zzdtuVar5;
    }

    /* renamed from: a */
    public static zzcef m18698a(zzdtu<Context> zzdtuVar, zzdtu<String> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<Integer> zzdtuVar4, zzdtu<String> zzdtuVar5) {
        return new zzcef(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        Context context = this.f24164a.get();
        final String str = this.f24165b.get();
        zzbai zzbaiVar = this.f24166c.get();
        final int iIntValue = this.f24167d.get().intValue();
        final String str2 = this.f24168e.get();
        zzwj zzwjVar = new zzwj(new zzwo(context));
        final zzxo zzxoVar = new zzxo();
        zzxoVar.f27377c = Integer.valueOf(zzbaiVar.f22751g);
        zzxoVar.f27378d = Integer.valueOf(zzbaiVar.f22752h);
        zzxoVar.f27379e = Integer.valueOf(zzbaiVar.f22753i ? 0 : 2);
        zzwjVar.m20697a(new zzwk(iIntValue, str, zzxoVar, str2) { // from class: com.google.android.gms.internal.ads.fi

            /* renamed from: a */
            private final int f18894a;

            /* renamed from: b */
            private final String f18895b;

            /* renamed from: c */
            private final zzxo f18896c;

            /* renamed from: d */
            private final String f18897d;

            {
                this.f18894a = iIntValue;
                this.f18895b = str;
                this.f18896c = zzxoVar;
                this.f18897d = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzwk
            /* renamed from: a */
            public final void mo14971a(zzxn zzxnVar) {
                int i2 = this.f18894a;
                String str3 = this.f18895b;
                zzxo zzxoVar2 = this.f18896c;
                String str4 = this.f18897d;
                zzxnVar.f27374l.f27341c = Integer.valueOf(i2);
                zzxl zzxlVar = zzxnVar.f27371i;
                zzxlVar.f27357c = str3;
                zzxlVar.f27360f = zzxoVar2;
                zzxnVar.f27366d = str4;
            }
        });
        return (zzwj) zzdto.m19874b(zzwjVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
