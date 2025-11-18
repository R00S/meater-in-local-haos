package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbsm;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzcoe<AdT, AdapterT, ListenerT extends zzbsm> implements zzcjv<AdT> {

    /* renamed from: a */
    private final zzcjz<AdapterT, ListenerT> f24801a;

    /* renamed from: b */
    private final zzcka<AdT, AdapterT, ListenerT> f24802b;

    /* renamed from: c */
    private final zzczt f24803c;

    /* renamed from: d */
    private final zzbbl f24804d;

    public zzcoe(zzczt zzcztVar, zzbbl zzbblVar, zzcjz<AdapterT, ListenerT> zzcjzVar, zzcka<AdT, AdapterT, ListenerT> zzckaVar) {
        this.f24803c = zzcztVar;
        this.f24804d = zzbblVar;
        this.f24802b = zzckaVar;
        this.f24801a = zzcjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<AdT> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        final zzcjy<AdapterT, ListenerT> zzcjyVarMo18850a;
        Iterator<String> it = zzcxmVar.f25259q.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcjyVarMo18850a = null;
                break;
            }
            try {
                zzcjyVarMo18850a = this.f24801a.mo18850a(it.next(), zzcxmVar.f25261s);
                break;
            } catch (Throwable unused) {
            }
        }
        if (zzcjyVarMo18850a == null) {
            return zzbar.m17375l(new zzcmk("unable to instantiate mediation adapter class"));
        }
        zzbbr zzbbrVar = new zzbbr();
        zzcjyVarMo18850a.f24423c.mo18315n6(new C6863km(this, zzbbrVar, zzcjyVarMo18850a));
        if (zzcxmVar.f25232E) {
            Bundle bundle = zzcxuVar.f25288a.f25282a.f25293d.f27414r;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f24803c.m19100g(zzczs.ADAPTER_LOAD_AD_SYN).m19104a(new zzczd(this, zzcxuVar, zzcxmVar, zzcjyVarMo18850a) { // from class: com.google.android.gms.internal.ads.im

            /* renamed from: a */
            private final zzcoe f19389a;

            /* renamed from: b */
            private final zzcxu f19390b;

            /* renamed from: c */
            private final zzcxm f19391c;

            /* renamed from: d */
            private final zzcjy f19392d;

            {
                this.f19389a = this;
                this.f19390b = zzcxuVar;
                this.f19391c = zzcxmVar;
                this.f19392d = zzcjyVarMo18850a;
            }

            @Override // com.google.android.gms.internal.ads.zzczd
            public final void run() throws Exception {
                this.f19389a.m18895d(this.f19390b, this.f19391c, this.f19392d);
            }
        }, this.f24804d).m19116j(zzczs.ADAPTER_LOAD_AD_ACK).m19113g(zzbbrVar).m19116j(zzczs.ADAPTER_WRAP_ADAPTER).m19114h(new zzczc(this, zzcxuVar, zzcxmVar, zzcjyVarMo18850a) { // from class: com.google.android.gms.internal.ads.jm

            /* renamed from: a */
            private final zzcoe f19489a;

            /* renamed from: b */
            private final zzcxu f19490b;

            /* renamed from: c */
            private final zzcxm f19491c;

            /* renamed from: d */
            private final zzcjy f19492d;

            {
                this.f19489a = this;
                this.f19490b = zzcxuVar;
                this.f19491c = zzcxmVar;
                this.f19492d = zzcjyVarMo18850a;
            }

            @Override // com.google.android.gms.internal.ads.zzczc
            /* renamed from: a */
            public final Object mo14763a(Object obj) {
                return this.f19489a.m18894c(this.f19490b, this.f19491c, this.f19492d, (Void) obj);
            }
        }).m19112f();
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return !zzcxmVar.f25259q.isEmpty();
    }

    /* renamed from: c */
    final /* synthetic */ Object m18894c(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar, Void r4) throws Exception {
        return this.f24802b.mo18851a(zzcxuVar, zzcxmVar, zzcjyVar);
    }

    /* renamed from: d */
    final /* synthetic */ void m18895d(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy zzcjyVar) throws Exception {
        this.f24802b.mo18852b(zzcxuVar, zzcxmVar, zzcjyVar);
    }
}
