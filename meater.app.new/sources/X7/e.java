package X7;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes2.dex */
public class e extends d {

    /* renamed from: a, reason: collision with root package name */
    float f18773a = -1.0f;

    @Override // X7.d
    public void a(m mVar, float f10, float f11, float f12) {
        mVar.o(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = f12;
        double d11 = f11;
        mVar.m((float) (Math.sin(Math.toRadians(f10)) * d10 * d11), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10 * d11));
    }
}
