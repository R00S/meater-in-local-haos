package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class zzcul implements zzcva<zzcuk> {

    /* renamed from: a */
    private final zzbbl f25091a;

    /* renamed from: b */
    private final ScheduledExecutorService f25092b;

    /* renamed from: c */
    private final List<zzcpk> f25093c;

    /* renamed from: d */
    private final Context f25094d;

    /* renamed from: e */
    private final zzcxv f25095e;

    /* renamed from: f */
    private String f25096f;

    public zzcul(zzbbl zzbblVar, ScheduledExecutorService scheduledExecutorService, String str, zzcpf zzcpfVar, Context context, zzcxv zzcxvVar) {
        this.f25091a = zzbblVar;
        this.f25092b = scheduledExecutorService;
        this.f25096f = str;
        this.f25094d = context;
        this.f25095e = zzcxvVar;
        if (zzcpfVar.m18908b().containsKey(zzcxvVar.f25295f)) {
            this.f25093c = zzcpfVar.m18908b().get(zzcxvVar.f25295f);
        } else {
            this.f25093c = Collections.emptyList();
        }
    }

    /* renamed from: d */
    static final /* synthetic */ zzcuk m18988d(List list) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((zzbbh) it.next()).get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzcuk(jSONArray.toString());
    }

    /* renamed from: a */
    final /* synthetic */ void m18989a(zzcpk zzcpkVar, Bundle bundle, zzcpl zzcplVar, zzbbr zzbbrVar) {
        try {
            zzcpkVar.f24859d.mo16818u3(ObjectWrapper.m14708E0(this.f25094d), this.f25096f, bundle, zzcpkVar.f24858c, this.f25095e.f25294e, zzcplVar);
        } catch (Exception e2) {
            zzbbrVar.m17386c(new Exception("Error calling adapter"));
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuk> mo14982b() {
        return ((Boolean) zzyt.m20848e().m16421c(zzacu.f21751a2)).booleanValue() ? zzbar.m17366c(this.f25091a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.to

            /* renamed from: f */
            private final zzcul f20578f;

            {
                this.f20578f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20578f.m18990c();
            }
        }), new zzbal(this) { // from class: com.google.android.gms.internal.ads.uo

            /* renamed from: a */
            private final zzcul f20646a;

            {
                this.f20646a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20646a.m18991e((List) obj);
            }
        }, this.f25091a) : zzbar.m17378o(null);
    }

    /* renamed from: c */
    final /* synthetic */ List m18990c() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (final zzcpk zzcpkVar : this.f25093c) {
            final zzbbr zzbbrVar = new zzbbr();
            final zzcpl zzcplVar = new zzcpl(zzcpkVar, zzbbrVar);
            Bundle bundle = this.f25095e.f25293d.f27414r;
            final Bundle bundle2 = bundle != null ? bundle.getBundle(zzcpkVar.f24856a) : null;
            arrayList.add(zzbar.m17365b(zzbbrVar, ((Long) zzyt.m20848e().m16421c(zzacu.f21744Z1)).longValue(), TimeUnit.MILLISECONDS, this.f25092b));
            this.f25091a.execute(new Runnable(this, zzcpkVar, bundle2, zzcplVar, zzbbrVar) { // from class: com.google.android.gms.internal.ads.vo

                /* renamed from: f */
                private final zzcul f20749f;

                /* renamed from: g */
                private final zzcpk f20750g;

                /* renamed from: h */
                private final Bundle f20751h;

                /* renamed from: i */
                private final zzcpl f20752i;

                /* renamed from: j */
                private final zzbbr f20753j;

                {
                    this.f20749f = this;
                    this.f20750g = zzcpkVar;
                    this.f20751h = bundle2;
                    this.f20752i = zzcplVar;
                    this.f20753j = zzbbrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f20749f.m18989a(this.f20750g, this.f20751h, this.f20752i, this.f20753j);
                }
            });
        }
        return arrayList;
    }

    /* renamed from: e */
    final /* synthetic */ zzbbh m18991e(final List list) throws Exception {
        return zzbar.m17377n(list).m17379a(new Callable(list) { // from class: com.google.android.gms.internal.ads.wo

            /* renamed from: f */
            private final List f20862f;

            {
                this.f20862f = list;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcul.m18988d(this.f20862f);
            }
        }, this.f25091a);
    }
}
