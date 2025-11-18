package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: LazyJVM.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m32267d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.q, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: f */
    private Function0<? extends T> f40721f;

    /* renamed from: g */
    private volatile Object f40722g;

    /* renamed from: h */
    private final Object f40723h;

    public SynchronizedLazyImpl(Function0<? extends T> function0, Object obj) {
        C9801m.m32346f(function0, "initializer");
        this.f40721f = function0;
        this.f40722g = UNINITIALIZED_VALUE.f41438a;
        this.f40723h = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    /* renamed from: a */
    public boolean m37657a() {
        return this.f40722g != UNINITIALIZED_VALUE.f41438a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T tInvoke;
        T t = (T) this.f40722g;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f41438a;
        if (t != uninitialized_value) {
            return t;
        }
        synchronized (this.f40723h) {
            tInvoke = (T) this.f40722g;
            if (tInvoke == uninitialized_value) {
                Function0<? extends T> function0 = this.f40721f;
                C9801m.m32343c(function0);
                tInvoke = function0.invoke();
                this.f40722g = tInvoke;
                this.f40721f = null;
            }
        }
        return tInvoke;
    }

    public String toString() {
        return m37657a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ SynchronizedLazyImpl(Function0 function0, Object obj, int i2, C9789g c9789g) {
        this(function0, (i2 & 2) != 0 ? null : obj);
    }
}
