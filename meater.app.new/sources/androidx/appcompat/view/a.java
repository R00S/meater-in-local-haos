package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import i.j;

/* compiled from: ActionBarPolicy.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f20843a;

    private a(Context context) {
        this.f20843a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f20843a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f20843a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f20843a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f20843a.getResources().getDimensionPixelSize(i.d.f42430b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f20843a.obtainStyledAttributes(null, j.f42684a, i.a.f42396c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f42729j, 0);
        Resources resources = this.f20843a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(i.d.f42429a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f20843a.getResources().getBoolean(i.b.f42420a);
    }

    public boolean h() {
        return true;
    }
}
