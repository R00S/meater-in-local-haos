package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.C9801m;

/* compiled from: UnboundedViewPool.kt */
/* renamed from: com.airbnb.epoxy.l0 */
/* loaded from: classes.dex */
public final class C5150l0 extends RecyclerView.C0608u {

    /* renamed from: c */
    private final SparseArray<Queue<RecyclerView.AbstractC0590c0>> f12247c = new SparseArray<>();

    /* renamed from: m */
    private final Queue<RecyclerView.AbstractC0590c0> m9307m(int i2) {
        Queue<RecyclerView.AbstractC0590c0> queue = this.f12247c.get(i2);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.f12247c.put(i2, linkedList);
        return linkedList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C0608u
    /* renamed from: b */
    public void mo4249b() {
        this.f12247c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C0608u
    /* renamed from: f */
    public RecyclerView.AbstractC0590c0 mo4253f(int i2) {
        Queue<RecyclerView.AbstractC0590c0> queue = this.f12247c.get(i2);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C0608u
    /* renamed from: i */
    public void mo4255i(RecyclerView.AbstractC0590c0 abstractC0590c0) {
        C9801m.m32347g(abstractC0590c0, "viewHolder");
        m9307m(abstractC0590c0.getItemViewType()).add(abstractC0590c0);
    }
}
