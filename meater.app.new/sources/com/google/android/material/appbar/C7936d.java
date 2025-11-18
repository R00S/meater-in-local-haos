package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C0311u;

/* compiled from: ViewOffsetHelper.java */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes2.dex */
class C7936d {

    /* renamed from: a */
    private final View f29669a;

    /* renamed from: b */
    private int f29670b;

    /* renamed from: c */
    private int f29671c;

    /* renamed from: d */
    private int f29672d;

    /* renamed from: e */
    private int f29673e;

    /* renamed from: f */
    private boolean f29674f = true;

    /* renamed from: g */
    private boolean f29675g = true;

    public C7936d(View view) {
        this.f29669a = view;
    }

    /* renamed from: a */
    void m23799a() {
        View view = this.f29669a;
        C0311u.m2108U(view, this.f29672d - (view.getTop() - this.f29670b));
        View view2 = this.f29669a;
        C0311u.m2107T(view2, this.f29673e - (view2.getLeft() - this.f29671c));
    }

    /* renamed from: b */
    public int m23800b() {
        return this.f29670b;
    }

    /* renamed from: c */
    public int m23801c() {
        return this.f29672d;
    }

    /* renamed from: d */
    void m23802d() {
        this.f29670b = this.f29669a.getTop();
        this.f29671c = this.f29669a.getLeft();
    }

    /* renamed from: e */
    public boolean m23803e(int i2) {
        if (!this.f29675g || this.f29673e == i2) {
            return false;
        }
        this.f29673e = i2;
        m23799a();
        return true;
    }

    /* renamed from: f */
    public boolean m23804f(int i2) {
        if (!this.f29674f || this.f29672d == i2) {
            return false;
        }
        this.f29672d = i2;
        m23799a();
        return true;
    }
}
