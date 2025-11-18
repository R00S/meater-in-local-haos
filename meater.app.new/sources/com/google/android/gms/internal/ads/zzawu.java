package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@zzard
/* loaded from: classes2.dex */
public final class zzawu implements zzut {

    /* renamed from: b */
    private final zzaxb f22619b;

    /* renamed from: d */
    @VisibleForTesting
    private final zzawr f22621d;

    /* renamed from: a */
    private final Object f22618a = new Object();

    /* renamed from: e */
    @VisibleForTesting
    private final HashSet<zzawj> f22622e = new HashSet<>();

    /* renamed from: f */
    @VisibleForTesting
    private final HashSet<Object> f22623f = new HashSet<>();

    /* renamed from: c */
    private final zzawt f22620c = new zzawt();

    public zzawu(String str, zzaxb zzaxbVar) {
        this.f22621d = new zzawr(str, zzaxbVar);
        this.f22619b = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    /* renamed from: a */
    public final void mo15953a(boolean z) {
        long jMo14608a = zzk.zzln().mo14608a();
        if (!z) {
            this.f22619b.mo17094h(jMo14608a);
            this.f22619b.mo17108v(this.f22621d.f22609d);
            return;
        }
        if (jMo14608a - this.f22619b.mo17099m() > ((Long) zzyt.m20848e().m16421c(zzacu.f21785f1)).longValue()) {
            this.f22621d.f22609d = -1;
        } else {
            this.f22621d.f22609d = this.f22619b.mo17095i();
        }
    }

    /* renamed from: b */
    public final Bundle m17073b(Context context, zzaws zzawsVar) {
        HashSet<zzawj> hashSet = new HashSet<>();
        synchronized (this.f22618a) {
            hashSet.addAll(this.f22622e);
            this.f22622e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f22621d.m17067c(context, this.f22620c.m17072b()));
        Bundle bundle2 = new Bundle();
        Iterator<Object> it = this.f22623f.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<zzawj> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().m17030a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzawsVar.mo17070a(hashSet);
        return bundle;
    }

    /* renamed from: c */
    public final zzawj m17074c(Clock clock, String str) {
        return new zzawj(clock, this, this.f22620c.m17071a(), str);
    }

    /* renamed from: d */
    public final void m17075d(zzxz zzxzVar, long j2) {
        synchronized (this.f22618a) {
            this.f22621d.m17066a(zzxzVar, j2);
        }
    }

    /* renamed from: e */
    public final void m17076e(zzawj zzawjVar) {
        synchronized (this.f22618a) {
            this.f22622e.add(zzawjVar);
        }
    }

    /* renamed from: f */
    public final void m17077f(HashSet<zzawj> hashSet) {
        synchronized (this.f22618a) {
            this.f22622e.addAll(hashSet);
        }
    }

    /* renamed from: g */
    public final void m17078g() {
        synchronized (this.f22618a) {
            this.f22621d.m17068d();
        }
    }

    /* renamed from: h */
    public final void m17079h() {
        synchronized (this.f22618a) {
            this.f22621d.m17069e();
        }
    }
}
