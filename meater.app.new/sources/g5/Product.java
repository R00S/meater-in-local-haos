package g5;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Product.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lg5/b;", "", "", "productId", "", "productName", "productThumbnail", "<init>", "(ILjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g5.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Product {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int productThumbnail;

    public Product(int i10, String productName, int i11) {
        C3862t.g(productName, "productName");
        this.productId = i10;
        this.productName = productName;
        this.productThumbnail = i11;
    }

    /* renamed from: a, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: b, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: c, reason: from getter */
    public final int getProductThumbnail() {
        return this.productThumbnail;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return this.productId == product.productId && C3862t.b(this.productName, product.productName) && this.productThumbnail == product.productThumbnail;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.productId) * 31) + this.productName.hashCode()) * 31) + Integer.hashCode(this.productThumbnail);
    }

    public String toString() {
        return "Product(productId=" + this.productId + ", productName=" + this.productName + ", productThumbnail=" + this.productThumbnail + ")";
    }
}
