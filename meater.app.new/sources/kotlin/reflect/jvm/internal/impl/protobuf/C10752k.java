package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.k */
/* loaded from: classes3.dex */
public class C10752k {

    /* renamed from: a */
    private AbstractC10745d f41319a;

    /* renamed from: b */
    private C10747f f41320b;

    /* renamed from: c */
    private volatile boolean f41321c;

    /* renamed from: d */
    protected volatile InterfaceC10756o f41322d;

    /* renamed from: a */
    protected void m38419a(InterfaceC10756o interfaceC10756o) {
        if (this.f41322d != null) {
            return;
        }
        synchronized (this) {
            if (this.f41322d != null) {
                return;
            }
            try {
                if (this.f41319a != null) {
                    this.f41322d = interfaceC10756o.mo34080g().mo38262d(this.f41319a, this.f41320b);
                } else {
                    this.f41322d = interfaceC10756o;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public int m38420b() {
        return this.f41321c ? this.f41322d.mo34078e() : this.f41319a.size();
    }

    /* renamed from: c */
    public InterfaceC10756o m38421c(InterfaceC10756o interfaceC10756o) {
        m38419a(interfaceC10756o);
        return this.f41322d;
    }

    /* renamed from: d */
    public InterfaceC10756o m38422d(InterfaceC10756o interfaceC10756o) {
        InterfaceC10756o interfaceC10756o2 = this.f41322d;
        this.f41322d = interfaceC10756o;
        this.f41319a = null;
        this.f41321c = true;
        return interfaceC10756o2;
    }
}
