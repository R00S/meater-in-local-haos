package kotlinx.coroutines.flow;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9782c0;
import okhttp3.HttpUrl;

/* compiled from: Limit.kt */
@Metadata(m32266d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000323\b\u0004\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aH\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\b\u001a\u0002H\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aH\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001ap\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\b\u0001\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u0013\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001b¢\u0006\u0002\b\u001cø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m32267d2 = {"collectWhile", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlinx/coroutines/flow/Flow;", "predicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drop", "count", HttpUrl.FRAGMENT_ENCODE_SET, "dropWhile", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "emitAbort", "Lkotlinx/coroutines/flow/FlowCollector;", "emitAbort$FlowKt__LimitKt", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "transformWhile", "R", "transform", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.z2.i */
/* loaded from: classes3.dex */
final /* synthetic */ class C11083i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(m32266d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m32267d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.z2.i$a */
    public static final class a<T> implements Flow<T> {

        /* renamed from: f */
        final /* synthetic */ Flow f41924f;

        /* renamed from: g */
        final /* synthetic */ Function2 f41925g;

        public a(Flow flow, Function2 function2) {
            this.f41924f = flow;
            this.f41925g = function2;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo2408a(FlowCollector<? super T> flowCollector, Continuation<? super C10775u> continuation) {
            Object objMo2408a = this.f41924f.mo2408a(new b(new C9782c0(), flowCollector, this.f41925g), continuation);
            return objMo2408a == C10855d.m39045c() ? objMo2408a : C10775u.f41439a;
        }
    }

    /* compiled from: Limit.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.z2.i$b */
    static final class b<T> implements FlowCollector {

        /* renamed from: f */
        final /* synthetic */ C9782c0 f41926f;

        /* renamed from: g */
        final /* synthetic */ FlowCollector<T> f41927g;

        /* renamed from: h */
        final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f41928h;

        /* compiled from: Limit.kt */
        @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
        @DebugMetadata(m39049c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m39050f = "Limit.kt", m39051l = {37, 38, 40}, m39052m = "emit")
        /* renamed from: kotlinx.coroutines.z2.i$b$a */
        static final class a extends ContinuationImpl {

            /* renamed from: f */
            Object f41929f;

            /* renamed from: g */
            Object f41930g;

            /* renamed from: h */
            /* synthetic */ Object f41931h;

            /* renamed from: i */
            final /* synthetic */ b<T> f41932i;

            /* renamed from: j */
            int f41933j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f41932i = bVar;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f41931h = obj;
                this.f41933j |= Integer.MIN_VALUE;
                return this.f41932i.mo2409c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(C9782c0 c9782c0, FlowCollector<? super T> flowCollector, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f41926f = c9782c0;
            this.f41927g = flowCollector;
            this.f41928h = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo2409c(T r7, kotlin.coroutines.Continuation<? super kotlin.C10775u> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C11083i.b.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.z2.i$b$a r0 = (kotlinx.coroutines.flow.C11083i.b.a) r0
                int r1 = r0.f41933j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f41933j = r1
                goto L18
            L13:
                kotlinx.coroutines.z2.i$b$a r0 = new kotlinx.coroutines.z2.i$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f41931h
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r2 = r0.f41933j
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.C10568o.m37655b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f41930g
                java.lang.Object r2 = r0.f41929f
                kotlinx.coroutines.z2.i$b r2 = (kotlinx.coroutines.flow.C11083i.b) r2
                kotlin.C10568o.m37655b(r8)
                goto L6c
            L41:
                kotlin.C10568o.m37655b(r8)
                goto L59
            L45:
                kotlin.C10568o.m37655b(r8)
                kotlin.a0.d.c0 r8 = r6.f41926f
                boolean r8 = r8.f37168f
                if (r8 == 0) goto L5c
                kotlinx.coroutines.z2.c<T> r8 = r6.f41927g
                r0.f41933j = r5
                java.lang.Object r7 = r8.mo2409c(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                kotlin.u r7 = kotlin.C10775u.f41439a
                return r7
            L5c:
                kotlin.a0.c.p<T, kotlin.y.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f41928h
                r0.f41929f = r6
                r0.f41930g = r7
                r0.f41933j = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.a0.d.c0 r8 = r2.f41926f
                r8.f37168f = r5
                kotlinx.coroutines.z2.c<T> r8 = r2.f41927g
                r2 = 0
                r0.f41929f = r2
                r0.f41930g = r2
                r0.f41933j = r3
                java.lang.Object r7 = r8.mo2409c(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                kotlin.u r7 = kotlin.C10775u.f41439a
                return r7
            L8b:
                kotlin.u r7 = kotlin.C10775u.f41439a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C11083i.b.mo2409c(java.lang.Object, kotlin.y.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> Flow<T> m39733a(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new a(flow, function2);
    }
}
