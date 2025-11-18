package kc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: SerialKinds.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lkc/j;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "a", "b", "Lkc/d;", "Lkc/e;", "Lkc/j$a;", "Lkc/j$b;", "Lkc/k;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class j {

    /* compiled from: SerialKinds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkc/j$a;", "Lkc/j;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43917a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SerialKinds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkc/j$b;", "Lkc/j;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43918a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ j(C3854k c3854k) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strR = P.b(getClass()).r();
        C3862t.d(strR);
        return strR;
    }

    private j() {
    }
}
