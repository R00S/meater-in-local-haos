package e7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import g7.C3445p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: e7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3218h {

    /* renamed from: B, reason: collision with root package name */
    protected final InterfaceC3219i f40695B;

    protected C3218h(InterfaceC3219i interfaceC3219i) {
        this.f40695B = interfaceC3219i;
    }

    public static InterfaceC3219i c(Activity activity) {
        return d(new C3217g(activity));
    }

    protected static InterfaceC3219i d(C3217g c3217g) {
        if (c3217g.d()) {
            return l0.x2(c3217g.b());
        }
        if (c3217g.c()) {
            return i0.a(c3217g.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public Activity b() {
        Activity activityR = this.f40695B.r();
        C3445p.k(activityR);
        return activityR;
    }

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
