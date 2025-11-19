package O1;

import android.view.InterfaceC2114v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;
import oa.C4173r;
import oa.InterfaceC4156a;

/* compiled from: LocalLifecycleOwner.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\b"}, d2 = {"LO/G0;", "Landroidx/lifecycle/v;", "a", "LO/G0;", "()LO/G0;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC2114v> f13111a;

    /* compiled from: LocalLifecycleOwner.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/v;", "a", "()Landroidx/lifecycle/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O1.a$a, reason: collision with other inner class name */
    static final class C0200a extends AbstractC3864v implements Ba.a<InterfaceC2114v> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0200a f13112B = new C0200a();

        C0200a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2114v invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    static {
        Object objA;
        AbstractC1501G0 abstractC1501G0;
        try {
            C4172q.Companion companion = C4172q.INSTANCE;
            ClassLoader classLoader = InterfaceC2114v.class.getClassLoader();
            C3862t.d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC1501G0) {
                        abstractC1501G0 = (AbstractC1501G0) objInvoke;
                    }
                } else if (annotations[i10] instanceof InterfaceC4156a) {
                    break;
                } else {
                    i10++;
                }
            }
            abstractC1501G0 = null;
            objA = C4172q.a(abstractC1501G0);
        } catch (Throwable th) {
            C4172q.Companion companion2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        AbstractC1501G0<InterfaceC2114v> abstractC1501G0F = (AbstractC1501G0) (C4172q.c(objA) ? null : objA);
        if (abstractC1501G0F == null) {
            abstractC1501G0F = C1576w.f(C0200a.f13112B);
        }
        f13111a = abstractC1501G0F;
    }

    public static final AbstractC1501G0<InterfaceC2114v> a() {
        return f13111a;
    }
}
