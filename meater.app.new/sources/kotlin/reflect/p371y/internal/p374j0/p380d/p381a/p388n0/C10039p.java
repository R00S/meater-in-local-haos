package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0;

import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: javaLoading.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.n0.p */
/* loaded from: classes2.dex */
public final class C10039p {
    /* renamed from: a */
    private static final boolean m33615a(InterfaceC10041r interfaceC10041r) {
        C10160c c10160cMo33596d;
        InterfaceC10022b0 interfaceC10022b0 = (InterfaceC10022b0) C10813s.m38870u0(interfaceC10041r.mo33620f());
        InterfaceC10047x type = interfaceC10022b0 != null ? interfaceC10022b0.getType() : null;
        InterfaceC10033j interfaceC10033j = type instanceof InterfaceC10033j ? (InterfaceC10033j) type : null;
        if (interfaceC10033j == null) {
            return false;
        }
        InterfaceC10032i interfaceC10032iMo33606c = interfaceC10033j.mo33606c();
        return (interfaceC10032iMo33606c instanceof InterfaceC10030g) && (c10160cMo33596d = ((InterfaceC10030g) interfaceC10032iMo33606c).mo33596d()) != null && C9801m.m32341a(c10160cMo33596d.m35420b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r3.mo33620f().isEmpty();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean m33616b(kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10041r r3) {
        /*
            kotlin.f0.y.e.j0.f.f r0 = r3.getName()
            java.lang.String r0 = r0.m35455k()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = m33615a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.mo33620f()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.C10039p.m33616b(kotlin.f0.y.e.j0.d.a.n0.r):boolean");
    }

    /* renamed from: c */
    public static final boolean m33617c(InterfaceC10040q interfaceC10040q) {
        C9801m.m32346f(interfaceC10040q, "<this>");
        return interfaceC10040q.mo33618P().mo33590H() && (interfaceC10040q instanceof InterfaceC10041r) && m33616b((InterfaceC10041r) interfaceC10040q);
    }
}
