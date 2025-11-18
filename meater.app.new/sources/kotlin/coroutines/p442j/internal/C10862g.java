package kotlin.coroutines.p442j.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: DebugMetadata.kt */
@Metadata(m32266d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m32267d2 = {"COROUTINES_DEBUG_METADATA_VERSION", HttpUrl.FRAGMENT_ENCODE_SET, "checkDebugMetadataVersion", HttpUrl.FRAGMENT_ENCODE_SET, "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.y.j.a.g */
/* loaded from: classes2.dex */
public final class C10862g {
    /* renamed from: a */
    private static final void m39054a(int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: b */
    private static final DebugMetadata m39055b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    /* renamed from: c */
    private static final int m39056c(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m39057d(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        String strM39049c;
        C9801m.m32346f(baseContinuationImpl, "<this>");
        DebugMetadata debugMetadataM39055b = m39055b(baseContinuationImpl);
        if (debugMetadataM39055b == null) {
            return null;
        }
        m39054a(1, debugMetadataM39055b.m39053v());
        int iM39056c = m39056c(baseContinuationImpl);
        int i2 = iM39056c < 0 ? -1 : debugMetadataM39055b.m39051l()[iM39056c];
        String strM39062b = ModuleNameRetriever.f41543a.m39062b(baseContinuationImpl);
        if (strM39062b == null) {
            strM39049c = debugMetadataM39055b.m39049c();
        } else {
            strM39049c = strM39062b + '/' + debugMetadataM39055b.m39049c();
        }
        return new StackTraceElement(strM39049c, debugMetadataM39055b.m39052m(), debugMetadataM39055b.m39050f(), i2);
    }
}
