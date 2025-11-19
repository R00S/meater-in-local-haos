package androidx.compose.ui.platform;

import F0.AccessibilityAction;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\b\u001a!\u0010\u0011\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0014\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006\u0015"}, d2 = {"LA0/G;", "Lkotlin/Function1;", "", "selector", "j", "(LA0/G;LBa/l;)LA0/G;", "LF0/p;", "h", "(LF0/p;)Z", "LF0/l;", "oldConfig", "l", "(LF0/p;LF0/l;)Z", "i", "LF0/a;", "", "other", "g", "(LF0/a;Ljava/lang/Object;)Z", "k", "isRtl", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2053z {

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.z$a */
    static final class a extends AbstractC3864v implements Ba.l<A0.G, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f23490B = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(A0.G r3) {
            /*
                r2 = this;
                F0.l r3 = r3.I()
                if (r3 == 0) goto L1a
                boolean r0 = r3.getIsMergingSemanticsOfDescendants()
                r1 = 1
                if (r0 != r1) goto L1a
                F0.s r0 = F0.s.f4372a
                F0.w r0 = r0.g()
                boolean r3 = r3.i(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2053z.a.invoke(A0.G):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!C3862t.b(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(F0.p pVar) {
        return !pVar.n().i(F0.s.f4372a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(F0.p pVar) {
        F0.l unmergedConfig = pVar.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        if (unmergedConfig.i(sVar.g()) && !C3862t.b(F0.m.a(pVar.getUnmergedConfig(), sVar.i()), Boolean.TRUE)) {
            return true;
        }
        A0.G gJ = j(pVar.getLayoutNode(), a.f23490B);
        if (gJ != null) {
            F0.l lVarI = gJ.I();
            if (!(lVarI != null ? C3862t.b(F0.m.a(lVarI, sVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A0.G j(A0.G g10, Ba.l<? super A0.G, Boolean> lVar) {
        for (A0.G gO0 = g10.o0(); gO0 != null; gO0 = gO0.o0()) {
            if (lVar.invoke(gO0).booleanValue()) {
                return gO0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(F0.p pVar) {
        return pVar.p().getLayoutDirection() == U0.t.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(F0.p pVar, F0.l lVar) {
        Iterator<Map.Entry<? extends F0.w<?>, ? extends Object>> it = lVar.iterator();
        while (it.hasNext()) {
            if (!pVar.n().i(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
