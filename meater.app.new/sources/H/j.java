package H;

import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import s.AbstractC4408s;

/* compiled from: SelectionRegistrar.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"LH/i;", "", "selectableId", "", "b", "(LH/i;J)Z", "LO/G0;", "a", "LO/G0;", "()LO/G0;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<i> f5220a = C1576w.d(null, a.f5221B, 1, null);

    /* compiled from: SelectionRegistrar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH/i;", "a", "()LH/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<i> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f5221B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            return null;
        }
    }

    public static final AbstractC1501G0<i> a() {
        return f5220a;
    }

    public static final boolean b(i iVar, long j10) {
        AbstractC4408s<Selection> abstractC4408sG;
        if (iVar == null || (abstractC4408sG = iVar.g()) == null) {
            return false;
        }
        return abstractC4408sG.a(j10);
    }
}
