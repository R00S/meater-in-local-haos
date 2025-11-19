package Oc;

import Ba.l;
import Ba.p;
import Xc.KoinDefinition;
import Zc.f;
import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;

/* compiled from: KoinExt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUc/b;", "Lad/b;", "level", "h", "(LUc/b;Lad/b;)LUc/b;", "Landroid/content/Context;", "androidContext", "d", "(LUc/b;Landroid/content/Context;)LUc/b;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    public static final Uc.b d(Uc.b bVar, final Context androidContext) {
        C3862t.g(bVar, "<this>");
        C3862t.g(androidContext, "androidContext");
        ad.c logger = bVar.getKoin().getLogger();
        if (logger.getLevel().compareTo(ad.b.f20457C) <= 0) {
            bVar.getKoin().getLogger().e("[init] declare Android Context");
        }
        Uc.a.i(bVar.getKoin(), r.e(hd.b.b(false, new l() { // from class: Oc.a
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return d.e(androidContext, (bd.a) obj);
            }
        }, 1, null)), false, false, 6, null);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(final Context context, bd.a module) {
        C3862t.g(module, "$this$module");
        if (context instanceof Application) {
            p pVar = new p() { // from class: Oc.b
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(context, (fd.a) obj, (cd.a) obj2);
                }
            };
            f<?> fVar = new f<>(new Xc.b(ed.c.INSTANCE.a(), P.b(Application.class), null, pVar, Xc.d.f19127B, r.m()));
            module.g(fVar);
            if (module.get_createdAtStart()) {
                module.h(fVar);
            }
            hd.a.a(new KoinDefinition(module, fVar), P.b(Context.class));
        } else {
            p pVar2 = new p() { // from class: Oc.c
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.g(context, (fd.a) obj, (cd.a) obj2);
                }
            };
            f<?> fVar2 = new f<>(new Xc.b(ed.c.INSTANCE.a(), P.b(Context.class), null, pVar2, Xc.d.f19127B, r.m()));
            module.g(fVar2);
            if (module.get_createdAtStart()) {
                module.h(fVar2);
            }
            new KoinDefinition(module, fVar2);
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Application f(Context context, fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return (Application) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context g(Context context, fd.a single, cd.a it) {
        C3862t.g(single, "$this$single");
        C3862t.g(it, "it");
        return context;
    }

    public static final Uc.b h(Uc.b bVar, ad.b level) {
        C3862t.g(bVar, "<this>");
        C3862t.g(level, "level");
        bVar.getKoin().j(new Pc.a(level));
        return bVar;
    }
}
