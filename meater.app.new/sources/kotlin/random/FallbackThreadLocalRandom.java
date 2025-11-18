package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;

/* compiled from: PlatformRandom.kt */
@Metadata(m32266d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, m32267d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "()V", "impl", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "implStorage", "kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Lkotlin/random/FallbackThreadLocalRandom$implStorage$1;", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.d0.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    /* renamed from: h */
    private final a f37194h = new a();

    /* compiled from: PlatformRandom.kt */
    @Metadata(m32266d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m32267d2 = {"kotlin/random/FallbackThreadLocalRandom$implStorage$1", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "initialValue", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.d0.b$a */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.AbstractPlatformRandom
    /* renamed from: f */
    public Random mo32377f() {
        Random random = this.f37194h.get();
        C9801m.m32345e(random, "implStorage.get()");
        return random;
    }
}
