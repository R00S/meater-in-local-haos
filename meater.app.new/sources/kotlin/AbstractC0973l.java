package kotlin;

import Ba.l;
import kotlin.AbstractC0973l.a;
import kotlin.InterfaceC0966d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: LazyLayoutIntervalContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"LC/l;", "LC/l$a;", "Interval", "", "<init>", "()V", "", "index", "e", "(I)Ljava/lang/Object;", "b", "LC/d;", "c", "()LC/d;", "intervals", "d", "()I", "itemCount", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0973l<Interval extends a> {

    /* compiled from: LazyLayoutIntervalContent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LC/l$a;", "", "Lkotlin/Function1;", "", "getKey", "()LBa/l;", "key", "a", "type", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.l$a */
    public interface a {

        /* compiled from: LazyLayoutIntervalContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LC/l$a;", "Interval", "", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: C.l$a$a, reason: collision with other inner class name */
        static final class C0035a extends AbstractC3864v implements l {

            /* renamed from: B, reason: collision with root package name */
            public static final C0035a f2053B = new C0035a();

            C0035a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        default l<Integer, Object> a() {
            return C0035a.f2053B;
        }

        default l<Integer, Object> getKey() {
            return null;
        }
    }

    public final Object b(int index) {
        InterfaceC0966d.a<Interval> aVar = c().get(index);
        return aVar.c().a().invoke(Integer.valueOf(index - aVar.getStartIndex()));
    }

    public abstract InterfaceC0966d<Interval> c();

    public final int d() {
        return c().a();
    }

    public final Object e(int index) {
        Object objInvoke;
        InterfaceC0966d.a<Interval> aVar = c().get(index);
        int startIndex = index - aVar.getStartIndex();
        l<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? F.a(index) : objInvoke;
    }
}
