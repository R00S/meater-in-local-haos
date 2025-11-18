package com.google.android.material.appbar;

import android.view.View;
import s1.X;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final View f35902a;

    /* renamed from: b, reason: collision with root package name */
    private int f35903b;

    /* renamed from: c, reason: collision with root package name */
    private int f35904c;

    /* renamed from: d, reason: collision with root package name */
    private int f35905d;

    /* renamed from: e, reason: collision with root package name */
    private int f35906e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35907f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35908g = true;

    public f(View view) {
        this.f35902a = view;
    }

    void a() {
        View view = this.f35902a;
        X.Y(view, this.f35905d - (view.getTop() - this.f35903b));
        View view2 = this.f35902a;
        X.X(view2, this.f35906e - (view2.getLeft() - this.f35904c));
    }

    public int b() {
        return this.f35905d;
    }

    void c() {
        this.f35903b = this.f35902a.getTop();
        this.f35904c = this.f35902a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f35908g || this.f35906e == i10) {
            return false;
        }
        this.f35906e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f35907f || this.f35905d == i10) {
            return false;
        }
        this.f35905d = i10;
        a();
        return true;
    }
}
