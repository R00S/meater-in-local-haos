package Ea;

import Ia.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ObservableProperty.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"LEa/c;", "V", "LEa/e;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "LIa/m;", "property", "oldValue", "newValue", "", "d", "(LIa/m;Ljava/lang/Object;Ljava/lang/Object;)Z", "Loa/F;", "c", "(LIa/m;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;LIa/m;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;LIa/m;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ea.c, reason: from toString */
/* loaded from: classes2.dex */
public abstract class ObservableProperty<V> implements e<Object, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private V value;

    public ObservableProperty(V v10) {
        this.value = v10;
    }

    @Override // Ea.e, Ea.d
    public V a(Object thisRef, m<?> property) {
        C3862t.g(property, "property");
        return this.value;
    }

    @Override // Ea.e
    public void b(Object thisRef, m<?> property, V value) {
        C3862t.g(property, "property");
        V v10 = this.value;
        if (d(property, v10, value)) {
            this.value = value;
            c(property, v10, value);
        }
    }

    protected void c(m<?> property, V oldValue, V newValue) {
        C3862t.g(property, "property");
    }

    protected boolean d(m<?> property, V oldValue, V newValue) {
        C3862t.g(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
