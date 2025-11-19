package s8;

import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import r8.InterfaceC4363a;

/* compiled from: KmsEnvelopeAeadKeyManager.java */
/* renamed from: s8.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4496F extends com.google.crypto.tink.internal.d<D8.G> {

    /* compiled from: KmsEnvelopeAeadKeyManager.java */
    /* renamed from: s8.F$a */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, D8.G> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(D8.G g10) {
            String strA0 = g10.a0().a0();
            return new C4495E(g10.a0().Z(), r8.s.a(strA0).b(strA0));
        }
    }

    /* compiled from: KmsEnvelopeAeadKeyManager.java */
    /* renamed from: s8.F$b */
    class b extends d.a<D8.H, D8.G> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public D8.G a(D8.H h10) {
            return D8.G.c0().D(h10).E(C4496F.this.k()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public D8.H d(AbstractC2898h abstractC2898h) {
            return D8.H.c0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(D8.H h10) throws GeneralSecurityException {
            if (h10.a0().isEmpty() || !h10.b0()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    C4496F() {
        super(D8.G.class, new a(InterfaceC4363a.class));
    }

    public static void m(boolean z10) {
        r8.x.l(new C4496F(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<D8.H, D8.G> f() {
        return new b(D8.H.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public D8.G h(AbstractC2898h abstractC2898h) {
        return D8.G.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(D8.G g10) throws GeneralSecurityException {
        E8.r.c(g10.b0(), k());
    }
}
