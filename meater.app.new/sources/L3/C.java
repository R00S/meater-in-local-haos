package L3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r1.C4338e;
import s.C4392b;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9104a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f9105b = new C4392b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, X3.h> f9106c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<C4338e<String, Float>> f9107d = new a();

    /* compiled from: PerformanceTracker.java */
    class a implements Comparator<C4338e<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C4338e<String, Float> c4338e, C4338e<String, Float> c4338e2) {
            float fFloatValue = c4338e.f48340b.floatValue();
            float fFloatValue2 = c4338e2.f48340b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (this.f9104a) {
            X3.h hVar = this.f9106c.get(str);
            if (hVar == null) {
                hVar = new X3.h();
                this.f9106c.put(str, hVar);
            }
            hVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f9105b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    void b(boolean z10) {
        this.f9104a = z10;
    }
}
