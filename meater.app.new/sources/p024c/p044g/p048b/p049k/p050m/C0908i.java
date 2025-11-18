package p024c.p044g.p048b.p049k.p050m;

import java.util.ArrayList;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0894g;
import p024c.p044g.p048b.p049k.C0896i;

/* compiled from: Grouping.java */
/* renamed from: c.g.b.k.m.i */
/* loaded from: classes.dex */
public class C0908i {
    /* renamed from: a */
    public static C0914o m5840a(C0892e c0892e, int i2, ArrayList<C0914o> arrayList, C0914o c0914o) {
        int iM5791b1;
        int i3 = i2 == 0 ? c0892e.f5943B0 : c0892e.f5945C0;
        if (i3 != -1 && (c0914o == null || i3 != c0914o.f6146c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C0914o c0914o2 = arrayList.get(i4);
                if (c0914o2.m5857c() == i3) {
                    if (c0914o != null) {
                        c0914o.m5860g(i2, c0914o2);
                        arrayList.remove(c0914o);
                    }
                    c0914o = c0914o2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return c0914o;
        }
        if (c0914o == null) {
            if ((c0892e instanceof C0896i) && (iM5791b1 = ((C0896i) c0892e).m5791b1(i2)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C0914o c0914o3 = arrayList.get(i5);
                    if (c0914o3.m5857c() == iM5791b1) {
                        c0914o = c0914o3;
                        break;
                    }
                    i5++;
                }
            }
            if (c0914o == null) {
                c0914o = new C0914o(i2);
            }
            arrayList.add(c0914o);
        }
        if (c0914o.m5855a(c0892e)) {
            if (c0892e instanceof C0894g) {
                C0894g c0894g = (C0894g) c0892e;
                c0894g.m5777a1().m5631b(c0894g.m5778b1() == 0 ? 1 : 0, arrayList, c0914o);
            }
            if (i2 == 0) {
                c0892e.f5943B0 = c0914o.m5857c();
                c0892e.f5951I.m5631b(i2, arrayList, c0914o);
                c0892e.f5953K.m5631b(i2, arrayList, c0914o);
            } else {
                c0892e.f5945C0 = c0914o.m5857c();
                c0892e.f5952J.m5631b(i2, arrayList, c0914o);
                c0892e.f5955M.m5631b(i2, arrayList, c0914o);
                c0892e.f5954L.m5631b(i2, arrayList, c0914o);
            }
            c0892e.f5958P.m5631b(i2, arrayList, c0914o);
        }
        return c0914o;
    }

    /* renamed from: b */
    private static C0914o m5841b(ArrayList<C0914o> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0914o c0914o = arrayList.get(i3);
            if (i2 == c0914o.f6146c) {
                return c0914o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x033d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5842c(p024c.p044g.p048b.p049k.C0893f r16, p024c.p044g.p048b.p049k.p050m.C0901b.b r17) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.p050m.C0908i.m5842c(c.g.b.k.f, c.g.b.k.m.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m5843d(C0892e.b bVar, C0892e.b bVar2, C0892e.b bVar3, C0892e.b bVar4) {
        C0892e.b bVar5;
        C0892e.b bVar6;
        C0892e.b bVar7 = C0892e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C0892e.b.WRAP_CONTENT) || (bVar3 == C0892e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C0892e.b.WRAP_CONTENT) || (bVar4 == C0892e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
