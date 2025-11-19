package oa;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Loa/t;", "T", "Loa/i;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(LBa/a;Ljava/lang/Object;)V", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "B", "LBa/a;", "C", "Ljava/lang/Object;", "_value", "D", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4175t<T> implements InterfaceC4164i<T>, Serializable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Ba.a<? extends T> initializer;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    public C4175t(Ba.a<? extends T> initializer, Object obj) {
        C3862t.g(initializer, "initializer");
        this.initializer = initializer;
        this._value = C4150C.f46603a;
        this.lock = obj == null ? this : obj;
    }

    @Override // oa.InterfaceC4164i
    public boolean b() {
        return this._value != C4150C.f46603a;
    }

    @Override // oa.InterfaceC4164i
    public T getValue() {
        T tInvoke;
        T t10 = (T) this._value;
        C4150C c4150c = C4150C.f46603a;
        if (t10 != c4150c) {
            return t10;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == c4150c) {
                Ba.a<? extends T> aVar = this.initializer;
                C3862t.d(aVar);
                tInvoke = aVar.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C4175t(Ba.a aVar, Object obj, int i10, C3854k c3854k) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
