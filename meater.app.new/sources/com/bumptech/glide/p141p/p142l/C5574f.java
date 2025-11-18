package com.bumptech.glide.p141p.p142l;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: NotificationTarget.java */
/* renamed from: com.bumptech.glide.p.l.f */
/* loaded from: classes.dex */
public class C5574f extends AbstractC5575g<Bitmap> {

    /* renamed from: f */
    private final RemoteViews f13991f;

    /* renamed from: g */
    private final Context f13992g;

    /* renamed from: h */
    private final int f13993h;

    /* renamed from: i */
    private final String f13994i;

    /* renamed from: j */
    private final Notification f13995j;

    /* renamed from: k */
    private final int f13996k;

    /* renamed from: d */
    private void m10985d() {
        ((NotificationManager) C5596j.m11042d((NotificationManager) this.f13992g.getSystemService("notification"))).notify(this.f13994i, this.f13993h, this.f13995j);
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onResourceReady(Bitmap bitmap, InterfaceC5582d<? super Bitmap> interfaceC5582d) {
        this.f13991f.setImageViewBitmap(this.f13996k, bitmap);
        m10985d();
    }
}
