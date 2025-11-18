package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qu */
/* loaded from: classes2.dex */
final class C7093qu implements InterfaceC6873kw {

    /* renamed from: a */
    private final zzdnd f20407a;

    /* renamed from: b */
    private int f20408b;

    /* renamed from: c */
    private int f20409c;

    /* renamed from: d */
    private int f20410d = 0;

    private C7093qu(zzdnd zzdndVar) {
        zzdnd zzdndVar2 = (zzdnd) zzdod.m19743d(zzdndVar, "input");
        this.f20407a = zzdndVar2;
        zzdndVar2.f25668d = this;
    }

    /* renamed from: c */
    public static C7093qu m15804c(zzdnd zzdndVar) {
        C7093qu c7093qu = zzdndVar.f25668d;
        return c7093qu != null ? c7093qu : new C7093qu(zzdndVar);
    }

    /* renamed from: d */
    private final void m15805d(List<String> list, boolean z) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if ((this.f20408b & 7) != 2) {
            throw zzdok.m19755f();
        }
        if (!(list instanceof zzdot) || z) {
            do {
                list.add(z ? mo15455M() : mo15469a());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d = this.f20407a.mo15763d();
                }
            } while (iMo15763d == this.f20408b);
            this.f20410d = iMo15763d;
            return;
        }
        zzdot zzdotVar = (zzdot) list;
        do {
            zzdotVar.mo19769q0(mo15462T());
            if (this.f20407a.mo15779t()) {
                return;
            } else {
                iMo15763d2 = this.f20407a.mo15763d();
            }
        } while (iMo15763d2 == this.f20408b);
        this.f20410d = iMo15763d2;
    }

    /* renamed from: e */
    private final <T> T m15806e(InterfaceC6910lw<T> interfaceC6910lw, zzdno zzdnoVar) throws IOException {
        int iMo15772m = this.f20407a.mo15772m();
        zzdnd zzdndVar = this.f20407a;
        if (zzdndVar.f25665a >= zzdndVar.f25666b) {
            throw new zzdok("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo15783z = zzdndVar.mo15783z(iMo15772m);
        T tMo14823c = interfaceC6910lw.mo14823c();
        this.f20407a.f25665a++;
        interfaceC6910lw.mo14828h(tMo14823c, this, zzdnoVar);
        interfaceC6910lw.mo14826f(tMo14823c);
        this.f20407a.mo15781x(0);
        r5.f25665a--;
        this.f20407a.mo15759A(iMo15783z);
        return tMo14823c;
    }

    /* renamed from: f */
    private final <T> T m15807f(InterfaceC6910lw<T> interfaceC6910lw, zzdno zzdnoVar) throws IOException {
        int i2 = this.f20409c;
        this.f20409c = ((this.f20408b >>> 3) << 3) | 4;
        try {
            T tMo14823c = interfaceC6910lw.mo14823c();
            interfaceC6910lw.mo14828h(tMo14823c, this, zzdnoVar);
            interfaceC6910lw.mo14826f(tMo14823c);
            if (this.f20408b == this.f20409c) {
                return tMo14823c;
            }
            throw zzdok.m19756g();
        } finally {
            this.f20409c = i2;
        }
    }

    /* renamed from: g */
    private final void m15808g(int i2) throws IOException {
        if ((this.f20408b & 7) != i2) {
            throw zzdok.m19755f();
        }
    }

    /* renamed from: h */
    private static void m15809h(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw zzdok.m19756g();
        }
    }

    /* renamed from: j */
    private static void m15810j(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw zzdok.m19756g();
        }
    }

    /* renamed from: k */
    private final void m15811k(int i2) throws IOException {
        if (this.f20407a.mo15780u() != i2) {
            throw zzdok.m19750a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: B */
    public final void mo15444B(List<Long> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C7020ov)) {
            int i2 = this.f20408b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f20407a.mo15767h()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15772m = this.f20407a.mo15772m();
            m15809h(iMo15772m);
            int iMo15780u = this.f20407a.mo15780u() + iMo15772m;
            do {
                list.add(Long.valueOf(this.f20407a.mo15767h()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            return;
        }
        C7020ov c7020ov = (C7020ov) list;
        int i3 = this.f20408b & 7;
        if (i3 == 1) {
            do {
                c7020ov.m15693i(this.f20407a.mo15767h());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15772m2 = this.f20407a.mo15772m();
        m15809h(iMo15772m2);
        int iMo15780u2 = this.f20407a.mo15780u() + iMo15772m2;
        do {
            c7020ov.m15693i(this.f20407a.mo15767h());
        } while (this.f20407a.mo15780u() < iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: C */
    public final void mo15445C(List<Integer> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6724gv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20407a.mo15766g()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Integer.valueOf(this.f20407a.mo15766g()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C6724gv c6724gv = (C6724gv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c6724gv.mo15174Z0(this.f20407a.mo15766g());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c6724gv.mo15174Z0(this.f20407a.mo15766g());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: D */
    public final int mo15446D() throws IOException {
        m15808g(0);
        return this.f20407a.mo15776q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: E */
    public final long mo15447E() throws IOException {
        m15808g(0);
        return this.f20407a.mo15764e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: F */
    public final <K, V> void mo15448F(Map<K, V> map, C7205tv<K, V> c7205tv, zzdno zzdnoVar) throws IOException {
        m15808g(2);
        this.f20407a.mo15783z(this.f20407a.mo15772m());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: G */
    public final boolean mo15449G() throws IOException {
        m15808g(0);
        return this.f20407a.mo15769j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: H */
    public final void mo15450H(List<Long> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C7020ov)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f20407a.mo15777r()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Long.valueOf(this.f20407a.mo15777r()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C7020ov c7020ov = (C7020ov) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c7020ov.m15693i(this.f20407a.mo15777r());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c7020ov.m15693i(this.f20407a.mo15777r());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: I */
    public final void mo15451I(List<Integer> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6724gv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20407a.mo15776q()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Integer.valueOf(this.f20407a.mo15776q()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C6724gv c6724gv = (C6724gv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c6724gv.mo15174Z0(this.f20407a.mo15776q());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c6724gv.mo15174Z0(this.f20407a.mo15776q());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: J */
    public final long mo15452J() throws IOException {
        m15808g(0);
        return this.f20407a.mo15777r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: K */
    public final long mo15453K() throws IOException {
        m15808g(0);
        return this.f20407a.mo15765f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: L */
    public final long mo15454L() throws IOException {
        m15808g(1);
        return this.f20407a.mo15767h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: M */
    public final String mo15455M() throws IOException {
        m15808g(2);
        return this.f20407a.mo15770k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: N */
    public final int mo15456N() throws IOException {
        int i2 = this.f20410d;
        if (i2 != 0) {
            this.f20408b = i2;
            this.f20410d = 0;
        } else {
            this.f20408b = this.f20407a.mo15763d();
        }
        int i3 = this.f20408b;
        if (i3 == 0 || i3 == this.f20409c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: O */
    public final void mo15457O(List<zzdmr> list) throws IOException {
        int iMo15763d;
        if ((this.f20408b & 7) != 2) {
            throw zzdok.m19755f();
        }
        do {
            list.add(mo15462T());
            if (this.f20407a.mo15779t()) {
                return;
            } else {
                iMo15763d = this.f20407a.mo15763d();
            }
        } while (iMo15763d == this.f20408b);
        this.f20410d = iMo15763d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: P */
    public final int mo15458P() throws IOException {
        m15808g(0);
        return this.f20407a.mo15766g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: Q */
    public final <T> void mo15459Q(List<T> list, InterfaceC6910lw<T> interfaceC6910lw, zzdno zzdnoVar) throws IOException {
        int iMo15763d;
        int i2 = this.f20408b;
        if ((i2 & 7) != 3) {
            throw zzdok.m19755f();
        }
        do {
            list.add(m15807f(interfaceC6910lw, zzdnoVar));
            if (this.f20407a.mo15779t() || this.f20410d != 0) {
                return;
            } else {
                iMo15763d = this.f20407a.mo15763d();
            }
        } while (iMo15763d == i2);
        this.f20410d = iMo15763d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: R */
    public final int mo15460R() throws IOException {
        m15808g(5);
        return this.f20407a.mo15768i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: S */
    public final boolean mo15461S() throws IOException {
        int i2;
        if (this.f20407a.mo15779t() || (i2 = this.f20408b) == this.f20409c) {
            return false;
        }
        return this.f20407a.mo15782y(i2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: T */
    public final zzdmr mo15462T() throws IOException {
        m15808g(2);
        return this.f20407a.mo15771l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: U */
    public final <T> T mo15463U(InterfaceC6910lw<T> interfaceC6910lw, zzdno zzdnoVar) throws IOException {
        m15808g(2);
        return (T) m15806e(interfaceC6910lw, zzdnoVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: V */
    public final int mo15464V() throws IOException {
        m15808g(0);
        return this.f20407a.mo15772m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: W */
    public final void mo15465W(List<Integer> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6724gv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20407a.mo15773n()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Integer.valueOf(this.f20407a.mo15773n()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C6724gv c6724gv = (C6724gv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c6724gv.mo15174Z0(this.f20407a.mo15773n());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c6724gv.mo15174Z0(this.f20407a.mo15773n());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: X */
    public final int mo15466X() throws IOException {
        m15808g(0);
        return this.f20407a.mo15773n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: Y */
    public final void mo15467Y(List<Integer> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6724gv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20407a.mo15772m()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Integer.valueOf(this.f20407a.mo15772m()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C6724gv c6724gv = (C6724gv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c6724gv.mo15174Z0(this.f20407a.mo15772m());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c6724gv.mo15174Z0(this.f20407a.mo15772m());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: Z */
    public final <T> void mo15468Z(List<T> list, InterfaceC6910lw<T> interfaceC6910lw, zzdno zzdnoVar) throws IOException {
        int iMo15763d;
        int i2 = this.f20408b;
        if ((i2 & 7) != 2) {
            throw zzdok.m19755f();
        }
        do {
            list.add(m15806e(interfaceC6910lw, zzdnoVar));
            if (this.f20407a.mo15779t() || this.f20410d != 0) {
                return;
            } else {
                iMo15763d = this.f20407a.mo15763d();
            }
        } while (iMo15763d == i2);
        this.f20410d = iMo15763d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: a */
    public final String mo15469a() throws IOException {
        m15808g(2);
        return this.f20407a.mo15762c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: a0 */
    public final void mo15470a0(List<Long> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C7020ov)) {
            int i2 = this.f20408b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f20407a.mo15775p()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15772m = this.f20407a.mo15772m();
            m15809h(iMo15772m);
            int iMo15780u = this.f20407a.mo15780u() + iMo15772m;
            do {
                list.add(Long.valueOf(this.f20407a.mo15775p()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            return;
        }
        C7020ov c7020ov = (C7020ov) list;
        int i3 = this.f20408b & 7;
        if (i3 == 1) {
            do {
                c7020ov.m15693i(this.f20407a.mo15775p());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15772m2 = this.f20407a.mo15772m();
        m15809h(iMo15772m2);
        int iMo15780u2 = this.f20407a.mo15780u() + iMo15772m2;
        do {
            c7020ov.m15693i(this.f20407a.mo15775p());
        } while (this.f20407a.mo15780u() < iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: b */
    public final void mo15471b(List<String> list) throws IOException {
        m15805d(list, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: b0 */
    public final int mo15472b0() throws IOException {
        m15808g(5);
        return this.f20407a.mo15774o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: c0 */
    public final <T> T mo15473c0(InterfaceC6910lw<T> interfaceC6910lw, zzdno zzdnoVar) throws IOException {
        m15808g(3);
        return (T) m15807f(interfaceC6910lw, zzdnoVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: d0 */
    public final void mo15474d0(List<Integer> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6724gv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 2) {
                int iMo15772m = this.f20407a.mo15772m();
                m15810j(iMo15772m);
                int iMo15780u = this.f20407a.mo15780u() + iMo15772m;
                do {
                    list.add(Integer.valueOf(this.f20407a.mo15774o()));
                } while (this.f20407a.mo15780u() < iMo15780u);
                return;
            }
            if (i2 != 5) {
                throw zzdok.m19755f();
            }
            do {
                list.add(Integer.valueOf(this.f20407a.mo15774o()));
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d = this.f20407a.mo15763d();
                }
            } while (iMo15763d == this.f20408b);
            this.f20410d = iMo15763d;
            return;
        }
        C6724gv c6724gv = (C6724gv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 2) {
            int iMo15772m2 = this.f20407a.mo15772m();
            m15810j(iMo15772m2);
            int iMo15780u2 = this.f20407a.mo15780u() + iMo15772m2;
            do {
                c6724gv.mo15174Z0(this.f20407a.mo15774o());
            } while (this.f20407a.mo15780u() < iMo15780u2);
            return;
        }
        if (i3 != 5) {
            throw zzdok.m19755f();
        }
        do {
            c6724gv.mo15174Z0(this.f20407a.mo15774o());
            if (this.f20407a.mo15779t()) {
                return;
            } else {
                iMo15763d2 = this.f20407a.mo15763d();
            }
        } while (iMo15763d2 == this.f20408b);
        this.f20410d = iMo15763d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: e0 */
    public final long mo15475e0() throws IOException {
        m15808g(1);
        return this.f20407a.mo15775p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    public final int getTag() {
        return this.f20408b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: i */
    public final void mo15476i(List<Boolean> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6575cu)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f20407a.mo15769j()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Boolean.valueOf(this.f20407a.mo15769j()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C6575cu c6575cu = (C6575cu) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c6575cu.m14990f(this.f20407a.mo15769j());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c6575cu.m14990f(this.f20407a.mo15769j());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: n */
    public final void mo15477n(List<Integer> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6724gv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 2) {
                int iMo15772m = this.f20407a.mo15772m();
                m15810j(iMo15772m);
                int iMo15780u = this.f20407a.mo15780u() + iMo15772m;
                do {
                    list.add(Integer.valueOf(this.f20407a.mo15768i()));
                } while (this.f20407a.mo15780u() < iMo15780u);
                return;
            }
            if (i2 != 5) {
                throw zzdok.m19755f();
            }
            do {
                list.add(Integer.valueOf(this.f20407a.mo15768i()));
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d = this.f20407a.mo15763d();
                }
            } while (iMo15763d == this.f20408b);
            this.f20410d = iMo15763d;
            return;
        }
        C6724gv c6724gv = (C6724gv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 2) {
            int iMo15772m2 = this.f20407a.mo15772m();
            m15810j(iMo15772m2);
            int iMo15780u2 = this.f20407a.mo15780u() + iMo15772m2;
            do {
                c6724gv.mo15174Z0(this.f20407a.mo15768i());
            } while (this.f20407a.mo15780u() < iMo15780u2);
            return;
        }
        if (i3 != 5) {
            throw zzdok.m19755f();
        }
        do {
            c6724gv.mo15174Z0(this.f20407a.mo15768i());
            if (this.f20407a.mo15779t()) {
                return;
            } else {
                iMo15763d2 = this.f20407a.mo15763d();
            }
        } while (iMo15763d2 == this.f20408b);
        this.f20410d = iMo15763d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: o */
    public final void mo15478o(List<Float> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C6576cv)) {
            int i2 = this.f20408b & 7;
            if (i2 == 2) {
                int iMo15772m = this.f20407a.mo15772m();
                m15810j(iMo15772m);
                int iMo15780u = this.f20407a.mo15780u() + iMo15772m;
                do {
                    list.add(Float.valueOf(this.f20407a.mo15761b()));
                } while (this.f20407a.mo15780u() < iMo15780u);
                return;
            }
            if (i2 != 5) {
                throw zzdok.m19755f();
            }
            do {
                list.add(Float.valueOf(this.f20407a.mo15761b()));
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d = this.f20407a.mo15763d();
                }
            } while (iMo15763d == this.f20408b);
            this.f20410d = iMo15763d;
            return;
        }
        C6576cv c6576cv = (C6576cv) list;
        int i3 = this.f20408b & 7;
        if (i3 == 2) {
            int iMo15772m2 = this.f20407a.mo15772m();
            m15810j(iMo15772m2);
            int iMo15780u2 = this.f20407a.mo15780u() + iMo15772m2;
            do {
                c6576cv.m14994i(this.f20407a.mo15761b());
            } while (this.f20407a.mo15780u() < iMo15780u2);
            return;
        }
        if (i3 != 5) {
            throw zzdok.m19755f();
        }
        do {
            c6576cv.m14994i(this.f20407a.mo15761b());
            if (this.f20407a.mo15779t()) {
                return;
            } else {
                iMo15763d2 = this.f20407a.mo15763d();
            }
        } while (iMo15763d2 == this.f20408b);
        this.f20410d = iMo15763d2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: r */
    public final void mo15479r(List<Double> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C7204tu)) {
            int i2 = this.f20408b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f20407a.mo15760a()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15772m = this.f20407a.mo15772m();
            m15809h(iMo15772m);
            int iMo15780u = this.f20407a.mo15780u() + iMo15772m;
            do {
                list.add(Double.valueOf(this.f20407a.mo15760a()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            return;
        }
        C7204tu c7204tu = (C7204tu) list;
        int i3 = this.f20408b & 7;
        if (i3 == 1) {
            do {
                c7204tu.m15911f(this.f20407a.mo15760a());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15772m2 = this.f20407a.mo15772m();
        m15809h(iMo15772m2);
        int iMo15780u2 = this.f20407a.mo15780u() + iMo15772m2;
        do {
            c7204tu.m15911f(this.f20407a.mo15760a());
        } while (this.f20407a.mo15780u() < iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    public final double readDouble() throws IOException {
        m15808g(1);
        return this.f20407a.mo15760a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    public final float readFloat() throws IOException {
        m15808g(5);
        return this.f20407a.mo15761b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: t */
    public final void mo15480t(List<String> list) throws IOException {
        m15805d(list, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: u */
    public final void mo15481u(List<Long> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C7020ov)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f20407a.mo15765f()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Long.valueOf(this.f20407a.mo15765f()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C7020ov c7020ov = (C7020ov) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c7020ov.m15693i(this.f20407a.mo15765f());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c7020ov.m15693i(this.f20407a.mo15765f());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6873kw
    /* renamed from: z */
    public final void mo15482z(List<Long> list) throws IOException {
        int iMo15763d;
        int iMo15763d2;
        if (!(list instanceof C7020ov)) {
            int i2 = this.f20408b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f20407a.mo15764e()));
                    if (this.f20407a.mo15779t()) {
                        return;
                    } else {
                        iMo15763d = this.f20407a.mo15763d();
                    }
                } while (iMo15763d == this.f20408b);
                this.f20410d = iMo15763d;
                return;
            }
            if (i2 != 2) {
                throw zzdok.m19755f();
            }
            int iMo15780u = this.f20407a.mo15780u() + this.f20407a.mo15772m();
            do {
                list.add(Long.valueOf(this.f20407a.mo15764e()));
            } while (this.f20407a.mo15780u() < iMo15780u);
            m15811k(iMo15780u);
            return;
        }
        C7020ov c7020ov = (C7020ov) list;
        int i3 = this.f20408b & 7;
        if (i3 == 0) {
            do {
                c7020ov.m15693i(this.f20407a.mo15764e());
                if (this.f20407a.mo15779t()) {
                    return;
                } else {
                    iMo15763d2 = this.f20407a.mo15763d();
                }
            } while (iMo15763d2 == this.f20408b);
            this.f20410d = iMo15763d2;
            return;
        }
        if (i3 != 2) {
            throw zzdok.m19755f();
        }
        int iMo15780u2 = this.f20407a.mo15780u() + this.f20407a.mo15772m();
        do {
            c7020ov.m15693i(this.f20407a.mo15764e());
        } while (this.f20407a.mo15780u() < iMo15780u2);
        m15811k(iMo15780u2);
    }
}
