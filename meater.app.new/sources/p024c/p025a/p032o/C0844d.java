package p024c.p025a.p032o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p024c.p025a.C0831i;

/* compiled from: ContextThemeWrapper.java */
/* renamed from: c.a.o.d */
/* loaded from: classes.dex */
public class C0844d extends ContextWrapper {

    /* renamed from: a */
    private int f5558a;

    /* renamed from: b */
    private Resources.Theme f5559b;

    /* renamed from: c */
    private LayoutInflater f5560c;

    /* renamed from: d */
    private Configuration f5561d;

    /* renamed from: e */
    private Resources f5562e;

    public C0844d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m5342b() {
        if (this.f5562e == null) {
            Configuration configuration = this.f5561d;
            if (configuration == null) {
                this.f5562e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f5562e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f5561d);
                this.f5562e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f5562e;
    }

    /* renamed from: d */
    private void m5343d() {
        boolean z = this.f5559b == null;
        if (z) {
            this.f5559b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f5559b.setTo(theme);
            }
        }
        m5346e(this.f5559b, this.f5558a, z);
    }

    /* renamed from: a */
    public void m5344a(Configuration configuration) {
        if (this.f5562e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f5561d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f5561d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m5345c() {
        return this.f5558a;
    }

    /* renamed from: e */
    protected void m5346e(Resources.Theme theme, int i2, boolean z) {
        theme.applyStyle(i2, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m5342b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f5560c == null) {
            this.f5560c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f5560c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f5559b;
        if (theme != null) {
            return theme;
        }
        if (this.f5558a == 0) {
            this.f5558a = C0831i.f5198e;
        }
        m5343d();
        return this.f5559b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f5558a != i2) {
            this.f5558a = i2;
            m5343d();
        }
    }

    public C0844d(Context context, int i2) {
        super(context);
        this.f5558a = i2;
    }

    public C0844d(Context context, Resources.Theme theme) {
        super(context);
        this.f5559b = theme;
    }
}
