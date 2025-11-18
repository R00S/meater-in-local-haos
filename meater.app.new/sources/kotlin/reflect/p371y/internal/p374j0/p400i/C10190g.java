package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;

/* compiled from: MemberComparator.java */
/* renamed from: kotlin.f0.y.e.j0.i.g */
/* loaded from: classes3.dex */
public class C10190g implements Comparator<InterfaceC10609m> {

    /* renamed from: f */
    public static final C10190g f39518f = new C10190g();

    private C10190g() {
    }

    /* renamed from: b */
    private static Integer m35844b(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
        int iM35845c = m35845c(interfaceC10609m2) - m35845c(interfaceC10609m);
        if (iM35845c != 0) {
            return Integer.valueOf(iM35845c);
        }
        if (C10187d.m35801B(interfaceC10609m) && C10187d.m35801B(interfaceC10609m2)) {
            return 0;
        }
        int iCompareTo = interfaceC10609m.getName().compareTo(interfaceC10609m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    /* renamed from: c */
    private static int m35845c(InterfaceC10609m interfaceC10609m) {
        if (C10187d.m35801B(interfaceC10609m)) {
            return 8;
        }
        if (interfaceC10609m instanceof InterfaceC10606l) {
            return 7;
        }
        if (interfaceC10609m instanceof InterfaceC10729t0) {
            return ((InterfaceC10729t0) interfaceC10609m).mo37032m0() == null ? 6 : 5;
        }
        if (interfaceC10609m instanceof InterfaceC10738y) {
            return ((InterfaceC10738y) interfaceC10609m).mo37032m0() == null ? 4 : 3;
        }
        if (interfaceC10609m instanceof InterfaceC10585e) {
            return 2;
        }
        return interfaceC10609m instanceof InterfaceC10584d1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
        Integer numM35844b = m35844b(interfaceC10609m, interfaceC10609m2);
        if (numM35844b != null) {
            return numM35844b.intValue();
        }
        return 0;
    }
}
