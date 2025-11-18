package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0;

import java.util.Iterator;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: javaElements.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.n0.e0 */
/* loaded from: classes2.dex */
public interface InterfaceC10028e0 extends InterfaceC10025d {

    /* compiled from: javaElements.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.n0.e0$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC10019a m33586a(InterfaceC10028e0 interfaceC10028e0, C10160c c10160c) {
            Object obj;
            C9801m.m32346f(c10160c, "fqName");
            Iterator<T> it = interfaceC10028e0.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C10159b c10159bMo33571e = ((InterfaceC10019a) next).mo33571e();
                if (C9801m.m32341a(c10159bMo33571e != null ? c10159bMo33571e.m35409b() : null, c10160c)) {
                    obj = next;
                    break;
                }
            }
            return (InterfaceC10019a) obj;
        }
    }
}
