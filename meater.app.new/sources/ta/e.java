package ta;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: ContinuationInterceptor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lta/e;", "Lta/g$b;", "T", "Lta/d;", "continuation", "m", "(Lta/d;)Lta/d;", "Loa/F;", "l", "(Lta/d;)V", "z", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface e extends g.b {

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f49998B;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> key) {
            E e10;
            C3862t.g(key, "key");
            if (!(key instanceof AbstractC4586b)) {
                if (e.INSTANCE != key) {
                    return null;
                }
                C3862t.e(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            AbstractC4586b abstractC4586b = (AbstractC4586b) key;
            if (!abstractC4586b.a(eVar.getKey()) || (e10 = (E) abstractC4586b.b(eVar)) == null) {
                return null;
            }
            return e10;
        }

        public static g b(e eVar, g.c<?> key) {
            C3862t.g(key, "key");
            if (!(key instanceof AbstractC4586b)) {
                return e.INSTANCE == key ? h.f50000B : eVar;
            }
            AbstractC4586b abstractC4586b = (AbstractC4586b) key;
            return (!abstractC4586b.a(eVar.getKey()) || abstractC4586b.b(eVar) == null) ? eVar : h.f50000B;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lta/e$b;", "Lta/g$c;", "Lta/e;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ta.e$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<e> {

        /* renamed from: B, reason: collision with root package name */
        static final /* synthetic */ Companion f49998B = new Companion();

        private Companion() {
        }
    }

    void l(InterfaceC4588d<?> continuation);

    <T> InterfaceC4588d<T> m(InterfaceC4588d<? super T> continuation);
}
