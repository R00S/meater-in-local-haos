package p024c.p079s.p080a;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p024c.p052i.p053e.C0923a;
import p024c.p079s.p080a.C1002b;

/* compiled from: ColorCutQuantizer.java */
/* renamed from: c.s.a.a */
/* loaded from: classes.dex */
final class C1001a {

    /* renamed from: a */
    private static final Comparator<b> f6613a = new a();

    /* renamed from: b */
    final int[] f6614b;

    /* renamed from: c */
    final int[] f6615c;

    /* renamed from: d */
    final List<C1002b.e> f6616d;

    /* renamed from: f */
    final C1002b.c[] f6618f;

    /* renamed from: g */
    private final float[] f6619g = new float[3];

    /* renamed from: e */
    final TimingLogger f6617e = null;

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: c.s.a.a$a */
    static class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.m6403g() - bVar.m6403g();
        }
    }

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: c.s.a.a$b */
    private class b {

        /* renamed from: a */
        private int f6620a;

        /* renamed from: b */
        private int f6621b;

        /* renamed from: c */
        private int f6622c;

        /* renamed from: d */
        private int f6623d;

        /* renamed from: e */
        private int f6624e;

        /* renamed from: f */
        private int f6625f;

        /* renamed from: g */
        private int f6626g;

        /* renamed from: h */
        private int f6627h;

        /* renamed from: i */
        private int f6628i;

        b(int i2, int i3) {
            this.f6620a = i2;
            this.f6621b = i3;
            m6399c();
        }

        /* renamed from: a */
        final boolean m6397a() {
            return m6401e() > 1;
        }

        /* renamed from: b */
        final int m6398b() {
            int iM6402f = m6402f();
            C1001a c1001a = C1001a.this;
            int[] iArr = c1001a.f6614b;
            int[] iArr2 = c1001a.f6615c;
            C1001a.m6384e(iArr, iM6402f, this.f6620a, this.f6621b);
            Arrays.sort(iArr, this.f6620a, this.f6621b + 1);
            C1001a.m6384e(iArr, iM6402f, this.f6620a, this.f6621b);
            int i2 = this.f6622c / 2;
            int i3 = this.f6620a;
            int i4 = 0;
            while (true) {
                int i5 = this.f6621b;
                if (i3 > i5) {
                    return this.f6620a;
                }
                i4 += iArr2[iArr[i3]];
                if (i4 >= i2) {
                    return Math.min(i5 - 1, i3);
                }
                i3++;
            }
        }

        /* renamed from: c */
        final void m6399c() {
            C1001a c1001a = C1001a.this;
            int[] iArr = c1001a.f6614b;
            int[] iArr2 = c1001a.f6615c;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.f6620a; i9 <= this.f6621b; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int iM6390k = C1001a.m6390k(i10);
                int iM6389j = C1001a.m6389j(i10);
                int iM6388i = C1001a.m6388i(i10);
                if (iM6390k > i5) {
                    i5 = iM6390k;
                }
                if (iM6390k < i2) {
                    i2 = iM6390k;
                }
                if (iM6389j > i6) {
                    i6 = iM6389j;
                }
                if (iM6389j < i3) {
                    i3 = iM6389j;
                }
                if (iM6388i > i7) {
                    i7 = iM6388i;
                }
                if (iM6388i < i4) {
                    i4 = iM6388i;
                }
            }
            this.f6623d = i2;
            this.f6624e = i5;
            this.f6625f = i3;
            this.f6626g = i6;
            this.f6627h = i4;
            this.f6628i = i7;
            this.f6622c = i8;
        }

        /* renamed from: d */
        final C1002b.e m6400d() {
            C1001a c1001a = C1001a.this;
            int[] iArr = c1001a.f6614b;
            int[] iArr2 = c1001a.f6615c;
            int iM6390k = 0;
            int i2 = 0;
            int iM6389j = 0;
            int iM6388i = 0;
            for (int i3 = this.f6620a; i3 <= this.f6621b; i3++) {
                int i4 = iArr[i3];
                int i5 = iArr2[i4];
                i2 += i5;
                iM6390k += C1001a.m6390k(i4) * i5;
                iM6389j += C1001a.m6389j(i4) * i5;
                iM6388i += i5 * C1001a.m6388i(i4);
            }
            float f2 = i2;
            return new C1002b.e(C1001a.m6382b(Math.round(iM6390k / f2), Math.round(iM6389j / f2), Math.round(iM6388i / f2)), i2);
        }

        /* renamed from: e */
        final int m6401e() {
            return (this.f6621b + 1) - this.f6620a;
        }

        /* renamed from: f */
        final int m6402f() {
            int i2 = this.f6624e - this.f6623d;
            int i3 = this.f6626g - this.f6625f;
            int i4 = this.f6628i - this.f6627h;
            if (i2 < i3 || i2 < i4) {
                return (i3 < i2 || i3 < i4) ? -1 : -2;
            }
            return -3;
        }

        /* renamed from: g */
        final int m6403g() {
            return ((this.f6624e - this.f6623d) + 1) * ((this.f6626g - this.f6625f) + 1) * ((this.f6628i - this.f6627h) + 1);
        }

        /* renamed from: h */
        final b m6404h() {
            if (!m6397a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iM6398b = m6398b();
            b bVar = C1001a.this.new b(iM6398b + 1, this.f6621b);
            this.f6621b = iM6398b;
            m6399c();
            return bVar;
        }
    }

    C1001a(int[] iArr, int i2, C1002b.c[] cVarArr) {
        this.f6618f = cVarArr;
        int[] iArr2 = new int[32768];
        this.f6615c = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int iM6386g = m6386g(iArr[i3]);
            iArr[i3] = iM6386g;
            iArr2[iM6386g] = iArr2[iM6386g] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0 && m6391l(i5)) {
                iArr2[i5] = 0;
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f6614b = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 > i2) {
            this.f6616d = m6387h(i2);
            return;
        }
        this.f6616d = new ArrayList();
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = iArr3[i8];
            this.f6616d.add(new C1002b.e(m6381a(i9), iArr2[i9]));
        }
    }

    /* renamed from: a */
    private static int m6381a(int i2) {
        return m6382b(m6390k(i2), m6389j(i2), m6388i(i2));
    }

    /* renamed from: b */
    static int m6382b(int i2, int i3, int i4) {
        return Color.rgb(m6385f(i2, 5, 8), m6385f(i3, 5, 8), m6385f(i4, 5, 8));
    }

    /* renamed from: c */
    private List<C1002b.e> m6383c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            C1002b.e eVarM6400d = it.next().m6400d();
            if (!m6393n(eVarM6400d)) {
                arrayList.add(eVarM6400d);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static void m6384e(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = m6388i(i5) | (m6389j(i5) << 10) | (m6390k(i5) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i4) {
            int i6 = iArr[i3];
            iArr[i3] = m6390k(i6) | (m6388i(i6) << 10) | (m6389j(i6) << 5);
            i3++;
        }
    }

    /* renamed from: f */
    private static int m6385f(int i2, int i3, int i4) {
        return (i4 > i3 ? i2 << (i4 - i3) : i2 >> (i3 - i4)) & ((1 << i4) - 1);
    }

    /* renamed from: g */
    private static int m6386g(int i2) {
        return m6385f(Color.blue(i2), 8, 5) | (m6385f(Color.red(i2), 8, 5) << 10) | (m6385f(Color.green(i2), 8, 5) << 5);
    }

    /* renamed from: h */
    private List<C1002b.e> m6387h(int i2) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i2, f6613a);
        priorityQueue.offer(new b(0, this.f6614b.length - 1));
        m6394o(priorityQueue, i2);
        return m6383c(priorityQueue);
    }

    /* renamed from: i */
    static int m6388i(int i2) {
        return i2 & 31;
    }

    /* renamed from: j */
    static int m6389j(int i2) {
        return (i2 >> 5) & 31;
    }

    /* renamed from: k */
    static int m6390k(int i2) {
        return (i2 >> 10) & 31;
    }

    /* renamed from: l */
    private boolean m6391l(int i2) {
        int iM6381a = m6381a(i2);
        C0923a.m5879g(iM6381a, this.f6619g);
        return m6392m(iM6381a, this.f6619g);
    }

    /* renamed from: m */
    private boolean m6392m(int i2, float[] fArr) {
        C1002b.c[] cVarArr = this.f6618f;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (!this.f6618f[i3].mo6416a(i2, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    private boolean m6393n(C1002b.e eVar) {
        return m6392m(eVar.m6429e(), eVar.m6427c());
    }

    /* renamed from: o */
    private void m6394o(PriorityQueue<b> priorityQueue, int i2) {
        b bVarPoll;
        while (priorityQueue.size() < i2 && (bVarPoll = priorityQueue.poll()) != null && bVarPoll.m6397a()) {
            priorityQueue.offer(bVarPoll.m6404h());
            priorityQueue.offer(bVarPoll);
        }
    }

    /* renamed from: d */
    List<C1002b.e> m6395d() {
        return this.f6616d;
    }
}
