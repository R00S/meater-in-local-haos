package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C2919d;
import h7.AbstractC3492a;
import java.util.Map;

/* compiled from: RemoteMessage.java */
/* loaded from: classes2.dex */
public final class P extends AbstractC3492a {
    public static final Parcelable.Creator<P> CREATOR = new Q();

    /* renamed from: B, reason: collision with root package name */
    Bundle f38267B;

    /* renamed from: C, reason: collision with root package name */
    private Map<String, String> f38268C;

    /* renamed from: D, reason: collision with root package name */
    private b f38269D;

    /* compiled from: RemoteMessage.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f38270a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38271b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f38272c;

        /* renamed from: d, reason: collision with root package name */
        private final String f38273d;

        /* renamed from: e, reason: collision with root package name */
        private final String f38274e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f38275f;

        /* renamed from: g, reason: collision with root package name */
        private final String f38276g;

        /* renamed from: h, reason: collision with root package name */
        private final String f38277h;

        /* renamed from: i, reason: collision with root package name */
        private final String f38278i;

        /* renamed from: j, reason: collision with root package name */
        private final String f38279j;

        /* renamed from: k, reason: collision with root package name */
        private final String f38280k;

        /* renamed from: l, reason: collision with root package name */
        private final String f38281l;

        /* renamed from: m, reason: collision with root package name */
        private final String f38282m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f38283n;

        /* renamed from: o, reason: collision with root package name */
        private final String f38284o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f38285p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f38286q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f38287r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f38288s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f38289t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f38290u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f38291v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f38292w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f38293x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f38294y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f38295z;

        private static String[] b(H h10, String str) {
            Object[] objArrG = h10.g(str);
            if (objArrG == null) {
                return null;
            }
            String[] strArr = new String[objArrG.length];
            for (int i10 = 0; i10 < objArrG.length; i10++) {
                strArr[i10] = String.valueOf(objArrG[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f38273d;
        }

        private b(H h10) {
            this.f38270a = h10.p("gcm.n.title");
            this.f38271b = h10.h("gcm.n.title");
            this.f38272c = b(h10, "gcm.n.title");
            this.f38273d = h10.p("gcm.n.body");
            this.f38274e = h10.h("gcm.n.body");
            this.f38275f = b(h10, "gcm.n.body");
            this.f38276g = h10.p("gcm.n.icon");
            this.f38278i = h10.o();
            this.f38279j = h10.p("gcm.n.tag");
            this.f38280k = h10.p("gcm.n.color");
            this.f38281l = h10.p("gcm.n.click_action");
            this.f38282m = h10.p("gcm.n.android_channel_id");
            this.f38283n = h10.f();
            this.f38277h = h10.p("gcm.n.image");
            this.f38284o = h10.p("gcm.n.ticker");
            this.f38285p = h10.b("gcm.n.notification_priority");
            this.f38286q = h10.b("gcm.n.visibility");
            this.f38287r = h10.b("gcm.n.notification_count");
            this.f38290u = h10.a("gcm.n.sticky");
            this.f38291v = h10.a("gcm.n.local_only");
            this.f38292w = h10.a("gcm.n.default_sound");
            this.f38293x = h10.a("gcm.n.default_vibrate_timings");
            this.f38294y = h10.a("gcm.n.default_light_settings");
            this.f38289t = h10.j("gcm.n.event_time");
            this.f38288s = h10.e();
            this.f38295z = h10.q();
        }
    }

    public P(Bundle bundle) {
        this.f38267B = bundle;
    }

    public Map<String, String> f0() {
        if (this.f38268C == null) {
            this.f38268C = C2919d.a.a(this.f38267B);
        }
        return this.f38268C;
    }

    public String h0() {
        return this.f38267B.getString("from");
    }

    public b r0() {
        if (this.f38269D == null && H.t(this.f38267B)) {
            this.f38269D = new b(new H(this.f38267B));
        }
        return this.f38269D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Q.c(this, parcel, i10);
    }
}
