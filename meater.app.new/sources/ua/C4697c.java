package ua;

import Ba.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lta/d;", "", "receiver", "completion", "d", "(LBa/p;Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "Loa/F;", "a", "(LBa/p;Ljava/lang/Object;Lta/d;)Lta/d;", "c", "(Lta/d;)Lta/d;", "b", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: ua.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4697c {

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"ua/c$a", "Lkotlin/coroutines/jvm/internal/j;", "Loa/q;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "B", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ua.c$a */
    public static final class a extends j {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p f50517C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Object f50518D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4588d interfaceC4588d, p pVar, Object obj) {
            super(interfaceC4588d);
            this.f50517C = pVar;
            this.f50518D = obj;
            C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                C4173r.b(result);
                C3862t.e(this.f50517C, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) W.f(this.f50517C, 2)).invoke(this.f50518D, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            C4173r.b(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"ua/c$b", "Lkotlin/coroutines/jvm/internal/d;", "Loa/q;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "B", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ua.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int label;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p f50520C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Object f50521D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4588d interfaceC4588d, g gVar, p pVar, Object obj) {
            super(interfaceC4588d, gVar);
            this.f50520C = pVar;
            this.f50521D = obj;
            C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                C4173r.b(result);
                C3862t.e(this.f50520C, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) W.f(this.f50520C, 2)).invoke(this.f50521D, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            C4173r.b(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ua/c$c", "Lkotlin/coroutines/jvm/internal/j;", "Loa/q;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ua.c$c, reason: collision with other inner class name */
    public static final class C0723c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0723c(InterfaceC4588d<? super T> interfaceC4588d) {
            super(interfaceC4588d);
            C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object result) {
            C4173r.b(result);
            return result;
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ua/c$d", "Lkotlin/coroutines/jvm/internal/d;", "Loa/q;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ua.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC4588d<? super T> interfaceC4588d, g gVar) {
            super(interfaceC4588d, gVar);
            C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object result) {
            C4173r.b(result);
            return result;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> InterfaceC4588d<C4153F> a(p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, R r10, InterfaceC4588d<? super T> completion) {
        C3862t.g(pVar, "<this>");
        C3862t.g(completion, "completion");
        InterfaceC4588d<?> interfaceC4588dA = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, interfaceC4588dA);
        }
        g context = interfaceC4588dA.getContext();
        return context == ta.h.f50000B ? new a(interfaceC4588dA, pVar, r10) : new b(interfaceC4588dA, context, pVar, r10);
    }

    private static final <T> InterfaceC4588d<T> b(InterfaceC4588d<? super T> interfaceC4588d) {
        g context = interfaceC4588d.getContext();
        return context == ta.h.f50000B ? new C0723c(interfaceC4588d) : new d(interfaceC4588d, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC4588d<T> c(InterfaceC4588d<? super T> interfaceC4588d) {
        InterfaceC4588d<T> interfaceC4588d2;
        C3862t.g(interfaceC4588d, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = interfaceC4588d instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) interfaceC4588d : null;
        return (dVar == null || (interfaceC4588d2 = (InterfaceC4588d<T>) dVar.intercepted()) == null) ? interfaceC4588d : interfaceC4588d2;
    }

    public static <R, T> Object d(p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, R r10, InterfaceC4588d<? super T> completion) {
        C3862t.g(pVar, "<this>");
        C3862t.g(completion, "completion");
        return ((p) W.f(pVar, 2)).invoke(r10, b(h.a(completion)));
    }
}
