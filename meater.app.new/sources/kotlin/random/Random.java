package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.internal.C10868b;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: Random.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, m32267d2 = {"Lkotlin/random/Random;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "nextBits", HttpUrl.FRAGMENT_ENCODE_SET, "bitCount", "nextBoolean", HttpUrl.FRAGMENT_ENCODE_SET, "nextBytes", HttpUrl.FRAGMENT_ENCODE_SET, "array", "fromIndex", "toIndex", "size", "nextDouble", HttpUrl.FRAGMENT_ENCODE_SET, "until", "from", "nextFloat", HttpUrl.FRAGMENT_ENCODE_SET, "nextInt", "nextLong", HttpUrl.FRAGMENT_ENCODE_SET, "Default", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.d0.c, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class Random {

    /* renamed from: f */
    public static final a f37195f = new a(null);

    /* renamed from: g */
    private static final Random f37196g = C10868b.f41552a.mo39064b();

    /* compiled from: Random.kt */
    @Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m32267d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", HttpUrl.FRAGMENT_ENCODE_SET, "bitCount", "nextBoolean", HttpUrl.FRAGMENT_ENCODE_SET, "nextBytes", HttpUrl.FRAGMENT_ENCODE_SET, "array", "fromIndex", "toIndex", "size", "nextDouble", HttpUrl.FRAGMENT_ENCODE_SET, "until", "from", "nextFloat", HttpUrl.FRAGMENT_ENCODE_SET, "nextInt", "nextLong", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", HttpUrl.FRAGMENT_ENCODE_SET, "Serialized", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.d0.c$a */
    public static final class a extends Random implements Serializable {

        /* compiled from: Random.kt */
        @Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.d0.c$a$a, reason: collision with other inner class name */
        private static final class C11536a implements Serializable {

            /* renamed from: f */
            public static final C11536a f37197f = new C11536a();

            private C11536a() {
            }

            private final Object readResolve() {
                return Random.f37195f;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        private final Object writeReplace() {
            return C11536a.f37197f;
        }

        @Override // kotlin.random.Random
        /* renamed from: b */
        public int mo32374b(int i2) {
            return Random.f37196g.mo32374b(i2);
        }

        @Override // kotlin.random.Random
        /* renamed from: c */
        public int mo32375c() {
            return Random.f37196g.mo32375c();
        }

        @Override // kotlin.random.Random
        /* renamed from: d */
        public int mo32376d(int i2) {
            return Random.f37196g.mo32376d(i2);
        }

        @Override // kotlin.random.Random
        /* renamed from: e */
        public int mo32380e(int i2, int i3) {
            return Random.f37196g.mo32380e(i2, i3);
        }
    }

    /* renamed from: b */
    public abstract int mo32374b(int i2);

    /* renamed from: c */
    public abstract int mo32375c();

    /* renamed from: d */
    public abstract int mo32376d(int i2);

    /* renamed from: e */
    public int mo32380e(int i2, int i3) {
        int iMo32375c;
        int i4;
        int iMo32374b;
        int iMo32375c2;
        boolean z;
        C9834d.m32382b(i2, i3);
        int i5 = i3 - i2;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                iMo32374b = mo32374b(C9834d.m32383c(i5));
            } else {
                do {
                    iMo32375c = mo32375c() >>> 1;
                    i4 = iMo32375c % i5;
                } while ((iMo32375c - i4) + (i5 - 1) < 0);
                iMo32374b = i4;
            }
            return i2 + iMo32374b;
        }
        do {
            iMo32375c2 = mo32375c();
            z = false;
            if (i2 <= iMo32375c2 && iMo32375c2 < i3) {
                z = true;
            }
        } while (!z);
        return iMo32375c2;
    }
}
