package f1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import g1.C3377a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class z implements Iterable<Intent> {

    /* renamed from: B, reason: collision with root package name */
    private final ArrayList<Intent> f41208B = new ArrayList<>();

    /* renamed from: C, reason: collision with root package name */
    private final Context f41209C;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        Intent t();
    }

    private z(Context context) {
        this.f41209C = context;
    }

    public static z j(Context context) {
        return new z(context);
    }

    public z c(Intent intent) {
        this.f41208B.add(intent);
        return this;
    }

    public z f(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f41209C.getPackageManager());
        }
        if (component != null) {
            i(component);
        }
        c(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z h(Activity activity) {
        Intent intentT = activity instanceof a ? ((a) activity).t() : null;
        if (intentT == null) {
            intentT = k.a(activity);
        }
        if (intentT != null) {
            ComponentName component = intentT.getComponent();
            if (component == null) {
                component = intentT.resolveActivity(this.f41209C.getPackageManager());
            }
            i(component);
            c(intentT);
        }
        return this;
    }

    public z i(ComponentName componentName) {
        int size = this.f41208B.size();
        try {
            Intent intentB = k.b(this.f41209C, componentName);
            while (intentB != null) {
                this.f41208B.add(size, intentB);
                intentB = k.b(this.f41209C, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f41208B.iterator();
    }

    public void r() {
        v(null);
    }

    public void v(Bundle bundle) {
        if (this.f41208B.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f41208B.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C3377a.n(this.f41209C, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f41209C.startActivity(intent);
    }
}
