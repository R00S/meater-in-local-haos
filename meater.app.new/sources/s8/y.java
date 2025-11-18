package s8;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import s8.C4491A;

/* compiled from: ChaCha20Poly1305Key.java */
/* loaded from: classes2.dex */
public final class y extends AbstractC4503b {

    /* renamed from: a, reason: collision with root package name */
    private final C4491A f49520a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.b f49521b;

    /* renamed from: c, reason: collision with root package name */
    private final F8.a f49522c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f49523d;

    private y(C4491A c4491a, F8.b bVar, F8.a aVar, Integer num) {
        this.f49520a = c4491a;
        this.f49521b = bVar;
        this.f49522c = aVar;
        this.f49523d = num;
    }

    public static y a(C4491A.a aVar, F8.b bVar, Integer num) throws GeneralSecurityException {
        C4491A.a aVar2 = C4491A.a.f49399d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            C4491A c4491aA = C4491A.a(aVar);
            return new y(c4491aA, bVar, b(c4491aA, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static F8.a b(C4491A c4491a, Integer num) {
        if (c4491a.b() == C4491A.a.f49399d) {
            return F8.a.a(new byte[0]);
        }
        if (c4491a.b() == C4491A.a.f49398c) {
            return F8.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (c4491a.b() == C4491A.a.f49397b) {
            return F8.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + c4491a.b());
    }
}
