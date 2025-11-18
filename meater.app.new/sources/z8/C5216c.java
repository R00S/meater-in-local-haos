package z8;

import D8.C0983a;
import D8.C0984b;
import D8.C0985c;
import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r8.l;
import r8.t;
import r8.x;

/* compiled from: AesCmacKeyManager.java */
/* renamed from: z8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5216c extends com.google.crypto.tink.internal.d<C0983a> {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.l<C5214a, g> f53855d = com.google.crypto.tink.internal.l.b(new l.b() { // from class: z8.b
        @Override // com.google.crypto.tink.internal.l.b
        public final Object a(r8.g gVar) {
            return new A8.b((C5214a) gVar);
        }
    }, C5214a.class, g.class);

    /* compiled from: AesCmacKeyManager.java */
    /* renamed from: z8.c$a */
    class a extends com.google.crypto.tink.internal.m<t, C0983a> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(C0983a c0983a) {
            return new E8.o(new E8.m(c0983a.b0().G()), c0983a.c0().a0());
        }
    }

    /* compiled from: AesCmacKeyManager.java */
    /* renamed from: z8.c$b */
    class b extends d.a<C0984b, C0983a> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<C0984b>> c() {
            HashMap map = new HashMap();
            C0984b c0984bE = C0984b.c0().D(32).E(C0985c.b0().D(16).e()).e();
            l.b bVar = l.b.TINK;
            map.put("AES_CMAC", new d.a.C0484a(c0984bE, bVar));
            map.put("AES256_CMAC", new d.a.C0484a(C0984b.c0().D(32).E(C0985c.b0().D(16).e()).e(), bVar));
            map.put("AES256_CMAC_RAW", new d.a.C0484a(C0984b.c0().D(32).E(C0985c.b0().D(16).e()).e(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0983a a(C0984b c0984b) {
            return C0983a.e0().F(0).D(AbstractC2898h.j(E8.p.c(c0984b.a0()))).E(c0984b.b0()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0984b d(AbstractC2898h abstractC2898h) {
            return C0984b.d0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0984b c0984b) throws GeneralSecurityException {
            C5216c.q(c0984b.b0());
            C5216c.r(c0984b.a0());
        }
    }

    C5216c() {
        super(C0983a.class, new a(t.class));
    }

    public static void o(boolean z10) {
        x.l(new C5216c(), z10);
        f.c();
        com.google.crypto.tink.internal.h.c().d(f53855d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(C0985c c0985c) throws GeneralSecurityException {
        if (c0985c.a0() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c0985c.a0() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<C0984b, C0983a> f() {
        return new b(C0984b.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0983a h(AbstractC2898h abstractC2898h) {
        return C0983a.g0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C0983a c0983a) throws GeneralSecurityException {
        E8.r.c(c0983a.d0(), m());
        r(c0983a.b0().size());
        q(c0983a.c0());
    }
}
