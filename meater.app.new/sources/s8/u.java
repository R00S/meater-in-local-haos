package s8;

import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import r8.InterfaceC4363a;
import r8.l;
import u8.C4686a;

/* compiled from: AesGcmSivKeyManager.java */
/* loaded from: classes2.dex */
public final class u extends com.google.crypto.tink.internal.d<D8.n> {

    /* compiled from: AesGcmSivKeyManager.java */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, D8.n> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(D8.n nVar) {
            return new C4686a(nVar.a0().G());
        }
    }

    /* compiled from: AesGcmSivKeyManager.java */
    class b extends d.a<D8.o, D8.n> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<D8.o>> c() {
            HashMap map = new HashMap();
            l.b bVar = l.b.TINK;
            map.put("AES128_GCM_SIV", u.m(16, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            map.put("AES256_GCM_SIV", u.m(32, bVar));
            map.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public D8.n a(D8.o oVar) {
            return D8.n.c0().D(AbstractC2898h.j(E8.p.c(oVar.Z()))).E(u.this.n()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public D8.o d(AbstractC2898h abstractC2898h) {
            return D8.o.b0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(D8.o oVar) throws InvalidAlgorithmParameterException {
            E8.r.a(oVar.Z());
        }
    }

    u() {
        super(D8.n.class, new a(InterfaceC4363a.class));
    }

    private static boolean l() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0484a<D8.o> m(int i10, l.b bVar) {
        return new d.a.C0484a<>(D8.o.a0().D(i10).e(), bVar);
    }

    public static void p(boolean z10) {
        if (l()) {
            r8.x.l(new u(), z10);
            x.c();
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<D8.o, D8.n> f() {
        return new b(D8.o.class);
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
    public D8.n h(AbstractC2898h abstractC2898h) {
        return D8.n.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(D8.n nVar) throws GeneralSecurityException {
        E8.r.c(nVar.b0(), n());
        E8.r.a(nVar.a0().size());
    }
}
