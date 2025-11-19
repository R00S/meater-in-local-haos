package x8;

import D8.p;
import D8.q;
import D8.y;
import E8.r;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.internal.m;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r8.InterfaceC4367e;
import r8.l;
import r8.x;

/* compiled from: AesSivKeyManager.java */
/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5076a extends d<p> {

    /* compiled from: AesSivKeyManager.java */
    /* renamed from: x8.a$a, reason: collision with other inner class name */
    class C0770a extends m<InterfaceC4367e, p> {
        C0770a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4367e a(p pVar) {
            return new E8.d(pVar.a0().G());
        }
    }

    /* compiled from: AesSivKeyManager.java */
    /* renamed from: x8.a$b */
    class b extends d.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<q>> c() {
            HashMap map = new HashMap();
            map.put("AES256_SIV", new d.a.C0484a(q.a0().D(64).e(), l.b.TINK));
            map.put("AES256_SIV_RAW", new d.a.C0484a(q.a0().D(64).e(), l.b.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return p.c0().D(AbstractC2898h.j(E8.p.c(qVar.Z()))).E(C5076a.this.k()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(AbstractC2898h abstractC2898h) {
            return q.b0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) throws InvalidAlgorithmParameterException {
            if (qVar.Z() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.Z() + ". Valid keys must have 64 bytes.");
        }
    }

    C5076a() {
        super(p.class, new C0770a(InterfaceC4367e.class));
    }

    public static void m(boolean z10) {
        x.l(new C5076a(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<q, p> f() {
        return new b(q.class);
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
    public p h(AbstractC2898h abstractC2898h) {
        return p.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) throws GeneralSecurityException {
        r.c(pVar.b0(), k());
        if (pVar.a0().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.a0().size() + ". Valid keys must have 64 bytes.");
    }
}
