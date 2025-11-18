package v1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final b f51010a;

    /* compiled from: InputContentInfoCompat.java */
    private static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f51011a;

        a(Object obj) {
            this.f51011a = (InputContentInfo) obj;
        }

        @Override // v1.d.b
        public Uri a() {
            return this.f51011a.getContentUri();
        }

        @Override // v1.d.b
        public void b() {
            this.f51011a.requestPermission();
        }

        @Override // v1.d.b
        public ClipDescription c() {
            return this.f51011a.getDescription();
        }

        @Override // v1.d.b
        public Uri d() {
            return this.f51011a.getLinkUri();
        }

        @Override // v1.d.b
        public Object e() {
            return this.f51011a;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    private interface b {
        Uri a();

        void b();

        ClipDescription c();

        Uri d();

        Object e();
    }

    private d(b bVar) {
        this.f51010a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f51010a.a();
    }

    public ClipDescription b() {
        return this.f51010a.c();
    }

    public Uri c() {
        return this.f51010a.d();
    }

    public void d() {
        this.f51010a.b();
    }

    public Object e() {
        return this.f51010a.e();
    }
}
