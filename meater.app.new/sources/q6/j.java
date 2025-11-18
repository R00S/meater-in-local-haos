package q6;

import H6.k;
import H6.l;
import I6.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m6.InterfaceC3970e;
import r1.InterfaceC4339f;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final H6.h<InterfaceC3970e, String> f48110a = new H6.h<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4339f<b> f48111b = I6.a.d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    class a implements a.d<b> {
        a() {
        }

        @Override // I6.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    private static final class b implements a.f {

        /* renamed from: B, reason: collision with root package name */
        final MessageDigest f48113B;

        /* renamed from: C, reason: collision with root package name */
        private final I6.c f48114C = I6.c.a();

        b(MessageDigest messageDigest) {
            this.f48113B = messageDigest;
        }

        @Override // I6.a.f
        public I6.c p() {
            return this.f48114C;
        }
    }

    private String a(InterfaceC3970e interfaceC3970e) {
        b bVar = (b) k.d(this.f48111b.b());
        try {
            interfaceC3970e.b(bVar.f48113B);
            return l.w(bVar.f48113B.digest());
        } finally {
            this.f48111b.a(bVar);
        }
    }

    public String b(InterfaceC3970e interfaceC3970e) {
        String strG;
        synchronized (this.f48110a) {
            strG = this.f48110a.g(interfaceC3970e);
        }
        if (strG == null) {
            strG = a(interfaceC3970e);
        }
        synchronized (this.f48110a) {
            this.f48110a.k(interfaceC3970e, strG);
        }
        return strG;
    }
}
