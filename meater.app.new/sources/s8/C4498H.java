package s8;

import D8.L;
import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r8.InterfaceC4363a;
import r8.l;

/* compiled from: XChaCha20Poly1305KeyManager.java */
/* renamed from: s8.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4498H extends com.google.crypto.tink.internal.d<D8.K> {

    /* compiled from: XChaCha20Poly1305KeyManager.java */
    /* renamed from: s8.H$a */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, D8.K> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(D8.K k10) {
            return new E8.s(k10.a0().G());
        }
    }

    C4498H() {
        super(D8.K.class, new a(InterfaceC4363a.class));
    }

    public static void m(boolean z10) {
        r8.x.l(new C4498H(), z10);
        C4501K.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<L, D8.K> f() {
        return new b(L.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public D8.K h(AbstractC2898h abstractC2898h) {
        return D8.K.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(D8.K k10) throws GeneralSecurityException {
        E8.r.c(k10.b0(), k());
        if (k10.a0().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* compiled from: XChaCha20Poly1305KeyManager.java */
    /* renamed from: s8.H$b */
    class b extends d.a<L, D8.K> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<L>> c() {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new d.a.C0484a(L.Y(), l.b.TINK));
            map.put("XCHACHA20_POLY1305_RAW", new d.a.C0484a(L.Y(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public D8.K a(L l10) {
            return D8.K.c0().E(C4498H.this.k()).D(AbstractC2898h.j(E8.p.c(32))).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public L d(AbstractC2898h abstractC2898h) {
            return L.Z(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(L l10) {
        }
    }
}
