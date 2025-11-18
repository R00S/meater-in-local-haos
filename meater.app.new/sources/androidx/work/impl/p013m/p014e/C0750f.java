package androidx.work.impl.p013m.p014e;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.EnumC0808o;
import androidx.work.impl.p013m.C0742b;
import androidx.work.impl.p013m.p015f.C0759g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: NetworkNotRoamingController.java */
/* renamed from: androidx.work.impl.m.e.f */
/* loaded from: classes.dex */
public class C0750f extends AbstractC0747c<C0742b> {

    /* renamed from: e */
    private static final String f4740e = AbstractC0807n.m5223f("NetworkNotRoamingCtrlr");

    public C0750f(Context context, InterfaceC0799a interfaceC0799a) {
        super(C0759g.m5066c(context, interfaceC0799a).m5069d());
    }

    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: b */
    boolean mo5036b(C0775p c0775p) {
        return c0775p.f4808l.m4800b() == EnumC0808o.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo5037c(C0742b c0742b) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (c0742b.m5027a() && c0742b.m5029c()) ? false : true;
        }
        AbstractC0807n.m5221c().mo5224a(f4740e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !c0742b.m5027a();
    }
}
