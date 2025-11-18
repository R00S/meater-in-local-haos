package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzup {

    /* renamed from: b */
    @VisibleForTesting
    private int f27164b;

    /* renamed from: a */
    private final Object f27163a = new Object();

    /* renamed from: c */
    private List<zzuo> f27165c = new LinkedList();

    /* renamed from: a */
    public final boolean m20623a(zzuo zzuoVar) {
        synchronized (this.f27163a) {
            return this.f27165c.contains(zzuoVar);
        }
    }

    /* renamed from: b */
    public final boolean m20624b(zzuo zzuoVar) {
        synchronized (this.f27163a) {
            Iterator<zzuo> it = this.f27165c.iterator();
            while (it.hasNext()) {
                zzuo next = it.next();
                if (zzk.zzlk().m17061r().mo17097k()) {
                    if (!zzk.zzlk().m17061r().mo17088b() && zzuoVar != next && next.m20616k().equals(zzuoVar.m20616k())) {
                        it.remove();
                        return true;
                    }
                } else if (zzuoVar != next && next.m20614i().equals(zzuoVar.m20614i())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void m20625c(zzuo zzuoVar) {
        synchronized (this.f27163a) {
            if (this.f27165c.size() >= 10) {
                int size = this.f27165c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzbad.m17349e(sb.toString());
                this.f27165c.remove(0);
            }
            int i2 = this.f27164b;
            this.f27164b = i2 + 1;
            zzuoVar.m20612e(i2);
            zzuoVar.m20620o();
            this.f27165c.add(zzuoVar);
        }
    }

    /* renamed from: d */
    public final zzuo m20626d(boolean z) {
        synchronized (this.f27163a) {
            zzuo zzuoVar = null;
            if (this.f27165c.size() == 0) {
                zzbad.m17349e("Queue empty");
                return null;
            }
            int i2 = 0;
            if (this.f27165c.size() < 2) {
                zzuo zzuoVar2 = this.f27165c.get(0);
                if (z) {
                    this.f27165c.remove(0);
                } else {
                    zzuoVar2.m20617l();
                }
                return zzuoVar2;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = 0;
            for (zzuo zzuoVar3 : this.f27165c) {
                int iM20609a = zzuoVar3.m20609a();
                if (iM20609a > i3) {
                    i2 = i4;
                    zzuoVar = zzuoVar3;
                    i3 = iM20609a;
                }
                i4++;
            }
            this.f27165c.remove(i2);
            return zzuoVar;
        }
    }
}
