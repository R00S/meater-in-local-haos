package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f28903a = new a();

    /* compiled from: DiffUtil.java */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f28906a - dVar2.f28906a;
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil.java */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f28904a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28905b;

        c(int i10) {
            int[] iArr = new int[i10];
            this.f28904a = iArr;
            this.f28905b = iArr.length / 2;
        }

        int[] a() {
            return this.f28904a;
        }

        int b(int i10) {
            return this.f28904a[i10 + this.f28905b];
        }

        void c(int i10, int i11) {
            this.f28904a[i10 + this.f28905b] = i11;
        }
    }

    /* compiled from: DiffUtil.java */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f28906a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28907b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28908c;

        d(int i10, int i11, int i12) {
            this.f28906a = i10;
            this.f28907b = i11;
            this.f28908c = i12;
        }

        int a() {
            return this.f28906a + this.f28908c;
        }

        int b() {
            return this.f28907b + this.f28908c;
        }
    }

    /* compiled from: DiffUtil.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f28909a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f28910b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f28911c;

        /* renamed from: d, reason: collision with root package name */
        private final b f28912d;

        /* renamed from: e, reason: collision with root package name */
        private final int f28913e;

        /* renamed from: f, reason: collision with root package name */
        private final int f28914f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f28915g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f28909a = list;
            this.f28910b = iArr;
            this.f28911c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f28912d = bVar;
            this.f28913e = bVar.e();
            this.f28914f = bVar.d();
            this.f28915g = z10;
            a();
            e();
        }

        private void a() {
            d dVar = this.f28909a.isEmpty() ? null : this.f28909a.get(0);
            if (dVar == null || dVar.f28906a != 0 || dVar.f28907b != 0) {
                this.f28909a.add(0, new d(0, 0, 0));
            }
            this.f28909a.add(new d(this.f28913e, this.f28914f, 0));
        }

        private void d(int i10) {
            int size = this.f28909a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f28909a.get(i11);
                while (iB < dVar.f28907b) {
                    if (this.f28911c[iB] == 0 && this.f28912d.b(i10, iB)) {
                        int i12 = this.f28912d.a(i10, iB) ? 8 : 4;
                        this.f28910b[i10] = (iB << 4) | i12;
                        this.f28911c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void e() {
            for (d dVar : this.f28909a) {
                for (int i10 = 0; i10 < dVar.f28908c; i10++) {
                    int i11 = dVar.f28906a + i10;
                    int i12 = dVar.f28907b + i10;
                    int i13 = this.f28912d.a(i11, i12) ? 1 : 2;
                    this.f28910b[i11] = (i12 << 4) | i13;
                    this.f28911c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f28915g) {
                f();
            }
        }

        private void f() {
            int iA = 0;
            for (d dVar : this.f28909a) {
                while (iA < dVar.f28906a) {
                    if (this.f28910b[iA] == 0) {
                        d(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        private static f g(Collection<f> collection, int i10, boolean z10) {
            f next;
            Iterator<f> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f28916a == i10 && next.f28918c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f next2 = it.next();
                if (z10) {
                    next2.f28917b--;
                } else {
                    next2.f28917b++;
                }
            }
            return next;
        }

        public void b(n nVar) {
            int i10;
            androidx.recyclerview.widget.c cVar = nVar instanceof androidx.recyclerview.widget.c ? (androidx.recyclerview.widget.c) nVar : new androidx.recyclerview.widget.c(nVar);
            int i11 = this.f28913e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f28913e;
            int i13 = this.f28914f;
            for (int size = this.f28909a.size() - 1; size >= 0; size--) {
                d dVar = this.f28909a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f28910b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        f fVarG = g(arrayDeque, i15, false);
                        if (fVarG != null) {
                            int i16 = (i11 - fVarG.f28917b) - 1;
                            cVar.a(i12, i16);
                            if ((i14 & 4) != 0) {
                                cVar.d(i16, 1, this.f28912d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new f(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        cVar.c(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f28911c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        f fVarG2 = g(arrayDeque, i18, true);
                        if (fVarG2 == null) {
                            arrayDeque.add(new f(i13, i11 - i12, false));
                        } else {
                            cVar.a((i11 - fVarG2.f28917b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                cVar.d(i12, 1, this.f28912d.c(i18, i13));
                            }
                        }
                    } else {
                        cVar.b(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f28906a;
                int i20 = dVar.f28907b;
                for (i10 = 0; i10 < dVar.f28908c; i10++) {
                    if ((this.f28910b[i19] & 15) == 2) {
                        cVar.d(i19, 1, this.f28912d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f28906a;
                i13 = dVar.f28907b;
            }
            cVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }
    }

    /* compiled from: DiffUtil.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        int f28916a;

        /* renamed from: b, reason: collision with root package name */
        int f28917b;

        /* renamed from: c, reason: collision with root package name */
        boolean f28918c;

        f(int i10, int i11, boolean z10) {
            this.f28916a = i10;
            this.f28917b = i11;
            this.f28918c = z10;
        }
    }

    /* compiled from: DiffUtil.java */
    static class g {

        /* renamed from: a, reason: collision with root package name */
        int f28919a;

        /* renamed from: b, reason: collision with root package name */
        int f28920b;

        /* renamed from: c, reason: collision with root package name */
        int f28921c;

        /* renamed from: d, reason: collision with root package name */
        int f28922d;

        public g() {
        }

        int a() {
            return this.f28922d - this.f28921c;
        }

        int b() {
            return this.f28920b - this.f28919a;
        }

        public g(int i10, int i11, int i12, int i13) {
            this.f28919a = i10;
            this.f28920b = i11;
            this.f28921c = i12;
            this.f28922d = i13;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    static class C0392h {

        /* renamed from: a, reason: collision with root package name */
        public int f28923a;

        /* renamed from: b, reason: collision with root package name */
        public int f28924b;

        /* renamed from: c, reason: collision with root package name */
        public int f28925c;

        /* renamed from: d, reason: collision with root package name */
        public int f28926d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f28927e;

        C0392h() {
        }

        int a() {
            return Math.min(this.f28925c - this.f28923a, this.f28926d - this.f28924b);
        }

        boolean b() {
            return this.f28926d - this.f28924b != this.f28925c - this.f28923a;
        }

        boolean c() {
            return this.f28926d - this.f28924b > this.f28925c - this.f28923a;
        }

        d d() {
            if (b()) {
                return this.f28927e ? new d(this.f28923a, this.f28924b, a()) : c() ? new d(this.f28923a, this.f28924b + 1, a()) : new d(this.f28923a + 1, this.f28924b, a());
            }
            int i10 = this.f28923a;
            return new d(i10, this.f28924b, this.f28925c - i10);
        }
    }

    private static C0392h a(g gVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = (gVar.b() - gVar.a()) % 2 == 0;
        int iB2 = gVar.b() - gVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.b(i14 + 1) < cVar2.b(i14 - 1))) {
                iB = cVar2.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar2.b(i14 - 1);
                i11 = iB - 1;
            }
            int i15 = gVar.f28922d - ((gVar.f28920b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 + 1;
            while (i11 > gVar.f28919a && i15 > gVar.f28921c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                C0392h c0392h = new C0392h();
                c0392h.f28923a = i11;
                c0392h.f28924b = i15;
                c0392h.f28925c = iB;
                c0392h.f28926d = i16;
                c0392h.f28927e = true;
                return c0392h;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z10) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new g(0, iE, 0, iD));
        int i10 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar = (g) arrayList2.remove(arrayList2.size() - 1);
            C0392h c0392hE = e(gVar, bVar, cVar, cVar2);
            if (c0392hE != null) {
                if (c0392hE.a() > 0) {
                    arrayList.add(c0392hE.d());
                }
                g gVar2 = arrayList3.isEmpty() ? new g() : (g) arrayList3.remove(arrayList3.size() - 1);
                gVar2.f28919a = gVar.f28919a;
                gVar2.f28921c = gVar.f28921c;
                gVar2.f28920b = c0392hE.f28923a;
                gVar2.f28922d = c0392hE.f28924b;
                arrayList2.add(gVar2);
                gVar.f28920b = gVar.f28920b;
                gVar.f28922d = gVar.f28922d;
                gVar.f28919a = c0392hE.f28925c;
                gVar.f28921c = c0392hE.f28926d;
                arrayList2.add(gVar);
            } else {
                arrayList3.add(gVar);
            }
        }
        Collections.sort(arrayList, f28903a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    private static C0392h d(g gVar, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = Math.abs(gVar.b() - gVar.a()) % 2 == 1;
        int iB2 = gVar.b() - gVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.b(i14 + 1) > cVar.b(i14 - 1))) {
                iB = cVar.b(i14 + 1);
                i11 = iB;
            } else {
                iB = cVar.b(i14 - 1);
                i11 = iB + 1;
            }
            int i15 = (gVar.f28921c + (i11 - gVar.f28919a)) - i14;
            int i16 = (i10 == 0 || i11 != iB) ? i15 : i15 - 1;
            while (i11 < gVar.f28920b && i15 < gVar.f28922d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                C0392h c0392h = new C0392h();
                c0392h.f28923a = iB;
                c0392h.f28924b = i16;
                c0392h.f28925c = i11;
                c0392h.f28926d = i15;
                c0392h.f28927e = false;
                return c0392h;
            }
        }
        return null;
    }

    private static C0392h e(g gVar, b bVar, c cVar, c cVar2) {
        if (gVar.b() >= 1 && gVar.a() >= 1) {
            int iB = ((gVar.b() + gVar.a()) + 1) / 2;
            cVar.c(1, gVar.f28919a);
            cVar2.c(1, gVar.f28920b);
            for (int i10 = 0; i10 < iB; i10++) {
                C0392h c0392hD = d(gVar, bVar, cVar, cVar2, i10);
                if (c0392hD != null) {
                    return c0392hD;
                }
                C0392h c0392hA = a(gVar, bVar, cVar, cVar2, i10);
                if (c0392hA != null) {
                    return c0392hA;
                }
            }
        }
        return null;
    }
}
