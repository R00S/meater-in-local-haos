package tb;

import Ra.InterfaceC1692e;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.Z;
import Ra.l0;
import java.util.Comparator;

/* compiled from: MemberComparator.java */
/* renamed from: tb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4600l implements Comparator<InterfaceC1700m> {

    /* renamed from: B, reason: collision with root package name */
    public static final C4600l f50025B = new C4600l();

    private C4600l() {
    }

    private static Integer b(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        int iC = c(interfaceC1700m2) - c(interfaceC1700m);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (C4597i.B(interfaceC1700m) && C4597i.B(interfaceC1700m2)) {
            return 0;
        }
        int iCompareTo = interfaceC1700m.getName().compareTo(interfaceC1700m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(InterfaceC1700m interfaceC1700m) {
        if (C4597i.B(interfaceC1700m)) {
            return 8;
        }
        if (interfaceC1700m instanceof InterfaceC1699l) {
            return 7;
        }
        if (interfaceC1700m instanceof Z) {
            return ((Z) interfaceC1700m).j0() == null ? 6 : 5;
        }
        if (interfaceC1700m instanceof InterfaceC1712z) {
            return ((InterfaceC1712z) interfaceC1700m).j0() == null ? 4 : 3;
        }
        if (interfaceC1700m instanceof InterfaceC1692e) {
            return 2;
        }
        return interfaceC1700m instanceof l0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC1700m interfaceC1700m, InterfaceC1700m interfaceC1700m2) {
        Integer numB = b(interfaceC1700m, interfaceC1700m2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
