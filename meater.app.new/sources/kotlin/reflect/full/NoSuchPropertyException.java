package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;

/* compiled from: exceptions.kt */
@Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlin/reflect/full/NoSuchPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "(Ljava/lang/Exception;)V", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* loaded from: classes2.dex */
public final class NoSuchPropertyException extends Exception {
    public NoSuchPropertyException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public NoSuchPropertyException(Exception exc) {
        super(exc);
    }

    public /* synthetic */ NoSuchPropertyException(Exception exc, int i2, C9789g c9789g) {
        this((i2 & 1) != 0 ? null : exc);
    }
}
