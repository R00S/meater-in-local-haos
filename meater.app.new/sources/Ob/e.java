package Ob;

import kotlin.jvm.internal.C3862t;

/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes3.dex */
public abstract class e<K, T> extends AbstractC1584a<K, T> {

    /* renamed from: B, reason: collision with root package name */
    private c<T> f13529B;

    protected e(c<T> arrayMap) {
        C3862t.g(arrayMap, "arrayMap");
        this.f13529B = arrayMap;
    }

    @Override // Ob.AbstractC1584a
    protected final c<T> c() {
        return this.f13529B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ob.AbstractC1584a
    protected final void j(String keyQualifiedName, T value) {
        C3862t.g(keyQualifiedName, "keyQualifiedName");
        C3862t.g(value, "value");
        int iE = h().e(keyQualifiedName);
        int iC = this.f13529B.c();
        if (iC == 0) {
            this.f13529B = new o(value, iE);
            return;
        }
        if (iC == 1) {
            c<T> cVar = this.f13529B;
            C3862t.e(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.i() == iE) {
                this.f13529B = new o(value, iE);
                return;
            } else {
                d dVar = new d();
                this.f13529B = dVar;
                dVar.h(oVar.i(), oVar.j());
            }
        }
        this.f13529B.h(iE, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f13542B;
        C3862t.e(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }
}
