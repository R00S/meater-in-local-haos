package ta;

import Ba.p;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lta/c;", "Lta/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lta/g$b;", "element", "<init>", "(Lta/g;Lta/g$b;)V", "", "i", "()I", "", "c", "(Lta/g$b;)Z", "context", "h", "(Lta/c;)Z", "E", "Lta/g$c;", "key", "b", "(Lta/g$c;)Lta/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "L", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "N", "(Lta/g$c;)Lta/g;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "B", "Lta/g;", "C", "Lta/g$b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ta.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4587c implements g, Serializable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final g left;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final g.b element;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lta/g$b;", "element", "a", "(Ljava/lang/String;Lta/g$b;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ta.c$a */
    static final class a extends AbstractC3864v implements p<String, g.b, String> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f49996B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            C3862t.g(acc, "acc");
            C3862t.g(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C4587c(g left, g.b element) {
        C3862t.g(left, "left");
        C3862t.g(element, "element");
        this.left = left;
        this.element = element;
    }

    private final boolean c(g.b element) {
        return C3862t.b(b(element.getKey()), element);
    }

    private final boolean h(C4587c context) {
        while (c(context.element)) {
            g gVar = context.left;
            if (!(gVar instanceof C4587c)) {
                C3862t.e(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
            context = (C4587c) gVar;
        }
        return false;
    }

    private final int i() {
        int i10 = 2;
        C4587c c4587c = this;
        while (true) {
            g gVar = c4587c.left;
            c4587c = gVar instanceof C4587c ? (C4587c) gVar : null;
            if (c4587c == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // ta.g
    public <R> R L(R initial, p<? super R, ? super g.b, ? extends R> operation) {
        C3862t.g(operation, "operation");
        return operation.invoke((Object) this.left.L(initial, operation), this.element);
    }

    @Override // ta.g
    public g N(g.c<?> key) {
        C3862t.g(key, "key");
        if (this.element.b(key) != null) {
            return this.left;
        }
        g gVarN = this.left.N(key);
        return gVarN == this.left ? this : gVarN == h.f50000B ? this.element : new C4587c(gVarN, this.element);
    }

    @Override // ta.g
    public <E extends g.b> E b(g.c<E> key) {
        C3862t.g(key, "key");
        C4587c c4587c = this;
        while (true) {
            E e10 = (E) c4587c.element.b(key);
            if (e10 != null) {
                return e10;
            }
            g gVar = c4587c.left;
            if (!(gVar instanceof C4587c)) {
                return (E) gVar.b(key);
            }
            c4587c = (C4587c) gVar;
        }
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof C4587c) {
                C4587c c4587c = (C4587c) other;
                if (c4587c.i() != i() || !c4587c.h(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // ta.g
    public g s(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) L("", a.f49996B)) + ']';
    }
}
