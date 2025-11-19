package p6;

/* compiled from: ByteArrayAdapter.java */
/* renamed from: p6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4241f implements InterfaceC4236a<byte[]> {
    @Override // p6.InterfaceC4236a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // p6.InterfaceC4236a
    public int b() {
        return 1;
    }

    @Override // p6.InterfaceC4236a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // p6.InterfaceC4236a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
