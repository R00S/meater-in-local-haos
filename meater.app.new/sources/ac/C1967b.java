package ac;

import kotlin.AbstractC2288d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lac/b;", "T", "Lac/c;", "Lkotlin/Function2;", "LZb/t;", "Lta/d;", "Loa/F;", "", "block", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "<init>", "(LBa/p;Lta/g;ILZb/d;)V", "scope", "h", "(LZb/t;Lta/d;)Ljava/lang/Object;", "Lbc/d;", "k", "(Lta/g;ILZb/d;)Lbc/d;", "F", "LBa/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ac.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1967b<T> extends C1968c<T> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<Zb.t<? super T>, InterfaceC4588d<? super C4153F>, Object> block;

    /* compiled from: Builders.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ac.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20344B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f20345C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1967b<T> f20346D;

        /* renamed from: E, reason: collision with root package name */
        int f20347E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1967b<T> c1967b, InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
            this.f20346D = c1967b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20345C = obj;
            this.f20347E |= Integer.MIN_VALUE;
            return this.f20346D.h(null, this);
        }
    }

    public /* synthetic */ C1967b(Ba.p pVar, ta.g gVar, int i10, Zb.d dVar, int i11, C3854k c3854k) {
        this(pVar, (i11 & 2) != 0 ? ta.h.f50000B : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Zb.d.f19650B : dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ac.C1968c, kotlin.AbstractC2288d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object h(Zb.t<? super T> r5, ta.InterfaceC4588d<? super oa.C4153F> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ac.C1967b.a
            if (r0 == 0) goto L13
            r0 = r6
            ac.b$a r0 = (ac.C1967b.a) r0
            int r1 = r0.f20347E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20347E = r1
            goto L18
        L13:
            ac.b$a r0 = new ac.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20345C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20347E
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f20344B
            Zb.t r5 = (Zb.t) r5
            oa.C4173r.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            oa.C4173r.b(r6)
            r0.f20344B = r5
            r0.f20347E = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.A()
            if (r5 == 0) goto L4c
            oa.F r5 = oa.C4153F.f46609a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C1967b.h(Zb.t, ta.d):java.lang.Object");
    }

    @Override // kotlin.AbstractC2288d
    protected AbstractC2288d<T> k(ta.g context, int capacity, Zb.d onBufferOverflow) {
        return new C1967b(this.block, context, capacity, onBufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1967b(Ba.p<? super Zb.t<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, ta.g gVar, int i10, Zb.d dVar) {
        super(pVar, gVar, i10, dVar);
        this.block = pVar;
    }
}
