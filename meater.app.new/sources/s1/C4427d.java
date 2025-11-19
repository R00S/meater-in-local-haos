package s1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* compiled from: ContentInfoCompat.java */
/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4427d {

    /* renamed from: a, reason: collision with root package name */
    private final f f49121a;

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f49122a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f49122a = new b(clipData, i10);
            } else {
                this.f49122a = new C0689d(clipData, i10);
            }
        }

        public C4427d a() {
            return this.f49122a.e();
        }

        public a b(Bundle bundle) {
            this.f49122a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f49122a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f49122a.a(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$b */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f49123a;

        b(ClipData clipData, int i10) {
            this.f49123a = C4433g.a(clipData, i10);
        }

        @Override // s1.C4427d.c
        public void a(Uri uri) {
            this.f49123a.setLinkUri(uri);
        }

        @Override // s1.C4427d.c
        public void b(int i10) {
            this.f49123a.setFlags(i10);
        }

        @Override // s1.C4427d.c
        public C4427d e() {
            return new C4427d(new e(this.f49123a.build()));
        }

        @Override // s1.C4427d.c
        public void setExtras(Bundle bundle) {
            this.f49123a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C4427d e();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$d, reason: collision with other inner class name */
    private static final class C0689d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f49124a;

        /* renamed from: b, reason: collision with root package name */
        int f49125b;

        /* renamed from: c, reason: collision with root package name */
        int f49126c;

        /* renamed from: d, reason: collision with root package name */
        Uri f49127d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f49128e;

        C0689d(ClipData clipData, int i10) {
            this.f49124a = clipData;
            this.f49125b = i10;
        }

        @Override // s1.C4427d.c
        public void a(Uri uri) {
            this.f49127d = uri;
        }

        @Override // s1.C4427d.c
        public void b(int i10) {
            this.f49126c = i10;
        }

        @Override // s1.C4427d.c
        public C4427d e() {
            return new C4427d(new g(this));
        }

        @Override // s1.C4427d.c
        public void setExtras(Bundle bundle) {
            this.f49128e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$e */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f49129a;

        e(ContentInfo contentInfo) {
            this.f49129a = C4425c.a(r1.i.g(contentInfo));
        }

        @Override // s1.C4427d.f
        public ClipData a() {
            return this.f49129a.getClip();
        }

        @Override // s1.C4427d.f
        public int b() {
            return this.f49129a.getFlags();
        }

        @Override // s1.C4427d.f
        public ContentInfo c() {
            return this.f49129a;
        }

        @Override // s1.C4427d.f
        public int j() {
            return this.f49129a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f49129a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$f */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int j();
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: s1.d$g */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f49130a;

        /* renamed from: b, reason: collision with root package name */
        private final int f49131b;

        /* renamed from: c, reason: collision with root package name */
        private final int f49132c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f49133d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f49134e;

        g(C0689d c0689d) {
            this.f49130a = (ClipData) r1.i.g(c0689d.f49124a);
            this.f49131b = r1.i.c(c0689d.f49125b, 0, 5, "source");
            this.f49132c = r1.i.f(c0689d.f49126c, 1);
            this.f49133d = c0689d.f49127d;
            this.f49134e = c0689d.f49128e;
        }

        @Override // s1.C4427d.f
        public ClipData a() {
            return this.f49130a;
        }

        @Override // s1.C4427d.f
        public int b() {
            return this.f49132c;
        }

        @Override // s1.C4427d.f
        public ContentInfo c() {
            return null;
        }

        @Override // s1.C4427d.f
        public int j() {
            return this.f49131b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f49130a.getDescription());
            sb2.append(", source=");
            sb2.append(C4427d.e(this.f49131b));
            sb2.append(", flags=");
            sb2.append(C4427d.a(this.f49132c));
            if (this.f49133d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f49133d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f49134e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    C4427d(f fVar) {
        this.f49121a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C4427d g(ContentInfo contentInfo) {
        return new C4427d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f49121a.a();
    }

    public int c() {
        return this.f49121a.b();
    }

    public int d() {
        return this.f49121a.j();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f49121a.c();
        Objects.requireNonNull(contentInfoC);
        return C4425c.a(contentInfoC);
    }

    public String toString() {
        return this.f49121a.toString();
    }
}
