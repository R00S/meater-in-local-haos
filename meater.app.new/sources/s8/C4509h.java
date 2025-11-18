package s8;

import D8.C0991i;
import D8.C0992j;
import D8.C0993k;
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

/* compiled from: AesEaxKeyManager.java */
/* renamed from: s8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4509h extends com.google.crypto.tink.internal.d<C0991i> {

    /* compiled from: AesEaxKeyManager.java */
    /* renamed from: s8.h$a */
    class a extends com.google.crypto.tink.internal.m<InterfaceC4363a, C0991i> {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC4363a a(C0991i c0991i) {
            return new E8.b(c0991i.b0().G(), c0991i.c0().a0());
        }
    }

    /* compiled from: AesEaxKeyManager.java */
    /* renamed from: s8.h$b */
    class b extends d.a<C0992j, C0991i> {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.internal.d.a
        public Map<String, d.a.C0484a<C0992j>> c() {
            HashMap map = new HashMap();
            l.b bVar = l.b.TINK;
            map.put("AES128_EAX", C4509h.l(16, 16, bVar));
            l.b bVar2 = l.b.RAW;
            map.put("AES128_EAX_RAW", C4509h.l(16, 16, bVar2));
            map.put("AES256_EAX", C4509h.l(32, 16, bVar));
            map.put("AES256_EAX_RAW", C4509h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0991i a(C0992j c0992j) {
            return C0991i.e0().D(AbstractC2898h.j(E8.p.c(c0992j.a0()))).E(c0992j.b0()).F(C4509h.this.m()).e();
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0992j d(AbstractC2898h abstractC2898h) {
            return C0992j.d0(abstractC2898h, C2905o.b());
        }

        @Override // com.google.crypto.tink.internal.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0992j c0992j) throws GeneralSecurityException {
            E8.r.a(c0992j.a0());
            if (c0992j.b0().a0() != 12 && c0992j.b0().a0() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    C4509h() {
        super(C0991i.class, new a(InterfaceC4363a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0484a<C0992j> l(int i10, int i11, l.b bVar) {
        return new d.a.C0484a<>(C0992j.c0().D(i10).E(C0993k.b0().D(i11).e()).e(), bVar);
    }

    public static void o(boolean z10) {
        r8.x.l(new C4509h(), z10);
        C4515n.c();
    }

    @Override // com.google.crypto.tink.internal.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.internal.d
    public d.a<C0992j, C0991i> f() {
        return new b(C0992j.class);
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
    public C0991i h(AbstractC2898h abstractC2898h) {
        return C0991i.g0(abstractC2898h, C2905o.b());
    }

    @Override // com.google.crypto.tink.internal.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C0991i c0991i) throws GeneralSecurityException {
        E8.r.c(c0991i.d0(), m());
        E8.r.a(c0991i.b0().size());
        if (c0991i.c0().a0() != 12 && c0991i.c0().a0() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
