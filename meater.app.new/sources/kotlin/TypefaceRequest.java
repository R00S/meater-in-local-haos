package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\u0014R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"LL0/U;", "", "LL0/l;", "fontFamily", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(LL0/l;LL0/B;IILjava/lang/Object;Lkotlin/jvm/internal/k;)V", "a", "(LL0/l;LL0/B;IILjava/lang/Object;)LL0/U;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LL0/l;", "c", "()LL0/l;", "b", "LL0/B;", "f", "()LL0/B;", "I", "d", "e", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.U, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class TypefaceRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC1341l fontFamily;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontSynthesis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object resourceLoaderCacheKey;

    public /* synthetic */ TypefaceRequest(AbstractC1341l abstractC1341l, FontWeight fontWeight, int i10, int i11, Object obj, C3854k c3854k) {
        this(abstractC1341l, fontWeight, i10, i11, obj);
    }

    public static /* synthetic */ TypefaceRequest b(TypefaceRequest typefaceRequest, AbstractC1341l abstractC1341l, FontWeight fontWeight, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            abstractC1341l = typefaceRequest.fontFamily;
        }
        if ((i12 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i12 & 4) != 0) {
            i10 = typefaceRequest.fontStyle;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = typefaceRequest.fontSynthesis;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.a(abstractC1341l, fontWeight2, i13, i14, obj);
    }

    public final TypefaceRequest a(AbstractC1341l fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis, Object resourceLoaderCacheKey) {
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC1341l getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: d, reason: from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    /* renamed from: e, reason: from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return C3862t.b(this.fontFamily, typefaceRequest.fontFamily) && C3862t.b(this.fontWeight, typefaceRequest.fontWeight) && C1352w.f(this.fontStyle, typefaceRequest.fontStyle) && C1353x.e(this.fontSynthesis, typefaceRequest.fontSynthesis) && C3862t.b(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    /* renamed from: f, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        AbstractC1341l abstractC1341l = this.fontFamily;
        int iHashCode = (((((((abstractC1341l == null ? 0 : abstractC1341l.hashCode()) * 31) + this.fontWeight.getWeight()) * 31) + C1352w.g(this.fontStyle)) * 31) + C1353x.f(this.fontSynthesis)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) C1352w.h(this.fontStyle)) + ", fontSynthesis=" + ((Object) C1353x.i(this.fontSynthesis)) + ", resourceLoaderCacheKey=" + this.resourceLoaderCacheKey + ')';
    }

    private TypefaceRequest(AbstractC1341l abstractC1341l, FontWeight fontWeight, int i10, int i11, Object obj) {
        this.fontFamily = abstractC1341l;
        this.fontWeight = fontWeight;
        this.fontStyle = i10;
        this.fontSynthesis = i11;
        this.resourceLoaderCacheKey = obj;
    }
}
