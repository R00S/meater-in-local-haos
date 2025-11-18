package i0;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: AndroidImageBitmap.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Li0/N;", "Li0/H0;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "Loa/F;", "c", "()V", "b", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "", "()I", "width", "a", "height", "Li0/I0;", "d", "config", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3551N implements H0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bitmap bitmap;

    public C3551N(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // i0.H0
    public int a() {
        return this.bitmap.getHeight();
    }

    @Override // i0.H0
    public int b() {
        return this.bitmap.getWidth();
    }

    @Override // i0.H0
    public void c() {
        this.bitmap.prepareToDraw();
    }

    @Override // i0.H0
    public int d() {
        return C3552O.e(this.bitmap.getConfig());
    }

    /* renamed from: e, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }
}
