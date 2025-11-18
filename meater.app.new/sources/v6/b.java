package v6;

import H6.k;
import o6.InterfaceC4139c;

/* compiled from: BytesResource.java */
/* loaded from: classes2.dex */
public class b implements InterfaceC4139c<byte[]> {

    /* renamed from: B, reason: collision with root package name */
    private final byte[] f51487B;

    public b(byte[] bArr) {
        this.f51487B = (byte[]) k.d(bArr);
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return this.f51487B.length;
    }

    @Override // o6.InterfaceC4139c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f51487B;
    }

    @Override // o6.InterfaceC4139c
    public Class<byte[]> d() {
        return byte[].class;
    }

    @Override // o6.InterfaceC4139c
    public void c() {
    }
}
