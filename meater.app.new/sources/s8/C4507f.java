package s8;

import D8.C0988f;
import D8.C0989g;
import D8.C0990h;
import D8.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.C2905o;
import java.security.GeneralSecurityException;

/* compiled from: AesCtrKeyManager.java */
/* renamed from: s8.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4507f extends com.google.crypto.tink.internal.d<C0988f> {

    /* compiled from: AesCtrKeyManager.java */
    /* renamed from: s8.f$a */
    class a extends com.google.crypto.tink.internal.m<E8.l, C0988f> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public E8.l a(C0988f c0988f) {
            return new E8.a(c0988f.c0().G(), c0988f.d0().a0());
        }
    }

    /* compiled from: AesCtrKeyManager.java */
    /* renamed from: s8.f$b */
    class b extends d.a<C0989g, C0988f> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0988f a(C0989g c0989g) {
            return C0988f.g0().E(c0989g.c0()).D(AbstractC2898h.j(E8.p.c(c0989g.b0()))).F(C4507f.this.l()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0989g d(AbstractC2898h abstractC2898h) {
            return C0989g.e0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0989g c0989g) throws GeneralSecurityException {
            E8.r.a(c0989g.b0());
            C4507f.this.o(c0989g.c0());
        }
    }

    C4507f() {
        super(C0988f.class, new a(E8.l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(C0990h c0990h) throws GeneralSecurityException {
        if (c0990h.a0() < 12 || c0990h.a0() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<C0989g, C0988f> f() {
        return new b(C0989g.class);
    }

    @Override // com.google.crypto.tink.internal.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0988f h(AbstractC2898h abstractC2898h) {
        return C0988f.h0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C0988f c0988f) throws GeneralSecurityException {
        E8.r.c(c0988f.e0(), l());
        E8.r.a(c0988f.c0().size());
        o(c0988f.d0());
    }
}
