package W9;

import X9.b;
import X9.c;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;

/* compiled from: DrawManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Y9.a f18472a;

    /* renamed from: b, reason: collision with root package name */
    private b f18473b;

    /* renamed from: c, reason: collision with root package name */
    private c f18474c;

    /* renamed from: d, reason: collision with root package name */
    private X9.a f18475d;

    public a() {
        Y9.a aVar = new Y9.a();
        this.f18472a = aVar;
        this.f18473b = new b(aVar);
        this.f18474c = new c();
        this.f18475d = new X9.a(this.f18472a);
    }

    public void a(Canvas canvas) {
        this.f18473b.a(canvas);
    }

    public Y9.a b() {
        if (this.f18472a == null) {
            this.f18472a = new Y9.a();
        }
        return this.f18472a;
    }

    public void c(Context context, AttributeSet attributeSet) {
        this.f18475d.c(context, attributeSet);
    }

    public Pair<Integer, Integer> d(int i10, int i11) {
        return this.f18474c.a(this.f18472a, i10, i11);
    }

    public void e(b.InterfaceC0274b interfaceC0274b) {
        this.f18473b.e(interfaceC0274b);
    }

    public void f(MotionEvent motionEvent) {
        this.f18473b.f(motionEvent);
    }

    public void g(T9.a aVar) {
        this.f18473b.g(aVar);
    }
}
