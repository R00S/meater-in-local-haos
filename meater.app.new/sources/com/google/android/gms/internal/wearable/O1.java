package com.google.android.gms.internal.wearable;

import A7.C0858l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public final class O1 {
    public static N1 a(C0858l c0858l) {
        ArrayList arrayList = new ArrayList();
        P1 p1C = C2662i.C();
        TreeSet treeSet = new TreeSet(c0858l.b());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objA = c0858l.a(str);
            Q1 q1C = C2656g.C();
            q1C.q(str);
            q1C.r(b(arrayList, objA));
            arrayList2.add((C2656g) q1C.i());
        }
        p1C.q(arrayList2);
        return new N1((C2662i) p1C.i(), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.wearable.C2653f b(java.util.List r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.O1.b(java.util.List, java.lang.Object):com.google.android.gms.internal.wearable.f");
    }
}
