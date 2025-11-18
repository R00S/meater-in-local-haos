package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: LazyJVM.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m32267d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", HttpUrl.FRAGMENT_ENCODE_SET, "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.p, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: f */
    public static final a f40716f = new a(null);

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f40717g = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "i");

    /* renamed from: h */
    private volatile Function0<? extends T> f40718h;

    /* renamed from: i */
    private volatile Object f40719i;

    /* renamed from: j */
    private final Object f40720j;

    /* compiled from: LazyJVM.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R^\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lkotlin/SafePublicationLazyImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.p$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public SafePublicationLazyImpl(Function0<? extends T> function0) {
        C9801m.m32346f(function0, "initializer");
        this.f40718h = function0;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f41438a;
        this.f40719i = uninitialized_value;
        this.f40720j = uninitialized_value;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    /* renamed from: a */
    public boolean m37656a() {
        return this.f40719i != UNINITIALIZED_VALUE.f41438a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t = (T) this.f40719i;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f41438a;
        if (t != uninitialized_value) {
            return t;
        }
        Function0<? extends T> function0 = this.f40718h;
        if (function0 != null) {
            T tInvoke = function0.invoke();
            if (f40717g.compareAndSet(this, uninitialized_value, tInvoke)) {
                this.f40718h = null;
                return tInvoke;
            }
        }
        return (T) this.f40719i;
    }

    public String toString() {
        return m37656a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
