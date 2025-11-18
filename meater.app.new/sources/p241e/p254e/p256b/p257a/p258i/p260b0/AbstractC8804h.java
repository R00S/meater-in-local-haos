package p241e.p254e.p256b.p257a.p258i.p260b0;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6286p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6289s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;

/* compiled from: SchedulingModule.java */
/* renamed from: e.e.b.a.i.b0.h */
/* loaded from: classes2.dex */
public abstract class AbstractC8804h {
    /* renamed from: a */
    static InterfaceC6295y m27970a(Context context, InterfaceC8825j0 interfaceC8825j0, AbstractC6290t abstractC6290t, InterfaceC8854a interfaceC8854a) {
        return Build.VERSION.SDK_INT >= 21 ? new C6289s(context, interfaceC8825j0, abstractC6290t) : new C6286p(context, interfaceC8825j0, interfaceC8854a, abstractC6290t);
    }
}
