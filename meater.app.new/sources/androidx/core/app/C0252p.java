package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0255a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* renamed from: androidx.core.app.p */
/* loaded from: classes.dex */
public final class C0252p implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f2182f = new ArrayList<>();

    /* renamed from: g */
    private final Context f2183g;

    /* compiled from: TaskStackBuilder.java */
    /* renamed from: androidx.core.app.p$a */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private C0252p(Context context) {
        this.f2183g = context;
    }

    /* renamed from: h */
    public static C0252p m1656h(Context context) {
        return new C0252p(context);
    }

    /* renamed from: c */
    public C0252p m1657c(Intent intent) {
        this.f2182f.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public C0252p m1658f(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0243g.m1550a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2183g.getPackageManager());
            }
            m1659g(component);
            m1657c(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: g */
    public C0252p m1659g(ComponentName componentName) {
        int size = this.f2182f.size();
        try {
            Intent intentM1551b = C0243g.m1551b(this.f2183g, componentName);
            while (intentM1551b != null) {
                this.f2182f.add(size, intentM1551b);
                intentM1551b = C0243g.m1551b(this.f2183g, intentM1551b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: i */
    public void m1660i() {
        m1661n(null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2182f.iterator();
    }

    /* renamed from: n */
    public void m1661n(Bundle bundle) {
        if (this.f2182f.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f2182f;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C0255a.m1681j(this.f2183g, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f2183g.startActivity(intent);
    }
}
