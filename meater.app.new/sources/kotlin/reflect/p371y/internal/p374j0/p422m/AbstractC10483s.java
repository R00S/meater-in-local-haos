package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* compiled from: ArrayMapOwner.kt */
/* renamed from: kotlin.f0.y.e.j0.m.s */
/* loaded from: classes3.dex */
public abstract class AbstractC10483s<K, V> {

    /* renamed from: a */
    private final ConcurrentHashMap<KClass<? extends K>, Integer> f40491a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AtomicInteger f40492b = new AtomicInteger(0);

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.s$a */
    static final class a extends Lambda implements Function1<KClass<? extends K>, Integer> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10483s<K, V> f40493f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC10483s<K, V> abstractC10483s) {
            super(1);
            this.f40493f = abstractC10483s;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(KClass<? extends K> kClass) {
            C9801m.m32346f(kClass, "it");
            return Integer.valueOf(((AbstractC10483s) this.f40493f).f40492b.getAndIncrement());
        }
    }

    /* renamed from: b */
    public abstract <T extends K> int mo36575b(ConcurrentHashMap<KClass<? extends K>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends K>, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T extends V, KK extends K> C10478n<K, V, T> m37220c(KClass<KK> kClass) {
        C9801m.m32346f(kClass, "kClass");
        return new C10478n<>(kClass, m37221d(kClass));
    }

    /* renamed from: d */
    public final <T extends K> int m37221d(KClass<T> kClass) {
        C9801m.m32346f(kClass, "kClass");
        return mo36575b(this.f40491a, kClass, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final Collection<Integer> m37222e() {
        Collection<Integer> collectionValues = this.f40491a.values();
        C9801m.m32345e(collectionValues, "idPerType.values");
        return collectionValues;
    }
}
