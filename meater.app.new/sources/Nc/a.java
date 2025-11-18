package Nc;

import Vc.b;
import android.content.ComponentCallbacks;
import kotlin.C1802b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidKoinScopeExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/ComponentCallbacks;", "Lfd/a;", "a", "(Landroid/content/ComponentCallbacks;)Lfd/a;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    public static final fd.a a(ComponentCallbacks componentCallbacks) {
        C3862t.g(componentCallbacks, "<this>");
        return componentCallbacks instanceof Qc.a ? ((Qc.a) componentCallbacks).a() : componentCallbacks instanceof b ? ((b) componentCallbacks).a() : componentCallbacks instanceof Vc.a ? ((Vc.a) componentCallbacks).b().getScopeRegistry().getRootScope() : C1802b.f18502a.get().getScopeRegistry().getRootScope();
    }
}
