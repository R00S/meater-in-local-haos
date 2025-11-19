package oa;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001bB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Loa/s;", "T", "Loa/i;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(LBa/a;)V", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "B", "LBa/a;", "", "C", "Ljava/lang/Object;", "_value", "D", "final", "getValue", "()Ljava/lang/Object;", "value", "E", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4174s<T> implements InterfaceC4164i<T>, Serializable {

    /* renamed from: F, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<C4174s<?>, Object> f46636F = AtomicReferenceFieldUpdater.newUpdater(C4174s.class, Object.class, "C");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private volatile Ba.a<? extends T> initializer;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private volatile Object _value;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Object final;

    public C4174s(Ba.a<? extends T> initializer) {
        C3862t.g(initializer, "initializer");
        this.initializer = initializer;
        C4150C c4150c = C4150C.f46603a;
        this._value = c4150c;
        this.final = c4150c;
    }

    @Override // oa.InterfaceC4164i
    public boolean b() {
        return this._value != C4150C.f46603a;
    }

    @Override // oa.InterfaceC4164i
    public T getValue() {
        T t10 = (T) this._value;
        C4150C c4150c = C4150C.f46603a;
        if (t10 != c4150c) {
            return t10;
        }
        Ba.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f46636F, this, c4150c, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
        }
        return (T) this._value;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
