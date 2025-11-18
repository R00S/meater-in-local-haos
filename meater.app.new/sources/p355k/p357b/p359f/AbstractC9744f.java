package p355k.p357b.p359f;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NamedLoggerBase.java */
/* renamed from: k.b.f.f */
/* loaded from: classes3.dex */
public abstract class AbstractC9744f implements InterfaceC9732b, Serializable {

    /* renamed from: f */
    protected String f37133f;

    AbstractC9744f() {
    }

    /* renamed from: j */
    public String mo32212j() {
        return this.f37133f;
    }

    protected Object readResolve() throws ObjectStreamException {
        return C9733c.m32189i(mo32212j());
    }
}
