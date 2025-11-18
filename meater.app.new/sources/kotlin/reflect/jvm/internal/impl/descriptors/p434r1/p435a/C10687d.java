package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import java.util.Set;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10711l;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10722w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.text.C10546u;

/* compiled from: ReflectJavaClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.d */
/* loaded from: classes2.dex */
public final class C10687d implements InterfaceC10050o {

    /* renamed from: a */
    private final ClassLoader f41142a;

    public C10687d(ClassLoader classLoader) {
        C9801m.m32346f(classLoader, "classLoader");
        this.f41142a = classLoader;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o
    /* renamed from: a */
    public InterfaceC10030g mo33629a(InterfaceC10050o.b bVar) {
        C9801m.m32346f(bVar, "request");
        C10159b c10159bM33633a = bVar.m33633a();
        C10160c c10160cM35413h = c10159bM33633a.m35413h();
        C9801m.m32345e(c10160cM35413h, "classId.packageFqName");
        String strM35420b = c10159bM33633a.m35414i().m35420b();
        C9801m.m32345e(strM35420b, "classId.relativeClassName.asString()");
        String strM37524z = C10546u.m37524z(strM35420b, '.', '$', false, 4, null);
        if (!c10160cM35413h.m35422d()) {
            strM37524z = c10160cM35413h.m35420b() + '.' + strM37524z;
        }
        Class<?> clsM38024a = C10688e.m38024a(this.f41142a, strM37524z);
        if (clsM38024a != null) {
            return new C10711l(clsM38024a);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o
    /* renamed from: b */
    public Set<String> mo33630b(C10160c c10160c) {
        C9801m.m32346f(c10160c, "packageFqName");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10050o
    /* renamed from: c */
    public InterfaceC10044u mo33631c(C10160c c10160c, boolean z) {
        C9801m.m32346f(c10160c, "fqName");
        return new C10722w(c10160c);
    }
}
