package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: KeylineState.java */
/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f36244a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f36245b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36246c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36247d;

    /* compiled from: KeylineState.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f36248a;

        /* renamed from: b, reason: collision with root package name */
        private final float f36249b;

        /* renamed from: d, reason: collision with root package name */
        private c f36251d;

        /* renamed from: e, reason: collision with root package name */
        private c f36252e;

        /* renamed from: c, reason: collision with root package name */
        private final List<c> f36250c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private int f36253f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f36254g = -1;

        /* renamed from: h, reason: collision with root package name */
        private float f36255h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        private int f36256i = -1;

        b(float f10, float f11) {
            this.f36248a = f10;
            this.f36249b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f36249b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f36256i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f36256i = this.f36250c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f36251d == null) {
                    this.f36251d = cVar;
                    this.f36253f = this.f36250c.size();
                }
                if (this.f36254g != -1 && this.f36250c.size() - this.f36254g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f36251d.f36260d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f36252e = cVar;
                this.f36254g = this.f36250c.size();
            } else {
                if (this.f36251d == null && cVar.f36260d < this.f36255h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f36252e != null && cVar.f36260d > this.f36255h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f36255h = cVar.f36260d;
            this.f36250c.add(cVar);
            return this;
        }

        b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        f i() {
            if (this.f36251d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f36250c.size(); i10++) {
                c cVar = this.f36250c.get(i10);
                arrayList.add(new c(j(this.f36251d.f36258b, this.f36248a, this.f36253f, i10), cVar.f36258b, cVar.f36259c, cVar.f36260d, cVar.f36261e, cVar.f36262f, cVar.f36263g, cVar.f36264h));
            }
            return new f(this.f36248a, arrayList, this.f36253f, this.f36254g);
        }
    }

    /* compiled from: KeylineState.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final float f36257a;

        /* renamed from: b, reason: collision with root package name */
        final float f36258b;

        /* renamed from: c, reason: collision with root package name */
        final float f36259c;

        /* renamed from: d, reason: collision with root package name */
        final float f36260d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f36261e;

        /* renamed from: f, reason: collision with root package name */
        final float f36262f;

        /* renamed from: g, reason: collision with root package name */
        final float f36263g;

        /* renamed from: h, reason: collision with root package name */
        final float f36264h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(D7.a.a(cVar.f36257a, cVar2.f36257a, f10), D7.a.a(cVar.f36258b, cVar2.f36258b, f10), D7.a.a(cVar.f36259c, cVar2.f36259c, f10), D7.a.a(cVar.f36260d, cVar2.f36260d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f36257a = f10;
            this.f36258b = f11;
            this.f36259c = f12;
            this.f36260d = f13;
            this.f36261e = z10;
            this.f36262f = f14;
            this.f36263g = f15;
            this.f36264h = f16;
        }
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listG = fVar.g();
        List<c> listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            arrayList.add(c.a(listG.get(i10), listG2.get(i10), f10));
        }
        return new f(fVar.f(), arrayList, D7.a.c(fVar.b(), fVar2.b(), f10), D7.a.c(fVar.i(), fVar2.i(), f10));
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f36258b) - (fVar.j().f36260d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = fVar.g().get(size);
            bVar.d(f11 + (cVar.f36260d / 2.0f), cVar.f36259c, cVar.f36260d, size >= fVar.b() && size <= fVar.i(), cVar.f36261e);
            f11 += cVar.f36260d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return this.f36245b.get(this.f36246c);
    }

    int b() {
        return this.f36246c;
    }

    c c() {
        return this.f36245b.get(0);
    }

    c d() {
        for (int i10 = 0; i10 < this.f36245b.size(); i10++) {
            c cVar = this.f36245b.get(i10);
            if (!cVar.f36261e) {
                return cVar;
            }
        }
        return null;
    }

    List<c> e() {
        return this.f36245b.subList(this.f36246c, this.f36247d + 1);
    }

    float f() {
        return this.f36244a;
    }

    List<c> g() {
        return this.f36245b;
    }

    c h() {
        return this.f36245b.get(this.f36247d);
    }

    int i() {
        return this.f36247d;
    }

    c j() {
        return this.f36245b.get(r0.size() - 1);
    }

    c k() {
        for (int size = this.f36245b.size() - 1; size >= 0; size--) {
            c cVar = this.f36245b.get(size);
            if (!cVar.f36261e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator<c> it = this.f36245b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f36261e) {
                i10++;
            }
        }
        return this.f36245b.size() - i10;
    }

    private f(float f10, List<c> list, int i10, int i11) {
        this.f36244a = f10;
        this.f36245b = Collections.unmodifiableList(list);
        this.f36246c = i10;
        this.f36247d = i11;
    }
}
