package i0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;

/* compiled from: AndroidPathMeasure.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Li0/W;", "Li0/U0;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Li0/R0;", "destination", "", "startWithMoveTo", "b", "(FFLi0/R0;Z)Z", "path", "forceClosed", "Loa/F;", "c", "(Li0/R0;Z)V", "a", "Landroid/graphics/PathMeasure;", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3559W implements U0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PathMeasure internalPathMeasure;

    public C3559W(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // i0.U0
    public float a() {
        return this.internalPathMeasure.getLength();
    }

    @Override // i0.U0
    public boolean b(float startDistance, float stopDistance, R0 destination, boolean startWithMoveTo) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof C3556T) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((C3556T) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // i0.U0
    public void c(R0 path, boolean forceClosed) {
        Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof C3556T)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((C3556T) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, forceClosed);
    }
}
