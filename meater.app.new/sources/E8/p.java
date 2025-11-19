package E8;

import java.security.SecureRandom;

/* compiled from: Random.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f4135a = new a();

    /* compiled from: Random.java */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return p.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i10) {
        byte[] bArr = new byte[i10];
        f4135a.get().nextBytes(bArr);
        return bArr;
    }
}
