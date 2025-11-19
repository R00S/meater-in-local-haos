package ia;

import Ba.p;
import Ba.q;
import ja.C3756a;
import ka.C3815c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: ActionDispatcher.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012,\u0010\n\u001a(\b\u0001\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0011\u001a\u00020\t2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0014\u001a\u00020\t2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2,\u0010\u0013\u001a(\b\u0001\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR=\u0010\n\u001a(\b\u0001\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lia/b;", "", "Lia/c;", "reducer", "Lkotlin/Function3;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lja/a;", "Lta/d;", "Loa/F;", "runError", "", "tag", "<init>", "(Lia/c;LBa/q;Ljava/lang/String;)V", "Lkotlin/Function2;", "onAction", "b", "(LBa/p;)V", "onError", "c", "(LBa/p;LBa/q;)V", "Lia/a;", "action", "d", "(Lia/a;)V", "a", "Lia/c;", "LBa/q;", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ia.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3637b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3638c reducer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<Exception, C3756a, InterfaceC4588d<? super C4153F>, Object> runError;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* compiled from: ActionDispatcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.uniflow.core.flow.ActionDispatcher$dispatchAction$1", f = "ActionDispatcher.kt", l = {23}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Lja/a;", "state", "Loa/F;", "<anonymous>", "(Ljava/lang/Exception;Lja/a;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ia.b$a */
    static final class a extends l implements q<Exception, C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43170B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43171C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f43172D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        @Override // Ba.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object g(Exception exc, C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            a aVar = C3637b.this.new a(interfaceC4588d);
            aVar.f43171C = exc;
            aVar.f43172D = c3756a;
            return aVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43170B;
            if (i10 == 0) {
                C4173r.b(obj);
                Exception exc = (Exception) this.f43171C;
                C3756a c3756a = (C3756a) this.f43172D;
                q qVar = C3637b.this.runError;
                this.f43171C = null;
                this.f43170B = 1;
                if (qVar.g(exc, c3756a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3637b(C3638c reducer, q<? super Exception, ? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> runError, String tag) {
        C3862t.g(reducer, "reducer");
        C3862t.g(runError, "runError");
        C3862t.g(tag, "tag");
        this.reducer = reducer;
        this.runError = runError;
        this.tag = tag;
    }

    public final void b(p<? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onAction) {
        C3862t.g(onAction, "onAction");
        c(onAction, new a(null));
    }

    public final void c(p<? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onAction, q<? super Exception, ? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onError) {
        C3862t.g(onAction, "onAction");
        C3862t.g(onError, "onError");
        d(new C3636a(onAction, onError, null, 4, null));
    }

    public final void d(C3636a action) {
        C3862t.g(action, "action");
        C3815c.f43834a.a(this.tag + " - enqueue: " + action);
        this.reducer.f(action);
    }
}
