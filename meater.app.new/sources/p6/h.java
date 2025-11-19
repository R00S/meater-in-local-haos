package p6;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes2.dex */
public final class h implements InterfaceC4236a<int[]> {
    @Override // p6.InterfaceC4236a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // p6.InterfaceC4236a
    public int b() {
        return 4;
    }

    @Override // p6.InterfaceC4236a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // p6.InterfaceC4236a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
