package nb;

import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import lb.C3935o;
import lb.C3936p;
import oa.u;

/* compiled from: NameResolverImpl.kt */
/* renamed from: nb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4078d implements InterfaceC4077c {

    /* renamed from: a, reason: collision with root package name */
    private final C3936p f45842a;

    /* renamed from: b, reason: collision with root package name */
    private final C3935o f45843b;

    /* compiled from: NameResolverImpl.kt */
    /* renamed from: nb.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45844a;

        static {
            int[] iArr = new int[C3935o.c.EnumC0600c.values().length];
            try {
                iArr[C3935o.c.EnumC0600c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3935o.c.EnumC0600c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3935o.c.EnumC0600c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45844a = iArr;
        }
    }

    public C4078d(C3936p strings, C3935o qualifiedNames) {
        C3862t.g(strings, "strings");
        C3862t.g(qualifiedNames, "qualifiedNames");
        this.f45842a = strings;
        this.f45843b = qualifiedNames;
    }

    private final u<List<String>, List<String>, Boolean> c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            C3935o.c cVarW = this.f45843b.w(i10);
            String strW = this.f45842a.w(cVarW.A());
            C3935o.c.EnumC0600c enumC0600cY = cVarW.y();
            C3862t.d(enumC0600cY);
            int i11 = a.f45844a[enumC0600cY.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strW);
            } else if (i11 == 2) {
                linkedList.addFirst(strW);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(strW);
                z10 = true;
            }
            i10 = cVarW.z();
        }
        return new u<>(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // nb.InterfaceC4077c
    public String a(int i10) {
        u<List<String>, List<String>, Boolean> uVarC = c(i10);
        List<String> listA = uVarC.a();
        String strS0 = r.s0(uVarC.b(), ".", null, null, 0, null, null, 62, null);
        if (listA.isEmpty()) {
            return strS0;
        }
        return r.s0(listA, "/", null, null, 0, null, null, 62, null) + '/' + strS0;
    }

    @Override // nb.InterfaceC4077c
    public boolean b(int i10) {
        return c(i10).d().booleanValue();
    }

    @Override // nb.InterfaceC4077c
    public String getString(int i10) {
        String strW = this.f45842a.w(i10);
        C3862t.f(strW, "getString(...)");
        return strW;
    }
}
