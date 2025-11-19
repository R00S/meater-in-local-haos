package s8;

import D8.C0994l;
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

/* compiled from: AesGcmKeyManager.java */
/* renamed from: s8.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4517p extends com.google.crypto.tink.internal.d<C0994l> {

    /* compiled from: AesGcmKeyManager.java */
    /* renamed from: s8.p$a */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, C0994l> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(C0994l c0994l) {
            return new E8.c(c0994l.a0().G());
        }
    }

    /* compiled from: AesGcmKeyManager.java */
    /* renamed from: s8.p$b */
    class b extends d.a<D8.m, C0994l> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<D8.m>> c() {
            HashMap map = new HashMap();
            l.b bVar = l.b.TINK;
            map.put("AES128_GCM", C4517p.l(16, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_GCM_RAW", C4517p.l(16, bVar2));
            map.put("AES256_GCM", C4517p.l(32, bVar));
            map.put("AES256_GCM_RAW", C4517p.l(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0994l a(D8.m mVar) {
            return C0994l.c0().D(AbstractC2898h.j(E8.p.c(mVar.Z()))).E(C4517p.this.m()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public D8.m d(AbstractC2898h abstractC2898h) {
            return D8.m.b0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(D8.m mVar) throws InvalidAlgorithmParameterException {
            E8.r.a(mVar.Z());
        }
    }

    C4517p() {
        super(C0994l.class, new a(InterfaceC4363a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0484a<D8.m> l(int i10, l.b bVar) {
        return new d.a.C0484a<>(D8.m.a0().D(i10).e(), bVar);
    }

    public static void o(boolean z10) {
        r8.x.l(new C4517p(), z10);
        s.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public C5009b.EnumC0751b a() {
        return C5009b.EnumC0751b.f51986C;
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<D8.m, C0994l> f() {
        return new b(D8.m.class);
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
    public C0994l h(AbstractC2898h abstractC2898h) {
        return C0994l.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C0994l c0994l) throws GeneralSecurityException {
        E8.r.c(c0994l.b0(), m());
        E8.r.a(c0994l.a0().size());
    }
}
