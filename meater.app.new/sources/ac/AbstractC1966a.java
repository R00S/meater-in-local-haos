package ac;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Flow.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lac/a;", "T", "Lac/e;", "", "<init>", "()V", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1966a<T> implements InterfaceC1970e<T> {

    /* compiled from: Flow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ac.a$a, reason: collision with other inner class name */
    static final class C0291a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20339B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f20340C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ AbstractC1966a<T> f20341D;

        /* renamed from: E, reason: collision with root package name */
        int f20342E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0291a(AbstractC1966a<T> abstractC1966a, InterfaceC4588d<? super C0291a> interfaceC4588d) {
            super(interfaceC4588d);
            this.f20341D = abstractC1966a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20340C = obj;
            this.f20342E |= Integer.MIN_VALUE;
            return this.f20341D.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ac.InterfaceC1970e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ac.InterfaceC1971f<? super T> r6, ta.InterfaceC4588d<? super oa.C4153F> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ac.AbstractC1966a.C0291a
            if (r0 == 0) goto L13
            r0 = r7
            ac.a$a r0 = (ac.AbstractC1966a.C0291a) r0
            int r1 = r0.f20342E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20342E = r1
            goto L18
        L13:
            ac.a$a r0 = new ac.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f20340C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20342E
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f20339B
            bc.o r6 = (kotlin.C2299o) r6
            oa.C4173r.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            oa.C4173r.b(r7)
            bc.o r7 = new bc.o
            ta.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f20339B = r7     // Catch: java.lang.Throwable -> L55
            r0.f20342E = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.f(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            oa.F r6 = oa.C4153F.f46609a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.AbstractC1966a.b(ac.f, ta.d):java.lang.Object");
    }

    public abstract Object f(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d);
}
