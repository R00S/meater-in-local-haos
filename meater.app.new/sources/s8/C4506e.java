package s8;

import D8.C0986d;
import D8.C0987e;
import D8.C0988f;
import D8.C0989g;
import D8.C0990h;
import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r8.InterfaceC4363a;
import r8.l;
import w8.C5009b;

/* compiled from: AesCtrHmacAeadKeyManager.java */
/* renamed from: s8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4506e extends com.google.crypto.tink.internal.d<C0986d> {

    /* compiled from: AesCtrHmacAeadKeyManager.java */
    /* renamed from: s8.e$a */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, C0986d> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(C0986d c0986d) {
            return new E8.h((E8.l) new C4507f().e(c0986d.b0(), E8.l.class), (r8.t) new z8.k().e(c0986d.c0(), r8.t.class), c0986d.c0().d0().c0());
        }
    }

    /* compiled from: AesCtrHmacAeadKeyManager.java */
    /* renamed from: s8.e$b */
    class b extends d.a<C0987e, C0986d> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<C0987e>> c() {
            HashMap map = new HashMap();
            D8.u uVar = D8.u.SHA256;
            l.b bVar = l.b.TINK;
            map.put("AES128_CTR_HMAC_SHA256", C4506e.m(16, 16, 32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", C4506e.m(16, 16, 32, 16, uVar, bVar2));
            map.put("AES256_CTR_HMAC_SHA256", C4506e.m(32, 16, 32, 32, uVar, bVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", C4506e.m(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0986d a(C0987e c0987e) {
            C0988f c0988f = (C0988f) new C4507f().f().a(c0987e.a0());
            return C0986d.e0().D(c0988f).E((D8.v) new z8.k().f().a(c0987e.b0())).F(C4506e.this.n()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0987e d(AbstractC2898h abstractC2898h) {
            return C0987e.d0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0987e c0987e) throws InvalidAlgorithmParameterException {
            new C4507f().f().e(c0987e.a0());
            new z8.k().f().e(c0987e.b0());
            E8.r.a(c0987e.a0().b0());
        }
    }

    C4506e() {
        super(C0986d.class, new a(InterfaceC4363a.class));
    }

    private static C0987e l(int i10, int i11, int i12, int i13, D8.u uVar) {
        C0989g c0989gE = C0989g.d0().E(C0990h.b0().D(i11).e()).D(i10).e();
        return C0987e.c0().D(c0989gE).E(D8.w.d0().E(D8.x.d0().D(uVar).E(i13).e()).D(i12).e()).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0484a<C0987e> m(int i10, int i11, int i12, int i13, D8.u uVar, l.b bVar) {
        return new d.a.C0484a<>(l(i10, i11, i12, i13, uVar), bVar);
    }

    public static void p(boolean z10) {
        r8.x.l(new C4506e(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public C5009b.EnumC0751b a() {
        return C5009b.EnumC0751b.f51986C;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<C0987e, C0986d> f() {
        return new b(C0987e.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0986d h(AbstractC2898h abstractC2898h) {
        return C0986d.g0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(C0986d c0986d) throws GeneralSecurityException {
        E8.r.c(c0986d.d0(), n());
        new C4507f().j(c0986d.b0());
        new z8.k().j(c0986d.c0());
    }
}
