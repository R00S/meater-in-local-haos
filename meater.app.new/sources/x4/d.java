package x4;

import Ba.l;
import N4.F;
import android.content.Context;
import kotlin.C1801a;
import kotlin.C1802b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: KoinStarter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lx4/d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LUc/a;", "b", "(Landroid/content/Context;)LUc/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f52781a = new d();

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F c(Context context, Uc.b startKoin) {
        C3862t.g(startKoin, "$this$startKoin");
        Context applicationContext = context.getApplicationContext();
        C3862t.f(applicationContext, "getApplicationContext(...)");
        Oc.d.d(startKoin, applicationContext);
        Sc.c.c(startKoin);
        Oc.d.h(startKoin, ad.b.f20459E);
        startKoin.d(F.N());
        return C4153F.f46609a;
    }

    public final synchronized Uc.a b(final Context context) {
        Uc.a aVarB;
        C3862t.g(context, "context");
        aVarB = C1802b.f18502a.b();
        if (aVarB == null) {
            aVarB = C1801a.a(new l() { // from class: x4.c
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return d.c(context, (Uc.b) obj);
                }
            }).getKoin();
        }
        return aVarB;
    }
}
