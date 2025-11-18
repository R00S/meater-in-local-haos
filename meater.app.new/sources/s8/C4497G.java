package s8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import s8.C4499I;

/* compiled from: XChaCha20Poly1305Key.java */
/* renamed from: s8.G, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4497G extends AbstractC4503b {

    /* renamed from: a, reason: collision with root package name */
    private final C4499I f49412a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f49413b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f49414c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f49415d;

    private C4497G(C4499I c4499i, F8.b bVar, F8.a aVar, Integer num) {
        this.f49412a = c4499i;
        this.f49413b = bVar;
        this.f49414c = aVar;
        this.f49415d = num;
    }

    public static C4497G a(C4499I.a aVar, F8.b bVar, Integer num) throws GeneralSecurityException {
        C4499I.a aVar2 = C4499I.a.f49420d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            C4499I c4499iA = C4499I.a(aVar);
            return new C4497G(c4499iA, bVar, b(c4499iA, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static F8.a b(C4499I c4499i, Integer num) {
        if (c4499i.b() == C4499I.a.f49420d) {
            return F8.a.a(new byte[0]);
        }
        if (c4499i.b() == C4499I.a.f49419c) {
            return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (c4499i.b() == C4499I.a.f49418b) {
            return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + c4499i.b());
    }
}
