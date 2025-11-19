package ta;

import Ba.p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import ta.e;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001:\u0002\u0006\u0013J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lta/g;", "", "Lta/g$b;", "E", "Lta/g$c;", "key", "b", "(Lta/g$c;)Lta/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "L", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "context", "s", "(Lta/g;)Lta/g;", "N", "(Lta/g$c;)Lta/g;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface g {

    /* compiled from: CoroutineContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta/g;", "acc", "Lta/g$b;", "element", "a", "(Lta/g;Lta/g$b;)Lta/g;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ta.g$a$a, reason: collision with other inner class name */
        static final class C0711a extends AbstractC3864v implements p<g, b, g> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0711a f49999B = new C0711a();

            C0711a() {
                super(2);
            }

            @Override // Ba.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                C4587c c4587c;
                C3862t.g(acc, "acc");
                C3862t.g(element, "element");
                g gVarN = acc.N(element.getKey());
                h hVar = h.f50000B;
                if (gVarN == hVar) {
                    return element;
                }
                e.Companion bVar = e.INSTANCE;
                e eVar = (e) gVarN.b(bVar);
                if (eVar == null) {
                    c4587c = new C4587c(gVarN, element);
                } else {
                    g gVarN2 = gVarN.N(bVar);
                    if (gVarN2 == hVar) {
                        return new C4587c(element, eVar);
                    }
                    c4587c = new C4587c(new C4587c(gVarN2, element), eVar);
                }
                return c4587c;
            }
        }

        public static g a(g gVar, g context) {
            C3862t.g(context, "context");
            return context == h.f50000B ? gVar : (g) context.L(gVar, C0711a.f49999B);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lta/g$b;", "Lta/g;", "E", "Lta/g$c;", "key", "b", "(Lta/g$c;)Lta/g$b;", "getKey", "()Lta/g$c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> operation) {
                C3862t.g(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                C3862t.g(key, "key");
                if (!C3862t.b(bVar.getKey(), key)) {
                    return null;
                }
                C3862t.e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> key) {
                C3862t.g(key, "key");
                return C3862t.b(bVar.getKey(), key) ? h.f50000B : bVar;
            }

            public static g d(b bVar, g context) {
                C3862t.g(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // ta.g
        <E extends b> E b(c<E> key);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lta/g$c;", "Lta/g$b;", "E", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<E extends b> {
    }

    <R> R L(R initial, p<? super R, ? super b, ? extends R> operation);

    g N(c<?> key);

    <E extends b> E b(c<E> key);

    g s(g context);
}
