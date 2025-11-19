package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.InterfaceC2611w4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2595u4<T extends InterfaceC2611w4<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final C2595u4<?> f34396d = new C2595u4<>(true);

    /* renamed from: a, reason: collision with root package name */
    final G5<T, Object> f34397a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34398b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34399c;

    private C2595u4() {
        this.f34397a = new F5();
    }

    public static int b(InterfaceC2611w4<?> interfaceC2611w4, Object obj) {
        EnumC2461d6 enumC2461d6B = interfaceC2611w4.b();
        int iA = interfaceC2611w4.a();
        if (!interfaceC2611w4.h()) {
            return c(enumC2461d6B, iA, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!interfaceC2611w4.f()) {
            int iC = 0;
            while (i10 < size) {
                iC += c(enumC2461d6B, iA, list.get(i10));
                i10++;
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iD = 0;
        while (i10 < size) {
            iD += d(enumC2461d6B, list.get(i10));
            i10++;
        }
        return zzjn.k0(iA) + iD + zzjn.o0(iD);
    }

    static int c(EnumC2461d6 enumC2461d6, int i10, Object obj) {
        int iK0 = zzjn.k0(i10);
        if (enumC2461d6 == EnumC2461d6.f34084M) {
            I4.g((InterfaceC2517k5) obj);
            iK0 <<= 1;
        }
        return iK0 + d(enumC2461d6, obj);
    }

    private static int d(EnumC2461d6 enumC2461d6, Object obj) {
        switch (C2619x4.f34445b[enumC2461d6.ordinal()]) {
            case 1:
                return zzjn.c(((Double) obj).doubleValue());
            case 2:
                return zzjn.d(((Float) obj).floatValue());
            case 3:
                return zzjn.F(((Long) obj).longValue());
            case 4:
                return zzjn.j0(((Long) obj).longValue());
            case 5:
                return zzjn.T(((Integer) obj).intValue());
            case 6:
                return zzjn.p(((Long) obj).longValue());
            case 7:
                return zzjn.z(((Integer) obj).intValue());
            case 8:
                return zzjn.v(((Boolean) obj).booleanValue());
            case 9:
                return zzjn.s((InterfaceC2517k5) obj);
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return obj instanceof N4 ? zzjn.r((N4) obj) : zzjn.G((InterfaceC2517k5) obj);
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return obj instanceof Y3 ? zzjn.q((Y3) obj) : zzjn.u((String) obj);
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof Y3 ? zzjn.q((Y3) obj) : zzjn.w((byte[]) obj);
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return zzjn.o0(((Integer) obj).intValue());
            case 14:
                return zzjn.b0(((Integer) obj).intValue());
            case 15:
                return zzjn.W(((Long) obj).longValue());
            case 16:
                return zzjn.g0(((Integer) obj).intValue());
            case 17:
                return zzjn.e0(((Long) obj).longValue());
            case 18:
                return obj instanceof H4 ? zzjn.e(((H4) obj).a()) : zzjn.e(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.d() != EnumC2486g6.MESSAGE || key.h() || key.f()) ? b(key, value) : value instanceof N4 ? zzjn.k(entry.getKey().a(), (N4) value) : zzjn.l(entry.getKey().a(), (InterfaceC2517k5) value);
    }

    private final Object f(T t10) {
        Object obj = this.f34397a.get(t10);
        if (obj instanceof N4) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    private static Object g(Object obj) {
        if (obj instanceof InterfaceC2580s5) {
            return ((InterfaceC2580s5) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends InterfaceC2611w4<T>> C2595u4<T> i() {
        return (C2595u4<T>) f34396d;
    }

    private final void j(T t10, Object obj) {
        if (!t10.h()) {
            n(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                n(t10, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof N4) {
            this.f34399c = true;
        }
        this.f34397a.put(t10, obj);
    }

    private final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof N4;
        if (key.h()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objF = f(key);
            List list = (List) value;
            int size = list.size();
            if (objF == null) {
                objF = new ArrayList(size);
            }
            List list2 = (List) objF;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(g(list.get(i10)));
            }
            this.f34397a.put(key, objF);
            return;
        }
        if (key.d() != EnumC2486g6.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f34397a.put(key, g(value));
            return;
        }
        Object objF2 = f(key);
        if (objF2 != null) {
            if (z10) {
                throw new NoSuchMethodError();
            }
            this.f34397a.put(key, objF2 instanceof InterfaceC2580s5 ? key.q((InterfaceC2580s5) objF2, (InterfaceC2580s5) value) : key.l(((InterfaceC2517k5) objF2).b(), (InterfaceC2517k5) value).x());
        } else {
            this.f34397a.put(key, g(value));
            if (z10) {
                this.f34399c = true;
            }
        }
    }

    private static boolean l(Object obj) {
        if (obj instanceof InterfaceC2533m5) {
            return ((InterfaceC2533m5) obj).g();
        }
        if (obj instanceof N4) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.d6 r0 = r3.b()
            com.google.android.gms.internal.measurement.I4.e(r4)
            int[] r1 = com.google.android.gms.internal.measurement.C2619x4.f34444a
            com.google.android.gms.internal.measurement.g6 r0 = r0.c()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r1 = r2
            goto L46
        L1a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.InterfaceC2517k5
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.N4
            if (r0 == 0) goto L18
            goto L46
        L23:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.H4
            if (r0 == 0) goto L18
            goto L46
        L2c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.Y3
            if (r0 != 0) goto L46
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L18
            goto L46
        L35:
            boolean r1 = r4 instanceof java.lang.String
            goto L46
        L38:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L46
        L3b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L46
        L3e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L46
        L41:
            boolean r1 = r4 instanceof java.lang.Long
            goto L46
        L44:
            boolean r1 = r4 instanceof java.lang.Integer
        L46:
            if (r1 == 0) goto L49
            return
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.d6 r3 = r3.b()
            com.google.android.gms.internal.measurement.g6 r3 = r3.c()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2595u4.n(com.google.android.gms.internal.measurement.w4, java.lang.Object):void");
    }

    private static <T extends InterfaceC2611w4<T>> boolean o(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.d() != EnumC2486g6.MESSAGE) {
            return true;
        }
        if (!key.h()) {
            return l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!l(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int a() {
        int i10 = this.f34397a.i();
        int iE = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iE += e(this.f34397a.g(i11));
        }
        Iterator it = this.f34397a.l().iterator();
        while (it.hasNext()) {
            iE += e((Map.Entry) it.next());
        }
        return iE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        C2595u4 c2595u4 = new C2595u4();
        int i10 = this.f34397a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            Map.Entry<K, Object> entryG = this.f34397a.g(i11);
            c2595u4.j((InterfaceC2611w4) entryG.getKey(), entryG.getValue());
        }
        Iterator it = this.f34397a.l().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c2595u4.j((InterfaceC2611w4) entry.getKey(), entry.getValue());
        }
        c2595u4.f34399c = this.f34399c;
        return c2595u4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2595u4) {
            return this.f34397a.equals(((C2595u4) obj).f34397a);
        }
        return false;
    }

    public final void h(C2595u4<T> c2595u4) {
        int i10 = c2595u4.f34397a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            k(c2595u4.f34397a.g(i11));
        }
        Iterator it = c2595u4.f34397a.l().iterator();
        while (it.hasNext()) {
            k((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f34397a.hashCode();
    }

    final Iterator<Map.Entry<T, Object>> m() {
        return this.f34397a.isEmpty() ? Collections.emptyIterator() : this.f34399c ? new P4(this.f34397a.n().iterator()) : this.f34397a.n().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.f34397a.isEmpty() ? Collections.emptyIterator() : this.f34399c ? new P4(this.f34397a.entrySet().iterator()) : this.f34397a.entrySet().iterator();
    }

    public final void q() {
        if (this.f34398b) {
            return;
        }
        int i10 = this.f34397a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            Object value = this.f34397a.g(i11).getValue();
            if (value instanceof F4) {
                ((F4) value).H();
            }
        }
        Iterator it = this.f34397a.l().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof F4) {
                ((F4) value2).H();
            }
        }
        this.f34397a.h();
        this.f34398b = true;
    }

    public final boolean r() {
        return this.f34398b;
    }

    public final boolean s() {
        int i10 = this.f34397a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (!o(this.f34397a.g(i11))) {
                return false;
            }
        }
        Iterator it = this.f34397a.l().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private C2595u4(G5<T, Object> g52) {
        this.f34397a = g52;
        q();
    }

    private C2595u4(boolean z10) {
        this(new F5());
        q();
    }
}
