package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C0280a;
import androidx.core.view.p004d0.C0289c;
import androidx.recyclerview.widget.C0634o;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* renamed from: androidx.preference.k */
/* loaded from: classes.dex */
public class C0567k extends C0634o {

    /* renamed from: f */
    final RecyclerView f3716f;

    /* renamed from: g */
    final C0280a f3717g;

    /* renamed from: h */
    final C0280a f3718h;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    /* renamed from: androidx.preference.k$a */
    class a extends C0280a {
        a() {
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            Preference preferenceM4126j;
            C0567k.this.f3717g.mo1858g(view, c0289c);
            int childAdapterPosition = C0567k.this.f3716f.getChildAdapterPosition(view);
            RecyclerView.AbstractC0594g adapter = C0567k.this.f3716f.getAdapter();
            if ((adapter instanceof C0564h) && (preferenceM4126j = ((C0564h) adapter).m4126j(childAdapterPosition)) != null) {
                preferenceM4126j.mo4037p0(c0289c);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: j */
        public boolean mo1861j(View view, int i2, Bundle bundle) {
            return C0567k.this.f3717g.mo1861j(view, i2, bundle);
        }
    }

    public C0567k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f3717g = super.mo4160n();
        this.f3718h = new a();
        this.f3716f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.C0634o
    /* renamed from: n */
    public C0280a mo4160n() {
        return this.f3718h;
    }
}
