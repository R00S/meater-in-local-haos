package mb;

import Ha.f;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.J;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nb.AbstractC4075a;

/* compiled from: BuiltInsBinaryVersion.kt */
/* renamed from: mb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4016a extends AbstractC4075a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0615a f45422g = new C0615a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final C4016a f45423h = new C4016a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    public static final C4016a f45424i = new C4016a(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: mb.a$a, reason: collision with other inner class name */
    public static final class C0615a {
        public /* synthetic */ C0615a(C3854k c3854k) {
            this();
        }

        public final C4016a a(InputStream stream) {
            C3862t.g(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            f fVar = new f(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(r.x(fVar, 10));
            Iterator<Integer> it = fVar.iterator();
            while (it.hasNext()) {
                ((J) it).b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrV0 = r.V0(arrayList);
            return new C4016a(Arrays.copyOf(iArrV0, iArrV0.length));
        }

        private C0615a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4016a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        C3862t.g(numbers, "numbers");
    }

    public boolean h() {
        return f(f45423h);
    }
}
