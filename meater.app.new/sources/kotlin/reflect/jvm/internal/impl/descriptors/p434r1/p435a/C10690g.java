package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.io.InputStream;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10099o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10279a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10282d;

/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.g */
/* loaded from: classes2.dex */
public final class C10690g implements InterfaceC10099o {

    /* renamed from: a */
    private final ClassLoader f41146a;

    /* renamed from: b */
    private final C10282d f41147b;

    public C10690g(ClassLoader classLoader) {
        C9801m.m32346f(classLoader, "classLoader");
        this.f41146a = classLoader;
        this.f41147b = new C10282d();
    }

    /* renamed from: d */
    private final InterfaceC10099o.a m38027d(String str) {
        C10689f c10689fM38026a;
        Class<?> clsM38024a = C10688e.m38024a(this.f41146a, str);
        if (clsM38024a == null || (c10689fM38026a = C10689f.f41143a.m38026a(clsM38024a)) == null) {
            return null;
        }
        return new InterfaceC10099o.a.b(c10689fM38026a, null, 2, null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10099o
    /* renamed from: a */
    public InterfaceC10099o.a mo34018a(InterfaceC10030g interfaceC10030g) {
        String strM35420b;
        C9801m.m32346f(interfaceC10030g, "javaClass");
        C10160c c10160cMo33596d = interfaceC10030g.mo33596d();
        if (c10160cMo33596d == null || (strM35420b = c10160cMo33596d.m35420b()) == null) {
            return null;
        }
        return m38027d(strM35420b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10311u
    /* renamed from: b */
    public InputStream mo36473b(C10160c c10160c) {
        C9801m.m32346f(c10160c, "packageFqName");
        if (c10160c.m35427i(C9917k.f37516q)) {
            return this.f41147b.m36251a(C10279a.f39754n.m36247n(c10160c));
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10099o
    /* renamed from: c */
    public InterfaceC10099o.a mo34019c(C10159b c10159b) {
        C9801m.m32346f(c10159b, "classId");
        return m38027d(C10691h.m38029b(c10159b));
    }
}
