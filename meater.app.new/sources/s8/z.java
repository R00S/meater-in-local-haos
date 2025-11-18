package s8;

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

/* compiled from: ChaCha20Poly1305KeyManager.java */
/* loaded from: classes2.dex */
public class z extends com.google.crypto.tink.internal.d<D8.r> {

    /* compiled from: ChaCha20Poly1305KeyManager.java */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, D8.r> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(D8.r rVar) {
            return new E8.g(rVar.a0().G());
        }
    }

    z() {
        super(D8.r.class, new a(InterfaceC4363a.class));
    }

    public static void m(boolean z10) {
        r8.x.l(new z(), z10);
        C4493C.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<D8.s, D8.r> f() {
        return new b(D8.s.class);
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
    public D8.r h(AbstractC2898h abstractC2898h) {
        return D8.r.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(D8.r rVar) throws GeneralSecurityException {
        E8.r.c(rVar.b0(), k());
        if (rVar.a0().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* compiled from: ChaCha20Poly1305KeyManager.java */
    class b extends d.a<D8.s, D8.r> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<D8.s>> c() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new d.a.C0484a(D8.s.Y(), l.b.TINK));
            map.put("CHACHA20_POLY1305_RAW", new d.a.C0484a(D8.s.Y(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public D8.r a(D8.s sVar) {
            return D8.r.c0().E(z.this.k()).D(AbstractC2898h.j(E8.p.c(32))).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public D8.s d(AbstractC2898h abstractC2898h) {
            return D8.s.Z(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(D8.s sVar) {
        }
    }
}
