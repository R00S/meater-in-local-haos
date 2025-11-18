package cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Border.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Border;", HttpUrl.FRAGMENT_ENCODE_SET, "size", HttpUrl.FRAGMENT_ENCODE_SET, "color", "(II)V", "getColor", "()I", "getSize", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Border {
    private final int color;
    private final int size;

    public Border(int i2, int i3) {
        this.size = i2;
        this.color = i3;
    }

    public static /* synthetic */ Border copy$default(Border border, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = border.size;
        }
        if ((i4 & 2) != 0) {
            i3 = border.color;
        }
        return border.copy(i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final Border copy(int size, int color) {
        return new Border(size, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Border)) {
            return false;
        }
        Border border = (Border) other;
        return this.size == border.size && this.color == border.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.size * 31) + this.color;
    }

    public String toString() {
        return "Border(size=" + this.size + ", color=" + this.color + ')';
    }
}
