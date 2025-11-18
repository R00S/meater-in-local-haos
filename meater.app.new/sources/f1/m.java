package f1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import e1.C3120b;
import e1.C3121c;
import e1.C3122d;
import e1.C3124f;
import g1.C3377a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class m {

    /* compiled from: NotificationCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f41056a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f41057b;

        /* renamed from: c, reason: collision with root package name */
        private final w[] f41058c;

        /* renamed from: d, reason: collision with root package name */
        private final w[] f41059d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f41060e;

        /* renamed from: f, reason: collision with root package name */
        boolean f41061f;

        /* renamed from: g, reason: collision with root package name */
        private final int f41062g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f41063h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f41064i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f41065j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f41066k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f41067l;

        /* compiled from: NotificationCompat.java */
        /* renamed from: f1.m$a$a, reason: collision with other inner class name */
        public static final class C0515a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f41068a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f41069b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f41070c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f41071d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f41072e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<w> f41073f;

            /* renamed from: g, reason: collision with root package name */
            private int f41074g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f41075h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f41076i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f41077j;

            public C0515a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f41076i && this.f41070c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f41073f;
                if (arrayList3 != null) {
                    Iterator<w> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        w next = it.next();
                        if (next.j()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                return new a(this.f41068a, this.f41069b, this.f41070c, this.f41072e, arrayList2.isEmpty() ? null : (w[]) arrayList2.toArray(new w[arrayList2.size()]), arrayList.isEmpty() ? null : (w[]) arrayList.toArray(new w[arrayList.size()]), this.f41071d, this.f41074g, this.f41075h, this.f41076i, this.f41077j);
            }

            private C0515a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f41071d = true;
                this.f41075h = true;
                this.f41068a = iconCompat;
                this.f41069b = e.e(charSequence);
                this.f41070c = pendingIntent;
                this.f41072e = bundle;
                this.f41073f = wVarArr == null ? null : new ArrayList<>(Arrays.asList(wVarArr));
                this.f41071d = z10;
                this.f41074g = i10;
                this.f41075h = z11;
                this.f41076i = z12;
                this.f41077j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.d(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f41066k;
        }

        public boolean b() {
            return this.f41060e;
        }

        public Bundle c() {
            return this.f41056a;
        }

        public IconCompat d() {
            int i10;
            if (this.f41057b == null && (i10 = this.f41064i) != 0) {
                this.f41057b = IconCompat.d(null, "", i10);
            }
            return this.f41057b;
        }

        public w[] e() {
            return this.f41058c;
        }

        public int f() {
            return this.f41062g;
        }

        public boolean g() {
            return this.f41061f;
        }

        public CharSequence h() {
            return this.f41065j;
        }

        public boolean i() {
            return this.f41067l;
        }

        public boolean j() {
            return this.f41063h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f41061f = true;
            this.f41057b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f41064i = iconCompat.f();
            }
            this.f41065j = e.e(charSequence);
            this.f41066k = pendingIntent;
            this.f41056a = bundle == null ? new Bundle() : bundle;
            this.f41058c = wVarArr;
            this.f41059d = wVarArr2;
            this.f41060e = z10;
            this.f41062g = i10;
            this.f41061f = z11;
            this.f41063h = z12;
            this.f41067l = z13;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b extends i {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f41078e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f41079f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f41080g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f41081h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f41082i;

        /* compiled from: NotificationCompat.java */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: f1.m$b$b, reason: collision with other inner class name */
        private static class C0516b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // f1.m.i
        public void b(l lVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(lVar.a()).setBigContentTitle(this.f41142b);
            IconCompat iconCompat = this.f41078e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0516b.a(bigContentTitle, this.f41078e.o(lVar instanceof o ? ((o) lVar).f() : null));
                } else if (iconCompat.h() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f41078e.e());
                }
            }
            if (this.f41080g) {
                if (this.f41079f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f41079f.o(lVar instanceof o ? ((o) lVar).f() : null));
                }
            }
            if (this.f41144d) {
                bigContentTitle.setSummaryText(this.f41143c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0516b.c(bigContentTitle, this.f41082i);
                C0516b.b(bigContentTitle, this.f41081h);
            }
        }

        @Override // f1.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f41079f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f41080g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f41078e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class c extends i {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f41083e;

        @Override // f1.m.i
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // f1.m.i
        public void b(l lVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(lVar.a()).setBigContentTitle(this.f41142b).bigText(this.f41083e);
            if (this.f41144d) {
                bigTextStyleBigText.setSummaryText(this.f41143c);
            }
        }

        @Override // f1.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f41083e = e.e(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class g extends i {

        /* compiled from: NotificationCompat.java */
        static class a {
            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // f1.m.i
        public void b(l lVar) {
            lVar.a().setStyle(a.a());
        }

        @Override // f1.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // f1.m.i
        public RemoteViews d(l lVar) {
            return null;
        }

        @Override // f1.m.i
        public RemoteViews e(l lVar) {
            return null;
        }

        @Override // f1.m.i
        public RemoteViews f(l lVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    public interface h {
        e a(e eVar);
    }

    /* compiled from: NotificationCompat.java */
    public static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        protected e f41141a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f41142b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f41143c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41144d = false;

        public void a(Bundle bundle) {
            if (this.f41144d) {
                bundle.putCharSequence("android.summaryText", this.f41143c);
            }
            CharSequence charSequence = this.f41142b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(l lVar);

        protected abstract String c();

        public RemoteViews d(l lVar) {
            return null;
        }

        public RemoteViews e(l lVar) {
            return null;
        }

        public RemoteViews f(l lVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f41141a != eVar) {
                this.f41141a = eVar;
                if (eVar != null) {
                    eVar.B(this);
                }
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class j implements h {

        /* renamed from: c, reason: collision with root package name */
        private PendingIntent f41147c;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f41149e;

        /* renamed from: f, reason: collision with root package name */
        private int f41150f;

        /* renamed from: j, reason: collision with root package name */
        private int f41154j;

        /* renamed from: l, reason: collision with root package name */
        private int f41156l;

        /* renamed from: m, reason: collision with root package name */
        private String f41157m;

        /* renamed from: n, reason: collision with root package name */
        private String f41158n;

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<a> f41145a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private int f41146b = 1;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Notification> f41148d = new ArrayList<>();

        /* renamed from: g, reason: collision with root package name */
        private int f41151g = 8388613;

        /* renamed from: h, reason: collision with root package name */
        private int f41152h = -1;

        /* renamed from: i, reason: collision with root package name */
        private int f41153i = 0;

        /* renamed from: k, reason: collision with root package name */
        private int f41155k = 80;

        /* compiled from: NotificationCompat.java */
        static class a {
            static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }
        }

        /* compiled from: NotificationCompat.java */
        static class b {
            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* compiled from: NotificationCompat.java */
        static class c {
            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        /* compiled from: NotificationCompat.java */
        static class d {
            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }
        }

        private static Notification.Action c(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat iconCompatD = aVar.d();
            Notification.Action.Builder builderA = b.a(iconCompatD == null ? null : iconCompatD.n(), aVar.h(), aVar.a());
            Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            c.a(builderA, aVar.b());
            if (i10 >= 31) {
                d.a(builderA, aVar.i());
            }
            a.a(builderA, bundle);
            w[] wVarArrE = aVar.e();
            if (wVarArrE != null) {
                for (RemoteInput remoteInput : w.b(wVarArrE)) {
                    a.b(builderA, remoteInput);
                }
            }
            return a.c(builderA);
        }

        @Override // f1.m.h
        public e a(e eVar) {
            Bundle bundle = new Bundle();
            if (!this.f41145a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f41145a.size());
                Iterator<a> it = this.f41145a.iterator();
                while (it.hasNext()) {
                    arrayList.add(c(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i10 = this.f41146b;
            if (i10 != 1) {
                bundle.putInt("flags", i10);
            }
            PendingIntent pendingIntent = this.f41147c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f41148d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f41148d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f41149e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i11 = this.f41150f;
            if (i11 != 0) {
                bundle.putInt("contentIcon", i11);
            }
            int i12 = this.f41151g;
            if (i12 != 8388613) {
                bundle.putInt("contentIconGravity", i12);
            }
            int i13 = this.f41152h;
            if (i13 != -1) {
                bundle.putInt("contentActionIndex", i13);
            }
            int i14 = this.f41153i;
            if (i14 != 0) {
                bundle.putInt("customSizePreset", i14);
            }
            int i15 = this.f41154j;
            if (i15 != 0) {
                bundle.putInt("customContentHeight", i15);
            }
            int i16 = this.f41155k;
            if (i16 != 80) {
                bundle.putInt("gravity", i16);
            }
            int i17 = this.f41156l;
            if (i17 != 0) {
                bundle.putInt("hintScreenTimeout", i17);
            }
            String str = this.f41157m;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f41158n;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            eVar.d().putBundle("android.wearable.EXTENSIONS", bundle);
            return eVar;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j clone() {
            j jVar = new j();
            jVar.f41145a = new ArrayList<>(this.f41145a);
            jVar.f41146b = this.f41146b;
            jVar.f41147c = this.f41147c;
            jVar.f41148d = new ArrayList<>(this.f41148d);
            jVar.f41149e = this.f41149e;
            jVar.f41150f = this.f41150f;
            jVar.f41151g = this.f41151g;
            jVar.f41152h = this.f41152h;
            jVar.f41153i = this.f41153i;
            jVar.f41154j = this.f41154j;
            jVar.f41155k = this.f41155k;
            jVar.f41156l = this.f41156l;
            jVar.f41157m = this.f41157m;
            jVar.f41158n = this.f41158n;
            return jVar;
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C3121c.f39970b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C3121c.f39969a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }

    /* compiled from: NotificationCompat.java */
    public static class e {

        /* renamed from: A, reason: collision with root package name */
        boolean f41084A;

        /* renamed from: B, reason: collision with root package name */
        boolean f41085B;

        /* renamed from: C, reason: collision with root package name */
        String f41086C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f41087D;

        /* renamed from: E, reason: collision with root package name */
        int f41088E;

        /* renamed from: F, reason: collision with root package name */
        int f41089F;

        /* renamed from: G, reason: collision with root package name */
        Notification f41090G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f41091H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f41092I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f41093J;

        /* renamed from: K, reason: collision with root package name */
        String f41094K;

        /* renamed from: L, reason: collision with root package name */
        int f41095L;

        /* renamed from: M, reason: collision with root package name */
        String f41096M;

        /* renamed from: N, reason: collision with root package name */
        long f41097N;

        /* renamed from: O, reason: collision with root package name */
        int f41098O;

        /* renamed from: P, reason: collision with root package name */
        int f41099P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f41100Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f41101R;

        /* renamed from: S, reason: collision with root package name */
        boolean f41102S;

        /* renamed from: T, reason: collision with root package name */
        Object f41103T;

        /* renamed from: U, reason: collision with root package name */
        @Deprecated
        public ArrayList<String> f41104U;

        /* renamed from: a, reason: collision with root package name */
        public Context f41105a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f41106b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<u> f41107c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f41108d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f41109e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f41110f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f41111g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f41112h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f41113i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f41114j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f41115k;

        /* renamed from: l, reason: collision with root package name */
        int f41116l;

        /* renamed from: m, reason: collision with root package name */
        int f41117m;

        /* renamed from: n, reason: collision with root package name */
        boolean f41118n;

        /* renamed from: o, reason: collision with root package name */
        boolean f41119o;

        /* renamed from: p, reason: collision with root package name */
        i f41120p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f41121q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f41122r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f41123s;

        /* renamed from: t, reason: collision with root package name */
        int f41124t;

        /* renamed from: u, reason: collision with root package name */
        int f41125u;

        /* renamed from: v, reason: collision with root package name */
        boolean f41126v;

        /* renamed from: w, reason: collision with root package name */
        String f41127w;

        /* renamed from: x, reason: collision with root package name */
        boolean f41128x;

        /* renamed from: y, reason: collision with root package name */
        String f41129y;

        /* renamed from: z, reason: collision with root package name */
        boolean f41130z;

        /* compiled from: NotificationCompat.java */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f41106b = new ArrayList<>();
            this.f41107c = new ArrayList<>();
            this.f41108d = new ArrayList<>();
            this.f41118n = true;
            this.f41130z = false;
            this.f41088E = 0;
            this.f41089F = 0;
            this.f41095L = 0;
            this.f41098O = 0;
            this.f41099P = 0;
            Notification notification = new Notification();
            this.f41101R = notification;
            this.f41105a = context;
            this.f41094K = str;
            notification.when = System.currentTimeMillis();
            this.f41101R.audioStreamType = -1;
            this.f41117m = 0;
            this.f41104U = new ArrayList<>();
            this.f41100Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void o(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f41101R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f41101R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(Uri uri) {
            Notification notification = this.f41101R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f41101R.audioAttributes = a.a(builderD);
            return this;
        }

        public e B(i iVar) {
            if (this.f41120p != iVar) {
                this.f41120p = iVar;
                if (iVar != null) {
                    iVar.g(this);
                }
            }
            return this;
        }

        public e C(CharSequence charSequence) {
            this.f41101R.tickerText = e(charSequence);
            return this;
        }

        public e D(long[] jArr) {
            this.f41101R.vibrate = jArr;
            return this;
        }

        public e E(int i10) {
            this.f41089F = i10;
            return this;
        }

        public e F(long j10) {
            this.f41101R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f41106b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new o(this).c();
        }

        public e c(h hVar) {
            hVar.a(this);
            return this;
        }

        public Bundle d() {
            if (this.f41087D == null) {
                this.f41087D = new Bundle();
            }
            return this.f41087D;
        }

        public e f(boolean z10) {
            o(16, z10);
            return this;
        }

        public e g(String str) {
            this.f41094K = str;
            return this;
        }

        public e h(int i10) {
            this.f41088E = i10;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f41111g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f41110f = e(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f41109e = e(charSequence);
            return this;
        }

        public e l(RemoteViews remoteViews) {
            this.f41091H = remoteViews;
            return this;
        }

        public e m(int i10) {
            Notification notification = this.f41101R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f41101R.deleteIntent = pendingIntent;
            return this;
        }

        public e p(String str) {
            this.f41127w = str;
            return this;
        }

        public e q(boolean z10) {
            this.f41128x = z10;
            return this;
        }

        public e r(Bitmap bitmap) {
            this.f41114j = bitmap == null ? null : IconCompat.b(m.b(this.f41105a, bitmap));
            return this;
        }

        public e s(int i10, int i11, int i12) {
            Notification notification = this.f41101R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e t(boolean z10) {
            this.f41130z = z10;
            return this;
        }

        public e u(int i10) {
            this.f41116l = i10;
            return this;
        }

        public e v(boolean z10) {
            o(2, z10);
            return this;
        }

        public e w(boolean z10) {
            o(8, z10);
            return this;
        }

        public e x(int i10) {
            this.f41117m = i10;
            return this;
        }

        public e y(boolean z10) {
            this.f41118n = z10;
            return this;
        }

        public e z(int i10) {
            this.f41101R.icon = i10;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class f extends i {

        /* renamed from: e, reason: collision with root package name */
        private int f41131e;

        /* renamed from: f, reason: collision with root package name */
        private u f41132f;

        /* renamed from: g, reason: collision with root package name */
        private PendingIntent f41133g;

        /* renamed from: h, reason: collision with root package name */
        private PendingIntent f41134h;

        /* renamed from: i, reason: collision with root package name */
        private PendingIntent f41135i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f41136j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f41137k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f41138l;

        /* renamed from: m, reason: collision with root package name */
        private IconCompat f41139m;

        /* renamed from: n, reason: collision with root package name */
        private CharSequence f41140n;

        /* compiled from: NotificationCompat.java */
        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        /* compiled from: NotificationCompat.java */
        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i10 = this.f41131e;
            if (i10 == 1) {
                return this.f41141a.f41105a.getResources().getString(C3124f.f40023e);
            }
            if (i10 == 2) {
                return this.f41141a.f41105a.getResources().getString(C3124f.f40024f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f41141a.f41105a.getResources().getString(C3124f.f40025g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(C3377a.c(this.f41141a.f41105a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f41141a.f41105a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C0515a(IconCompat.c(this.f41141a.f41105a, i10), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i10 = C3122d.f39972b;
            int i11 = C3122d.f39971a;
            PendingIntent pendingIntent = this.f41133g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f41136j;
            return k(z10 ? i10 : i11, z10 ? C3124f.f40020b : C3124f.f40019a, this.f41137k, C3120b.f39967a, pendingIntent);
        }

        private a m() {
            int i10 = C3122d.f39973c;
            PendingIntent pendingIntent = this.f41134h;
            return pendingIntent == null ? k(i10, C3124f.f40022d, this.f41138l, C3120b.f39968b, this.f41135i) : k(i10, C3124f.f40021c, this.f41138l, C3120b.f39968b, pendingIntent);
        }

        @Override // f1.m.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f41131e);
            bundle.putBoolean("android.callIsVideo", this.f41136j);
            u uVar = this.f41132f;
            if (uVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(uVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", uVar.i());
                }
            }
            IconCompat iconCompat = this.f41139m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.o(this.f41141a.f41105a)));
            }
            bundle.putCharSequence("android.verificationText", this.f41140n);
            bundle.putParcelable("android.answerIntent", this.f41133g);
            bundle.putParcelable("android.declineIntent", this.f41134h);
            bundle.putParcelable("android.hangUpIntent", this.f41135i);
            Integer num = this.f41137k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f41138l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // f1.m.i
        public void b(l lVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (i10 < 31) {
                Notification.Builder builderA = lVar.a();
                u uVar = this.f41132f;
                builderA.setContentTitle(uVar != null ? uVar.c() : null);
                Bundle bundle = this.f41141a.f41087D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f41141a.f41087D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                u uVar2 = this.f41132f;
                if (uVar2 != null) {
                    if (uVar2.a() != null) {
                        b.b(builderA, this.f41132f.a().o(this.f41141a.f41105a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f41132f.h());
                    } else {
                        a.a(builderA, this.f41132f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f41131e;
            if (i11 == 1) {
                callStyleA = d.a(this.f41132f.h(), this.f41134h, this.f41133g);
            } else if (i11 == 2) {
                callStyleA = d.b(this.f41132f.h(), this.f41135i);
            } else if (i11 == 3) {
                callStyleA = d.c(this.f41132f.h(), this.f41135i, this.f41133g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f41131e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(lVar.a());
                Integer num = this.f41137k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f41138l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f41140n);
                IconCompat iconCompat = this.f41139m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.o(this.f41141a.f41105a));
                }
                d.f(callStyleA, this.f41136j);
            }
        }

        @Override // f1.m.i
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f41141a.f41106b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (aVarL != null && i10 == 1) {
                        arrayList.add(aVarL);
                        i10--;
                    }
                }
            }
            if (aVarL != null && i10 >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }

        /* compiled from: NotificationCompat.java */
        static class b {
            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            static Parcelable a(Icon icon) {
                return icon;
            }
        }

        /* compiled from: NotificationCompat.java */
        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }
    }
}
