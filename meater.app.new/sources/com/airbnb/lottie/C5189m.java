package com.airbnb.lottie;

import com.airbnb.lottie.p118v.C5318d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024c.p041e.C0868b;
import p024c.p052i.p059j.C0955e;

/* compiled from: PerformanceTracker.java */
/* renamed from: com.airbnb.lottie.m */
/* loaded from: classes.dex */
public class C5189m {

    /* renamed from: a */
    private boolean f12431a = false;

    /* renamed from: b */
    private final Set<b> f12432b = new C0868b();

    /* renamed from: c */
    private final Map<String, C5318d> f12433c = new HashMap();

    /* renamed from: d */
    private final Comparator<C0955e<String, Float>> f12434d = new a();

    /* compiled from: PerformanceTracker.java */
    /* renamed from: com.airbnb.lottie.m$a */
    class a implements Comparator<C0955e<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0955e<String, Float> c0955e, C0955e<String, Float> c0955e2) {
            float fFloatValue = c0955e.f6406b.floatValue();
            float fFloatValue2 = c0955e2.f6406b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* renamed from: com.airbnb.lottie.m$b */
    public interface b {
        /* renamed from: a */
        void m9509a(float f2);
    }

    /* renamed from: a */
    public void m9506a(String str, float f2) {
        if (this.f12431a) {
            C5318d c5318d = this.f12433c.get(str);
            if (c5318d == null) {
                c5318d = new C5318d();
                this.f12433c.put(str, c5318d);
            }
            c5318d.m9870a(f2);
            if (str.equals("__container")) {
                Iterator<b> it = this.f12432b.iterator();
                while (it.hasNext()) {
                    it.next().m9509a(f2);
                }
            }
        }
    }

    /* renamed from: b */
    void m9507b(boolean z) {
        this.f12431a = z;
    }
}
