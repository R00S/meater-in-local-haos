package Fa;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LFa/b;", "LFa/a;", "<init>", "()V", "Fa/b$a", "D", "LFa/b$a;", "implStorage", "Ljava/util/Random;", "d", "()Ljava/util/Random;", "impl", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fa.a {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final a implStorage = new a();

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Fa/b$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // Fa.a
    public Random d() {
        Random random = this.implStorage.get();
        C3862t.f(random, "get(...)");
        return random;
    }
}
