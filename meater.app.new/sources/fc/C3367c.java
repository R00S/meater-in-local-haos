package fc;

import Ba.l;
import Ba.q;
import Xb.InterfaceC1847l;
import cc.C2361F;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0011\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u001a\u0010\u001f\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e*d\b\u0007\u0010!\".\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00020\r2.\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00020\r*H\b\u0007\u0010\"\" \u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2 \u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r*H\b\u0007\u0010#\" \u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00010\r2 \u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 \u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00010\r¨\u0006$"}, d2 = {"LXb/l;", "Loa/F;", "Lkotlin/Function1;", "", "onCancellation", "", "h", "(LXb/l;LBa/l;)Z", "", "trySelectInternalResult", "Lfc/d;", "a", "(I)Lfc/d;", "Lkotlin/Function3;", "", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "LBa/q;", "DUMMY_PROCESS_RESULT_FUNCTION", "Lcc/F;", "b", "Lcc/F;", "STATE_REG", "c", "STATE_COMPLETED", "d", "STATE_CANCELLED", "e", "NO_RESULT", "f", "getPARAM_CLAUSE_0", "()Lcc/F;", "PARAM_CLAUSE_0", "Lfc/b;", "OnCancellationConstructor", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: fc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3367c {

    /* renamed from: a, reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f41464a = a.f41470B;

    /* renamed from: b, reason: collision with root package name */
    private static final C2361F f41465b = new C2361F("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    private static final C2361F f41466c = new C2361F("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    private static final C2361F f41467d = new C2361F("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    private static final C2361F f41468e = new C2361F("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    private static final C2361F f41469f = new C2361F("PARAM_CLAUSE_0");

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: fc.c$a */
    static final class a extends AbstractC3864v implements q {

        /* renamed from: B, reason: collision with root package name */
        public static final a f41470B = new a();

        a() {
            super(3);
        }

        @Override // Ba.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void g(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC3368d a(int i10) {
        if (i10 == 0) {
            return EnumC3368d.f41471B;
        }
        if (i10 == 1) {
            return EnumC3368d.f41472C;
        }
        if (i10 == 2) {
            return EnumC3368d.f41473D;
        }
        if (i10 == 3) {
            return EnumC3368d.f41474E;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1847l<? super C4153F> interfaceC1847l, l<? super Throwable, C4153F> lVar) {
        Object objS = interfaceC1847l.S(C4153F.f46609a, null, lVar);
        if (objS == null) {
            return false;
        }
        interfaceC1847l.T(objS);
        return true;
    }
}
