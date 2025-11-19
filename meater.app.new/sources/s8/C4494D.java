package s8;

import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;
import r8.InterfaceC4363a;

/* compiled from: KmsAeadKeyManager.java */
/* renamed from: s8.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4494D extends com.google.crypto.tink.internal.d<D8.E> {

    /* compiled from: KmsAeadKeyManager.java */
    /* renamed from: s8.D$a */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, D8.E> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(D8.E e10) {
            String strZ = e10.a0().Z();
            return r8.s.a(strZ).b(strZ);
        }
    }

    C4494D() {
        super(D8.E.class, new a(InterfaceC4363a.class));
    }

    public static void m(boolean z10) {
        r8.x.l(new C4494D(), z10);
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<D8.F, D8.E> f() {
        return new b(D8.F.class);
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
    public D8.E h(AbstractC2898h abstractC2898h) {
        return D8.E.d0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(D8.E e10) throws GeneralSecurityException {
        E8.r.c(e10.b0(), k());
    }

    /* compiled from: KmsAeadKeyManager.java */
    /* renamed from: s8.D$b */
    class b extends d.a<D8.F, D8.E> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public D8.E a(D8.F f10) {
            return D8.E.c0().D(f10).E(C4494D.this.k()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public D8.F d(AbstractC2898h abstractC2898h) {
            return D8.F.a0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(D8.F f10) {
        }
    }
}
