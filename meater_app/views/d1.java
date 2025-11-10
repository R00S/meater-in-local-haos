package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MenuManager.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    private final q5.d0 f10515a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<View> f10516b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<View> f10517c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuManager.java */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements j6.b {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ j6.b f10518q;

        a(j6.b bVar) {
            this.f10518q = bVar;
        }

        @Override // j6.b
        public void r(View view, Object obj) {
            this.f10518q.r(view, obj);
            d1.this.j(false);
        }
    }

    public d1(Context context, RecyclerView recyclerView, View view) {
        q5.d0 d0Var = new q5.d0(context);
        this.f10515a = d0Var;
        recyclerView.setAdapter(d0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        recyclerView.j(new androidx.recyclerview.widget.i(context, 1));
        this.f10516b = new WeakReference<>(recyclerView);
        if (view != null) {
            WeakReference<View> weakReference = new WeakReference<>(view);
            this.f10517c = weakReference;
            weakReference.get().setOnClickListener(new View.OnClickListener() { // from class: com.apptionlabs.meater_app.views.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d1.this.c(view2);
                }
            });
        }
        j(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        j(false);
    }

    private void i(View view, boolean z10) {
        int i10;
        if (view != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    private void l(View view) {
        f8.q0.h(view);
    }

    public boolean b() {
        WeakReference<View> weakReference = this.f10516b;
        if (weakReference != null && this.f10517c != null && weakReference.get().getVisibility() == 0 && this.f10517c.get().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void d(j6.b bVar) {
        this.f10515a.P(new a(bVar));
    }

    public void e(List<j6.p> list) {
        this.f10515a.Q(list);
        this.f10515a.n();
    }

    public void f(boolean z10, List<j6.p> list) {
        this.f10515a.R(z10, list);
        this.f10515a.n();
    }

    public void g(j6.p pVar, int... iArr) {
        this.f10515a.S(pVar, iArr);
        this.f10515a.n();
    }

    public void h(j6.p pVar, String str) {
        this.f10515a.T(pVar, str);
    }

    public void j(boolean z10) {
        WeakReference<View> weakReference = this.f10516b;
        if (weakReference != null) {
            i(weakReference.get(), z10);
        }
        WeakReference<View> weakReference2 = this.f10517c;
        if (weakReference2 != null) {
            i(weakReference2.get(), z10);
        }
    }

    public void k() {
        WeakReference<View> weakReference = this.f10516b;
        if (weakReference != null) {
            l(weakReference.get());
        }
        WeakReference<View> weakReference2 = this.f10517c;
        if (weakReference2 != null) {
            l(weakReference2.get());
        }
    }
}
