package p024c.p025a.p032o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p024c.p025a.C0823a;
import p024c.p025a.C0824b;
import p024c.p025a.C0826d;
import p024c.p025a.C0832j;

/* compiled from: ActionBarPolicy.java */
/* renamed from: c.a.o.a */
/* loaded from: classes.dex */
public class C0841a {

    /* renamed from: a */
    private Context f5555a;

    private C0841a(Context context) {
        this.f5555a = context;
    }

    /* renamed from: b */
    public static C0841a m5331b(Context context) {
        return new C0841a(context);
    }

    /* renamed from: a */
    public boolean m5332a() {
        return this.f5555a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m5333c() {
        return this.f5555a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m5334d() {
        Configuration configuration = this.f5555a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int m5335e() {
        return this.f5555a.getResources().getDimensionPixelSize(C0826d.f5063b);
    }

    /* renamed from: f */
    public int m5336f() {
        TypedArray typedArrayObtainStyledAttributes = this.f5555a.obtainStyledAttributes(null, C0832j.f5328a, C0823a.f5029c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C0832j.f5373j, 0);
        Resources resources = this.f5555a.getResources();
        if (!m5337g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0826d.f5062a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m5337g() {
        return this.f5555a.getResources().getBoolean(C0824b.f5053a);
    }

    /* renamed from: h */
    public boolean m5338h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f5555a).hasPermanentMenuKey();
    }
}
