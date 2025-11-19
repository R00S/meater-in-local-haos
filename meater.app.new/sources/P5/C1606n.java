package P5;

/* compiled from: DeviceUtils.java */
/* renamed from: P5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1606n {
    public static int a(T4.p pVar, boolean z10) {
        if (pVar != null) {
            return (z10 || pVar.getShouldShowAsConnected()) ? pVar.getMiniImageConnected() : pVar.getMiniImageDisconnected();
        }
        return 0;
    }

    public static int b(T4.p pVar, boolean z10) {
        if (pVar != null) {
            return z10 ? pVar.getSmallImage() : pVar.getMediumImage();
        }
        return 0;
    }
}
