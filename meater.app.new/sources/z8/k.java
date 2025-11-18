package z8;

import D8.u;
import D8.v;
import D8.w;
import D8.x;
import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.l;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import r8.l;
import r8.t;
import w8.C5009b;

/* compiled from: HmacKeyManager.java */
/* loaded from: classes2.dex */
public final class k extends com.google.crypto.tink.internal.d<v> {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.l<i, g> f53883d = com.google.crypto.tink.internal.l.b(new l.b() { // from class: z8.j
        @Override // com.google.crypto.tink.internal.l.b
        public final Object a(r8.g gVar) {
            return new A8.c((i) gVar);
        }
    }, i.class, g.class);

    /* compiled from: HmacKeyManager.java */
    class a extends com.google.crypto.tink.internal.m<t, v> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) throws GeneralSecurityException {
            u uVarB0 = vVar.d0().b0();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.c0().G(), "HMAC");
            int iC0 = vVar.d0().c0();
            int i10 = c.f53885a[uVarB0.ordinal()];
            if (i10 == 1) {
                return new E8.o(new E8.n("HMACSHA1", secretKeySpec), iC0);
            }
            if (i10 == 2) {
                return new E8.o(new E8.n("HMACSHA224", secretKeySpec), iC0);
            }
            if (i10 == 3) {
                return new E8.o(new E8.n("HMACSHA256", secretKeySpec), iC0);
            }
            if (i10 == 4) {
                return new E8.o(new E8.n("HMACSHA384", secretKeySpec), iC0);
            }
            if (i10 == 5) {
                return new E8.o(new E8.n("HMACSHA512", secretKeySpec), iC0);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* compiled from: HmacKeyManager.java */
    class b extends d.a<w, v> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<w>> c() {
            HashMap map = new HashMap();
            u uVar = u.SHA256;
            l.b bVar = l.b.TINK;
            map.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            map.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            map.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            map.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            map.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return v.g0().F(k.this.n()).E(wVar.c0()).D(AbstractC2898h.j(E8.p.c(wVar.b0()))).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(AbstractC2898h abstractC2898h) {
            return w.e0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) throws GeneralSecurityException {
            if (wVar.b0() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.c0());
        }
    }

    /* compiled from: HmacKeyManager.java */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53885a;

        static {
            int[] iArr = new int[u.values().length];
            f53885a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53885a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53885a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53885a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53885a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(t.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0484a<w> m(int i10, int i11, u uVar, l.b bVar) {
        return new d.a.C0484a<>(w.d0().E(x.d0().D(uVar).E(i11).e()).D(i10).e(), bVar);
    }

    public static void p(boolean z10) {
        r8.x.l(new k(), z10);
        n.c();
        com.google.crypto.tink.internal.h.c().d(f53883d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(x xVar) throws GeneralSecurityException {
        if (xVar.c0() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i10 = c.f53885a[xVar.b0().ordinal()];
        if (i10 == 1) {
            if (xVar.c0() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 2) {
            if (xVar.c0() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i10 == 3) {
            if (xVar.c0() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i10 == 4) {
            if (xVar.c0() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i10 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.c0() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public C5009b.EnumC0751b a() {
        return C5009b.EnumC0751b.f51986C;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<w, v> f() {
        return new b(w.class);
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
    public v h(AbstractC2898h abstractC2898h) {
        return v.h0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) throws GeneralSecurityException {
        E8.r.c(vVar.e0(), n());
        if (vVar.c0().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.d0());
    }
}
