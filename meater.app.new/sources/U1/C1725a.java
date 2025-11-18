package U1;

import android.view.View;

/* compiled from: AdOverlayInfo.java */
/* renamed from: U1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725a {

    /* renamed from: a, reason: collision with root package name */
    public final View f16990a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16992c;

    /* compiled from: AdOverlayInfo.java */
    /* renamed from: U1.a$a, reason: collision with other inner class name */
    public static final class C0256a {

        /* renamed from: a, reason: collision with root package name */
        private final View f16993a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16994b;

        /* renamed from: c, reason: collision with root package name */
        private String f16995c;

        public C0256a(View view, int i10) {
            this.f16993a = view;
            this.f16994b = i10;
        }

        public C1725a a() {
            return new C1725a(this.f16993a, this.f16994b, this.f16995c);
        }

        public C0256a b(String str) {
            this.f16995c = str;
            return this;
        }
    }

    @Deprecated
    public C1725a(View view, int i10, String str) {
        this.f16990a = view;
        this.f16991b = i10;
        this.f16992c = str;
    }
}
