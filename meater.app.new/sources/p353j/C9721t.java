package p353j;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.C9789g;

/* compiled from: Options.kt */
/* renamed from: j.t */
/* loaded from: classes3.dex */
public final class C9721t extends AbstractList<C9710i> implements RandomAccess {

    /* renamed from: g */
    public static final a f37072g = new a(null);

    /* renamed from: h */
    private final C9710i[] f37073h;

    /* renamed from: i */
    private final int[] f37074i;

    /* compiled from: Options.kt */
    /* renamed from: j.t$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        private final void m32150a(long j2, C9703f c9703f, int i2, List<? extends C9710i> list, int i3, int i4, List<Integer> list2) throws IOException {
            int i5;
            int i6;
            int i7;
            int i8;
            C9703f c9703f2;
            int i9 = i2;
            if (!(i3 < i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i10 = i3; i10 < i4; i10++) {
                if (!(list.get(i10).m32093P() >= i9)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C9710i c9710i = list.get(i3);
            C9710i c9710i2 = list.get(i4 - 1);
            if (i9 == c9710i.m32093P()) {
                int iIntValue = list2.get(i3).intValue();
                int i11 = i3 + 1;
                C9710i c9710i3 = list.get(i11);
                i5 = i11;
                i6 = iIntValue;
                c9710i = c9710i3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (c9710i.m32097x(i9) == c9710i2.m32097x(i9)) {
                int iMin = Math.min(c9710i.m32093P(), c9710i2.m32093P());
                int i12 = 0;
                for (int i13 = i9; i13 < iMin && c9710i.m32097x(i13) == c9710i2.m32097x(i13); i13++) {
                    i12++;
                }
                long jM32152c = j2 + m32152c(c9703f) + 2 + i12 + 1;
                c9703f.writeInt(-i12);
                c9703f.writeInt(i6);
                int i14 = i9 + i12;
                while (i9 < i14) {
                    c9703f.writeInt(c9710i.m32097x(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (!(i14 == list.get(i5).m32093P())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    c9703f.writeInt(list2.get(i5).intValue());
                    return;
                } else {
                    C9703f c9703f3 = new C9703f();
                    c9703f.writeInt(((int) (m32152c(c9703f3) + jM32152c)) * (-1));
                    m32150a(jM32152c, c9703f3, i14, list, i5, i4, list2);
                    c9703f.mo31999B0(c9703f3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i5 + 1; i16 < i4; i16++) {
                if (list.get(i16 - 1).m32097x(i9) != list.get(i16).m32097x(i9)) {
                    i15++;
                }
            }
            long jM32152c2 = j2 + m32152c(c9703f) + 2 + (i15 * 2);
            c9703f.writeInt(i15);
            c9703f.writeInt(i6);
            for (int i17 = i5; i17 < i4; i17++) {
                byte bM32097x = list.get(i17).m32097x(i9);
                if (i17 == i5 || bM32097x != list.get(i17 - 1).m32097x(i9)) {
                    c9703f.writeInt(bM32097x & 255);
                }
            }
            C9703f c9703f4 = new C9703f();
            while (i5 < i4) {
                byte bM32097x2 = list.get(i5).m32097x(i9);
                int i18 = i5 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i4) {
                        i7 = i4;
                        break;
                    } else {
                        if (bM32097x2 != list.get(i19).m32097x(i9)) {
                            i7 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i7 && i9 + 1 == list.get(i5).m32093P()) {
                    c9703f.writeInt(list2.get(i5).intValue());
                    i8 = i7;
                    c9703f2 = c9703f4;
                } else {
                    c9703f.writeInt(((int) (jM32152c2 + m32152c(c9703f4))) * (-1));
                    i8 = i7;
                    c9703f2 = c9703f4;
                    m32150a(jM32152c2, c9703f4, i9 + 1, list, i5, i7, list2);
                }
                c9703f4 = c9703f2;
                i5 = i8;
            }
            c9703f.mo31999B0(c9703f4);
        }

        /* renamed from: b */
        static /* synthetic */ void m32151b(a aVar, long j2, C9703f c9703f, int i2, List list, int i3, int i4, List list2, int i5, Object obj) throws IOException {
            aVar.m32150a((i5 & 1) != 0 ? 0L : j2, c9703f, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        /* renamed from: c */
        private final long m32152c(C9703f c9703f) {
            return c9703f.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
        
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p353j.C9721t m32153d(p353j.C9710i... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 338
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p353j.C9721t.a.m32153d(j.i[]):j.t");
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public /* synthetic */ C9721t(C9710i[] c9710iArr, int[] iArr, C9789g c9789g) {
        this(c9710iArr, iArr);
    }

    /* renamed from: r */
    public static final C9721t m32142r(C9710i... c9710iArr) {
        return f37072g.m32153d(c9710iArr);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: c */
    public int getF41452i() {
        return this.f37073h.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C9710i) {
            return m32144f((C9710i) obj);
        }
        return false;
    }

    /* renamed from: f */
    public /* bridge */ boolean m32144f(C9710i c9710i) {
        return super.contains(c9710i);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C9710i get(int i2) {
        return this.f37073h[i2];
    }

    /* renamed from: i */
    public final C9710i[] m32146i() {
        return this.f37073h;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C9710i) {
            return m32148o((C9710i) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C9710i) {
            return m32149q((C9710i) obj);
        }
        return -1;
    }

    /* renamed from: n */
    public final int[] m32147n() {
        return this.f37074i;
    }

    /* renamed from: o */
    public /* bridge */ int m32148o(C9710i c9710i) {
        return super.indexOf(c9710i);
    }

    /* renamed from: q */
    public /* bridge */ int m32149q(C9710i c9710i) {
        return super.lastIndexOf(c9710i);
    }

    private C9721t(C9710i[] c9710iArr, int[] iArr) {
        this.f37073h = c9710iArr;
        this.f37074i = iArr;
    }
}
