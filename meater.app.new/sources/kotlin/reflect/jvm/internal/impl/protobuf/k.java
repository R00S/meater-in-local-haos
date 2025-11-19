package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private d f44081a;

    /* renamed from: b, reason: collision with root package name */
    private f f44082b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f44083c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile o f44084d;

    protected void a(o oVar) {
        if (this.f44084d != null) {
            return;
        }
        synchronized (this) {
            if (this.f44084d != null) {
                return;
            }
            try {
                if (this.f44081a != null) {
                    this.f44084d = oVar.h().d(this.f44081a, this.f44082b);
                } else {
                    this.f44084d = oVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f44083c ? this.f44084d.f() : this.f44081a.size();
    }

    public o c(o oVar) {
        a(oVar);
        return this.f44084d;
    }

    public o d(o oVar) {
        o oVar2 = this.f44084d;
        this.f44084d = oVar;
        this.f44081a = null;
        this.f44083c = true;
        return oVar2;
    }
}
