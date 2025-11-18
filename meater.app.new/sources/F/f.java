package F;

import ac.InterfaceC1971f;
import kotlin.C1538d1;
import kotlin.InterfaceC1557m0;
import kotlin.Metadata;
import oa.C4153F;
import s.C4386H;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5155d;
import z.C5156e;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: LinkStateInteractionSourceObserver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"LF/f;", "", "<init>", "()V", "Lz/i;", "interactionSource", "Loa/F;", "e", "(Lz/i;Lta/d;)Ljava/lang/Object;", "", "a", "I", "Focused", "b", "Hovered", "c", "Pressed", "LO/m0;", "d", "LO/m0;", "interactionState", "", "f", "()Z", "isFocused", "g", "isHovered", "h", "isPressed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int Focused = 1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int Hovered = 2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int Pressed = 4;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 interactionState = C1538d1.a(0);

    /* compiled from: LinkStateInteractionSourceObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a<T> implements InterfaceC1971f {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4386H<InterfaceC5159h> f4228B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ f f4229C;

        a(C4386H<InterfaceC5159h> c4386h, f fVar) {
            this.f4228B = c4386h;
            this.f4229C = fVar;
        }

        @Override // ac.InterfaceC1971f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            int i10;
            if (interfaceC5159h instanceof C5157f ? true : interfaceC5159h instanceof C5155d ? true : interfaceC5159h instanceof m.b) {
                this.f4228B.e(interfaceC5159h);
            } else if (interfaceC5159h instanceof C5158g) {
                this.f4228B.h(((C5158g) interfaceC5159h).getEnter());
            } else if (interfaceC5159h instanceof C5156e) {
                this.f4228B.h(((C5156e) interfaceC5159h).getFocus());
            } else if (interfaceC5159h instanceof m.c) {
                this.f4228B.h(((m.c) interfaceC5159h).getPress());
            } else if (interfaceC5159h instanceof m.a) {
                this.f4228B.h(((m.a) interfaceC5159h).getPress());
            }
            C4386H<InterfaceC5159h> c4386h = this.f4228B;
            f fVar = this.f4229C;
            Object[] objArr = c4386h.content;
            int i11 = c4386h._size;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                InterfaceC5159h interfaceC5159h2 = (InterfaceC5159h) objArr[i13];
                if (interfaceC5159h2 instanceof C5157f) {
                    i10 = fVar.Hovered;
                } else if (interfaceC5159h2 instanceof C5155d) {
                    i10 = fVar.Focused;
                } else if (interfaceC5159h2 instanceof m.b) {
                    i10 = fVar.Pressed;
                }
                i12 |= i10;
            }
            this.f4229C.interactionState.g(i12);
            return C4153F.f46609a;
        }
    }

    public final Object e(InterfaceC5160i interfaceC5160i, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objB = interfaceC5160i.b().b(new a(new C4386H(0, 1, null), this), interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    public final boolean f() {
        return (this.interactionState.d() & this.Focused) != 0;
    }

    public final boolean g() {
        return (this.interactionState.d() & this.Hovered) != 0;
    }

    public final boolean h() {
        return (this.interactionState.d() & this.Pressed) != 0;
    }
}
