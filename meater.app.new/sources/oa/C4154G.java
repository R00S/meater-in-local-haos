package oa;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Loa/G;", "T", "Loa/i;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(LBa/a;)V", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "B", "LBa/a;", "", "C", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oa.G, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4154G<T> implements InterfaceC4164i<T>, Serializable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Ba.a<? extends T> initializer;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Object _value;

    public C4154G(Ba.a<? extends T> initializer) {
        C3862t.g(initializer, "initializer");
        this.initializer = initializer;
        this._value = C4150C.f46603a;
    }

    @Override // oa.InterfaceC4164i
    public boolean b() {
        return this._value != C4150C.f46603a;
    }

    @Override // oa.InterfaceC4164i
    public T getValue() {
        if (this._value == C4150C.f46603a) {
            Ba.a<? extends T> aVar = this.initializer;
            C3862t.d(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    public String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
