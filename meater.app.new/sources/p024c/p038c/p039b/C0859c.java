package p024c.p038c.p039b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.C0238b;
import androidx.core.app.C0241e;
import androidx.core.content.C0255a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* renamed from: c.c.b.c */
/* loaded from: classes.dex */
public final class C0859c {

    /* renamed from: a */
    public final Intent f5675a;

    /* renamed from: b */
    public final Bundle f5676b;

    /* compiled from: CustomTabsIntent.java */
    /* renamed from: c.c.b.c$a */
    public static final class a {

        /* renamed from: a */
        private final Intent f5677a;

        /* renamed from: b */
        private ArrayList<Bundle> f5678b;

        /* renamed from: c */
        private Bundle f5679c;

        /* renamed from: d */
        private ArrayList<Bundle> f5680d;

        /* renamed from: e */
        private boolean f5681e;

        public a() {
            this(null);
        }

        /* renamed from: a */
        public a m5398a() {
            this.f5677a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }

        /* renamed from: b */
        public a m5399b(String str, PendingIntent pendingIntent) {
            if (this.f5678b == null) {
                this.f5678b = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f5678b.add(bundle);
            return this;
        }

        /* renamed from: c */
        public C0859c m5400c() {
            ArrayList<Bundle> arrayList = this.f5678b;
            if (arrayList != null) {
                this.f5677a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f5680d;
            if (arrayList2 != null) {
                this.f5677a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f5677a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f5681e);
            return new C0859c(this.f5677a, this.f5679c);
        }

        /* renamed from: d */
        public a m5401d(Bitmap bitmap) {
            this.f5677a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        /* renamed from: e */
        public a m5402e(Context context, int i2, int i3) {
            this.f5677a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0238b.m1533a(context, i2, i3).mo1534b());
            return this;
        }

        /* renamed from: f */
        public a m5403f(boolean z) {
            this.f5677a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: g */
        public a m5404g(Context context, int i2, int i3) {
            this.f5679c = C0238b.m1533a(context, i2, i3).mo1534b();
            return this;
        }

        /* renamed from: h */
        public a m5405h(int i2) {
            this.f5677a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i2);
            return this;
        }

        public a(C0861e c0861e) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f5677a = intent;
            this.f5678b = null;
            this.f5679c = null;
            this.f5680d = null;
            this.f5681e = true;
            if (c0861e != null) {
                intent.setPackage(c0861e.m5407b().getPackageName());
            }
            Bundle bundle = new Bundle();
            C0241e.m1547b(bundle, "android.support.customtabs.extra.SESSION", c0861e != null ? c0861e.m5406a() : null);
            intent.putExtras(bundle);
        }
    }

    C0859c(Intent intent, Bundle bundle) {
        this.f5675a = intent;
        this.f5676b = bundle;
    }

    /* renamed from: a */
    public void m5397a(Context context, Uri uri) {
        this.f5675a.setData(uri);
        C0255a.m1682k(context, this.f5675a, this.f5676b);
    }
}
