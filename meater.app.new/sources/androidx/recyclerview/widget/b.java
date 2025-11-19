package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final RecyclerView.h f28820a;

    public b(RecyclerView.h hVar) {
        this.f28820a = hVar;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(int i10, int i11) {
        this.f28820a.p(i10, i11);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(int i10, int i11) {
        this.f28820a.s(i10, i11);
    }

    @Override // androidx.recyclerview.widget.n
    public void c(int i10, int i11) {
        this.f28820a.t(i10, i11);
    }

    @Override // androidx.recyclerview.widget.n
    @SuppressLint({"UnknownNullness"})
    public void d(int i10, int i11, Object obj) {
        this.f28820a.r(i10, i11, obj);
    }
}
