package q6;

import android.annotation.SuppressLint;
import m6.InterfaceC3970e;
import o6.InterfaceC4139c;
import q6.h;

/* compiled from: LruResourceCache.java */
/* loaded from: classes2.dex */
public class g extends H6.h<InterfaceC3970e, InterfaceC4139c<?>> implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f48095e;

    public g(long j10) {
        super(j10);
    }

    @Override // q6.h
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // q6.h
    public /* bridge */ /* synthetic */ InterfaceC4139c c(InterfaceC3970e interfaceC3970e, InterfaceC4139c interfaceC4139c) {
        return (InterfaceC4139c) super.k(interfaceC3970e, interfaceC4139c);
    }

    @Override // q6.h
    public /* bridge */ /* synthetic */ InterfaceC4139c d(InterfaceC3970e interfaceC3970e) {
        return (InterfaceC4139c) super.l(interfaceC3970e);
    }

    @Override // q6.h
    public void e(h.a aVar) {
        this.f48095e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // H6.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(InterfaceC4139c<?> interfaceC4139c) {
        return interfaceC4139c == null ? super.i(null) : interfaceC4139c.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // H6.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(InterfaceC3970e interfaceC3970e, InterfaceC4139c<?> interfaceC4139c) {
        h.a aVar = this.f48095e;
        if (aVar == null || interfaceC4139c == null) {
            return;
        }
        aVar.a(interfaceC4139c);
    }
}
