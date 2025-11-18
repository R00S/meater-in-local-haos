package Xc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KoinDefinition.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LXc/e;", "R", "", "Lbd/a;", "module", "LZc/b;", "factory", "<init>", "(Lbd/a;LZc/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbd/a;", "b", "()Lbd/a;", "LZc/b;", "()LZc/b;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Xc.e, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class KoinDefinition<R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final bd.a module;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Zc.b<R> factory;

    public KoinDefinition(bd.a module, Zc.b<R> factory) {
        C3862t.g(module, "module");
        C3862t.g(factory, "factory");
        this.module = module;
        this.factory = factory;
    }

    public final Zc.b<R> a() {
        return this.factory;
    }

    /* renamed from: b, reason: from getter */
    public final bd.a getModule() {
        return this.module;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KoinDefinition)) {
            return false;
        }
        KoinDefinition koinDefinition = (KoinDefinition) other;
        return C3862t.b(this.module, koinDefinition.module) && C3862t.b(this.factory, koinDefinition.factory);
    }

    public int hashCode() {
        return (this.module.hashCode() * 31) + this.factory.hashCode();
    }

    public String toString() {
        return "KoinDefinition(module=" + this.module + ", factory=" + this.factory + ')';
    }
}
