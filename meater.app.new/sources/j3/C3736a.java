package j3;

import ic.InterfaceC3693a;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3386C;
import kotlin.AbstractC3399e;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: RouteBuilder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006 "}, d2 = {"Lj3/a;", "T", "", "Lic/a;", "serializer", "<init>", "(Lic/a;)V", "", "path", "Loa/F;", "a", "(Ljava/lang/String;)V", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "Lg3/C;", "type", "Lj3/a$a;", "e", "(ILg3/C;)Lj3/a$a;", "d", "()Ljava/lang/String;", "", "c", "(ILjava/lang/String;Lg3/C;Ljava/util/List;)V", "Lic/a;", "Ljava/lang/String;", "pathArgs", "queryArgs", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3736a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3693a<T> serializer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String pathArgs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String queryArgs;

    /* compiled from: RouteBuilder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lj3/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j3.a$a, reason: collision with other inner class name */
    private enum EnumC0557a {
        PATH,
        QUERY
    }

    /* compiled from: RouteBuilder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j3.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43513a;

        static {
            int[] iArr = new int[EnumC0557a.values().length];
            try {
                iArr[EnumC0557a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0557a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43513a = iArr;
        }
    }

    public C3736a(InterfaceC3693a<T> serializer) {
        C3862t.g(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = serializer.getDescriptor().getSerialName();
    }

    private final void a(String path) {
        this.pathArgs += '/' + path;
    }

    private final void b(String name, String value) {
        this.queryArgs += (this.queryArgs.length() == 0 ? "?" : "&") + name + '=' + value;
    }

    private final EnumC0557a e(int index, AbstractC3386C<Object> type) {
        return ((type instanceof AbstractC3399e) || this.serializer.getDescriptor().f(index)) ? EnumC0557a.QUERY : EnumC0557a.PATH;
    }

    public final void c(int index, String name, AbstractC3386C<Object> type, List<String> value) {
        C3862t.g(name, "name");
        C3862t.g(type, "type");
        C3862t.g(value, "value");
        int i10 = b.f43513a[e(index, type).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) r.j0(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final String d() {
        return this.path + this.pathArgs + this.queryArgs;
    }
}
