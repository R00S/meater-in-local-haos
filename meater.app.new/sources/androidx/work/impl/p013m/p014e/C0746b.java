package androidx.work.impl.p013m.p014e;

import android.content.Context;
import androidx.work.impl.p013m.p015f.C0759g;
import androidx.work.impl.p016n.C0775p;
import androidx.work.impl.utils.p018p.InterfaceC0799a;

/* compiled from: BatteryNotLowController.java */
/* renamed from: androidx.work.impl.m.e.b */
/* loaded from: classes.dex */
public class C0746b extends AbstractC0747c<Boolean> {
    public C0746b(Context context, InterfaceC0799a interfaceC0799a) {
        super(C0759g.m5066c(context, interfaceC0799a).m5068b());
    }

    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: b */
    boolean mo5036b(C0775p c0775p) {
        return c0775p.f4808l.m4804f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.work.impl.p013m.p014e.AbstractC0747c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo5037c(Boolean bool) {
        return !bool.booleanValue();
    }
}
