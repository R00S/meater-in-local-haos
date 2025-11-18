package com.liulishuo.filedownloader.services;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import p241e.p307h.p308a.C8998d0;
import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: ForegroundServiceConfig.java */
@TargetApi(26)
/* renamed from: com.liulishuo.filedownloader.services.i */
/* loaded from: classes2.dex */
public class C8709i {

    /* renamed from: a */
    private int f33061a;

    /* renamed from: b */
    private String f33062b;

    /* renamed from: c */
    private String f33063c;

    /* renamed from: d */
    private Notification f33064d;

    /* renamed from: e */
    private boolean f33065e;

    /* compiled from: ForegroundServiceConfig.java */
    /* renamed from: com.liulishuo.filedownloader.services.i$b */
    public static class b {

        /* renamed from: a */
        private int f33066a;

        /* renamed from: b */
        private String f33067b;

        /* renamed from: c */
        private String f33068c;

        /* renamed from: d */
        private Notification f33069d;

        /* renamed from: e */
        private boolean f33070e;

        /* renamed from: a */
        public C8709i m27682a() {
            C8709i c8709i = new C8709i();
            String str = this.f33067b;
            if (str == null) {
                str = "filedownloader_channel";
            }
            c8709i.m27679i(str);
            String str2 = this.f33068c;
            if (str2 == null) {
                str2 = "Filedownloader";
            }
            c8709i.m27680j(str2);
            int i2 = this.f33066a;
            if (i2 == 0) {
                i2 = R.drawable.arrow_down_float;
            }
            c8709i.m27681k(i2);
            c8709i.m27677g(this.f33070e);
            c8709i.m27678h(this.f33069d);
            return c8709i;
        }

        /* renamed from: b */
        public b m27683b(boolean z) {
            this.f33070e = z;
            return this;
        }
    }

    /* renamed from: a */
    private Notification m27671a(Context context) {
        String string = context.getString(C8998d0.f34635b);
        String string2 = context.getString(C8998d0.f34634a);
        Notification.Builder builder = new Notification.Builder(context, this.f33062b);
        builder.setContentTitle(string).setContentText(string2).setSmallIcon(R.drawable.arrow_down_float);
        return builder.build();
    }

    /* renamed from: b */
    public Notification m27672b(Context context) {
        if (this.f33064d == null) {
            if (C9034d.f34819a) {
                C9034d.m28962a(this, "build default notification", new Object[0]);
            }
            this.f33064d = m27671a(context);
        }
        return this.f33064d;
    }

    /* renamed from: c */
    public String m27673c() {
        return this.f33062b;
    }

    /* renamed from: d */
    public String m27674d() {
        return this.f33063c;
    }

    /* renamed from: e */
    public int m27675e() {
        return this.f33061a;
    }

    /* renamed from: f */
    public boolean m27676f() {
        return this.f33065e;
    }

    /* renamed from: g */
    public void m27677g(boolean z) {
        this.f33065e = z;
    }

    /* renamed from: h */
    public void m27678h(Notification notification) {
        this.f33064d = notification;
    }

    /* renamed from: i */
    public void m27679i(String str) {
        this.f33062b = str;
    }

    /* renamed from: j */
    public void m27680j(String str) {
        this.f33063c = str;
    }

    /* renamed from: k */
    public void m27681k(int i2) {
        this.f33061a = i2;
    }

    public String toString() {
        return "ForegroundServiceConfig{notificationId=" + this.f33061a + ", notificationChannelId='" + this.f33062b + "', notificationChannelName='" + this.f33063c + "', notification=" + this.f33064d + ", needRecreateChannelId=" + this.f33065e + '}';
    }

    private C8709i() {
    }
}
