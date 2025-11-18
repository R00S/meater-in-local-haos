package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

@zzard
/* loaded from: classes2.dex */
public final class zzacf {

    /* renamed from: a */
    private final Context f21577a;

    public zzacf(Context context) {
        Preconditions.m14373l(context, "Context can not be null");
        this.f21577a = context;
    }

    /* renamed from: a */
    private final boolean m16396a(Intent intent) {
        Preconditions.m14373l(intent, "Intent can not be null");
        return !this.f21577a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: b */
    public final boolean m16397b() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m16396a(intent);
    }

    /* renamed from: c */
    public final boolean m16398c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m16396a(intent);
    }

    /* renamed from: d */
    public final boolean m16399d() {
        return ((Boolean) zzazl.m17282a(this.f21577a, new CallableC6840k())).booleanValue() && Wrappers.m14674a(this.f21577a).m14667a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: e */
    public final boolean m16400e() {
        return m16396a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
