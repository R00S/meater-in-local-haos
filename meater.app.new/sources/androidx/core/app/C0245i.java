package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.content.C0256b;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p024c.p052i.C0920b;

/* compiled from: NotificationCompat.java */
/* renamed from: androidx.core.app.i */
/* loaded from: classes.dex */
public class C0245i {

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.i$a */
    public static class a {

        /* renamed from: a */
        final Bundle f2073a;

        /* renamed from: b */
        private IconCompat f2074b;

        /* renamed from: c */
        private final C0250n[] f2075c;

        /* renamed from: d */
        private final C0250n[] f2076d;

        /* renamed from: e */
        private boolean f2077e;

        /* renamed from: f */
        boolean f2078f;

        /* renamed from: g */
        private final int f2079g;

        /* renamed from: h */
        private final boolean f2080h;

        /* renamed from: i */
        @Deprecated
        public int f2081i;

        /* renamed from: j */
        public CharSequence f2082j;

        /* renamed from: k */
        public PendingIntent f2083k;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.m1788c(null, HttpUrl.FRAGMENT_ENCODE_SET, i2) : null, charSequence, pendingIntent);
        }

        /* renamed from: a */
        public PendingIntent m1558a() {
            return this.f2083k;
        }

        /* renamed from: b */
        public boolean m1559b() {
            return this.f2077e;
        }

        /* renamed from: c */
        public C0250n[] m1560c() {
            return this.f2076d;
        }

        /* renamed from: d */
        public Bundle m1561d() {
            return this.f2073a;
        }

        /* renamed from: e */
        public IconCompat m1562e() {
            int i2;
            if (this.f2074b == null && (i2 = this.f2081i) != 0) {
                this.f2074b = IconCompat.m1788c(null, HttpUrl.FRAGMENT_ENCODE_SET, i2);
            }
            return this.f2074b;
        }

        /* renamed from: f */
        public C0250n[] m1563f() {
            return this.f2075c;
        }

        /* renamed from: g */
        public int m1564g() {
            return this.f2079g;
        }

        /* renamed from: h */
        public boolean m1565h() {
            return this.f2078f;
        }

        /* renamed from: i */
        public CharSequence m1566i() {
            return this.f2082j;
        }

        /* renamed from: j */
        public boolean m1567j() {
            return this.f2080h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0250n[] c0250nArr, C0250n[] c0250nArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f2078f = true;
            this.f2074b = iconCompat;
            if (iconCompat != null && iconCompat.m1797i() == 2) {
                this.f2081i = iconCompat.m1795e();
            }
            this.f2082j = e.m1580e(charSequence);
            this.f2083k = pendingIntent;
            this.f2073a = bundle == null ? new Bundle() : bundle;
            this.f2075c = c0250nArr;
            this.f2076d = c0250nArr2;
            this.f2077e = z;
            this.f2079g = i2;
            this.f2078f = z2;
            this.f2080h = z3;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.i$b */
    public static class b extends f {

        /* renamed from: e */
        private Bitmap f2084e;

        /* renamed from: f */
        private IconCompat f2085f;

        /* renamed from: g */
        private boolean f2086g;

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.i$b$a */
        private static class a {
            /* renamed from: a */
            static void m1572a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            /* renamed from: b */
            static void m1573b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.i$b$b, reason: collision with other inner class name */
        private static class C11433b {
            /* renamed from: a */
            static void m1574a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @Override // androidx.core.app.C0245i.f
        /* renamed from: b */
        public void mo1568b(InterfaceC0244h interfaceC0244h) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16) {
                Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(interfaceC0244h.mo1556a()).setBigContentTitle(this.f2137b).bigPicture(this.f2084e);
                if (this.f2086g) {
                    IconCompat iconCompat = this.f2085f;
                    if (iconCompat == null) {
                        a.m1572a(bigPictureStyleBigPicture, null);
                    } else if (i2 >= 23) {
                        C11433b.m1574a(bigPictureStyleBigPicture, this.f2085f.m1803q(interfaceC0244h instanceof C0246j ? ((C0246j) interfaceC0244h).m1621f() : null));
                    } else if (iconCompat.m1797i() == 1) {
                        a.m1572a(bigPictureStyleBigPicture, this.f2085f.m1794d());
                    } else {
                        a.m1572a(bigPictureStyleBigPicture, null);
                    }
                }
                if (this.f2139d) {
                    a.m1573b(bigPictureStyleBigPicture, this.f2138c);
                }
            }
        }

        @Override // androidx.core.app.C0245i.f
        /* renamed from: c */
        protected String mo1569c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* renamed from: h */
        public b m1570h(Bitmap bitmap) {
            this.f2085f = bitmap == null ? null : IconCompat.m1787b(bitmap);
            this.f2086g = true;
            return this;
        }

        /* renamed from: i */
        public b m1571i(Bitmap bitmap) {
            this.f2084e = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.i$c */
    public static class c extends f {

        /* renamed from: e */
        private CharSequence f2087e;

        @Override // androidx.core.app.C0245i.f
        /* renamed from: a */
        public void mo1575a(Bundle bundle) {
            super.mo1575a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2087e);
            }
        }

        @Override // androidx.core.app.C0245i.f
        /* renamed from: b */
        public void mo1568b(InterfaceC0244h interfaceC0244h) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0244h.mo1556a()).setBigContentTitle(this.f2137b).bigText(this.f2087e);
                if (this.f2139d) {
                    bigTextStyleBigText.setSummaryText(this.f2138c);
                }
            }
        }

        @Override // androidx.core.app.C0245i.f
        /* renamed from: c */
        protected String mo1569c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* renamed from: h */
        public c m1576h(CharSequence charSequence) {
            this.f2087e = e.m1580e(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.i$d */
    public static final class d {

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.i$d$a */
        private static class a {
            /* renamed from: a */
            static Notification.BubbleMetadata m1578a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                throw null;
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.i$d$b */
        private static class b {
            /* renamed from: a */
            static Notification.BubbleMetadata m1579a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                throw null;
            }
        }

        /* renamed from: a */
        public static Notification.BubbleMetadata m1577a(d dVar) {
            if (dVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.m1579a(dVar);
            }
            if (i2 == 29) {
                return a.m1578a(dVar);
            }
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.i$f */
    public static abstract class f {

        /* renamed from: a */
        protected e f2136a;

        /* renamed from: b */
        CharSequence f2137b;

        /* renamed from: c */
        CharSequence f2138c;

        /* renamed from: d */
        boolean f2139d = false;

        /* renamed from: a */
        public void mo1575a(Bundle bundle) {
            if (this.f2139d) {
                bundle.putCharSequence("android.summaryText", this.f2138c);
            }
            CharSequence charSequence = this.f2137b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strMo1569c = mo1569c();
            if (strMo1569c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo1569c);
            }
        }

        /* renamed from: b */
        public abstract void mo1568b(InterfaceC0244h interfaceC0244h);

        /* renamed from: c */
        protected abstract String mo1569c();

        /* renamed from: d */
        public RemoteViews m1611d(InterfaceC0244h interfaceC0244h) {
            return null;
        }

        /* renamed from: e */
        public RemoteViews m1612e(InterfaceC0244h interfaceC0244h) {
            return null;
        }

        /* renamed from: f */
        public RemoteViews m1613f(InterfaceC0244h interfaceC0244h) {
            return null;
        }

        /* renamed from: g */
        public void m1614g(e eVar) {
            if (this.f2136a != eVar) {
                this.f2136a = eVar;
                if (eVar != null) {
                    eVar.m1583A(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1557a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return C0247k.m1624c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* renamed from: androidx.core.app.i$e */
    public static class e {

        /* renamed from: A */
        boolean f2088A;

        /* renamed from: B */
        boolean f2089B;

        /* renamed from: C */
        String f2090C;

        /* renamed from: D */
        Bundle f2091D;

        /* renamed from: E */
        int f2092E;

        /* renamed from: F */
        int f2093F;

        /* renamed from: G */
        Notification f2094G;

        /* renamed from: H */
        RemoteViews f2095H;

        /* renamed from: I */
        RemoteViews f2096I;

        /* renamed from: J */
        RemoteViews f2097J;

        /* renamed from: K */
        String f2098K;

        /* renamed from: L */
        int f2099L;

        /* renamed from: M */
        String f2100M;

        /* renamed from: N */
        C0256b f2101N;

        /* renamed from: O */
        long f2102O;

        /* renamed from: P */
        int f2103P;

        /* renamed from: Q */
        boolean f2104Q;

        /* renamed from: R */
        d f2105R;

        /* renamed from: S */
        Notification f2106S;

        /* renamed from: T */
        boolean f2107T;

        /* renamed from: U */
        Icon f2108U;

        /* renamed from: V */
        @Deprecated
        public ArrayList<String> f2109V;

        /* renamed from: a */
        public Context f2110a;

        /* renamed from: b */
        public ArrayList<a> f2111b;

        /* renamed from: c */
        public ArrayList<C0249m> f2112c;

        /* renamed from: d */
        ArrayList<a> f2113d;

        /* renamed from: e */
        CharSequence f2114e;

        /* renamed from: f */
        CharSequence f2115f;

        /* renamed from: g */
        PendingIntent f2116g;

        /* renamed from: h */
        PendingIntent f2117h;

        /* renamed from: i */
        RemoteViews f2118i;

        /* renamed from: j */
        Bitmap f2119j;

        /* renamed from: k */
        CharSequence f2120k;

        /* renamed from: l */
        int f2121l;

        /* renamed from: m */
        int f2122m;

        /* renamed from: n */
        boolean f2123n;

        /* renamed from: o */
        boolean f2124o;

        /* renamed from: p */
        f f2125p;

        /* renamed from: q */
        CharSequence f2126q;

        /* renamed from: r */
        CharSequence f2127r;

        /* renamed from: s */
        CharSequence[] f2128s;

        /* renamed from: t */
        int f2129t;

        /* renamed from: u */
        int f2130u;

        /* renamed from: v */
        boolean f2131v;

        /* renamed from: w */
        String f2132w;

        /* renamed from: x */
        boolean f2133x;

        /* renamed from: y */
        String f2134y;

        /* renamed from: z */
        boolean f2135z;

        public e(Context context, String str) {
            this.f2111b = new ArrayList<>();
            this.f2112c = new ArrayList<>();
            this.f2113d = new ArrayList<>();
            this.f2123n = true;
            this.f2135z = false;
            this.f2092E = 0;
            this.f2093F = 0;
            this.f2099L = 0;
            this.f2103P = 0;
            Notification notification = new Notification();
            this.f2106S = notification;
            this.f2110a = context;
            this.f2098K = str;
            notification.when = System.currentTimeMillis();
            this.f2106S.audioStreamType = -1;
            this.f2122m = 0;
            this.f2109V = new ArrayList<>();
            this.f2104Q = true;
        }

        /* renamed from: e */
        protected static CharSequence m1580e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        /* renamed from: f */
        private Bitmap m1581f(Bitmap bitmap) throws Resources.NotFoundException {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2110a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0920b.f6196b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C0920b.f6195a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = dimensionPixelSize;
            double dMax = Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(dMax);
            double d3 = d2 / dMax;
            double d4 = dimensionPixelSize2;
            double dMax2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(dMax2);
            double dMin = Math.min(d3, d4 / dMax2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int iCeil = (int) Math.ceil(width * dMin);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, iCeil, (int) Math.ceil(height * dMin), true);
        }

        /* renamed from: o */
        private void m1582o(int i2, boolean z) {
            if (z) {
                Notification notification = this.f2106S;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.f2106S;
                notification2.flags = (i2 ^ (-1)) & notification2.flags;
            }
        }

        /* renamed from: A */
        public e m1583A(f fVar) {
            if (this.f2125p != fVar) {
                this.f2125p = fVar;
                if (fVar != null) {
                    fVar.m1614g(this);
                }
            }
            return this;
        }

        /* renamed from: B */
        public e m1584B(CharSequence charSequence) {
            this.f2106S.tickerText = m1580e(charSequence);
            return this;
        }

        /* renamed from: C */
        public e m1585C(long[] jArr) {
            this.f2106S.vibrate = jArr;
            return this;
        }

        /* renamed from: D */
        public e m1586D(int i2) {
            this.f2093F = i2;
            return this;
        }

        /* renamed from: E */
        public e m1587E(long j2) {
            this.f2106S.when = j2;
            return this;
        }

        /* renamed from: a */
        public e m1588a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2111b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: b */
        public e m1589b(a aVar) {
            if (aVar != null) {
                this.f2111b.add(aVar);
            }
            return this;
        }

        /* renamed from: c */
        public Notification m1590c() {
            return new C0246j(this).m1619c();
        }

        /* renamed from: d */
        public Bundle m1591d() {
            if (this.f2091D == null) {
                this.f2091D = new Bundle();
            }
            return this.f2091D;
        }

        /* renamed from: g */
        public e m1592g(boolean z) {
            m1582o(16, z);
            return this;
        }

        /* renamed from: h */
        public e m1593h(String str) {
            this.f2098K = str;
            return this;
        }

        /* renamed from: i */
        public e m1594i(int i2) {
            this.f2092E = i2;
            return this;
        }

        /* renamed from: j */
        public e m1595j(PendingIntent pendingIntent) {
            this.f2116g = pendingIntent;
            return this;
        }

        /* renamed from: k */
        public e m1596k(CharSequence charSequence) {
            this.f2115f = m1580e(charSequence);
            return this;
        }

        /* renamed from: l */
        public e m1597l(CharSequence charSequence) {
            this.f2114e = m1580e(charSequence);
            return this;
        }

        /* renamed from: m */
        public e m1598m(int i2) {
            Notification notification = this.f2106S;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: n */
        public e m1599n(PendingIntent pendingIntent) {
            this.f2106S.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: p */
        public e m1600p(Bitmap bitmap) {
            this.f2119j = m1581f(bitmap);
            return this;
        }

        /* renamed from: q */
        public e m1601q(int i2, int i3, int i4) {
            Notification notification = this.f2106S;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        /* renamed from: r */
        public e m1602r(boolean z) {
            this.f2135z = z;
            return this;
        }

        /* renamed from: s */
        public e m1603s(int i2) {
            this.f2121l = i2;
            return this;
        }

        /* renamed from: t */
        public e m1604t(boolean z) {
            m1582o(2, z);
            return this;
        }

        /* renamed from: u */
        public e m1605u(boolean z) {
            m1582o(8, z);
            return this;
        }

        /* renamed from: v */
        public e m1606v(int i2) {
            this.f2122m = i2;
            return this;
        }

        /* renamed from: w */
        public e m1607w(int i2, int i3, boolean z) {
            this.f2129t = i2;
            this.f2130u = i3;
            this.f2131v = z;
            return this;
        }

        /* renamed from: x */
        public e m1608x(boolean z) {
            this.f2123n = z;
            return this;
        }

        /* renamed from: y */
        public e m1609y(int i2) {
            this.f2106S.icon = i2;
            return this;
        }

        /* renamed from: z */
        public e m1610z(Uri uri) {
            Notification notification = this.f2106S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
