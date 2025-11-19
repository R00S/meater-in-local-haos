package Xc;

import Ba.l;
import Ba.p;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.B;
import kotlin.jvm.internal.C3862t;

/* compiled from: BeanDefinition.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010'R3\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b!\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b+\u0010,R,\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R(\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"LXc/b;", "T", "", "Ldd/a;", "scopeQualifier", "LIa/d;", "primaryType", "qualifier", "Lkotlin/Function2;", "Lfd/a;", "Lcd/a;", "Lorg/koin/core/definition/Definition;", "definition", "LXc/d;", "kind", "", "secondaryTypes", "<init>", "(Ldd/a;LIa/d;Ldd/a;LBa/p;LXc/d;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ldd/a;", "e", "()Ldd/a;", "b", "LIa/d;", "c", "()LIa/d;", "d", "setQualifier", "(Ldd/a;)V", "LBa/p;", "()LBa/p;", "LXc/d;", "getKind", "()LXc/d;", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", "(Ljava/util/List;)V", "LXc/c;", "LXc/c;", "getCallbacks", "()LXc/c;", "setCallbacks", "(LXc/c;)V", "callbacks", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dd.a scopeQualifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ia.d<?> primaryType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private dd.a qualifier;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p<fd.a, cd.a, T> definition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d kind;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<? extends Ia.d<?>> secondaryTypes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Callbacks<T> callbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public b(dd.a scopeQualifier, Ia.d<?> primaryType, dd.a aVar, p<? super fd.a, ? super cd.a, ? extends T> definition, d kind, List<? extends Ia.d<?>> secondaryTypes) {
        C3862t.g(scopeQualifier, "scopeQualifier");
        C3862t.g(primaryType, "primaryType");
        C3862t.g(definition, "definition");
        C3862t.g(kind, "kind");
        C3862t.g(secondaryTypes, "secondaryTypes");
        this.scopeQualifier = scopeQualifier;
        this.primaryType = primaryType;
        this.qualifier = aVar;
        this.definition = definition;
        this.kind = kind;
        this.secondaryTypes = secondaryTypes;
        this.callbacks = new Callbacks<>(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(Ia.d it) {
        C3862t.g(it, "it");
        return id.a.a(it);
    }

    public final p<fd.a, cd.a, T> b() {
        return this.definition;
    }

    public final Ia.d<?> c() {
        return this.primaryType;
    }

    /* renamed from: d, reason: from getter */
    public final dd.a getQualifier() {
        return this.qualifier;
    }

    /* renamed from: e, reason: from getter */
    public final dd.a getScopeQualifier() {
        return this.scopeQualifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        C3862t.e(other, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        b bVar = (b) other;
        return C3862t.b(this.primaryType, bVar.primaryType) && C3862t.b(this.qualifier, bVar.qualifier) && C3862t.b(this.scopeQualifier, bVar.scopeQualifier);
    }

    public final List<Ia.d<?>> f() {
        return this.secondaryTypes;
    }

    public final void g(List<? extends Ia.d<?>> list) {
        C3862t.g(list, "<set-?>");
        this.secondaryTypes = list;
    }

    public int hashCode() {
        dd.a aVar = this.qualifier;
        return ((((aVar != null ? aVar.hashCode() : 0) * 31) + this.primaryType.hashCode()) * 31) + this.scopeQualifier.hashCode();
    }

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.kind);
        sb2.append(": '");
        sb2.append(id.a.a(this.primaryType));
        sb2.append('\'');
        if (this.qualifier != null) {
            sb2.append(",qualifier:");
            sb2.append(this.qualifier);
        }
        if (!C3862t.b(this.scopeQualifier, ed.c.INSTANCE.a())) {
            sb2.append(",scope:");
            sb2.append(this.scopeQualifier);
        }
        if (!this.secondaryTypes.isEmpty()) {
            sb2.append(",binds:");
            B.p0(this.secondaryTypes, sb2, (124 & 2) != 0 ? ", " : ",", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new l() { // from class: Xc.a
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return b.h((Ia.d) obj);
                }
            });
        }
        sb2.append(']');
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }
}
