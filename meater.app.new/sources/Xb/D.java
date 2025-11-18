package Xb;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LXb/I;", "Lta/g;", "context", "d", "(LXb/I;Lta/g;)Lta/g;", "addedContext", "e", "(Lta/g;Lta/g;)Lta/g;", "", "c", "(Lta/g;)Z", "originalContext", "appendContext", "isNewCoroutine", "a", "(Lta/g;Lta/g;Z)Lta/g;", "Lta/d;", "", "oldValue", "LXb/X0;", "g", "(Lta/d;Lta/g;Ljava/lang/Object;)LXb/X0;", "Lkotlin/coroutines/jvm/internal/e;", "f", "(Lkotlin/coroutines/jvm/internal/e;)LXb/X0;", "", "b", "(Lta/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D {

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta/g;", "result", "Lta/g$b;", "element", "a", "(Lta/g;Lta/g$b;)Lta/g;"}, k = 3, mv = {1, 9, 0})
    static final class a extends AbstractC3864v implements Ba.p<ta.g, g.b, ta.g> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f19009B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ta.g invoke(ta.g gVar, g.b bVar) {
            return bVar instanceof C ? gVar.s(((C) bVar).Q()) : gVar.s(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lta/g;", "result", "Lta/g$b;", "element", "a", "(Lta/g;Lta/g$b;)Lta/g;"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements Ba.p<ta.g, g.b, ta.g> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<ta.g> f19010B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f19011C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.O<ta.g> o10, boolean z10) {
            super(2);
            this.f19010B = o10;
            this.f19011C = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, ta.g] */
        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ta.g invoke(ta.g gVar, g.b bVar) {
            if (!(bVar instanceof C)) {
                return gVar.s(bVar);
            }
            g.b bVarB = this.f19010B.f43978B.b(bVar.getKey());
            if (bVarB != null) {
                kotlin.jvm.internal.O<ta.g> o10 = this.f19010B;
                o10.f43978B = o10.f43978B.N(bVar.getKey());
                return gVar.s(((C) bVar).f(bVarB));
            }
            C cQ = (C) bVar;
            if (this.f19011C) {
                cQ = cQ.Q();
            }
            return gVar.s(cQ);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "result", "Lta/g$b;", "it", "a", "(ZLta/g$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class c extends AbstractC3864v implements Ba.p<Boolean, g.b, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f19012B = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof C));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final ta.g a(ta.g gVar, ta.g gVar2, boolean z10) {
        boolean zC = c(gVar);
        boolean zC2 = c(gVar2);
        if (!zC && !zC2) {
            return gVar.s(gVar2);
        }
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        o10.f43978B = gVar2;
        ta.h hVar = ta.h.f50000B;
        ta.g gVar3 = (ta.g) gVar.L(hVar, new b(o10, z10));
        if (zC2) {
            o10.f43978B = ((ta.g) o10.f43978B).L(hVar, a.f19009B);
        }
        return gVar3.s((ta.g) o10.f43978B);
    }

    public static final String b(ta.g gVar) {
        return null;
    }

    private static final boolean c(ta.g gVar) {
        return ((Boolean) gVar.L(Boolean.FALSE, c.f19012B)).booleanValue();
    }

    public static final ta.g d(I i10, ta.g gVar) {
        ta.g gVarA = a(i10.getCoroutineContext(), gVar, true);
        return (gVarA == Z.a() || gVarA.b(ta.e.INSTANCE) != null) ? gVarA : gVarA.s(Z.a());
    }

    public static final ta.g e(ta.g gVar, ta.g gVar2) {
        return !c(gVar2) ? gVar.s(gVar2) : a(gVar, gVar2, false);
    }

    public static final X0<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof V) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof X0) {
                return (X0) eVar;
            }
        }
        return null;
    }

    public static final X0<?> g(InterfaceC4588d<?> interfaceC4588d, ta.g gVar, Object obj) {
        if (!(interfaceC4588d instanceof kotlin.coroutines.jvm.internal.e) || gVar.b(Y0.f19058B) == null) {
            return null;
        }
        X0<?> x0F = f((kotlin.coroutines.jvm.internal.e) interfaceC4588d);
        if (x0F != null) {
            x0F.g1(gVar, obj);
        }
        return x0F;
    }
}
