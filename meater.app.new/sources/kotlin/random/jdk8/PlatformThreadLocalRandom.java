package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.random.AbstractPlatformRandom;
import okhttp3.HttpUrl;

/* compiled from: PlatformThreadLocalRandom.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m32267d2 = {"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "nextDouble", HttpUrl.FRAGMENT_ENCODE_SET, "until", "nextInt", HttpUrl.FRAGMENT_ENCODE_SET, "from", "nextLong", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib-jdk8"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.d0.e.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.Random
    /* renamed from: e */
    public int mo32380e(int i2, int i3) {
        return ThreadLocalRandom.current().nextInt(i2, i3);
    }

    @Override // kotlin.random.AbstractPlatformRandom
    /* renamed from: f */
    public Random mo32377f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C9801m.m32345e(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
