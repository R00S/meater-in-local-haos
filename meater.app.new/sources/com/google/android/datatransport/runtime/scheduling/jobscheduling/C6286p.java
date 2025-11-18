package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import p241e.p254e.p256b.p257a.p258i.AbstractC8874q;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8861a;
import p241e.p254e.p256b.p257a.p258i.p268z.C8891a;

/* compiled from: AlarmManagerScheduler.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.p */
/* loaded from: classes2.dex */
public class C6286p implements InterfaceC6295y {

    /* renamed from: a */
    private final Context f16817a;

    /* renamed from: b */
    private final InterfaceC8825j0 f16818b;

    /* renamed from: c */
    private AlarmManager f16819c;

    /* renamed from: d */
    private final AbstractC6290t f16820d;

    /* renamed from: e */
    private final InterfaceC8854a f16821e;

    public C6286p(Context context, InterfaceC8825j0 interfaceC8825j0, InterfaceC8854a interfaceC8854a, AbstractC6290t abstractC6290t) {
        this(context, interfaceC8825j0, (AlarmManager) context.getSystemService("alarm"), interfaceC8854a, abstractC6290t);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y
    /* renamed from: a */
    public void mo13540a(AbstractC8874q abstractC8874q, int i2) {
        mo13541b(abstractC8874q, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y
    /* renamed from: b */
    public void mo13541b(AbstractC8874q abstractC8874q, int i2, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC8874q.mo28134b());
        builder.appendQueryParameter("priority", String.valueOf(C8861a.m28132a(abstractC8874q.mo28136d())));
        if (abstractC8874q.mo28135c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC8874q.mo28135c(), 0));
        }
        Intent intent = new Intent(this.f16817a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (!z && m13542c(intent)) {
            C8891a.m28230b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC8874q);
            return;
        }
        long jMo27998W0 = this.f16818b.mo27998W0(abstractC8874q);
        long jM13561g = this.f16820d.m13561g(abstractC8874q.mo28136d(), jMo27998W0, i2);
        C8891a.m28231c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC8874q, Long.valueOf(jM13561g), Long.valueOf(jMo27998W0), Integer.valueOf(i2));
        this.f16819c.set(3, this.f16821e.mo28110a() + jM13561g, PendingIntent.getBroadcast(this.f16817a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    /* renamed from: c */
    boolean m13542c(Intent intent) {
        return PendingIntent.getBroadcast(this.f16817a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    C6286p(Context context, InterfaceC8825j0 interfaceC8825j0, AlarmManager alarmManager, InterfaceC8854a interfaceC8854a, AbstractC6290t abstractC6290t) {
        this.f16817a = context;
        this.f16818b = interfaceC8825j0;
        this.f16819c = alarmManager;
        this.f16821e = interfaceC8854a;
        this.f16820d = abstractC6290t;
    }
}
