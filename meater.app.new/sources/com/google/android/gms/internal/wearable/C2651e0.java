package com.google.android.gms.internal.wearable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2651e0 {

    /* renamed from: d, reason: collision with root package name */
    private static final C2651e0 f34560d = new C2651e0(true);

    /* renamed from: a, reason: collision with root package name */
    final C2661h1 f34561a = new C2646c1();

    /* renamed from: b, reason: collision with root package name */
    private boolean f34562b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34563c;

    private C2651e0() {
    }

    static int a(v1 v1Var, int i10, Object obj) {
        W.B(i10 << 3);
        if (v1.f34696L == null) {
            byte[] bArr = C2689r0.f34653b;
            if (((N0) obj) instanceof D) {
                throw null;
            }
        }
        w1 w1Var = w1.INT;
        throw null;
    }

    public static int b(InterfaceC2648d0 interfaceC2648d0, Object obj) {
        v1 v1VarB = interfaceC2648d0.b();
        int iA = interfaceC2648d0.a();
        if (!interfaceC2648d0.h()) {
            return a(v1VarB, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!interfaceC2648d0.f()) {
            int iA2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                iA2 += a(v1VarB, iA, list.get(i10));
            }
            return iA2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        if (size <= 0) {
            return W.B(iA << 3) + W.B(0);
        }
        list.get(0);
        v1 v1Var = v1.f34687C;
        w1 w1Var = w1.INT;
        throw null;
    }

    public static C2651e0 d() {
        return f34560d;
    }

    private static boolean i(Map.Entry entry) {
        InterfaceC2648d0 interfaceC2648d0 = (InterfaceC2648d0) entry.getKey();
        if (interfaceC2648d0.d() != w1.MESSAGE) {
            return true;
        }
        if (!interfaceC2648d0.h()) {
            return j(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!j(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean j(Object obj) {
        if (obj instanceof O0) {
            return ((O0) obj).l();
        }
        if (obj instanceof C2702x0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int k(Map.Entry entry) {
        int i10;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        InterfaceC2648d0 interfaceC2648d0 = (InterfaceC2648d0) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC2648d0.d() != w1.MESSAGE || interfaceC2648d0.h() || interfaceC2648d0.f()) {
            return b(interfaceC2648d0, value);
        }
        if (value instanceof C2702x0) {
            int iA = ((InterfaceC2648d0) entry.getKey()).a();
            int iB5 = W.B(8);
            i10 = iB5 + iB5;
            iB = W.B(16) + W.B(iA);
            iB2 = W.B(24);
            iB3 = ((C2702x0) value).a();
            iB4 = W.B(iB3);
        } else {
            int iA2 = ((InterfaceC2648d0) entry.getKey()).a();
            int iB6 = W.B(8);
            i10 = iB6 + iB6;
            iB = W.B(16) + W.B(iA2);
            iB2 = W.B(24);
            iB3 = ((N0) value).b();
            iB4 = W.B(iB3);
        }
        return i10 + iB + iB2 + iB4 + iB3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void l(com.google.android.gms.internal.wearable.InterfaceC2648d0 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.wearable.v1 r0 = r2.b()
            byte[] r1 = com.google.android.gms.internal.wearable.C2689r0.f34653b
            r3.getClass()
            com.google.android.gms.internal.wearable.v1 r1 = com.google.android.gms.internal.wearable.v1.f34687C
            com.google.android.gms.internal.wearable.w1 r1 = com.google.android.gms.internal.wearable.w1.INT
            com.google.android.gms.internal.wearable.w1 r0 = r0.c()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r3 instanceof com.google.android.gms.internal.wearable.N0
            if (r0 != 0) goto L43
            boolean r0 = r3 instanceof com.google.android.gms.internal.wearable.C2702x0
            if (r0 == 0) goto L44
            goto L43
        L22:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L44
            goto L43
        L27:
            boolean r0 = r3 instanceof com.google.android.gms.internal.wearable.P
            if (r0 != 0) goto L43
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L44
            goto L43
        L30:
            boolean r0 = r3 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r3 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r3 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r3 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r3 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.wearable.v1 r2 = r2.b()
            com.google.android.gms.internal.wearable.w1 r2 = r2.c()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C2651e0.l(com.google.android.gms.internal.wearable.d0, java.lang.Object):void");
    }

    public final int c() {
        int iC = this.f34561a.c();
        int iK = 0;
        for (int i10 = 0; i10 < iC; i10++) {
            iK += k(this.f34561a.i(i10));
        }
        Iterator it = this.f34561a.d().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C2651e0 c2651e0 = new C2651e0();
        int iC = this.f34561a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryI = this.f34561a.i(i10);
            c2651e0.g((InterfaceC2648d0) ((C2649d1) entryI).c(), entryI.getValue());
        }
        for (Map.Entry entry : this.f34561a.d()) {
            c2651e0.g((InterfaceC2648d0) entry.getKey(), entry.getValue());
        }
        c2651e0.f34563c = this.f34563c;
        return c2651e0;
    }

    public final Iterator e() {
        return this.f34561a.isEmpty() ? Collections.emptyIterator() : this.f34563c ? new C2698v0(this.f34561a.entrySet().iterator()) : this.f34561a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2651e0) {
            return this.f34561a.equals(((C2651e0) obj).f34561a);
        }
        return false;
    }

    public final void f() {
        if (this.f34562b) {
            return;
        }
        int iC = this.f34561a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = this.f34561a.i(i10).getValue();
            if (value instanceof AbstractC2672l0) {
                ((AbstractC2672l0) value).u();
            }
        }
        Iterator it = this.f34561a.d().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC2672l0) {
                ((AbstractC2672l0) value2).u();
            }
        }
        this.f34561a.a();
        this.f34562b = true;
    }

    public final void g(InterfaceC2648d0 interfaceC2648d0, Object obj) {
        if (!interfaceC2648d0.h()) {
            l(interfaceC2648d0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                l(interfaceC2648d0, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof C2702x0) {
            this.f34563c = true;
        }
        this.f34561a.put(interfaceC2648d0, obj);
    }

    public final boolean h() {
        int iC = this.f34561a.c();
        for (int i10 = 0; i10 < iC; i10++) {
            if (!i(this.f34561a.i(i10))) {
                return false;
            }
        }
        Iterator it = this.f34561a.d().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f34561a.hashCode();
    }

    private C2651e0(boolean z10) {
        f();
        f();
    }
}
