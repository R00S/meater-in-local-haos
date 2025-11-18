package androidx.work.impl.p013m.p014e;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0807n;
import androidx.work.EnumC0808o;
import androidx.work.impl.p013m.C0742b;
import androidx.work.impl.p013m.p015f.C0759g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: NetworkMeteredController.java */
/* renamed from: androidx.work.impl.m.e.e */
/* loaded from: classes.dex */
public class C0749e extends AbstractC0747c<C0742b> {

    /* renamed from: e */
    private static final String f4739e = AbstractC0807n.m5223f("NetworkMeteredCtrlr");

    public C0749e(Context context, InterfaceC0799a interfaceC0799a) {
        super(C0759g.m5066c(context, interfaceC0799a).m5069d());
    }

    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: b */
    boolean mo5036b(C0775p c0775p) {
        return c0775p.f4808l.m4800b() == EnumC0808o.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo5037c(C0742b c0742b) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (c0742b.m5027a() && c0742b.m5028b()) ? false : true;
        }
        AbstractC0807n.m5221c().mo5224a(f4739e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c0742b.m5027a();
    }
}
