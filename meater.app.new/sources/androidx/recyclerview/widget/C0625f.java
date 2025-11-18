package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public class C0625f {

    /* renamed from: a */
    private static final Comparator<g> f4126a = new a();

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$a */
    static class a implements Comparator<g> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int i2 = gVar.f4141a - gVar2.f4141a;
            return i2 == 0 ? gVar.f4142b - gVar2.f4142b : i2;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$b */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i2, int i3);

        public abstract boolean areItemsTheSame(int i2, int i3);

        public Object getChangePayload(int i2, int i3) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$c */
    public static class c {

        /* renamed from: a */
        private final List<g> f4127a;

        /* renamed from: b */
        private final int[] f4128b;

        /* renamed from: c */
        private final int[] f4129c;

        /* renamed from: d */
        private final b f4130d;

        /* renamed from: e */
        private final int f4131e;

        /* renamed from: f */
        private final int f4132f;

        /* renamed from: g */
        private final boolean f4133g;

        c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4127a = list;
            this.f4128b = iArr;
            this.f4129c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4130d = bVar;
            this.f4131e = bVar.getOldListSize();
            this.f4132f = bVar.getNewListSize();
            this.f4133g = z;
            m4473a();
            m4478h();
        }

        /* renamed from: a */
        private void m4473a() {
            g gVar = this.f4127a.isEmpty() ? null : this.f4127a.get(0);
            if (gVar != null && gVar.f4141a == 0 && gVar.f4142b == 0) {
                return;
            }
            g gVar2 = new g();
            gVar2.f4141a = 0;
            gVar2.f4142b = 0;
            gVar2.f4144d = false;
            gVar2.f4143c = 0;
            gVar2.f4145e = false;
            this.f4127a.add(0, gVar2);
        }

        /* renamed from: b */
        private void m4474b(List<e> list, InterfaceC0631l interfaceC0631l, int i2, int i3, int i4) {
            if (!this.f4133g) {
                interfaceC0631l.mo4437b(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.f4129c;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    interfaceC0631l.mo4437b(i2, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f4135b++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    interfaceC0631l.mo4436a(m4480j(list, i8, true).f4135b, i2);
                    if (i7 == 4) {
                        interfaceC0631l.mo4439d(i2, 1, this.f4130d.getChangePayload(i8, i6));
                    }
                } else {
                    if (i7 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString(i7));
                    }
                    list.add(new e(i6, i2, false));
                }
            }
        }

        /* renamed from: c */
        private void m4475c(List<e> list, InterfaceC0631l interfaceC0631l, int i2, int i3, int i4) {
            if (!this.f4133g) {
                interfaceC0631l.mo4438c(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.f4128b;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    interfaceC0631l.mo4438c(i2 + i5, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f4135b--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    e eVarM4480j = m4480j(list, i8, false);
                    interfaceC0631l.mo4436a(i2 + i5, eVarM4480j.f4135b - 1);
                    if (i7 == 4) {
                        interfaceC0631l.mo4439d(eVarM4480j.f4135b - 1, 1, this.f4130d.getChangePayload(i6, i8));
                    }
                } else {
                    if (i7 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString(i7));
                    }
                    list.add(new e(i6, i2 + i5, true));
                }
            }
        }

        /* renamed from: f */
        private void m4476f(int i2, int i3, int i4) {
            if (this.f4128b[i2 - 1] != 0) {
                return;
            }
            m4477g(i2, i3, i4, false);
        }

        /* renamed from: g */
        private boolean m4477g(int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            int i7;
            if (z) {
                i3--;
                i6 = i2;
                i5 = i3;
            } else {
                i5 = i2 - 1;
                i6 = i5;
            }
            while (i4 >= 0) {
                g gVar = this.f4127a.get(i4);
                int i8 = gVar.f4141a;
                int i9 = gVar.f4143c;
                int i10 = i8 + i9;
                int i11 = gVar.f4142b + i9;
                if (z) {
                    for (int i12 = i6 - 1; i12 >= i10; i12--) {
                        if (this.f4130d.areItemsTheSame(i12, i5)) {
                            i7 = this.f4130d.areContentsTheSame(i12, i5) ? 8 : 4;
                            this.f4129c[i5] = (i12 << 5) | 16;
                            this.f4128b[i12] = (i5 << 5) | i7;
                            return true;
                        }
                    }
                } else {
                    for (int i13 = i3 - 1; i13 >= i11; i13--) {
                        if (this.f4130d.areItemsTheSame(i5, i13)) {
                            i7 = this.f4130d.areContentsTheSame(i5, i13) ? 8 : 4;
                            int i14 = i2 - 1;
                            this.f4128b[i14] = (i13 << 5) | 16;
                            this.f4129c[i13] = (i14 << 5) | i7;
                            return true;
                        }
                    }
                }
                i6 = gVar.f4141a;
                i3 = gVar.f4142b;
                i4--;
            }
            return false;
        }

        /* renamed from: h */
        private void m4478h() {
            int i2 = this.f4131e;
            int i3 = this.f4132f;
            for (int size = this.f4127a.size() - 1; size >= 0; size--) {
                g gVar = this.f4127a.get(size);
                int i4 = gVar.f4141a;
                int i5 = gVar.f4143c;
                int i6 = i4 + i5;
                int i7 = gVar.f4142b + i5;
                if (this.f4133g) {
                    while (i2 > i6) {
                        m4476f(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i7) {
                        m4479i(i2, i3, size);
                        i3--;
                    }
                }
                for (int i8 = 0; i8 < gVar.f4143c; i8++) {
                    int i9 = gVar.f4141a + i8;
                    int i10 = gVar.f4142b + i8;
                    int i11 = this.f4130d.areContentsTheSame(i9, i10) ? 1 : 2;
                    this.f4128b[i9] = (i10 << 5) | i11;
                    this.f4129c[i10] = (i9 << 5) | i11;
                }
                i2 = gVar.f4141a;
                i3 = gVar.f4142b;
            }
        }

        /* renamed from: i */
        private void m4479i(int i2, int i3, int i4) {
            if (this.f4129c[i3 - 1] != 0) {
                return;
            }
            m4477g(i2, i3, i4, true);
        }

        /* renamed from: j */
        private static e m4480j(List<e> list, int i2, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.f4134a == i2 && eVar.f4136c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f4135b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: d */
        public void m4481d(InterfaceC0631l interfaceC0631l) {
            C0622c c0622c = interfaceC0631l instanceof C0622c ? (C0622c) interfaceC0631l : new C0622c(interfaceC0631l);
            ArrayList arrayList = new ArrayList();
            int i2 = this.f4131e;
            int i3 = this.f4132f;
            for (int size = this.f4127a.size() - 1; size >= 0; size--) {
                g gVar = this.f4127a.get(size);
                int i4 = gVar.f4143c;
                int i5 = gVar.f4141a + i4;
                int i6 = gVar.f4142b + i4;
                if (i5 < i2) {
                    m4475c(arrayList, c0622c, i5, i2 - i5, i5);
                }
                if (i6 < i3) {
                    m4474b(arrayList, c0622c, i5, i3 - i6, i6);
                }
                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                    int[] iArr = this.f4128b;
                    int i8 = gVar.f4141a;
                    if ((iArr[i8 + i7] & 31) == 2) {
                        c0622c.mo4439d(i8 + i7, 1, this.f4130d.getChangePayload(i8 + i7, gVar.f4142b + i7));
                    }
                }
                i2 = gVar.f4141a;
                i3 = gVar.f4142b;
            }
            c0622c.m4440e();
        }

        /* renamed from: e */
        public void m4482e(RecyclerView.AbstractC0594g abstractC0594g) {
            m4481d(new C0621b(abstractC0594g));
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$d */
    public static abstract class d<T> {
        /* renamed from: a */
        public abstract boolean mo4483a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo4484b(T t, T t2);

        /* renamed from: c */
        public abstract Object mo4485c(T t, T t2);
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$e */
    private static class e {

        /* renamed from: a */
        int f4134a;

        /* renamed from: b */
        int f4135b;

        /* renamed from: c */
        boolean f4136c;

        public e(int i2, int i3, boolean z) {
            this.f4134a = i2;
            this.f4135b = i3;
            this.f4136c = z;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$f */
    static class f {

        /* renamed from: a */
        int f4137a;

        /* renamed from: b */
        int f4138b;

        /* renamed from: c */
        int f4139c;

        /* renamed from: d */
        int f4140d;

        public f() {
        }

        public f(int i2, int i3, int i4, int i5) {
            this.f4137a = i2;
            this.f4138b = i3;
            this.f4139c = i4;
            this.f4140d = i5;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.f$g */
    static class g {

        /* renamed from: a */
        int f4141a;

        /* renamed from: b */
        int f4142b;

        /* renamed from: c */
        int f4143c;

        /* renamed from: d */
        boolean f4144d;

        /* renamed from: e */
        boolean f4145e;

        g() {
        }
    }

    /* renamed from: a */
    public static c m4469a(b bVar) {
        return m4470b(bVar, true);
    }

    /* renamed from: b */
    public static c m4470b(b bVar, boolean z) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(0, oldListSize, 0, newListSize));
        int iAbs = oldListSize + newListSize + Math.abs(oldListSize - newListSize);
        int i2 = iAbs * 2;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar = (f) arrayList2.remove(arrayList2.size() - 1);
            g gVarM4471c = m4471c(bVar, fVar.f4137a, fVar.f4138b, fVar.f4139c, fVar.f4140d, iArr, iArr2, iAbs);
            if (gVarM4471c != null) {
                if (gVarM4471c.f4143c > 0) {
                    arrayList.add(gVarM4471c);
                }
                gVarM4471c.f4141a += fVar.f4137a;
                gVarM4471c.f4142b += fVar.f4139c;
                f fVar2 = arrayList3.isEmpty() ? new f() : (f) arrayList3.remove(arrayList3.size() - 1);
                fVar2.f4137a = fVar.f4137a;
                fVar2.f4139c = fVar.f4139c;
                if (gVarM4471c.f4145e) {
                    fVar2.f4138b = gVarM4471c.f4141a;
                    fVar2.f4140d = gVarM4471c.f4142b;
                } else if (gVarM4471c.f4144d) {
                    fVar2.f4138b = gVarM4471c.f4141a - 1;
                    fVar2.f4140d = gVarM4471c.f4142b;
                } else {
                    fVar2.f4138b = gVarM4471c.f4141a;
                    fVar2.f4140d = gVarM4471c.f4142b - 1;
                }
                arrayList2.add(fVar2);
                if (!gVarM4471c.f4145e) {
                    int i3 = gVarM4471c.f4141a;
                    int i4 = gVarM4471c.f4143c;
                    fVar.f4137a = i3 + i4;
                    fVar.f4139c = gVarM4471c.f4142b + i4;
                } else if (gVarM4471c.f4144d) {
                    int i5 = gVarM4471c.f4141a;
                    int i6 = gVarM4471c.f4143c;
                    fVar.f4137a = i5 + i6 + 1;
                    fVar.f4139c = gVarM4471c.f4142b + i6;
                } else {
                    int i7 = gVarM4471c.f4141a;
                    int i8 = gVarM4471c.f4143c;
                    fVar.f4137a = i7 + i8;
                    fVar.f4139c = gVarM4471c.f4142b + i8 + 1;
                }
                arrayList2.add(fVar);
            } else {
                arrayList3.add(fVar);
            }
        }
        Collections.sort(arrayList, f4126a);
        return new c(bVar, arrayList, iArr, iArr2, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:52:0x00cd
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.recyclerview.widget.C0625f.g m4471c(androidx.recyclerview.widget.C0625f.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0625f.m4471c(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$g");
    }
}
