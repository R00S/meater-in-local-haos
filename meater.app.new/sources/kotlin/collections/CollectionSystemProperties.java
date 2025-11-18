package kotlin.collections;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: CollectionsJVM.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m32267d2 = {"Lkotlin/collections/CollectionSystemProperties;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "brittleContainsOptimizationEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.r, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class CollectionSystemProperties {

    /* renamed from: a */
    public static final CollectionSystemProperties f41473a = new CollectionSystemProperties();

    /* renamed from: b */
    public static final boolean f41474b;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        f41474b = property != null ? Boolean.parseBoolean(property) : false;
    }

    private CollectionSystemProperties() {
    }
}
