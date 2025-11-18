package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@zzard
/* loaded from: classes2.dex */
public final class zzawj {

    /* renamed from: a */
    private final Clock f22572a;

    /* renamed from: b */
    private final zzawu f22573b;

    /* renamed from: e */
    private final String f22576e;

    /* renamed from: f */
    private final String f22577f;

    /* renamed from: d */
    private final Object f22575d = new Object();

    /* renamed from: g */
    private long f22578g = -1;

    /* renamed from: h */
    private long f22579h = -1;

    /* renamed from: i */
    private boolean f22580i = false;

    /* renamed from: j */
    private long f22581j = -1;

    /* renamed from: k */
    private long f22582k = 0;

    /* renamed from: l */
    private long f22583l = -1;

    /* renamed from: m */
    private long f22584m = -1;

    /* renamed from: c */
    private final LinkedList<C7215u4> f22574c = new LinkedList<>();

    zzawj(Clock clock, zzawu zzawuVar, String str, String str2) {
        this.f22572a = clock;
        this.f22573b = zzawuVar;
        this.f22576e = str;
        this.f22577f = str2;
    }

    /* renamed from: a */
    public final Bundle m17030a() {
        Bundle bundle;
        synchronized (this.f22575d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f22576e);
            bundle.putString("slotid", this.f22577f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f22583l);
            bundle.putLong("tresponse", this.f22584m);
            bundle.putLong("timp", this.f22579h);
            bundle.putLong("tload", this.f22581j);
            bundle.putLong("pcc", this.f22582k);
            bundle.putLong("tfetch", this.f22578g);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<C7215u4> it = this.f22574c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().m15921a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public final void m17031c(boolean z) {
        synchronized (this.f22575d) {
            if (this.f22584m != -1) {
                this.f22581j = this.f22572a.mo14609b();
            }
        }
    }

    /* renamed from: d */
    public final void m17032d(zzxz zzxzVar) {
        synchronized (this.f22575d) {
            long jMo14609b = this.f22572a.mo14609b();
            this.f22583l = jMo14609b;
            this.f22573b.m17075d(zzxzVar, jMo14609b);
        }
    }

    /* renamed from: e */
    public final void m17033e(long j2) {
        synchronized (this.f22575d) {
            this.f22584m = j2;
            if (j2 != -1) {
                this.f22573b.m17076e(this);
            }
        }
    }

    /* renamed from: f */
    public final void m17034f() {
        synchronized (this.f22575d) {
            if (this.f22584m != -1 && this.f22579h == -1) {
                this.f22579h = this.f22572a.mo14609b();
                this.f22573b.m17076e(this);
            }
            this.f22573b.m17078g();
        }
    }

    /* renamed from: g */
    public final void m17035g() {
        synchronized (this.f22575d) {
            if (this.f22584m != -1) {
                C7215u4 c7215u4 = new C7215u4(this);
                c7215u4.m15924d();
                this.f22574c.add(c7215u4);
                this.f22582k++;
                this.f22573b.m17079h();
                this.f22573b.m17076e(this);
            }
        }
    }

    /* renamed from: h */
    public final void m17036h() {
        synchronized (this.f22575d) {
            if (this.f22584m != -1 && !this.f22574c.isEmpty()) {
                C7215u4 last = this.f22574c.getLast();
                if (last.m15922b() == -1) {
                    last.m15923c();
                    this.f22573b.m17076e(this);
                }
            }
        }
    }

    /* renamed from: i */
    public final String m17037i() {
        return this.f22576e;
    }
}
