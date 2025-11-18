package H;

import i0.C3602t0;
import i0.C3606v0;
import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: TextSelectionColors.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b\"\u001a\u0010\u000e\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LO/G0;", "LH/l;", "a", "LO/G0;", "b", "()LO/G0;", "LocalTextSelectionColors", "Li0/t0;", "J", "DefaultSelectionColor", "c", "LH/l;", "getDefaultTextSelectionColors$annotations", "()V", "DefaultTextSelectionColors", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<SelectionColors> f5224a = C1576w.d(null, a.f5227B, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f5225b;

    /* renamed from: c, reason: collision with root package name */
    private static final SelectionColors f5226c;

    /* compiled from: TextSelectionColors.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH/l;", "a", "()LH/l;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<SelectionColors> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f5227B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectionColors invoke() {
            return m.f5226c;
        }
    }

    static {
        long jD = C3606v0.d(4282550004L);
        f5225b = jD;
        f5226c = new SelectionColors(jD, C3602t0.k(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final AbstractC1501G0<SelectionColors> b() {
        return f5224a;
    }
}
