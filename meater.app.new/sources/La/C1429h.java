package La;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;

/* compiled from: caches.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\"*\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u000b*\u0004\u0018\u00010\u00000\u00000\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\r\"<\u0010\u001e\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u0018j\u0002`\u001c\u0012\u0004\u0012\u00020\u00120\u00170\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\r*0\b\u0002\u0010\u001f\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u00182\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u001b0\u0018¨\u0006 "}, d2 = {"", "T", "Ljava/lang/Class;", "jClass", "LLa/X;", "k", "(Ljava/lang/Class;)LLa/X;", "LIa/g;", "l", "(Ljava/lang/Class;)LIa/g;", "LLa/a;", "kotlin.jvm.PlatformType", "a", "LLa/a;", "K_CLASS_CACHE", "LLa/v0;", "b", "K_PACKAGE_CACHE", "LIa/q;", "c", "CACHE_FOR_BASE_CLASSIFIERS", "d", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Loa/o;", "", "LIa/s;", "", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: La.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1429h {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1415a<X<? extends Object>> f11212a = C1417b.a(C1419c.f11182B);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1415a<C1457v0> f11213b = C1417b.a(C1421d.f11185B);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1415a<Ia.q> f11214c = C1417b.a(C1423e.f11199B);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC1415a<Ia.q> f11215d = C1417b.a(C1425f.f11204B);

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC1415a<ConcurrentHashMap<C4170o<List<Ia.s>, Boolean>, Ia.q>> f11216e = C1417b.a(C1427g.f11209B);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ia.q a(Class it) {
        C3862t.g(it, "it");
        return Ja.a.b(k(it), kotlin.collections.r.m(), false, kotlin.collections.r.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap b(Class it) {
        C3862t.g(it, "it");
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ia.q c(Class it) {
        C3862t.g(it, "it");
        return Ja.a.b(k(it), kotlin.collections.r.m(), true, kotlin.collections.r.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X d(Class it) {
        C3862t.g(it, "it");
        return new X(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1457v0 e(Class it) {
        C3862t.g(it, "it");
        return new C1457v0(it);
    }

    public static final <T> X<T> k(Class<T> jClass) {
        C3862t.g(jClass, "jClass");
        Ia.f fVarA = f11212a.a(jClass);
        C3862t.e(fVarA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (X) fVarA;
    }

    public static final <T> Ia.g l(Class<T> jClass) {
        C3862t.g(jClass, "jClass");
        return f11213b.a(jClass);
    }
}
