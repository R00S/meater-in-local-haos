package F8;

import r8.y;

/* compiled from: SecretBytes.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f4563a;

    private b(a aVar) {
        this.f4563a = aVar;
    }

    public static b a(byte[] bArr, y yVar) {
        if (yVar != null) {
            return new b(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.f4563a.c();
    }
}
