package androidx.work.impl.p013m.p014e;

import android.content.Context;
import android.os.Build;
import androidx.work.EnumC0808o;
import androidx.work.impl.p013m.C0742b;
import androidx.work.impl.p013m.p015f.C0759g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: NetworkUnmeteredController.java */
/* renamed from: androidx.work.impl.m.e.g */
/* loaded from: classes.dex */
public class C0751g extends AbstractC0747c<C0742b> {
    public C0751g(Context context, InterfaceC0799a interfaceC0799a) {
        super(C0759g.m5066c(context, interfaceC0799a).m5069d());
    }

    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: b */
    boolean mo5036b(C0775p c0775p) {
        return c0775p.f4808l.m4800b() == EnumC0808o.UNMETERED || (Build.VERSION.SDK_INT >= 30 && c0775p.f4808l.m4800b() == EnumC0808o.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo5037c(C0742b c0742b) {
        return !c0742b.m5027a() || c0742b.m5028b();
    }
}
