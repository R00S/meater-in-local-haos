package S3;

import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15419a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f15420b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15421c;

    public q(String str, List<c> list, boolean z10) {
        this.f15419a = str;
        this.f15420b = list;
        this.f15421c = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.d(nVar, bVar, this, iVar);
    }

    public List<c> b() {
        return this.f15420b;
    }

    public String c() {
        return this.f15419a;
    }

    public boolean d() {
        return this.f15421c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f15419a + "' Shapes: " + Arrays.toString(this.f15420b.toArray()) + '}';
    }
}
