package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdnu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yu */
/* loaded from: classes2.dex */
final class C7389yu<FieldDescriptorType extends zzdnu<FieldDescriptorType>> {

    /* renamed from: a */
    private static final C7389yu f21318a = new C7389yu(true);

    /* renamed from: c */
    private boolean f21320c;

    /* renamed from: d */
    private boolean f21321d = false;

    /* renamed from: b */
    private final C7021ow<FieldDescriptorType, Object> f21319b = C7021ow.m15702p(16);

    private C7389yu() {
    }

    /* renamed from: f */
    static int m16109f(zzdri zzdriVar, int i2, Object obj) {
        int iM19635h0 = zzdni.m19635h0(i2);
        if (zzdriVar == zzdri.f25818o) {
            zzdod.m19749j((zzdpk) obj);
            iM19635h0 <<= 1;
        }
        return iM19635h0 + m16116q(zzdriVar, obj);
    }

    /* renamed from: g */
    private final Object m16110g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f21319b.get(fielddescriptortype);
        return obj instanceof zzdon ? zzdon.m19760e() : obj;
    }

    /* renamed from: i */
    private final void m16111i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.m19710t()) {
            m16112j(fielddescriptortype.m19707p(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                m16112j(fielddescriptortype.m19707p(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzdon) {
            this.f21321d = true;
        }
        this.f21319b.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m16112j(com.google.android.gms.internal.ads.zzdri r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzdod.m19740a(r3)
            int[] r0 = com.google.android.gms.internal.ads.C7426zu.f21478a
            com.google.android.gms.internal.ads.zzdrn r2 = r2.m19793g()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdpk
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdon
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdoe
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L50
        L4f:
            throw r2
        L50:
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7389yu.m16112j(com.google.android.gms.internal.ads.zzdri, java.lang.Object):void");
    }

    /* renamed from: k */
    private static Object m16113k(Object obj) {
        if (obj instanceof zzdpr) {
            return ((zzdpr) obj).m19779e0();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: m */
    public static <T extends zzdnu<T>> C7389yu<T> m16114m() {
        return f21318a;
    }

    /* renamed from: p */
    private static int m16115p(zzdnu<?> zzdnuVar, Object obj) {
        zzdri zzdriVarM19707p = zzdnuVar.m19707p();
        int iM19706i = zzdnuVar.m19706i();
        if (!zzdnuVar.m19710t()) {
            return m16109f(zzdriVarM19707p, iM19706i, obj);
        }
        int iM16109f = 0;
        if (zzdnuVar.m19711w()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM16109f += m16116q(zzdriVarM19707p, it.next());
            }
            return zzdni.m19635h0(iM19706i) + iM16109f + zzdni.m19647p0(iM16109f);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM16109f += m16109f(zzdriVarM19707p, iM19706i, it2.next());
        }
        return iM16109f;
    }

    /* renamed from: q */
    private static int m16116q(zzdri zzdriVar, Object obj) {
        switch (C7426zu.f21479b[zzdriVar.ordinal()]) {
            case 1:
                return zzdni.m19618H(((Double) obj).doubleValue());
            case 2:
                return zzdni.m19652s0(((Float) obj).floatValue());
            case 3:
                return zzdni.m19626V(((Long) obj).longValue());
            case 4:
                return zzdni.m19627W(((Long) obj).longValue());
            case 5:
                return zzdni.m19636i0(((Integer) obj).intValue());
            case 6:
                return zzdni.m19629Y(((Long) obj).longValue());
            case 7:
                return zzdni.m19639l0(((Integer) obj).intValue());
            case 8:
                return zzdni.m19616G(((Boolean) obj).booleanValue());
            case 9:
                return zzdni.m19612C0((zzdpk) obj);
            case 10:
                return obj instanceof zzdon ? zzdni.m19634e((zzdon) obj) : zzdni.m19610A0((zzdpk) obj);
            case 11:
                return obj instanceof zzdmr ? zzdni.m19625Q((zzdmr) obj) : zzdni.m19650r0((String) obj);
            case 12:
                return obj instanceof zzdmr ? zzdni.m19625Q((zzdmr) obj) : zzdni.m19646p((byte[]) obj);
            case 13:
                return zzdni.m19637j0(((Integer) obj).intValue());
            case 14:
                return zzdni.m19641m0(((Integer) obj).intValue());
            case 15:
                return zzdni.m19630Z(((Long) obj).longValue());
            case 16:
                return zzdni.m19638k0(((Integer) obj).intValue());
            case 17:
                return zzdni.m19628X(((Long) obj).longValue());
            case 18:
                return obj instanceof zzdoe ? zzdni.m19643n0(((zzdoe) obj).mo17879i()) : zzdni.m19643n0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: r */
    private static boolean m16117r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.m19709s() == zzdrn.MESSAGE) {
            if (key.m19710t()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzdpk) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzdpk)) {
                    if (value instanceof zzdon) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzdpk) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private final void m16118s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzdon) {
            value = zzdon.m19760e();
        }
        if (key.m19710t()) {
            Object objM16110g = m16110g(key);
            if (objM16110g == null) {
                objM16110g = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM16110g).add(m16113k(it.next()));
            }
            this.f21319b.put(key, objM16110g);
            return;
        }
        if (key.m19709s() != zzdrn.MESSAGE) {
            this.f21319b.put(key, m16113k(value));
            return;
        }
        Object objM16110g2 = m16110g(key);
        if (objM16110g2 == null) {
            this.f21319b.put(key, m16113k(value));
        } else {
            this.f21319b.put(key, objM16110g2 instanceof zzdpr ? key.m19705C((zzdpr) objM16110g2, (zzdpr) value) : key.m19708r(((zzdpk) objM16110g2).mo19725b(), (zzdpk) value).mo19736p0());
        }
    }

    /* renamed from: t */
    private static int m16119t(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.m19709s() != zzdrn.MESSAGE || key.m19710t() || key.m19711w()) ? m16115p(key, value) : value instanceof zzdon ? zzdni.m19657y(entry.getKey().m19706i(), (zzdon) value) : zzdni.m19624O(entry.getKey().m19706i(), (zzdpk) value);
    }

    /* renamed from: a */
    final Iterator<Map.Entry<FieldDescriptorType, Object>> m16120a() {
        return this.f21321d ? new C6835jv(this.f21319b.m15709j().iterator()) : this.f21319b.m15709j().iterator();
    }

    /* renamed from: b */
    final boolean m16121b() {
        return this.f21319b.isEmpty();
    }

    /* renamed from: c */
    public final boolean m16122c() {
        return this.f21320c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C7389yu c7389yu = new C7389yu();
        for (int i2 = 0; i2 < this.f21319b.m15707h(); i2++) {
            Map.Entry<K, Object> entryM15710q = this.f21319b.m15710q(i2);
            c7389yu.m16111i((zzdnu) entryM15710q.getKey(), entryM15710q.getValue());
        }
        Iterator it = this.f21319b.m15708i().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c7389yu.m16111i((zzdnu) entry.getKey(), entry.getValue());
        }
        c7389yu.f21321d = this.f21321d;
        return c7389yu;
    }

    /* renamed from: d */
    public final boolean m16123d() {
        for (int i2 = 0; i2 < this.f21319b.m15707h(); i2++) {
            if (!m16117r(this.f21319b.m15710q(i2))) {
                return false;
            }
        }
        Iterator it = this.f21319b.m15708i().iterator();
        while (it.hasNext()) {
            if (!m16117r((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> m16124e() {
        return this.f21321d ? new C6835jv(this.f21319b.entrySet().iterator()) : this.f21319b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7389yu) {
            return this.f21319b.equals(((C7389yu) obj).f21319b);
        }
        return false;
    }

    /* renamed from: h */
    public final void m16125h(C7389yu<FieldDescriptorType> c7389yu) {
        for (int i2 = 0; i2 < c7389yu.f21319b.m15707h(); i2++) {
            m16118s(c7389yu.f21319b.m15710q(i2));
        }
        Iterator it = c7389yu.f21319b.m15708i().iterator();
        while (it.hasNext()) {
            m16118s((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f21319b.hashCode();
    }

    /* renamed from: l */
    public final void m16126l() {
        if (this.f21320c) {
            return;
        }
        this.f21319b.mo15706f();
        this.f21320c = true;
    }

    /* renamed from: n */
    public final int m16127n() {
        int iM16115p = 0;
        for (int i2 = 0; i2 < this.f21319b.m15707h(); i2++) {
            Map.Entry<K, Object> entryM15710q = this.f21319b.m15710q(i2);
            iM16115p += m16115p((zzdnu) entryM15710q.getKey(), entryM15710q.getValue());
        }
        Iterator it = this.f21319b.m15708i().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM16115p += m16115p((zzdnu) entry.getKey(), entry.getValue());
        }
        return iM16115p;
    }

    /* renamed from: o */
    public final int m16128o() {
        int iM16119t = 0;
        for (int i2 = 0; i2 < this.f21319b.m15707h(); i2++) {
            iM16119t += m16119t(this.f21319b.m15710q(i2));
        }
        Iterator it = this.f21319b.m15708i().iterator();
        while (it.hasNext()) {
            iM16119t += m16119t((Map.Entry) it.next());
        }
        return iM16119t;
    }

    private C7389yu(boolean z) {
        m16126l();
    }
}
