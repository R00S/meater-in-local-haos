package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C6298R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzapo extends zzaqb {

    /* renamed from: c */
    private final Map<String, String> f22223c;

    /* renamed from: d */
    private final Context f22224d;

    /* renamed from: e */
    private String f22225e;

    /* renamed from: f */
    private long f22226f;

    /* renamed from: g */
    private long f22227g;

    /* renamed from: h */
    private String f22228h;

    /* renamed from: i */
    private String f22229i;

    public zzapo(zzbgz zzbgzVar, Map<String, String> map) {
        super(zzbgzVar, "createCalendarEvent");
        this.f22223c = map;
        this.f22224d = zzbgzVar.mo14897a();
        this.f22225e = m16834k("description");
        this.f22228h = m16834k("summary");
        this.f22226f = m16835l("start_ticks");
        this.f22227g = m16835l("end_ticks");
        this.f22229i = m16834k("location");
    }

    /* renamed from: k */
    private final String m16834k(String str) {
        return TextUtils.isEmpty(this.f22223c.get(str)) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f22223c.get(str);
    }

    /* renamed from: l */
    private final long m16835l(String str) {
        String str2 = this.f22223c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @TargetApi(14)
    /* renamed from: h */
    final Intent m16836h() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f22225e);
        data.putExtra("eventLocation", this.f22229i);
        data.putExtra("description", this.f22228h);
        long j2 = this.f22226f;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.f22227g;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: i */
    public final void m16837i() {
        if (this.f22224d == null) {
            m16865e("Activity context is not available.");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.m17169y(this.f22224d).m16400e()) {
            m16865e("This feature is not available on the device.");
            return;
        }
        zzk.zzlg();
        AlertDialog.Builder builderM17168x = zzaxi.m17168x(this.f22224d);
        Resources resourcesM17050b = zzk.zzlk().m17050b();
        builderM17168x.setTitle(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16869s5) : "Create calendar event");
        builderM17168x.setMessage(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16870s6) : "Allow Ad to create a calendar event?");
        builderM17168x.setPositiveButton(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16867s3) : "Accept", new DialogInterfaceOnClickListenerC6733h3(this));
        builderM17168x.setNegativeButton(resourcesM17050b != null ? resourcesM17050b.getString(C6298R.string.f16868s4) : "Decline", new DialogInterfaceOnClickListenerC6770i3(this));
        builderM17168x.create().show();
    }
}
