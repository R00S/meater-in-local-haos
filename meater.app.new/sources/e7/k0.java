package e7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import r7.HandlerC4360e;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f40714a = Collections.synchronizedMap(new C4391a());

    /* renamed from: b, reason: collision with root package name */
    private int f40715b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f40716c;

    k0() {
    }

    final C3218h c(String str, Class cls) {
        return (C3218h) cls.cast(this.f40714a.get(str));
    }

    final void d(String str, C3218h c3218h) {
        if (this.f40714a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f40714a.put(str, c3218h);
        if (this.f40715b > 0) {
            new HandlerC4360e(Looper.getMainLooper()).post(new j0(this, c3218h, str));
        }
    }

    final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f40714a.values().iterator();
        while (it.hasNext()) {
            ((C3218h) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f40714a.values().iterator();
        while (it.hasNext()) {
            ((C3218h) it.next()).e(i10, i11, intent);
        }
    }

    final void g(Bundle bundle) {
        this.f40715b = 1;
        this.f40716c = bundle;
        for (Map.Entry entry : this.f40714a.entrySet()) {
            ((C3218h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f40715b = 5;
        Iterator it = this.f40714a.values().iterator();
        while (it.hasNext()) {
            ((C3218h) it.next()).g();
        }
    }

    final void i() {
        this.f40715b = 3;
        Iterator it = this.f40714a.values().iterator();
        while (it.hasNext()) {
            ((C3218h) it.next()).h();
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f40714a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((C3218h) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void k() {
        this.f40715b = 2;
        Iterator it = this.f40714a.values().iterator();
        while (it.hasNext()) {
            ((C3218h) it.next()).j();
        }
    }

    final void l() {
        this.f40715b = 4;
        Iterator it = this.f40714a.values().iterator();
        while (it.hasNext()) {
            ((C3218h) it.next()).k();
        }
    }
}
