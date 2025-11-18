package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10136o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10137p;

/* compiled from: NameResolverImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.d */
/* loaded from: classes3.dex */
public final class C10152d implements InterfaceC10151c {

    /* renamed from: a */
    private final C10137p f39233a;

    /* renamed from: b */
    private final C10136o f39234b;

    /* compiled from: NameResolverImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.z.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39235a;

        static {
            int[] iArr = new int[C10136o.c.EnumC11557c.values().length];
            iArr[C10136o.c.EnumC11557c.CLASS.ordinal()] = 1;
            iArr[C10136o.c.EnumC11557c.PACKAGE.ordinal()] = 2;
            iArr[C10136o.c.EnumC11557c.LOCAL.ordinal()] = 3;
            f39235a = iArr;
        }
    }

    public C10152d(C10137p c10137p, C10136o c10136o) {
        C9801m.m32346f(c10137p, "strings");
        C9801m.m32346f(c10136o, "qualifiedNames");
        this.f39233a = c10137p;
        this.f39234b = c10136o;
    }

    /* renamed from: c */
    private final Triple<List<String>, List<String>, Boolean> m35379c(int i2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i2 != -1) {
            C10136o.c cVarM34941v = this.f39234b.m34941v(i2);
            String strM34993v = this.f39233a.m34993v(cVarM34941v.m34969z());
            C10136o.c.EnumC11557c enumC11557cM34967x = cVarM34941v.m34967x();
            C9801m.m32343c(enumC11557cM34967x);
            int i3 = a.f39235a[enumC11557cM34967x.ordinal()];
            if (i3 == 1) {
                linkedList2.addFirst(strM34993v);
            } else if (i3 == 2) {
                linkedList.addFirst(strM34993v);
            } else if (i3 == 3) {
                linkedList2.addFirst(strM34993v);
                z = true;
            }
            i2 = cVarM34941v.m34968y();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c
    /* renamed from: a */
    public String mo34253a(int i2) {
        Triple<List<String>, List<String>, Boolean> tripleM35379c = m35379c(i2);
        List<String> listM37658a = tripleM35379c.m37658a();
        String strM38599e0 = C10782c0.m38599e0(tripleM35379c.m37659b(), ".", null, null, 0, null, null, 62, null);
        if (listM37658a.isEmpty()) {
            return strM38599e0;
        }
        return C10782c0.m38599e0(listM37658a, "/", null, null, 0, null, null, 62, null) + '/' + strM38599e0;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c
    /* renamed from: b */
    public boolean mo34254b(int i2) {
        return m35379c(i2).m37661d().booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c
    public String getString(int i2) {
        String strM34993v = this.f39233a.m34993v(i2);
        C9801m.m32345e(strM34993v, "strings.getString(index)");
        return strM34993v;
    }
}
