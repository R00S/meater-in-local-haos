package kotlin;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4388J;
import s.C4389K;
import s.W;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001a-\u0010\u0018\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001a\"\b\b\u0001\u0010\u001b*\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001e\u001a!\u0010\"\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a!\u0010$\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b$\u0010#\u001a3\u0010(\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010,\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010-\u001a#\u0010.\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/\u001a)\u00100\u001a\u00020\t*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u00101\u001a/\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00106\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107\u001a#\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160;*\u0002082\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=\u001a#\u0010@\u001a\u00020\u0003*\u00020>2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010A\u001a+\u0010E\u001a\u00020\u0003*\u00020>2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u00032\u0006\u0010D\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0000H\u0000¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bL\u0010M\u001a\u0017\u0010N\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bN\u0010O\" \u0010T\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010P\u0012\u0004\bS\u0010\r\u001a\u0004\bQ\u0010R\" \u0010W\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bC\u0010P\u0012\u0004\bV\u0010\r\u001a\u0004\bU\u0010R\" \u0010[\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bX\u0010P\u0012\u0004\bZ\u0010\r\u001a\u0004\bY\u0010R\" \u0010_\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\\\u0010P\u0012\u0004\b^\u0010\r\u001a\u0004\b]\u0010R\" \u0010c\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010P\u0012\u0004\bb\u0010\r\u001a\u0004\ba\u0010R\" \u0010g\u001a\u00020\u00168\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bd\u0010P\u0012\u0004\bf\u0010\r\u001a\u0004\be\u0010R\"\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020 0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j\"\u0018\u0010n\u001a\u00020\u0000*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m\"\u0018\u0010n\u001a\u00020\u0000*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p\"\u0018\u0010t\u001a\u00020\u0016*\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006u"}, d2 = {"", "J", "()Z", "", "key", "dirty1", "dirty2", "", "info", "Loa/F;", "S", "(IIILjava/lang/String;)V", "R", "()V", "LO/c1;", "LO/Q0;", "rememberManager", "M", "(LO/c1;LO/Q0;)V", "u", "group", "index", "", "data", "N", "(LO/c1;IILjava/lang/Object;)V", "K", "V", "initialCapacity", "LO/o0;", "(I)Ls/J;", "", "LO/X;", "location", "y", "(Ljava/util/List;I)I", "x", "LO/J0;", "scope", "instance", "G", "(Ljava/util/List;ILO/J0;Ljava/lang/Object;)V", "start", "end", "z", "(Ljava/util/List;II)LO/X;", "O", "(Ljava/util/List;I)LO/X;", "P", "(Ljava/util/List;II)V", "w", "(Ljava/util/List;II)Ljava/util/List;", "p", "(Z)I", "o", "(I)Z", "LO/Z0;", "LO/d;", "anchor", "", "q", "(LO/Z0;LO/d;)Ljava/util/List;", "LO/Y0;", "root", "v", "(LO/Y0;II)I", "a", "b", "common", "L", "(LO/Y0;III)I", "value", "Q", "(Z)V", "message", "", "t", "(Ljava/lang/String;)Ljava/lang/Void;", "s", "(Ljava/lang/String;)V", "Ljava/lang/Object;", "B", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "D", "getProvider$annotations", "provider", "c", "A", "getCompositionLocalMap$annotations", "compositionLocalMap", "d", "getProviderValues", "getProviderValues$annotations", "providerValues", "e", "E", "getProviderMaps$annotations", "providerMaps", "f", "F", "getReference$annotations", "reference", "Ljava/util/Comparator;", "g", "Ljava/util/Comparator;", "InvalidationLocationAscending", "I", "(LO/c1;)Z", "isAfterFirstChild", "H", "(LO/Y0;)Z", "LO/a0;", "C", "(LO/a0;)Ljava/lang/Object;", "joinedKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1560o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f12949a = new OpaqueKey("provider");

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12950b = new OpaqueKey("provider");

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12951c = new OpaqueKey("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    private static final Object f12952d = new OpaqueKey("providerValues");

    /* renamed from: e, reason: collision with root package name */
    private static final Object f12953e = new OpaqueKey("providers");

    /* renamed from: f, reason: collision with root package name */
    private static final Object f12954f = new OpaqueKey("reference");

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator<C1524X> f12955g = new Comparator() { // from class: O.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1560o.b((C1524X) obj, (C1524X) obj2);
        }
    };

    public static final Object A() {
        return f12951c;
    }

    public static final Object B() {
        return f12949a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object C(C1528a0 c1528a0) {
        return c1528a0.getObjectKey() != null ? new JoinedKey(Integer.valueOf(c1528a0.getKey()), c1528a0.getObjectKey()) : Integer.valueOf(c1528a0.getKey());
    }

    public static final Object D() {
        return f12950b;
    }

    public static final Object E() {
        return f12953e;
    }

    public static final Object F() {
        return f12954f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(List<C1524X> list, int i10, C1507J0 c1507j0, Object obj) {
        int iY = y(list, i10);
        if (iY < 0) {
            int i11 = -(iY + 1);
            if (!(obj instanceof InterfaceC1502H)) {
                obj = null;
            }
            list.add(i11, new C1524X(c1507j0, i10, obj));
            return;
        }
        C1524X c1524x = list.get(iY);
        if (!(obj instanceof InterfaceC1502H)) {
            c1524x.e(null);
            return;
        }
        Object objA = c1524x.getInstances();
        if (objA == null) {
            c1524x.e(obj);
        } else if (objA instanceof C4389K) {
            ((C4389K) objA).h(obj);
        } else {
            c1524x.e(W.b(objA, obj));
        }
    }

    public static final boolean H(SlotReader y02) {
        return y02.getCurrent() > y02.getParent() + 1;
    }

    public static final boolean I(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final boolean J() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> C4388J<K, Object> K(int i10) {
        return C1561o0.b(new C4388J(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(SlotReader y02, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (y02.P(i10) == i11) {
            return i11;
        }
        if (y02.P(i11) == i10) {
            return i10;
        }
        if (y02.P(i10) == y02.P(i11)) {
            return y02.P(i10);
        }
        int iV = v(y02, i10, i12);
        int iV2 = v(y02, i11, i12);
        int i13 = iV - iV2;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = y02.P(i10);
        }
        int i15 = iV2 - iV;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = y02.P(i11);
        }
        while (i10 != i11) {
            i10 = y02.P(i10);
            i11 = y02.P(i11);
        }
        return i10;
    }

    public static final void M(SlotWriter slotWriter, Q0 q02) {
        int iG0;
        int iQ = slotWriter.Q(slotWriter.groups, slotWriter.j0(slotWriter.getCurrentGroup() + slotWriter.m0(slotWriter.getCurrentGroup())));
        for (int iQ2 = slotWriter.Q(slotWriter.groups, slotWriter.j0(slotWriter.getCurrentGroup())); iQ2 < iQ; iQ2++) {
            Object obj = slotWriter.slots[slotWriter.R(iQ2)];
            int iF = -1;
            if (obj instanceof InterfaceC1552k) {
                q02.e((InterfaceC1552k) obj, slotWriter.g0() - iQ2, -1, -1);
            }
            if (obj instanceof S0) {
                int iG02 = slotWriter.g0() - iQ2;
                S0 s02 = (S0) obj;
                C1536d after = s02.getAfter();
                if (after == null || !after.b()) {
                    iG0 = -1;
                } else {
                    iF = slotWriter.F(after);
                    iG0 = slotWriter.g0() - slotWriter.e1(iF);
                }
                q02.b(s02.getWrapped(), iG02, iF, iG0);
            }
            if (obj instanceof C1507J0) {
                ((C1507J0) obj).x();
            }
        }
        slotWriter.O0();
    }

    private static final void N(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if (obj == slotWriter.U0(i10, i11, InterfaceC1554l.INSTANCE.a())) {
            return;
        }
        s("Slot table is out of sync");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1524X O(List<C1524X> list, int i10) {
        int iY = y(list, i10);
        if (iY >= 0) {
            return list.remove(iY);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(List<C1524X> list, int i10, int i11) {
        int iX = x(list, i10);
        while (iX < list.size() && list.get(iX).getLocation() < i11) {
            list.remove(iX);
        }
    }

    public static final void Q(boolean z10) {
        if (z10) {
            return;
        }
        s("Check failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(C1524X c1524x, C1524X c1524x2) {
        return C3862t.i(c1524x.getLocation(), c1524x2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> q(Z0 z02, C1536d c1536d) {
        ArrayList arrayList = new ArrayList();
        SlotReader y0K = z02.K();
        try {
            r(y0K, arrayList, z02.h(c1536d));
            C4153F c4153f = C4153F.f46609a;
            return arrayList;
        } finally {
            y0K.d();
        }
    }

    private static final void r(SlotReader y02, List<Object> list, int i10) {
        if (y02.J(i10)) {
            list.add(y02.L(i10));
            return;
        }
        int iE = i10 + 1;
        int iE2 = i10 + y02.E(i10);
        while (iE < iE2) {
            r(y02, list, iE);
            iE += y02.E(iE);
        }
    }

    public static final void s(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void t(String str) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void u(SlotWriter slotWriter, Q0 q02) {
        int iF;
        int iG0;
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object objD0 = slotWriter.D0(currentGroup);
            if (objD0 instanceof InterfaceC1552k) {
                q02.a((InterfaceC1552k) objD0, slotWriter.g0() - slotWriter.g1(currentGroup), -1, -1);
            }
            int iC1 = slotWriter.c1(slotWriter.groups, slotWriter.j0(currentGroup));
            int i10 = currentGroup + 1;
            int iQ = slotWriter.Q(slotWriter.groups, slotWriter.j0(i10));
            for (int i11 = iC1; i11 < iQ; i11++) {
                int i12 = i11 - iC1;
                Object obj = slotWriter.slots[slotWriter.R(i11)];
                if (obj instanceof S0) {
                    S0 s02 = (S0) obj;
                    R0 wrapped = s02.getWrapped();
                    if (!(wrapped instanceof U0)) {
                        N(slotWriter, currentGroup, i12, obj);
                        int iG02 = slotWriter.g0() - i12;
                        C1536d after = s02.getAfter();
                        if (after == null || !after.b()) {
                            iF = -1;
                            iG0 = -1;
                        } else {
                            iF = slotWriter.F(after);
                            iG0 = slotWriter.g0() - slotWriter.e1(iF);
                        }
                        q02.b(wrapped, iG02, iF, iG0);
                    }
                } else if (obj instanceof C1507J0) {
                    N(slotWriter, currentGroup, i12, obj);
                    ((C1507J0) obj).x();
                }
            }
            currentGroup = i10;
        }
    }

    private static final int v(SlotReader y02, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = y02.P(i10);
            i12++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<C1524X> w(List<C1524X> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iX = x(list, i10); iX < list.size(); iX++) {
            C1524X c1524x = list.get(iX);
            if (c1524x.getLocation() >= i11) {
                break;
            }
            arrayList.add(c1524x);
        }
        return arrayList;
    }

    private static final int x(List<C1524X> list, int i10) {
        int iY = y(list, i10);
        return iY < 0 ? -(iY + 1) : iY;
    }

    private static final int y(List<C1524X> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = C3862t.i(list.get(i12).getLocation(), i10);
            if (i13 < 0) {
                i11 = i12 + 1;
            } else {
                if (i13 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1524X z(List<C1524X> list, int i10, int i11) {
        int iX = x(list, i10);
        if (iX >= list.size()) {
            return null;
        }
        C1524X c1524x = list.get(iX);
        if (c1524x.getLocation() < i11) {
            return c1524x;
        }
        return null;
    }

    public static final void R() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final void S(int i10, int i11, int i12, String str) {
    }
}
