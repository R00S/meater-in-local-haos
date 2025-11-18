package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f20846f;

    /* renamed from: a, reason: collision with root package name */
    private int f20847a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f20848b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f20849c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f20850d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f20851e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f20851e == null) {
            Configuration configuration = this.f20850d;
            if (configuration == null || e(configuration)) {
                this.f20851e = super.getResources();
            } else {
                this.f20851e = createConfigurationContext(this.f20850d).getResources();
            }
        }
        return this.f20851e;
    }

    private void d() {
        boolean z10 = this.f20848b == null;
        if (z10) {
            this.f20848b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f20848b.setTo(theme);
            }
        }
        f(this.f20848b, this.f20847a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f20846f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f20846f = configuration2;
        }
        return configuration.equals(f20846f);
    }

    public void a(Configuration configuration) {
        if (this.f20851e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f20850d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f20850d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f20847a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f20849c == null) {
            this.f20849c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f20849c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f20848b;
        if (theme != null) {
            return theme;
        }
        if (this.f20847a == 0) {
            this.f20847a = i.i.f42561c;
        }
        d();
        return this.f20848b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f20847a != i10) {
            this.f20847a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f20847a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f20848b = theme;
    }
}
