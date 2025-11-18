package com.bumptech.glide.load.engine.p123a0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5379h;
import com.bumptech.glide.p145r.C5593g;

/* compiled from: LruResourceCache.java */
/* renamed from: com.bumptech.glide.load.engine.a0.g */
/* loaded from: classes.dex */
public class C5378g extends C5593g<InterfaceC5423f, InterfaceC5404u<?>> implements InterfaceC5379h {

    /* renamed from: e */
    private InterfaceC5379h.a f13267e;

    public C5378g(long j2) {
        super(j2);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5379h
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo10190a(int i2) {
        if (i2 >= 40) {
            m11030b();
        } else if (i2 >= 20 || i2 == 15) {
            m11035m(m11032h() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5379h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC5404u mo10191c(InterfaceC5423f interfaceC5423f, InterfaceC5404u interfaceC5404u) {
        return (InterfaceC5404u) super.m11033k(interfaceC5423f, interfaceC5404u);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5379h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC5404u mo10192d(InterfaceC5423f interfaceC5423f) {
        return (InterfaceC5404u) super.m11034l(interfaceC5423f);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5379h
    /* renamed from: e */
    public void mo10193e(InterfaceC5379h.a aVar) {
        this.f13267e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.p145r.C5593g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo10194i(InterfaceC5404u<?> interfaceC5404u) {
        return interfaceC5404u == null ? super.mo10194i(null) : interfaceC5404u.mo10341d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.p145r.C5593g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo10195j(InterfaceC5423f interfaceC5423f, InterfaceC5404u<?> interfaceC5404u) {
        InterfaceC5379h.a aVar = this.f13267e;
        if (aVar == null || interfaceC5404u == null) {
            return;
        }
        aVar.mo10199a(interfaceC5404u);
    }
}
