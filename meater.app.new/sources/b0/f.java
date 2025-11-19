package b0;

import Ba.p;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: Modifier.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lb0/f;", "Lb0/i;", "outer", "inner", "<init>", "(Lb0/i;Lb0/i;)V", "R", "initial", "Lkotlin/Function2;", "Lb0/i$b;", "operation", "c", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(LBa/l;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Lb0/i;", "n", "()Lb0/i;", "m", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i outer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i inner;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lb0/i$b;", "element", "a", "(Ljava/lang/String;Lb0/i$b;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements p<String, i.b, String> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f29913B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, i.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public f(i iVar, i iVar2) {
        this.outer = iVar;
        this.inner = iVar2;
    }

    @Override // b0.i
    public boolean a(Ba.l<? super i.b, Boolean> predicate) {
        return this.outer.a(predicate) && this.inner.a(predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.i
    public <R> R c(R initial, p<? super R, ? super i.b, ? extends R> operation) {
        return (R) this.inner.c(this.outer.c(initial, operation), operation);
    }

    public boolean equals(Object other) {
        if (other instanceof f) {
            f fVar = (f) other;
            if (C3862t.b(this.outer, fVar.outer) && C3862t.b(this.inner, fVar.inner)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    /* renamed from: m, reason: from getter */
    public final i getInner() {
        return this.inner;
    }

    /* renamed from: n, reason: from getter */
    public final i getOuter() {
        return this.outer;
    }

    public String toString() {
        return '[' + ((String) c("", a.f29913B)) + ']';
    }
}
