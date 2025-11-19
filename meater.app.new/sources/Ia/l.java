package Ia;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: KParameter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"LIa/l;", "LIa/b;", "", "getIndex", "()I", "index", "", "getName", "()Ljava/lang/String;", "name", "LIa/q;", "a", "()LIa/q;", "type", "LIa/l$a;", "i", "()LIa/l$a;", "kind", "", "n", "()Z", "isOptional", "j", "isVararg$annotations", "()V", "isVararg", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface l extends b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LIa/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6936B = new a("INSTANCE", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f6937C = new a("EXTENSION_RECEIVER", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final a f6938D = new a("VALUE", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ a[] f6939E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f6940F;

        static {
            a[] aVarArrC = c();
            f6939E = aVarArrC;
            f6940F = C4929b.a(aVarArrC);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f6936B, f6937C, f6938D};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6939E.clone();
        }
    }

    q a();

    int getIndex();

    String getName();

    a i();

    boolean j();

    boolean n();
}
